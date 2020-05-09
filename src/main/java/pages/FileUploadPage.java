package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private By inputField = By.id("file-upload");
    private By uploadButton = By.id("file-submit");
    private By uploadedFile = By.id("uploaded-files");

    private WebDriver driver;
    public FileUploadPage(WebDriver driver) {
        this.driver=driver;
    }
    public void uploadFile(String absolutedPathOfFile){
        driver.findElement(inputField).sendKeys(absolutedPathOfFile);
        clickUploadButton();

    }
    public void clickUploadButton(){
        driver.findElement(uploadButton).click();
    }
    public String getUploadedFile(){
     return driver.findElement(uploadedFile).getText();
    }
}
