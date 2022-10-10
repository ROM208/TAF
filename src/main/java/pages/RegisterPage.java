package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends PageBase{

    public RegisterPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id="FirstName")
    WebElement firstname;

    @FindBy(id="LastName")
    WebElement lastname;

    @FindBy(id="Email")
    WebElement email;

    @FindBy(id="ConfirmEmail")
    WebElement confirmMail;

    @FindBy(id="Username")
    WebElement username;

    @FindBy(id="Password")
    WebElement password;
    @FindBy(id="ConfirmPassword")
    WebElement confirmPassword;

    @FindBy(id="Details_CompanyIndustryId")
    WebElement companyPrimarily;

    @FindBy(id="Details_CompanyRoleId")
    WebElement companyRole;

    @FindBy(id="Details_CompanySizeId")
    WebElement companySize;

    @FindBy(id="register-button")
    WebElement registerBtn;

    @FindBy(css = "div.sub-title")
    public WebElement successMessage;

    public void user_register(String fname,String lname,String mail,String cmail,String uname,String pass,String cpass,String indopt,String rolopt,String sizopt)
    {
        firstname.sendKeys(fname);
        lastname.sendKeys(lname);
        email.sendKeys(mail);
        confirmMail.sendKeys(cmail);
        username.sendKeys(uname);
        password.sendKeys(pass);
        confirmPassword.sendKeys(cpass);
        select =new Select(companyPrimarily);
        select.selectByValue(indopt);
        registerBtn.click();
    }

}
