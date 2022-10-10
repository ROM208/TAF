package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "Username")
    WebElement username;
    @FindBy (id = "Password")
    WebElement password;
    @FindBy (xpath = "//*[@id=\"login-page\"]/body/div[7]/section/div/div/div/div/div/div[2]/div[1]/div[2]/form/div[2]/div[4]/input")
    WebElement loginBtn;

    public void user_login(String usernametxt,String passtxt)
    {
        username.sendKeys(usernametxt);
        password.sendKeys(passtxt);
        loginBtn.click();
    }

}
