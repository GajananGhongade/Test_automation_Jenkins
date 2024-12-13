package TestNG.in.RetryFailedTestCase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRetryDemo {
    @Test(retryAnalyzer = RetryFailed.class)
    public void launchApp() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");

        Assert.assertTrue(false);


        driver.close();
    }
}


//public class TestretryDemo{
//    @Test(retryAnalyzer = RetryFailed.class)
//    public void LaunchApp() {
//
//
//        Assert.assertTrue(false);
//
//        driver.close()
//    }
//}