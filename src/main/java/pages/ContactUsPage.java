package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ContactUsPage extends PageBase{
    public ContactUsPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "Type")
    WebElement request;
    @FindBy (id = "FullNamef")
    WebElement fullname;
    @FindBy(id = "Email")
    WebElement mail;
    @FindBy(id = "Enquiry")
    WebElement enquiry;
    @FindBy(name = "send-email")
    WebElement submitBtn;
    @FindBy(className = "result")
    public WebElement successmessage;
     public void userContact(String value,String name,String email,String enq)
     {
         select=new Select(request);
         select.selectByValue(value);
         fullname.sendKeys(name);
         mail.sendKeys(email);
         enquiry.sendKeys(enq);
         submitBtn.click();
     }
}
