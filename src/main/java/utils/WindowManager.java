package utils;

import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Set;

public class WindowManager {
    private WebDriver driver;
    private WebDriver.Navigation navigation;

    public WindowManager(WebDriver driver) {
        this.driver = driver;
        this.navigation = driver.navigate();
    }

    public void goBack() {
        navigation.back();
    }

    public void goForward() {
        navigation.forward();
    }

    public void refreshPage() {
        navigation.refresh();
    }

    public void goTo(String url) {
        navigation.to(url);
    }

    public void switchToTab(String name) {
        Set<String> windows = driver.getWindowHandles();
        System.out.println("number of tabs: " + windows.size());
        System.out.println("Windows Handles");
        windows.forEach(System.out::println);
        for (String window : windows) {
            driver.switchTo().window(window);
            System.out.println("current window title: "+driver.getTitle());
            if (name.equals(driver.getTitle())){
                break;
            }
        }
    }
    public void switchToNewTab(){
        Set<String> windows = driver.getWindowHandles();
        windows.forEach(driver.switchTo()::window);
    }
}