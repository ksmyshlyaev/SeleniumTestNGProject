package pages;

import helper.EnvironmentSetup;
import helper.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ITInterestPage extends EnvironmentSetup {

    public static String url = "https://www.oracle.com/area-of-interest/it.html";

    public static void selectLearnMoreAutonomousDatabase() {
        driver.findElement(By.xpath(Locators.learnMoreAutonomousDatabaseXPath)).click();
    }

    public static void selectMachineLearningIcon() {
        try {
            wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(Locators.machineLearningButtonXPath))));
        }
        catch (TimeoutException e){
            Assert.fail(e.toString());
        }
        driver.findElement(By.xpath(Locators.machineLearningButtonXPath)).click();
    }

    public static String getMachineLearningText() {
        try {
            wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath(Locators.machineLearningFormTextXPath)), "As your personal data concierge"));
        }
        catch (TimeoutException e){
            Assert.fail(e.toString());
        }
        return  driver.findElement(By.xpath(Locators.machineLearningFormTextXPath)).getText();
    }
}

