package javascript;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.DropDownPage;
import pages.InfiniteScrollPage;
import pages.LargeAndDeepDomPage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class JavaScriptTests extends BaseTest {

    @Test
    public void testScrollToTable(){
        LargeAndDeepDomPage largeAndDeepDomPage = homePage.goToLargeDeepDOM();
        largeAndDeepDomPage.scrollToTable();
        assertEquals("","");
    }
    @Test
    public void testScrollToFithParagraph(){
        InfiniteScrollPage infiniteScrollPage = homePage.goToInfiniteScroll();
        infiniteScrollPage.scrollToParagraph(5);
    }

    @Test
    public void testAddMultipleAttributeToDropdown() {

        DropDownPage dropDownPage = homePage.goToDropDownPage();
        dropDownPage.addMultipleAttribute();

        List<String> optionsToSelect = Arrays.asList("Option 1", "Option 2");
        optionsToSelect.forEach(dropDownPage::selectFromDropDown);

        List<String> selectedOptions = dropDownPage.getSelectedOptions();
        assertTrue(selectedOptions.containsAll(optionsToSelect), "All options were not selected");
        assertEquals(selectedOptions.size(), optionsToSelect.size(), "Number of selected items");
    }
}
