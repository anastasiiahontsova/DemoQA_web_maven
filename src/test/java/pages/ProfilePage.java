package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import java.util.List;

public class ProfilePage extends BasePage {

    @FindBy(id = "userName-value")
    WebElement userNameText;

    @FindBy(id = "submit")
    WebElement logOutBtn;

    @FindBy(xpath = "//span[@class='mr-2']")
    List<WebElement> profileBookNamesLinks;

    @FindBy(xpath = "//span[@title = 'Delete']")
    WebElement deleteBookBtn;

    @FindBy(xpath = "//*[contains(@class, 'modal-footer')]//*[text() = 'OK']")
    WebElement acceptDeletionOfBook;


    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    public String getUserName() {
        return userNameText.getText();
    }

    public void waitToLoad() {
        System.out.println("Waiting for login form to load ...");
        waitForElementToBeClickable(logOutBtn);
    }

    public String getBookName(int idx) {
        return profileBookNamesLinks.get(idx).getText();
    }

    public ProfilePage deleteBookFromProfilePage() {
        deleteBookBtn.click();
        acceptDeletionOfBook.click();
        closeTheAlert();
        return this;
    }

    public ProfilePage closeTheAlert() {
        waitForAlert();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        return this;
    }
}
