package pages;

import helper.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ITInterestPage {

    private WebDriver driver;
    private JavascriptExecutor js;
    private Actions action;
    private WebDriverWait wait;

    public ITInterestPage(WebDriver driver, JavascriptExecutor js, Actions action, WebDriverWait wait){
        this.driver = driver;
        this.js = js;
        this.action = action;
        this.wait = wait;
    }

    public void selectLearnMoreAutonomousDatabase() {
        driver.findElement(By.xpath(Locators.learnMoreAutonomousDatabaseXPath)).click();
    }

    public void selectMachineLearningIcon() {
        try {
            wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(Locators.machineLearningButtonXPath))));
        }
        catch (TimeoutException e){
            Assert.fail(e.toString());
        }
        driver.findElement(By.xpath(Locators.machineLearningButtonXPath)).click();
    }

    public String getMachineLearningText() {
        try {
            wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath(Locators.machineLearningFormTextXPath)), "As your personal data concierge"));
        }
        catch (TimeoutException e){
            Assert.fail(e.toString());
        }
        return  driver.findElement(By.xpath(Locators.machineLearningFormTextXPath)).getText();
    }
}

