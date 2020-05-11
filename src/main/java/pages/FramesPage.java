package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage {
    private WebDriver driver;
    private By nestedFrame = By.linkText("Nested Frames");

    public FramesPage(WebDriver driver) {
        this.driver = driver;
    }

    public NestedFramePage goToNestedFrame(){
        driver.findElement(nestedFrame).click();
        return new NestedFramePage(driver);
    }

}
