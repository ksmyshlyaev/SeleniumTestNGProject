package pages;
import helper.EnvironmentSetup;
import helper.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.Assert.fail;

public class MainPage extends EnvironmentSetup {
    public static String url = "https://www.oracle.com";

    public static void goToUrl() {
        driver.get(MainPage.url);
    }

    public static void goToSignInPage() {

        action.moveToElement(driver.findElement(By.cssSelector(Locators.signInButtonMainPageCssSelector))).pause(1000).perform();
        driver.findElement(By.xpath(Locators.signInToMyAccountButtonXPath)).click();
    }

    public static void goToItInterest() {

        WebElement itInterest = driver.findElement(By.cssSelector(Locators.interestItButtonCssSelector));
        js.executeScript("arguments[0].scrollIntoView();", itInterest);
        driver.findElement(By.cssSelector(Locators.interestItButtonCssSelector)).click();
    }

    public static void closePopupLanguageWindow(){
        try{
            wait = new WebDriverWait(driver, 5);
            wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(Locators.closeButtonOnLanguageWindowXPath))));

        } catch(TimeoutException e){
            fail(e.toString());
        }
            driver.findElement(By.xpath(Locators.closeButtonOnLanguageWindowXPath)).click();
    }

    public static void goToBigDataFromSandwichMenu() {

        action.moveToElement(driver.findElement(By.cssSelector(Locators.sandwichMenuCssSelector))).pause(1000).perform();
        action.moveToElement(driver.findElement(By.xpath(Locators.solutionsButtonXPath))).pause(1000).perform();
        action.moveToElement(driver.findElement(By.xpath(Locators.bigDataButtonXPath))).click().perform();

    }

    public static void clickJobsAtOracleButton(){
        wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(Locators.jobsAtOracleLinkXPath))));
        driver.findElement(By.xpath(Locators.jobsAtOracleLinkXPath)).click();
    }

}

