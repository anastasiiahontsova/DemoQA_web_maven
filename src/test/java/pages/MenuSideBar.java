package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuSideBar extends BasePage {
    @FindBy(xpath = "//li[contains(@class,'btn btn-light')]/*[text()='Book Store']")
    WebElement bookStoreMenu;


    @FindBy(xpath = "//div[@class='rt-tr-group']")
    WebElement tableOfUserBooks;


    public MenuSideBar(WebDriver driver) {
        super(driver);
    }

    public BookStorePage clickOnBookStoreMenu() {
        scrollToElementAndClick(bookStoreMenu);
        // bookStoreMenu.click(); - won't work coz is out the viewport
        return new BookStorePage(driver);
    }


}
