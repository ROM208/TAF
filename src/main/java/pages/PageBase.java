package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageBase {
    public WebDriver driver;
    public Actions act;
    public Select select;
    public JavascriptExecutor js;
    public PageBase(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }
}
