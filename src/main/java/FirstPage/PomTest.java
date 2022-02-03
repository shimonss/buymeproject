package FirstPage;

import MainPage.WebDriver;
import org.testng.annotations.Test;

public class PomTest {
    public static WebDriver driver;

    @Test
    public void test01() {
        LoginPage loginPage = new LoginPage(driver);
        LoginPage.pressLogin();
        loginPage.setUserName();
    }

    static class LoginPage {
        public LoginPage(WebDriver driver) {

        }

        public static void pressLogin() {

        }

        public void setUserName() {

        }
    }
}
