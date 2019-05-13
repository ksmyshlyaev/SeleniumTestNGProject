package pages;
import helper.Locators;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.Assert.fail;

public class MainPage {
    private WebDriver driver;
    private JavascriptExecutor js;
    private Actions action;
    private WebDriverWait wait;

    public MainPage(WebDriver driver, JavascriptExecutor js, Actions action, WebDriverWait wait){
        this.driver = driver;
        this.js = js;
        this.action = action;
        this.wait = wait;
    }

    public void goToUrl() {
        String url = "https://www.oracle.com";
        driver.get(url);
    }

    public void goToSignInPage() {

        action.moveToElement(driver.findElement(By.cssSelector(Locators.signInButtonMainPageCssSelector))).pause(1000).perform();
        driver.findElement(By.xpath(Locators.signInToMyAccountButtonXPath)).click();
    }

    public void goToItInterest() {

        WebElement itInterest = driver.findElement(By.cssSelector(Locators.interestItButtonCssSelector));
        js.executeScript("arguments[0].scrollIntoView();", itInterest);
        driver.findElement(By.cssSelector(Locators.interestItButtonCssSelector)).click();
    }

    public void closePopupLanguageWindow(){
        try{
            wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(Locators.closeButtonOnLanguageWindowXPath))));

        } catch(TimeoutException e){
            fail(e.toString());
        }
            driver.findElement(By.xpath(Locators.closeButtonOnLanguageWindowXPath)).click();
    }

    public void acceptCookies(){
        try {

            wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(Locators.acceptCookiesButtonXPath))));

        }
        catch (NoSuchElementException e){
            System.out.println("No cookies window appeared");
        }
        driver.findElement(By.xpath(Locators.acceptCookiesButtonXPath)).click();

    }

    public void goToBigDataFromSandwichMenu() {

        action.moveToElement(driver.findElement(By.cssSelector(Locators.sandwichMenuCssSelector))).pause(1000).perform();
        action.moveToElement(driver.findElement(By.xpath(Locators.solutionsButtonXPath))).pause(1000).perform();
        action.moveToElement(driver.findElement(By.xpath(Locators.bigDataButtonXPath))).click().perform();

    }

    public void goToEventsPage() {
        WebElement eventsButton = driver.findElement(By.xpath(Locators.eventsButtonXPath));
        js.executeScript("arguments[0].scrollIntoView();", eventsButton);
        driver.findElement(By.xpath(Locators.eventsButtonXPath)).click();
    }

    public void clickJobsAtOracleButton(){
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(Locators.jobsAtOracleLinkXPath))));
        driver.findElement(By.xpath(Locators.jobsAtOracleLinkXPath)).click();
    }

}

