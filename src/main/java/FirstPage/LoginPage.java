package FirstPage;

import MainPage.MainClass;

import static FirstPage.PomTest.LoginPage.pressLogin;

public class LoginPage extends BasePage{
    public void login(){
        enterCredentials();
        pressLogin();
    }
    public void enterCredentials(){
        sendKeysToElement(MainClass.By.id("userName"), "shimonss1974@gmail.com");
        sendKeysToElement(MainClass.By.id("password"), "Vvxr5jph1974");
    }



    }



