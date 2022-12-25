package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ACFrame2Page extends BasePage{
    public ACFrame2Page(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "click_me_2")
    WebElement btn2;

    @FindBy(id = "frame3")
    WebElement iFrame3;
    public ACFrame2Page clickOnBtn2() {
        waitForElementToBeClickable(btn2);
        btn2.click();
        return this;
    }

    public ACFrame3Page switchToFrame3() {
        driver.switchTo().frame(iFrame3);
        return new ACFrame3Page(driver);
    }
    public ACFrame1Page switchToParent(){
        driver.switchTo().parentFrame();
        return new ACFrame1Page(driver);
    }
}
