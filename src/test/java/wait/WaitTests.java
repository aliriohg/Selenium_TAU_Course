package wait;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.DynamicLoadingExample1Page;
import pages.DynamicLoadingExample2Page;

import static org.testng.Assert.assertEquals;

public class WaitTests extends BaseTest {

    @Test
    public void testWaitUntilHidden(){
        DynamicLoadingExample1Page loadingPage = homePage.goToDynamicLoading().clickExample1();
        loadingPage.clickStart();
        assertEquals(loadingPage.getLoadedText(),"Hello World!","loaded text is incorrect");
    }

    @Test
    public void testWaitUntilVisible(){
        DynamicLoadingExample2Page loadingPage = homePage.goToDynamicLoading().clickExample2();
        loadingPage.clickStart();
        assertEquals(loadingPage.getLoadedText(), "Hello World!", "Loaded text incorrect");
    }
}
