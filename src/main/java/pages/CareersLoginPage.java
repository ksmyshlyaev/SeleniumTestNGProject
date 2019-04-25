package pages;

import helper.*;
import org.openqa.selenium.By;

public class CareersLoginPage extends EnvironmentSetup {

    public static void EnterCredentialsAndLogin(String username, String password){
        driver.findElement(By.id(Locators.careersLoginUsernameId)).sendKeys(username);
        driver.findElement(By.id(Locators.careersLoginPasswordId)).sendKeys(password);
        driver.findElement(By.id(Locators.careersLoginButtonId)).click();

    }

    public static String GetErrorMessageText(){
        return driver.findElement(By.id(Locators.careersLoginErrorMessageId)).getText();
    }
}
