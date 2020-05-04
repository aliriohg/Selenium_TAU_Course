package Hover;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HoversPage;

import static org.testng.Assert.*;

public class HoverTest extends BaseTest {

    @Test
    public void testHoverUser1() {
        HoversPage hoversPage = homePage.goToHoverPAge();
        HoversPage.FigureCaption caption = hoversPage.hoverOverFigure(1);
        assertTrue(caption.isCaptionDisplayed(),"caption not displayed");
        assertEquals(caption.getTitle(),"name: user1", "caption title is incorrect");
        assertEquals(caption.getLinkText(),"View profile","caption link text is incorrect");
        assertTrue(caption.getLink().endsWith("/users/1"),"caption link href is incorrect");
    }
}
