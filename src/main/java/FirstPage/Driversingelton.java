package FirstPage;

import MainPage.WebDriver;
import org.w3c.dom.Document;

import java.io.File;

import static org.apache.struts.tiles.ComponentDefinition.URL;

public class Driversingelton {
    static String getInstance(Class<Object> classLoader) throws Exception {
        WebDriver driver = null;
        if (driver == null) {
            String type = getData("browserType");
            if (type.equals("chrome")) {
                System.setProperty("WebDriver.chrome.driver", Constant.CHROMEDRIVER_PATH);
                driver = new WebDriver();
            } else if (type.equals("FF")) {
                String xmlFilePath = String.valueOf(new File(classLoader.getResource("data.xml").getFile()));
                Document doc = null;
                doc.getDocumentElement().normalize();
                String keyName = null;
                return doc.getElementsByTagName(keyName).item(0).getTextContent();

            }
        }


        Object browserType = null;
        Object browserType1 = browserType;{
            return null;
        }


    }

    private static String getData(String browserType) {
        return null;
    }

    public static ChromeDriver getDriverInstance() {
        return null;
    }
}

















