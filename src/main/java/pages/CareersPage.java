package pages;

import helper.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.Assert.fail;

public class CareersPage {

    private WebDriver driver;
    private JavascriptExecutor js;
    private Actions action;
    private WebDriverWait wait;

    public CareersPage(WebDriver driver, JavascriptExecutor js, Actions action, WebDriverWait wait){
        this.driver = driver;
        this.js = js;
        this.action = action;
        this.wait = wait;
    }


    public void ClickSearchForJobsButton(){
        driver.findElement(By.xpath(Locators.searchForJobsButtonXPath)).click();
    }

    public void SearchForJobs(String jobTitle, String jobArea){
        driver.findElement(By.id(Locators.jobTitleSearchFieldId)).sendKeys(jobTitle);
        driver.findElement(By.id(Locators.jobAreaSearchFieldId)).sendKeys(jobArea);
        driver.findElement(By.id(Locators.searchForJobsApplyButtonId)).click();
    }

    public void SearchForJobs(String jobTitle) {
        driver.findElement(By.id(Locators.jobTitleSearchFieldId)).sendKeys(jobTitle);
        driver.findElement(By.id(Locators.searchForJobsApplyButtonId)).click();
    }

    public void ApplyForFirstJob(){

        try {
            wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.id(Locators.progressIndicatorId))));
        }

        catch (TimeoutException e)
        {
            fail(e.toString());
        }

        try {
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(Locators.applyForFirstJobXPath))));
        }

        catch (TimeoutException e)
        {
            fail(e.toString());
        }


        try {
            WebElement apply = driver.findElement(By.xpath(Locators.applyForFirstJobXPath));
            apply.click();
        }
        catch (StaleElementReferenceException e) {
            WebElement apply = driver.findElement(By.xpath(Locators.applyForFirstJobXPath));
            apply.click();
        }

    }
}
