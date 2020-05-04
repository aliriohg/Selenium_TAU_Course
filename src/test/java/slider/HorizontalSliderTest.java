package slider;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HorizontalSliderPage;

import static org.testng.Assert.*;

public class HorizontalSliderTest extends BaseTest {

    @Test
    public void testSliderToRight(){
        HorizontalSliderPage horizontalSliderPage = homePage.goToHorizontalSlider();
        horizontalSliderPage.sliderToRight(4);
        assertEquals(horizontalSliderPage.getValue(),"4.5","value is incorrect");
    }

    @Test
    public void testSliderToLeft(){
        HorizontalSliderPage horizontalSliderPage = homePage.goToHorizontalSlider();
        horizontalSliderPage.sliderToLeft(4);
        assertEquals(horizontalSliderPage.getValue(),"0.5","value is incorrect");
    }
}
