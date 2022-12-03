package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class  BasePage {
    WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    protected void type(WebElement fieldWebElement, String text) {
        waitForElementToBeClickable(fieldWebElement);
        fieldWebElement.click();
        fieldWebElement.sendKeys(text);
    }

    protected void scrollToElementAndClick(WebElement webElement) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,4000)");
        waitForElementToBeClickable(webElement);
        webElement.click();
    }

    protected WebElement waitForElementToBeClickable(WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
        return webElement;
    }

    protected void waitForAlert() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.alertIsPresent());
    }
}
