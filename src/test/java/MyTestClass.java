import helper.EnvironmentSetup;
import helper.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import pages.MainPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

public class MyTestClass extends helper.EnvironmentSetup {

    @Test
    public void TestForMenu() throws InterruptedException {
        MainPage.goToUrl();
        MainPage.goToBigDataFromSandwichMenu();
        try {
            wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.urlContains("big-data"));
            Assert.assertEquals(driver.getTitle(), "Big Data | Oracle");
        }
        catch (TimeoutException exception){
            fail(exception.toString());
        }
    }
}
