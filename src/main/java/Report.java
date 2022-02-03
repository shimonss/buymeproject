import FirstPage.ExtentReports;
import FirstPage.ExtentTest;
import org.apache.commons.io.FileUtils;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;

public class Report {
    private static ChromeDriver driver;
    // create ExtentReports and attach reporter(s)
    private static ExtentReports extent;
    // creates a toggle for the given test, adds all log events under it
    private static ExtentTest test;

    @BeforeClass
    public static void beforeClass(Object INFO, String CHROMEDRIVER_PATH, Object FAIL, Object PASS) throws Exception {
        String cwd = System.getProperty("user.dir");
        extent = new ExtentReports();
        test = extent.createTest("MyFirstTest", "Sample description");
        test.log(INFO, "@Before class");

        try {
            System.setProperty("webdriver.chrome.driver", CHROMEDRIVER_PATH);
            driver = new ChromeDriver();
            Object Satus = null;
            test.log(PASS, "Driver established successfully");
        } catch (Exception e) {
            e.printStackTrace();
            test.log(FAIL, "Driver connection failed!" + e.getMessage());
            throw new Exception("Driver failed");
        }

        driver.get("https://www.buyme.co.il");
    }

    @Test
    public void numberExceptionTest(Object FAIL) {
        try {
            int a = 1 / 0;
        } catch (ArithmeticException e) {
            test.log(FAIL, "numberException" + e.getMessage());
        }
    }

    @AfterClass
    public static void afterClass(Object INFO) {
        test.log(INFO, "@After test" + "After test method");
        driver.quit();
        extent.flush();

    }




        }





