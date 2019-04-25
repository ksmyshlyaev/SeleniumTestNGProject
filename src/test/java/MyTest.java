import helper.Locators;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.*;

import static org.testng.Assert.*;
import static org.testng.Assert.assertEquals;

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
    @Description("Just to add more green color to reports...")
    public void SimpleTest() {
        driver.get("https://oracle.com");
        assertEquals(driver.getTitle(), "Oracle | Integrated Cloud Applications and Platform Services");
    }

    @Test
    public void CheckMachineLearningText() throws InterruptedException {
        MainPage.goToUrl();
        MainPage.goToItInterest();
        ITInterestPage.selectLearnMoreAutonomousDatabase();
        ITInterestPage.selectMachineLearningIcon();
        Thread.sleep(1000);
        assertEquals(ITInterestPage.getMachineLearningText(), "As your personal data concierge, Oracle Autonomous Database monitors " +
                "your workloads and keeps track of who can access your data. It knows when you need more capacity and how to optimize performance.");
    }
}
