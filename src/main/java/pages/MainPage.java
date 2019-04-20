package pages;

import helper.EnvironmentSetup;
import helper.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
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
        try{
            wait = new WebDriverWait(driver, 5);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Locators.closeButtonOnLanguageWindow)));

        } catch(TimeoutException e){
            fail(e.toString());
        }
        if (driver.findElement(By.xpath(Locators.closeButtonOnLanguageWindow)).isDisplayed()) {
            driver.findElement(By.xpath(Locators.closeButtonOnLanguageWindow)).click();
        }

    }

    public static void goToBigDataFromSandwichMenu() {
        action = new Actions(driver);

        action.moveToElement(driver.findElement(By.cssSelector(Locators.sandwichMenuCssSelector))).pause(1000).perform();
        action.moveToElement(driver.findElement(By.xpath(Locators.solutionsButtonXPath))).pause(1000).perform();
        action.moveToElement(driver.findElement(By.xpath(Locators.bigDataButtonXPath))).click().perform();

        }
    }

