package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class EntryAdPage {
    private WebDriverWait wait;
    private WebDriver driver;
    private By bodyAd = By.className("modal-body");
    private By closeAd = By.className("modal-footer");
    private By bodyPage = By.className("example");

    public EntryAdPage(WebDriver driver) {
        this.driver=driver;
        this.wait =new WebDriverWait(driver,30);
    }
    public String getBodyAdText(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(bodyAd)).getText();
    }
    public void closeAd(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(closeAd)).click();
    }

    public String getBodyPageText(){
        return driver.findElement(bodyPage).getText();
    }


}
