package TestNG.in.Capture.screenshot.inTestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BaseClass {
    public static WebDriver driver = null;

    @BeforeSuite
    public void launchBrowser(){
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();

    }

    @Test
    public void launchApp(){
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        String expectedTitle = "automation lab";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, expectedTitle, "title match or not");

    }

    @AfterSuite
    public void closeBrowser() throws InterruptedException {
        driver.manage().deleteAllCookies();
        Thread.sleep(3000);
        driver.close();
    }
}


