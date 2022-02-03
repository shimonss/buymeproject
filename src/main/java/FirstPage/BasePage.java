package FirstPage;


import MainPage.MainClass;

public class BasePage {

    private By locator;

    public void clickElement(By locator) {
        this.locator = locator;
        getWebElement(locator).click();
    }

    public void sendKeysToElement(By locator, String text) {
        getWebElement(locator).sendKeys(text);
    }

    private WebElement getWebElement(By locator) {
        return Driversingelton.getDriverInstance().findElement(locator);
    }

    public static class By {
        public static Object className(String s) {
            return null;
        }

        public static Object id(String s) {
            return null;
        }

        public static Object xpath(String s) {
            return null;
        }
    }
}







