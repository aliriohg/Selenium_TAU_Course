package alerts;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.AlertPage;

import static org.testng.Assert.*;

public class AlertTest extends BaseTest {
    @Test
    public void testAceptAlert(){
        AlertPage alertPage = homePage.goToAlertPage();
        alertPage.triggerAlert();
        alertPage.alert_clickToAccept();
        assertEquals(alertPage.getResult(),"You successfuly clicked an alert","result message is incorrect");
    }
    @Test
    public void testCancelAlert(){
        AlertPage alertPage = homePage.goToAlertPage();
        alertPage.triggerConfirmAlert();
        alertPage.alert_clickToDismiss();
        assertEquals(alertPage.getResult(),"You clicked: Cancel","result message is incorrect");
    }
    @Test
    public void testGetTextAlert(){
        AlertPage alertPage = homePage.goToAlertPage();
        alertPage.triggerConfirmAlert();
        assertEquals(alertPage.alert_getText(),"I am a JS Confirm","result message is incorrect");
        alertPage.alert_clickToAccept();
    }

    @Test
    public void testSendKeysAlert(){
        AlertPage alertPage = homePage.goToAlertPage();
        alertPage.triggerPrompt();
        alertPage.alert_sendKeys("Hi ali");
        alertPage.alert_clickToAccept();
        assertEquals(alertPage.getResult(),"You entered: Hi ali","result message is incorrect");

    }
}
