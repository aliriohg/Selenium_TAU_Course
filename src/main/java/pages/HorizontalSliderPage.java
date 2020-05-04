package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HorizontalSliderPage {
    private WebDriver driver;
    private By slider = By.tagName("input");
    private By value = By.id("range");
    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void sliderToRight(int count){
       WebElement sliderElement = driver.findElement(slider);
        sliderElement.click();
       for(int i = 0; i<count; i++) {
           sliderElement.sendKeys(Keys.RIGHT);
       }
    }
    public void sliderToLeft(int count){
        WebElement sliderElement = driver.findElement(slider);
        sliderElement.click();
        for(int i = 0; i<count;i++){
            sliderElement.sendKeys(Keys.LEFT);
        }
    }
    public String getValue(){
        return driver.findElement(value).getText();
    }
}
