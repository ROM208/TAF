package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegisterPage;

public class RegisterTest extends TestBase{
       HomePage home;
       RegisterPage regpage;

       @Test(priority = 1)
       public void test_register() throws InterruptedException {
              home=new HomePage(driver);
              home.open_regstrationPage();
              regpage=new RegisterPage(driver);
              regpage.user_register("mariam","ashraf","yarzoziydu@vusra.com","yarzoziydu@vusra.com","yarz245","12345678","12345678","5",null,null);
              Assert.assertTrue(regpage.successMessage.getText().contains("Almost done!"));
       }


}
