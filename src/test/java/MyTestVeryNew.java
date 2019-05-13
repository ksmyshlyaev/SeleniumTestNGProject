import helper. *;
import org.testng.annotations.Test;
import pages.MainPage;

import static org.testng.Assert.assertEquals;


public class MyTestVeryNew extends EnvironmentSetup {

    @Test
    public void CheckEventsPageTitle(){
        MainPage mainPage = new MainPage(driver, js, action, wait);
        mainPage.goToUrl();
        mainPage.goToEventsPage();
        assertEquals(driver.getTitle(), "Events Search");
    }
}
