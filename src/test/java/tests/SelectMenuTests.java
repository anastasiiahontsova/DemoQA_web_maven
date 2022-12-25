package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.SelectMenuPage;

import java.util.ArrayList;

public class SelectMenuTests extends BaseTests {
    @BeforeMethod
    public void ensurePreconditions() {
        new SelectMenuPage(driver).goToWithURL();
    }

    @Test
    public void selectOldStyleSelectMenuPositive() {
        new SelectMenuPage(driver)
                .selectOldStyleSelectMenu("Purple");
    }

    @Test
    public void selectMultiselectDropdownPositive() {
        ArrayList<String> colorsToSelect = new ArrayList<>();
        colorsToSelect.add("Blue");
        colorsToSelect.add("Black");
        colorsToSelect.add("Green");
        colorsToSelect.add("Red");

        new SelectMenuPage(driver)
                .selectMultiselectDropdown(colorsToSelect);
    }
}
