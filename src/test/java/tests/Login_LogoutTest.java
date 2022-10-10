package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class Login_LogoutTest extends TestBase{
    HomePage home;
    LoginPage logpage;

    @Test
    public void test_logout() throws InterruptedException {
        home=new HomePage(driver);
        home.logout_page();
    }
    @Test
    public void test_login() throws InterruptedException {
        home=new HomePage(driver);
        home.open_loginPage();
        logpage=new LoginPage(driver);
        logpage.user_login("yarz245","11111111");
    }
}
