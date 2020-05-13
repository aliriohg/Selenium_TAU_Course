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
    public EntryAdPage goToEntryAd() {
        clickLinkText("Entry Ad");
        return new EntryAdPage(driver);
    }
    public WYSIWYGEditorPage goToWYSIWYGEditor() {
        clickLinkText("WYSIWYG Editor");
        return new WYSIWYGEditorPage(driver);
    }
    public FramesPage goToFramesPAge(){
        clickLinkText("Frames");
        return new FramesPage(driver);
    }
    public DynamicLoadingPage goToDynamicLoading(){
        clickLinkText("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }
    public LargeAndDeepDomPage goToLargeDeepDOM(){
        clickLinkText("Large & Deep DOM");
        return new LargeAndDeepDomPage(driver);
    }
    public InfiniteScrollPage goToInfiniteScroll(){
        clickLinkText("Infinite Scroll");
        return new InfiniteScrollPage(driver);
    }
    public MultipleWindowsPage goToMultipleWindows(){
        clickLinkText("Multiple Windows");
        return new MultipleWindowsPage(driver);
    }

    public void clickLinkText(String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }
}
