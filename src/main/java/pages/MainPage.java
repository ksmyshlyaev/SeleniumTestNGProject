package pages;

import helper.EnvironmentSetup;
import helper.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.Assert.fail;

public class MainPage extends EnvironmentSetup {
    public static String url = "https://www.oracle.com";

    public static void goToUrl() {
        driver.get(MainPage.url);
    }

    public static void goToItInterest() {

        js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.cssSelector(Locators.interestItButtonCssSelector)));
        driver.findElement(By.cssSelector(Locators.interestItButtonCssSelector)).click();
    }

    public static void closePopupLanguageWindow(){
        wait = new WebDriverWait(driver, 10);
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath(Locators.closeButtonOnLanguageWindow))));
            if (driver.findElement(By.xpath(Locators.closeButtonOnLanguageWindow)).isDisplayed()){
                driver.findElement(By.xpath(Locators.closeButtonOnLanguageWindow)).click();}
        }
        catch (TimeoutException exception){
            fail(exception.toString());
        }
    }

    public static void goToBigDataFromSandwichMenu() throws InterruptedException {
        action = new Actions(driver);

        action.moveToElement(driver.findElement(By.cssSelector(Locators.sandwichMenuCssSelector))).pause(1000).perform();
        action.moveToElement(driver.findElement(By.xpath(Locators.solutionsButtonXPath))).pause(1000).perform();
        action.moveToElement(driver.findElement(By.xpath(Locators.bigDataButtonXPath))).click().perform();

        }
    }

