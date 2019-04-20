package pages;

import helper.EnvironmentSetup;
import helper.Locators;
import org.openqa.selenium.By;

public class BigDataMenuPage extends EnvironmentSetup {

    public static boolean checkBigDataHeadingIsDisplayed(){
        if (driver.findElement(By.xpath(Locators.bigDataHeadingXPath)).isDisplayed()) {
            return true;
        }
        else {
            return false;
        }
    }
}
