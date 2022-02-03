package MainPage;

import FirstPage.*;
import org.apache.commons.io.FileUtils;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import static FirstPage.PomTest.driver;


public class MainClass {
    private static Object file;
    private static Object string;
    private static Object object;
    public static Object cwd;
    private static String imagesPath;
    private String FIRSTNAME;
    private String email;
    private byte[] MYMAIL;
    private byte[] MYPASS;
    private String PASSREPEAT;
    private Object MYPASSREP;
    private Object myElement;
    private static ExtentReports extent = new ExtentReports();
    private static ExtentTest test = extent.createTest("MyFirstTest", "Sample description");

    @BeforeClass
    public static void beforeClass() throws InterruptedException {
        try {
            new FirstScreen().openURL();
        } catch (Exception e) {
            e.printStackTrace();
            System.setProperty("WebDriver.chrome.driver", Constant.CHROMEDRIVER_PATH);
            driver = new WebDriver();
            ExtentSparkReporter htmlReporter = new ExtentSparkReporter(cwd + "\\extent.html");
            extent.attachReporter(htmlReporter);
            Object Info = null;
            test.log(Info, "Login screen");
            Thread.sleep(1000);
            driver.get("https://www.buyme.co.il");
        }

    }

    @Test
    public void test01_signUpTest() throws Exception {
        new FirstScreen().SignUpRegisterElement();
        new FirstScreen().RegisterElement();
    }


    @Test
    public void test02_FirstNameTest() throws Exception {
        new FirstScreen().firstNameElement();
        FirstScreen firstScreen = new FirstScreen();
        firstScreen.firstNameElement();
    }

    @Test
    public void test03_emailTest() throws Exception {
        new FirstScreen().emailElement();
    }

    @Test
    public void test04_passwordtTest() throws Exception {
        new FirstScreen().passwordElement();
    }

    @Test
    public void test05_passwordConfiemTest() throws InvalidSelectorException, Exception {
        new FirstScreen().passwordConfirmElement();

    }

    private void sendKeysToElement(BasePage.By ember1828, String shimon) {
    }

    private void ClickElement(Object className) {
    }

    @Test
    public void test06_HomeScreen(Object INFO) {
        ClickElement(BasePage.By.className("selected-text-עד 99 שקלים"));//הזנת הסכום
        ClickElement(BasePage.By.className("selected-text-תל-אביב והסביבה"));//בחירת אזור
        ClickElement(BasePage.By.className("selected-text-המתנות המומלצות של איתי לוי"));//בחירת קטגוריה
        ClickElement(BasePage.By.className("ember2626"));//לחיצה על "תמצאו לי מתנה"
        test.log(INFO, "Login screen");
    }

    @Test
    public void test07_PickBusiness(Object INFO) {
        Assert.assertEquals(myElement, "https://www.buyme.co.il");
        ClickElement(BasePage.By.className("div.product-card-bg"));//pick business
        ClickElement(BasePage.By.className("input#ember2962.ember-view.ember-text-field"));//choose price
        ClickElement(BasePage.By.className("span.label"));//לחיצה על כפתור "בחירה"
        test.log(INFO, "Login screen");
    }

    @Test
    public void test08_SenderAndReceiverInfoScreen(Object INFO) {
        ClickElement(BasePage.By.className("span.text"));//לחיצה על כפתור "למישהו אחר"
        ClickElement(BasePage.By.id("input#ember3027.ember-view.ember-text-field"));//הכנסת שם מקבל המתנה
        ClickElement(BasePage.By.className("span.selected-text"));//pick an event birthday
        ClickElement(BasePage.By.className("data-parsley-id=41"));//הכנסת ברכה
        ClickElement(BasePage.By.className("המון מזל טוב ליום ההולדת,\n" +
                "שיהיה יום מדהים, מלא באושר ובחיוכים עד 120\n" +
                "ממני באהבה בעלך האוהב\n" +
                "שמעון"));
        ClickElement(BasePage.By.id("label#ember3071.media-circle-bth.ember-view.bm-media-upload"));//העלאת תמונה מהמחשב
        ClickElement(BasePage.By.className("span.label"));//לחיצה על כפתור "המשך"
        ClickElement(BasePage.By.className("circle.fill"));//לחיצה על כפתור "עכשיו"
        ClickElement(BasePage.By.xpath("path.circle"));//pick email
        ClickElement(BasePage.By.id("input#email.ember-view.ember-text-field"));//enter email address
        ClickElement(BasePage.By.id("input#ember3184.ember-view.ember-text-field"));//enter sender name
        ClickElement(BasePage.By.className("span.label"));//לחיצה על כפתור "תשלום"
        test.log(INFO, "Login screen");
        Assert.assertEquals(myElement, "Shimon");
        Assert.assertEquals(myElement, "Merav");
    }

        public static Object className(String s) {
            return null;
        }

        public static BasePage.By id(String ember1178) {
            return null;
        }

        public static Object xpath(String s) {
            return null;
        }

    private static <TakesScreenshot> String takeScreenShot(WebDriver driver, String ImagesPath, TakesScreenshot takesScreenshot) {
        File destinationFile = new File(ImagesPath + ".png");
        try {
            File screenShotFile = null;
            FileUtils.copyFile(screenShotFile, destinationFile);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return ImagesPath + ".png";


    }

    @AfterClass
    public static void afterClass(String ImagesPath, Object FILE, Object String, Object Object) {
        imagesPath = ImagesPath;
        file = FILE;
        string = String;
        object = Object;
        extent.flush();
        driver.qite();
    }

    public static class By extends BasePage.By {
        public static By id(String ember1178) {
            return null;
        }
    }

    private static class FirstScreen {
        public void openURL() {

        }

        public void SignUpRegisterElement() {

        }

        public void RegisterElement() {

        }

        public void firstNameElement() {

        }

        public void emailElement() {

        }

        public void passwordElement() {

        }

        public void passwordConfirmElement() {

        }
    }
}



















        















