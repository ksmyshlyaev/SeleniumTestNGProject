package pages;

import helper.EnvironmentSetup;
import helper.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BigDataMenuPage {

    private WebDriver driver;
    private JavascriptExecutor js;
    private Actions action;
    private WebDriverWait wait;

    public BigDataMenuPage(WebDriver driver, JavascriptExecutor js, Actions action, WebDriverWait wait){
        this.driver = driver;
        this.js = js;
        this.action = action;
        this.wait = wait;
    }

    public boolean checkBigDataHeadingIsDisplayed(){
        if (driver.findElement(By.xpath(Locators.bigDataHeadingXPath)).isDisplayed()) {
            return true;
        }
        else {
            return false;
        }
    }
}
