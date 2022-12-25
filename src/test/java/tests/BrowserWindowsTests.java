package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BrowserWindowsPage;
import pages.NewWindowMessagePage;

public class BrowserWindowsTests extends BaseTests {
    @BeforeMethod
    public void ensurePreconditions() {
        new BrowserWindowsPage(driver).goToWithURL();
    }

    @Test
    public void openNewTabTestPositive() {
        String actualSampleHeadingText = new BrowserWindowsPage(driver)
                .clickOnNewTabBtn()
                .getSampleHeadingText();

        Assert.assertEquals(actualSampleHeadingText, "This is a sample page",
                "Actual heading text is: " + actualSampleHeadingText);
    }


    @Test
    public void openNewWindowTestPositive() {
        String actualSampleHeadingText = new BrowserWindowsPage(driver)
                .clickOnNewWindowBtn()
                .getSampleHeadingText();

        Assert.assertEquals(actualSampleHeadingText, "This is a sample page",
                "Actual heading text is: " + actualSampleHeadingText);
    }

    //HW: add test for 'New Window Message' btn]

    @Test
    public void openNewWindowMessageTestPositive() {
        String expectedNewWindowMessageText = "Knowledge increases by sharing but not by saving. " +
                "Please share this website with your friends and in your organization." +
                "Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization.";


        String actualNewWindowMessageText = new NewWindowMessagePage(driver)
                .clickOnNewWindowMessageBtn()
                .getNewWindowMessageText();

        Assert.assertEquals(actualNewWindowMessageText, expectedNewWindowMessageText, "Actual newWindowMessage text is: ");
    }


}
