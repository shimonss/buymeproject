package FourthPage;

import MainPage.MainClass;
import org.testng.Assert;

public class SenderAndReceiverScreen {
    private boolean myElement;

    private void SenderAndReceiverInfoScreen()throws InterruptedException{
        sendKeysToElement(MainClass.By.id("span class=text"));//לחיצה על כפתור "למישהו אחר"
        sendKeysToElement(MainClass.By.id("ember2247"));//Enter receiver name
        sendKeysToElement(MainClass.By.id("span class selected-text"));//Pick an event birthday
        sendKeysToElement(MainClass.By.id("data-parsley-id=41"));
        sendKeysToElement(MainClass.By.id("המון מזל טוב ליום ההולדת" +
                "שיהיה יום מדהים, מלא באושר ובחיוכים " +
                "עד 120"+
                "ממני באהבה בעלך האוהב שמעון"));//הכנסת ברכה
        sendKeysToElement(MainClass.By.id("div class=thumbnail data-ember-action"));//העלאת תמונה מהמחשב
        sendKeysToElement(MainClass.By.id("span class=label"));//לחיצה על המשך
        sendKeysToElement(MainClass.By.id("circle class=check"));//לחיצה על כפתור עכשיו
        sendKeysToElement(MainClass.By.id("path class=circle"));//Pick email
        sendKeysToElement(MainClass.By.id("input id =email placeholder"));//Enter email address
        sendKeysToElement(MainClass.By.id("input id=ember2340 maxlength=25"));//הכנסת שם שולח המתנה
        sendKeysToElement(MainClass.By.id("span class=label"));//לחיצה על כפתור תשלום
        Assert.assertEquals(myElement, "Shimon");
        Assert.assertEquals(myElement, "Merav");





    }

    private void sendKeysToElement(MainClass.By id) {

    }
}


