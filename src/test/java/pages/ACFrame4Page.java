package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ACFrame4Page extends BasePage{
    public ACFrame4Page(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "frame4")
    WebElement iFrame4;

    @FindBy(id = "click_me_4")
    WebElement btn4;


    public ACFrame4Page clickOnBtn4() {
        waitForElementToBeClickable(btn4);
        btn4.click();
        return this;
    }

    public ACFrame3Page switchToParent(){
        driver.switchTo().parentFrame();
        return new ACFrame3Page(driver);
    }
}
