package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;

public class BookStoreTests extends BaseTests {

    @BeforeMethod
    public void ensurePreconditions() {
        new LoginPage(driver).login("Testusername", "Test123456789!").waitToLoad();
    }

    @Test
    public void searchFormTestPositive() {
        String searchText = "JS";
        String expectedBookName = "You Don't Know JS";
        System.out.println("searchFormTestPositive...");
        new MenuSideBar(driver)
                .clickOnBookStoreMenu()
                .typeTextIntoSearchField(searchText);

        String actualBookName = new BookStorePage(driver).getBookName(0);
        Assert.assertEquals(actualBookName, expectedBookName, "Expected book name: " + expectedBookName);
    }

    //HW #1: Implement a TC: look for "JavaScript" and check all 4 books are there; check the name of each book returned

    @Test
    public void searchFormJavaScriptAllFourBooksFoundTestPositive() {
        String searchText = "JavaScript";

        new MenuSideBar(driver)
                .clickOnBookStoreMenu()
                .typeTextIntoSearchField(searchText);

        String firstBookFound = new BookStorePage(driver).getBookName(0);
        Assert.assertTrue(firstBookFound.contains("JavaScript"));
        String secondBookFound = new BookStorePage(driver).getBookName(1);
        Assert.assertTrue(secondBookFound.contains("JavaScript"));
        String thirdBookFound = new BookStorePage(driver).getBookName(2);
        Assert.assertTrue(thirdBookFound.contains("JavaScript"));
        String forthBookFound = new BookStorePage(driver).getBookName(3);
        Assert.assertTrue(forthBookFound.contains("JavaScript"));

    }

    @Test
    public void addToCollectionPositive() {
        String searchText = "JS";
        String expectedBookName = "You Don't Know JS";


        new MenuSideBar(driver)
                .clickOnBookStoreMenu()
                .typeTextIntoSearchField(searchText);

        new BookStorePage(driver)
                .clickOnBookName(expectedBookName)
                .addToCollection();
                //.closeTheAlert();
        // HW #2: extend the TC: go to Profile; check that out of all the book there is one that you've added
        new BookItemPage(driver).
                clickOnProfilePage();

        String firstBookInProfile = new ProfilePage(driver).getBookName(0);
        Assert.assertEquals(firstBookInProfile, expectedBookName, "Expected book name: " + expectedBookName);
        // HW #3: extend the TC: remove the item from your collection
        //new ProfilePage(driver).deleteBookFromProfilePage();


       // HW #4: add me to the contributors in your git repo (akutafina)

}

}
