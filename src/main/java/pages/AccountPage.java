package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends PageBase{
    public AccountPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(linkText = "Change password")
    WebElement changePass;
    @FindBy(id = "OldPassword")
    WebElement oldPassword;
    @FindBy(id = "NewPassword")
    WebElement newPassword;
    @FindBy(id = "ConfirmNewPassword")
    WebElement confirmNewPass;
    @FindBy(css = "input.btn.blue-button.change-password-button")
    WebElement submitBtn;
    @FindBy(className = "result")
   public WebElement successMessage;
    public void change_password(String oldpass,String newpass)
    {
        changePass.click();
        oldPassword.sendKeys(oldpass);
        newPassword.sendKeys(newpass);
        confirmNewPass.sendKeys(newpass);
        submitBtn.click();
    }
}
