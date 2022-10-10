package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ContactUsPage;
import pages.HomePage;

public class ContactUsTest extends TestBase{
    HomePage home;
    ContactUsPage contactpage;

    @Test
    public void userContact_Test()
    {
        home=new HomePage(driver);
        home.contactUs_page();
        contactpage=new ContactUsPage(driver);
        contactpage.userContact("1","rom","ma@mail.com","enquiry");
        Assert.assertTrue(contactpage.successmessage.getText().contains("successfully sent"));
    }
}
