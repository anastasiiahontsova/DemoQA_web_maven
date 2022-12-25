package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ACExpectedConditionsPage;

public class ACExpectedConditionsTests extends BaseTests{
    @BeforeMethod
    public void ensurePreconditions(){
        new ACExpectedConditionsPage(driver).goWithURL();
    }

    @Test
    public void showAlertTest(){
        String actualAlertHandledBadgeText = new ACExpectedConditionsPage(driver)
                .interactWithShowAlert()
                .getAlertHandledBageText();
        Assert.assertEquals(actualAlertHandledBadgeText, "Alert handled",
                "The Alert handling text appeared: " + actualAlertHandledBadgeText);
    }

    @Test
    public void acceptPromtTest(){
        String actualPromptHandledBadgeText =
                new ACExpectedConditionsPage(driver)
                        .acceptPromptAlert()
                        .getPromtHandledBageText();
        Assert.assertEquals(actualPromptHandledBadgeText, "OK",
                "The Prompt handling text appeared: " + actualPromptHandledBadgeText);
    }

    @Test
    public void cancelPromtTest(){
        //todo: HW
    }
}
