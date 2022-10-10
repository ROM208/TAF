package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase{
    public HomePage(WebDriver driver)
    {
        super(driver);
        act = new Actions(driver);
        js= (JavascriptExecutor) driver;
    }
    @FindBy(css= "span.user-actions-ico")
    WebElement userlist;
    @FindBy(linkText = "Register")
    WebElement register;
    @FindBy(linkText = "Log in")
    WebElement login;
    @FindBy(linkText = "Log out")
    WebElement logout;
    @FindBy(linkText = "Contact us")
    WebElement contactUs;
    @FindBy(linkText = "My account")
    WebElement account;
    public void open_regstrationPage() throws InterruptedException {

         act.moveToElement(userlist).build().perform();
         Thread.sleep(1000);
         act.moveToElement(register).click().build().perform();
    }
    public void open_loginPage() throws InterruptedException {
        act.moveToElement(userlist).build().perform();
        Thread.sleep(1000);
        act.moveToElement(login).click().build().perform();
    }
    public void logout_page() throws InterruptedException {
        act.moveToElement(userlist).build().perform();
        Thread.sleep(1000);
        act.moveToElement(logout).click().build().perform();
    }
    public void contactUs_page()
    {
        js.executeScript("scrollBy(0,3000)");
        contactUs.click();
    }
    public void open_accountPage() throws InterruptedException {
        act.moveToElement(userlist).build().perform();
        Thread.sleep(1000);
        act.moveToElement(account).click().build().perform();
    }
}
