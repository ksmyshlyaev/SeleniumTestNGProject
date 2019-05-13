package pages;

import helper.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CareersLoginPage extends EnvironmentSetup {

    private WebDriver driver;
    private JavascriptExecutor js;
    private Actions action;
    private WebDriverWait wait;

    public CareersLoginPage(WebDriver driver, JavascriptExecutor js, Actions action, WebDriverWait wait){
        this.driver = driver;
        this.js = js;
        this.action = action;
        this.wait = wait;
    }

    public void EnterCredentialsAndLogin(String username, String password){
        driver.findElement(By.id(Locators.careersLoginUsernameId)).sendKeys(username);
        driver.findElement(By.id(Locators.careersLoginPasswordId)).sendKeys(password);
        driver.findElement(By.id(Locators.careersLoginButtonId)).click();

    }

    public String GetErrorMessageText(){
        return driver.findElement(By.id(Locators.careersLoginErrorMessageId)).getText();
    }
}
