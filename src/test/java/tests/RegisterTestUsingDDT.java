package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegisterPage;

public class RegisterTestUsingDDT extends TestBase{
    HomePage home;
    RegisterPage regpage;
    @DataProvider(name = "testdata")
    public static Object[][] userdata()
    {
        return new Object[][]
                {
                        {"mariam","ashraf","yarzoziydu@vusra.com","yarzoziydu@vusra.com","yarz245","12345678","12345678","5",null,null},
                        {"ahmed","mohamed","dgfhjk@vusra.com","dgfhjk@vusra.com","dgfhjk245","98778654","98778654","5",null,null}
                };
    }
    @Test(priority = 1,dataProvider = "testdata")
    public void test_register(String firstname,String lastname,String mail,String cmail,String username,String pass,String cpass,String indopt,String rolopt,String sizopt) throws InterruptedException {
        home=new HomePage(driver);
        home.open_regstrationPage();
        regpage=new RegisterPage(driver);
        regpage.user_register(firstname,lastname,mail,cmail,username,pass,cpass,indopt,rolopt,sizopt);
        Assert.assertTrue(regpage.successMessage.getText().contains("Almost done!"));
    }
}
