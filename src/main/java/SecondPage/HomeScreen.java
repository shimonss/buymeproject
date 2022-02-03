package SecondPage;

import MainPage.MainClass;

import static FirstPage.PomTest.driver;

public class HomeScreen {
    private void PickPricePoint() throws InterruptedException {
        driver.findElement(MainClass.By.id("selected-text-עד 99 שקלים")).click();//הזנת הסכום
        driver.findElement(MainClass.By.id("selected-text-תל-אביב והסביבה")).click();//בחירת אזור
        driver.findElement(MainClass.By.id("selected-text-המתנות המומלצות של איתי לוי")).click();//בחירת קטגוריה
        driver.findElement(MainClass.By.id("ember2626")).click();//לחיצה על "תמצאו לי מתנה"



    }
}

