package pages;

import helper.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CareersPage extends EnvironmentSetup {

    public static void ClickSearchForJobsButton(){
        driver.findElement(By.xpath(Locators.searchForJobsButtonXPath)).click();
    }

    public static void SearchForJobs(String jobTitle, String jobArea){
        driver.findElement(By.id(Locators.jobTitleSearchFieldId)).sendKeys(jobTitle);
        driver.findElement(By.id(Locators.jobAreaSearchFieldId)).sendKeys(jobArea);
        driver.findElement(By.id(Locators.searchForJobsApplyButtonId)).click();
    }

    public static void SearchForJobs(String jobTitle) {
        driver.findElement(By.id(Locators.jobTitleSearchFieldId)).sendKeys(jobTitle);
        driver.findElement(By.id(Locators.searchForJobsApplyButtonId)).click();
    }

    public static void ApplyForFirstJob(){

        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.id(Locators.progressIndicatorId))));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(Locators.applyForFirstJobXPath))));

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
