package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;

public class NewWindowMessagePage extends BasePage {

    @FindBy(id = "messageWindowButton")
    WebElement NewWindowMessageBtn;
    @FindBy(id = "//*[contains(text(), 'Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization.')]")
    WebElement newWindowMessageText;

    public NewWindowMessagePage(WebDriver driver) {
        super(driver);
    }

    public NewWindowMessagePage clickOnNewWindowMessageBtn() {
        NewWindowMessageBtn.click();
        ArrayList<String> newWindowsMessage = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(newWindowsMessage.get(1));
        return new NewWindowMessagePage(driver);

    }

    public String getNewWindowMessageText() {
        return newWindowMessageText.getText();
    }
}
