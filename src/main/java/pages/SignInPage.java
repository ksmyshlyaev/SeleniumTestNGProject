package pages;

import helper.EnvironmentSetup;
import helper.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.Assert.fail;

public class SignInPage extends EnvironmentSetup {

    public static void LogInOracleAccount(String username, String password){
        driver.findElement(By.id(Locators.userNameInputId)).sendKeys(username);
        driver.findElement(By.id(Locators.userPasswordId)).sendKeys(password);
        driver.findElement(By.id(Locators.signInButtonSignInPageId)).click();
    }

    public static String GetSignInErrorMessageText() {
        try{
            wait = new WebDriverWait(driver, 8);
            wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(Locators.signInErrorMessageXPath))));

        } catch(TimeoutException e){
            fail(e.toString());
        }
        return driver.findElement(By.xpath(Locators.signInErrorMessageXPath)).getText();
    }
}

