package helper;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class EnvironmentSetup {

    public static ChromeDriver driver;
    public static Actions action;
    public static WebDriverWait wait;
    public static JavascriptExecutor js = driver;

    @BeforeTest
    @Ignore
    public void setUp(){
        String driverPath = "\\src\\main\\resources\\drivers\\chromedriver.exe";
        String workingDir = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", workingDir + driverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @Ignore
    @AfterTest
    public void close(){
        driver.quit();

    }
}
