import helper.EnvironmentSetup;
import helper.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import pages.BigDataMenuPage;
import pages.MainPage;

import static org.testng.Assert.*;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

public class MyTest extends helper.EnvironmentSetup {

    @Test
    public void TestForMenu() {
        MainPage.goToUrl();
        MainPage.closePopupLanguageWindow();
        MainPage.goToBigDataFromSandwichMenu();
        assertEquals(driver.getTitle(), "Big Data | Oracle");
        assertTrue(BigDataMenuPage.checkBigDataHeadingIsDisplayed());
    }

    @Test
    public void SimpleTest() {
        driver.get("https://oracle.com");
        assertEquals(driver.getTitle(), "Oracle | Integrated Cloud Applications and Platform Services");
    }
}
