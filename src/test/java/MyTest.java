import io.qameta.allure.Description;
import org.testng.annotations.Test;
import pages.*;

import static org.testng.Assert.*;
import static org.testng.Assert.assertEquals;

public class MyTest extends helper.EnvironmentSetup {

    @Test
    public void TestForMenu() {
        MainPage.goToUrl();
        //MainPage.closePopupLanguageWindow();
        MainPage.goToBigDataFromSandwichMenu();
        assertEquals(driver.getTitle(), "Big Data | Oracle");
        assertTrue(BigDataMenuPage.checkBigDataHeadingIsDisplayed());
    }

    @Test
    @Description("Just to add more green color to reports...")
    public void CheckMainPageTitle() {
        MainPage.goToUrl();
        assertEquals(driver.getTitle(), "Oracle | Integrated Cloud Applications and Platform Services");
    }

    @Test
    public void CheckMachineLearningText() {
        MainPage.goToUrl();
        MainPage.goToItInterest();
        ITInterestPage.selectLearnMoreAutonomousDatabase();
        ITInterestPage.selectMachineLearningIcon();
        assertEquals(ITInterestPage.getMachineLearningText(), "As your personal data concierge, Oracle Autonomous Database monitors " +
                "your workloads and keeps track of who can access your data. It knows when you need more capacity and how to optimize performance.");
    }

    @Test(description = "this test will always fall in headless mode. meh.")
    public void SignInWithWrongCredentials() {
        MainPage.goToUrl();
        MainPage.closePopupLanguageWindow();
        MainPage.goToSignInPage();
        SignInPage.LogInOracleAccount("asdasdasd", "password123123123");
        assertEquals(SignInPage.GetSignInErrorMessageText(), "Неправильное имя пользователя");
    }
}
