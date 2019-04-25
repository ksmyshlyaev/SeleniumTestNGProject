import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class MyTestNew extends  helper.EnvironmentSetup {

    @Test
    public void ApplyForJob() {
        MainPage.goToUrl();
        MainPage.clickJobsAtOracleButton();
        CareersPage.ClickSearchForJobsButton();
        CareersPage.SearchForJobs("QA Analyst");
        CareersPage.ApplyForFirstJob();
        CareersLoginPage.EnterCredentialsAndLogin("dsdasdasdasdasd", "dasdasdasdasdasd");
        Assert.assertEquals(CareersLoginPage.GetErrorMessageText(), "The action cannot be completed.\n" +
                " The user name and password combination you entered does not correspond to a registered user.\n" + " ");
    }
}
