package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountPage;
import pages.HomePage;
import pages.LoginPage;

public class AccountTest extends TestBase{
    HomePage home;
    AccountPage accPage;
    LoginPage logPage;
    @Test
    public void changePassword_test() throws InterruptedException {
        home=new HomePage(driver);
        home.open_loginPage();
        logPage=new LoginPage(driver);
        logPage.user_login("yarz245","22222222");
        home.open_accountPage();
        accPage=new AccountPage(driver);
        accPage.change_password("22222222","00000000");
        Assert.assertTrue(accPage.successMessage.getText().contains("changed"));
        home.logout_page();
    }
}
