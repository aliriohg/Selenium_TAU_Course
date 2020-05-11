package frames;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.NestedFramePage;
import pages.WYSIWYGEditorPage;

import static org.testng.Assert.*;

public class FrameTests extends BaseTest {

    @Test
    public void testWysiwyg(){
        WYSIWYGEditorPage wysiwygEditorPage = homePage.goToWYSIWYGEditor();
        wysiwygEditorPage.clearTextArea();
        String text1 = "hola";
        String text2 = "Ali";
        wysiwygEditorPage.setTextArea(text1);
        wysiwygEditorPage.decreaseIndention();
        wysiwygEditorPage.setTextArea(text2);
        assertEquals(wysiwygEditorPage.getTextFromEditor(),text1+text2,"Text from editor is incorrect");
    }
    @Test
    public void testFrameText() {
        NestedFramePage nestedFramesPage = homePage.goToFramesPAge().goToNestedFrame();
        assertEquals(nestedFramesPage.getLeftFrameText(), "LEFT", "Left frame text incorrect");
        assertEquals(nestedFramesPage.getBottomFrameText(), "BOTTOM", "Bottom frame text incorrect");
    }
}
