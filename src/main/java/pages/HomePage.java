package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage goToLogginPage() {
        clickLinkText("Form Authentication");
        return new LoginPage(driver);
    }

    public DropDownPage goToDropDownPage() {
        clickLinkText("Dropdown");
        return new DropDownPage(driver);
    }

    public HoversPage goToHoverPAge() {
        clickLinkText("Hovers");
        return new HoversPage(driver);
    }

    public KeyPressesPage goToKeyPresses() {
        clickLinkText("Key Presses");
        return new KeyPressesPage(driver);
    }

    public HorizontalSliderPage goToHorizontalSlider() {
        clickLinkText("Horizontal Slider");
        return new HorizontalSliderPage(driver);
    }

    public AlertPage goToAlertPage() {
        clickLinkText("JavaScript Alerts");
        return new AlertPage(driver);
    }
    public FileUploadPage goToFileUpload() {
        clickLinkText("File Upload");
        return new FileUploadPage(driver);
    }
    public void clickLinkText(String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }
}
