package tests;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import java.io.File;
import java.io.IOException;


public class TestBase {
    public static WebDriver driver;
    @BeforeSuite
    public void openUrl()
    {
        String path=System.getProperty("user.dir")+"/sources/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",path);
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.nopcommerce.com/en");
    }
    @AfterSuite
    public void closeUrl()
    {
        driver.quit();
    }
    @AfterMethod
    public void take_screenShot(ITestResult result) throws IOException {
        if(ITestResult.FAILURE == result.getStatus())
        {
            System.out.println("Failed!");
            System.out.println("Taking Screenshot...");
            TakesScreenshot sc=(TakesScreenshot) driver;
            File photo=sc.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(photo,new File("./screenshots/"+result.getName()+".png"));
        }
    }

}
