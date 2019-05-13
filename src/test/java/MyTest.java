import io.qameta.allure.Description;
import org.testng.annotations.Test;
import pages.*;

import static org.testng.Assert.*;
import static org.testng.Assert.assertEquals;

public class MyTest extends helper.EnvironmentSetup {

    @Test(groups = "functest")
    public void TestForMenu() {

        MainPage mainPage = new MainPage(driver, js, action, wait);
        mainPage.goToUrl();
        //MainPage.acceptCookies();
        //MainPage.closePopupLanguageWindow();
        mainPage.goToBigDataFromSandwichMenu();
        BigDataMenuPage bigDataMenuPage = new BigDataMenuPage(driver, js, action, wait);
        assertEquals(driver.getTitle(), "Big Data | Oracle");
        assertTrue(bigDataMenuPage.checkBigDataHeadingIsDisplayed());
    }

    @Test(groups = "functest")
    @Description("Just to add more green color to reports...")
    public void CheckMainPageTitle() {
        MainPage mainPage = new MainPage(driver, js, action, wait);
        mainPage.goToUrl();
        assertEquals(driver.getTitle(), "Oracle | Integrated Cloud Applications and Platform Services");
    }

    @Test
    public void CheckMachineLearningText() {
        MainPage mainPage = new MainPage(driver, js, action, wait);
        mainPage.goToUrl();
        mainPage.goToItInterest();
        ITInterestPage itInterestPage = new ITInterestPage(driver, js, action, wait);
        itInterestPage.selectLearnMoreAutonomousDatabase();
        itInterestPage.selectMachineLearningIcon();
        assertEquals(itInterestPage.getMachineLearningText(), "As your personal data concierge, Oracle Autonomous Database monitors " +
                "your workloads and keeps track of who can access your data. It knows when you need more capacity and how to optimize performance.");
    }

    @Test
    public void SignInWithWrongCredentials() {
        MainPage mainPage = new MainPage(driver, js, action, wait);
        mainPage.goToUrl();
        mainPage.closePopupLanguageWindow();
        mainPage.goToSignInPage();
        SignInPage signInPage = new SignInPage(driver, js, action, wait);
        signInPage.LogInOracleAccount("asdasdasd", "password123123123");
        assertEquals(signInPage.GetSignInErrorMessageText(), "Invalid login");
    }
}
