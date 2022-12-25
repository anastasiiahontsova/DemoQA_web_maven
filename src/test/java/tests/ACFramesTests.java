package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ACFramesPage;

public class ACFramesTests extends BaseTests{
    @BeforeMethod
    public void ensurePreconditions(){
        new ACFramesPage(driver).goWithURL();
    }

    @Test
    public void frame1ButtonClickTest(){
        new ACFramesPage(driver)
                .switchToFrame1()
                .clickOnBtn1();
    }

    @Test
    public void frame2ButtonClickTest(){
        new ACFramesPage(driver)
                .switchToFrame1()
                .switchToFrame2()
                .clickOnBtn2();
    }

    @Test
    public void frameSequence21ButtonsClicksTest(){
        new ACFramesPage(driver)
                .switchToFrame1()
                .switchToFrame2()
                .clickOnBtn2()
                .switchToParent()
                .clickOnBtn1();
    }

    @Test
    public void switchToFrameByIdTest(){
        new ACFramesPage(driver)
                .switchToFrame1ById()
                .clickOnBtn1();
    }

    // todo: HW
    // @Test 1: click on Button 4
    @Test
    public void clickOnBtn4Test(){
        new ACFramesPage(driver)
                .switchToFrame1()
                .switchToFrame2()
                .switchToFrame3()
                .switchToFrame4()
                .clickOnBtn4();
    }
    // @Test 2: click on Button 4, click on Button 1, click on Button 2, click on Button 4
    @Test
    public void clickOnVariousBtnsTest() {
        new ACFramesPage(driver)
                .switchToFrame1()
                .switchToFrame2()
                .switchToFrame3()
                .switchToFrame4()
                .clickOnBtn4()
                .switchToParent()
                .switchToParent()
                .switchToParent()
                .clickOnBtn1()
                .switchToFrame2()
                .clickOnBtn2()
                .switchToFrame3()
                .switchToFrame4()
                .clickOnBtn4();
    }

}
