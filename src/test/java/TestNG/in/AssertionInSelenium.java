package TestNG.in;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


//TestNG asserts the tester decides whether the test was successful or not,
//along with the exceptions. Assertions in TestNG are a way to verify that
//the expected result and the actual result matched or not.

public class AssertionInSelenium {


    @Test
    public  void  titleTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        String expectedTitle = "Automation asf Testing Practice";
        driver.get("https://testautomationpractice.blogspot.com/");

        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);


        Assert.assertTrue(true);  /// test to bet passed
        Assert.assertEquals("actual", "expected", "Both are equals");
        Assert.assertFalse(false);



        driver.close();

    }
}
