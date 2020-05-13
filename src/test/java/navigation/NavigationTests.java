package navigation;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.DynamicLoadingExample2Page;
import pages.MultipleWindowsPage;
import utils.WindowManager;

import static org.testng.Assert.assertTrue;

public class NavigationTests extends BaseTest {

    @Test
    public void testNavigator(){
        homePage.goToDynamicLoading().clickExample1();
        getWindowManager().goBack();
        getWindowManager().refreshPage();
        getWindowManager().goForward();
        getWindowManager().goTo("https://www.google.com");

    }

    @Test
    public void testSwitchTab(){
        homePage.goToMultipleWindows().clickHereLink();
        getWindowManager().switchToTab("New Window");
    }
    @Test
    public void testWindowTabs(){
        DynamicLoadingExample2Page buttonPage = homePage.goToDynamicLoading().rightClickOnExample2Link();
        getWindowManager().switchToNewTab();
        assertTrue(buttonPage.isStartButtonDisplayed(), "Start button is not displayed");
    }
}
