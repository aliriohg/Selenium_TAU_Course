package base;

import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.*;
import pages.HomePage;
import utils.WindowManager;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver(getChromeOptions());
        goHome();
//        setCookie();
        homePage = new HomePage(driver);
    }

    @BeforeMethod
    public void goHome() {
        driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterMethod
    public void recordFailure(ITestResult iTestResult) {
        if (ITestResult.FAILURE == iTestResult.getStatus()) {
            TakesScreenshot camera = (TakesScreenshot) driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            try {
                Files.move(screenshot, new File("resources/screenshots/" + iTestResult.getName() + ".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public WindowManager getWindowManager() {
        return new WindowManager(driver);
    }

    private ChromeOptions getChromeOptions() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        //options.setHeadless(true);
        return options;
    }

    private void setCookie(){
        Cookie cookie = new Cookie.Builder("tau","123")
                .domain("the-internet.herokuapp.com").build();
        driver.manage().addCookie(cookie);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
