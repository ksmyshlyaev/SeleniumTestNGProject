package pages;

import helper.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.Assert.fail;

public class SignInPage {

    private WebDriver driver;
    private JavascriptExecutor js;
    private Actions action;
    private WebDriverWait wait;

    public SignInPage(WebDriver driver, JavascriptExecutor js, Actions action, WebDriverWait wait){
        this.driver = driver;
        this.js = js;
        this.action = action;
        this.wait = wait;
    }

    public void LogInOracleAccount(String username, String password){
        driver.findElement(By.id(Locators.userNameInputId)).sendKeys(username);
        driver.findElement(By.id(Locators.userPasswordId)).sendKeys(password);
        driver.findElement(By.id(Locators.signInButtonSignInPageId)).click();
    }

    public String GetSignInErrorMessageText() {
        try{
            wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(Locators.signInErrorMessageXPath))));

        } catch(TimeoutException e){
            fail(e.toString());
        }
        return driver.findElement(By.xpath(Locators.signInErrorMessageXPath)).getText();
    }
}

