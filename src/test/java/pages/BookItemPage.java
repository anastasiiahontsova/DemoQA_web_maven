package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookItemPage extends BasePage {

    @FindBy(id = "addNewRecordButton")
    WebElement addToCollectionBtn;

    @FindBy(xpath = "//span[contains(text(), 'Profile')]")
    WebElement profilePageBtn;

    public BookItemPage(WebDriver driver) {
        super(driver);
    }

    public BookItemPage addToCollection() {
        scrollToElementAndClick(addToCollectionBtn);
        return this;
    }

    public BookItemPage closeTheAlert() {
        waitForAlert();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        return this;
    }

    public ProfilePage clickOnProfilePage() {
        scrollToElementAndClick(profilePageBtn);
        //profilePageBtn.click();
        return new ProfilePage(driver);
    }
}
