package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewWindowPage extends BasePage {
    @FindBy(id = "sampleHeading")
    WebElement sampleHeadingText;

    public NewWindowPage(WebDriver driver) {
        super(driver);
    }

    public String getSampleHeadingText() {
        return sampleHeadingText.getText();
    }
}
