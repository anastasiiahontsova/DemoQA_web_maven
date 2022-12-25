package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ButtonsPage extends BasePage {

    @FindBy(id = "doubleClickBtn")
    WebElement doubleClickBtn;
    @FindBy(id = "rightClickMessage")
    WebElement rightClickText;
    @FindBy(id = "doubleClickMessage")
    WebElement doubleClickText;
    @FindBy(id = "rightClickBtn")
    WebElement rightClickBtn;

    public ButtonsPage(WebDriver driver) {
        super(driver);
    }

    public ButtonsPage goToWithURL() {
        driver.get("https://demoqa.com/buttons");
        waitForElementToBeClickable(doubleClickBtn);
        return this;
    }

    public ButtonsPage doubleClickOnDoubleClickBtn() {
        Actions actions = new Actions(driver);
        actions.doubleClick(doubleClickBtn).perform();
        return this;
    }

    public String getRightClickText() {
        waitForElementToBeVisible(rightClickText);
        return rightClickText.getText();
    }

    public String getDoubleClickText() {
        waitForElementToBeVisible(doubleClickText);
        return doubleClickText.getText();
    }

    public ButtonsPage rightClickOnRightClickBtn() {
        Actions actions = new Actions(driver);
        actions.contextClick(rightClickBtn).perform();
        return this;
    }
}
