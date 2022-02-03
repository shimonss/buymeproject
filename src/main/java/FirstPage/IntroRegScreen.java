package FirstPage;

import MainPage.MainClass;
import org.testng.Assert;

public class IntroRegScreen {
    public static WebDriver driver;
    private boolean myElement;


    public static void chromeDriver() {
        System.setProperty("WebDriver.chrome.driver", Constant.CHROMEDRIVER_PATH);
        driver.get("https://buyme.co.il");//enter BuyMe website
    }

    public static void signButton() {
        WebElement signUpButton = (WebElement) driver.findElement(MainClass.By.id("ember1178"));//press כניסה\הרשמה
        signUpButton.sendKeys("fdsfds");

    }

    private void signIndetails() throws InterruptedException {
        sendKeysToElement(MainClass.By.id("ember1828"), "Shimon");//enter first name
        sendKeysToElement(MainClass.By.id("ember1835"), "shimonss1974@gmail.com");//enter valid email address
        sendKeysToElement(MainClass.By.id("valpass.ember"), "Vvxr5jph1974");//enter password
        sendKeysToElement(MainClass.By.id("ember1849"), "Vvxr5jph1974");//re-enter password
        driver.findElement(MainClass.By.id("span.label")).click();
        Assert.assertEquals(myElement, "Shimon");
        Assert.assertEquals(myElement, "shimonss1974@gmail.com");
        Assert.assertEquals(myElement, "Vvxr5jph1974");




    }

    private void sendKeysToElement(MainClass.By ember1828, String shimon) {

    }

    private void sendKeysToElement(MainClass.By ember1828) {

    }


    private static class WebDriver {
        public void get(String s) {

        }

        public WebElement findElement(MainClass.By id) {
            return null;
        }
    }
}


