package Keys;

import base.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.KeyPressesPage;

import static org.testng.Assert.*;

public class KeysTest extends BaseTest {

    @Test
    public void testBackSpace(){
        KeyPressesPage keyPressesPage = homePage.goToKeyPresses();
        keyPressesPage.enterText("Hola"+ Keys.BACK_SPACE);

        assertEquals(keyPressesPage.getResult(),"You entered: BACK_SPACE", "the result is incorrect");
    }
    @Test
    public void testPi(){
        KeyPressesPage keyPressesPage = homePage.goToKeyPresses();
        keyPressesPage.enterPi();
        assertEquals(keyPressesPage.getResult(),"You entered: 4", "the result is incorrect");

    }
}
