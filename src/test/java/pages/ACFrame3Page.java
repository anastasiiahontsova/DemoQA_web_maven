package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ACFrame3Page extends BasePage{

    public ACFrame3Page(WebDriver driver) {
        super(driver);
    }


    @FindBy(id = "frame3")
    WebElement iFrame3;
    @FindBy(id = "click_me_3")
    WebElement btn3;

    @FindBy(id = "frame4")
    WebElement iFrame4;

    public ACFrame3Page clickOnBtn3() {
        waitForElementToBeClickable(btn3);
        btn3.click();
        return this;
    }

    public ACFrame4Page switchToFrame4() {
        driver.switchTo().frame(iFrame4);
        return new ACFrame4Page(driver);
    }


    public ACFrame2Page switchToParent(){
        driver.switchTo().parentFrame();
        return new ACFrame2Page(driver);
    }
}
