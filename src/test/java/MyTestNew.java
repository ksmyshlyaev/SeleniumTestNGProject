import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class MyTestNew extends  helper.EnvironmentSetup {

    @Test
    public void ApplyForJob() {
        MainPage mainPage = new MainPage(driver, js, action, wait);
        mainPage.goToUrl();
        mainPage.clickJobsAtOracleButton();
        CareersPage careersPage = new CareersPage(driver, js, action, wait);
        careersPage.ClickSearchForJobsButton();
        careersPage.SearchForJobs("QA Analyst");
        careersPage.ApplyForFirstJob();
        CareersLoginPage careersLoginPage = new CareersLoginPage(driver, js, action, wait);
        careersLoginPage.EnterCredentialsAndLogin("dsdasdasdasdasd", "dasdasdasdasdasd");
        Assert.assertEquals(careersLoginPage.GetErrorMessageText(), "The action cannot be completed.\n" +
                " The user name and password combination you entered does not correspond to a registered user.\n" + " ");
    }
}
