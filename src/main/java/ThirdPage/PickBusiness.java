package ThirdPage;

import FirstPage.ChromeDriver;
import FirstPage.Constant;
import MainPage.MainClass;
import org.testng.Assert;

public class PickBusiness {
    private static ChromeDriver driver;
    private static boolean myElement;

    public static void chromeDriver() {
        System.setProperty("WebDriver.chrome.driver", Constant.CHROMEDRIVER_PATH);
        driver = new ChromeDriver();
        driver.get("https://buyme.co.il");//enter BuyMe website
        Assert.assertEquals(myElement, "https://www.buyme.co.il");
        driver.findElement(MainClass.By.id("product-card-bg")).click();//בחירת מסעדת בני הדייג כעסק
        driver.findElement(MainClass.By.id("ember1992")).click();//הכנסת סכום
        driver.findElement(MainClass.By.id("span.label")).click();//לחיצה על "לבחירה"


    }
}

