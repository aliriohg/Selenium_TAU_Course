package alerts;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.FileUploadPage;

import static org.testng.Assert.*;

public class FileUploadTest extends BaseTest {

    @Test
    public void testFileUpload() {
        FileUploadPage fileUploadPage = homePage.goToFileUpload();
        fileUploadPage.uploadFile("C:\\Users\\Ahernandez\\Documents\\projectsAli\\Selenium_TAU_Course\\resources\\chromedriver.exe");
        assertEquals(fileUploadPage.getUploadedFile(),"chromedriver.exe");
    }
}
