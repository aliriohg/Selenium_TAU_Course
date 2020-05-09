package modals;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.EntryAdPage;

import static org.testng.Assert.*;

public class ModalsTest extends BaseTest {

    @Test
    public void testValidateLoadModalWindow() {
        EntryAdPage entryAdPage = homePage.goToEntryAd();
        assertEquals(entryAdPage.getBodyAdText(), "It's commonly used to encourage a user to take an action (e.g., give their e-mail address to sign up for something or disable their ad blocker).");
    }

    @Test
    public void testClostAd() {
        EntryAdPage entryAdPage = homePage.goToEntryAd();
        entryAdPage.closeAd();
        assertEquals(entryAdPage.getBodyPageText(), "Entry Ad\n" +
                "Displays an ad on page load.\n" +
                "If closed, it will not appear on subsequent page loads.\n" +
                "To re-enable it, click here.");
    }
}
