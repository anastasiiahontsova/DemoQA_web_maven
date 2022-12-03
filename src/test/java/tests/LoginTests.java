package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTests extends BaseTests{
    @Test
    public void loginTestPositive(){
        String currentUserName = "Testusername";
        String currentPwd = "Test123456789";

        Assert.assertEquals(
                new LoginPage(driver)
                        .login(currentUserName, currentPwd)
                        .getUserName(),
                currentUserName, "User name expected is: " + currentUserName);
    }

}
