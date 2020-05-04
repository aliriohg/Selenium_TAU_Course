package dropDown;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.DropDownPage;

import java.util.List;

import static org.testng.Assert.*;

public class DropDownTest extends BaseTest {

    @Test
    public void testSelectOption() {
        DropDownPage dropDownPage = homePage.goToDropDownPage();
        String option ="Option 1";
        dropDownPage.selectFromDropdown(option);
        List<String> selectedOptions = dropDownPage.getSelectedOption();
        assertTrue(selectedOptions.contains(option));
    }
}
