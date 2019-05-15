package helper;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class EnvironmentSetup {

    public WebDriver driver;
    public ChromeOptions options;
    public Actions action;
    public WebDriverWait wait;
    public JavascriptExecutor js;

    @BeforeClass
    public void setUp(){
        String driverPath = "\\src\\main\\resources\\drivers\\chromedriver.exe";
        String workingDir = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", workingDir + driverPath);

/*
        options  = new ChromeOptions();
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
*/
        driver = new ChromeDriver();

        action = new Actions(driver);
        wait = new WebDriverWait(driver, 5);
        js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @AfterClass
    public void close(){
        driver.quit();

    }
}
