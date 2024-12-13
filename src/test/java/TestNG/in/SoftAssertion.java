package TestNG.in;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
    @Test
    public  void  titleTest() {
        SoftAssert softassert = new SoftAssert();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        String expectedTitle = "Automation agggs Testing Practice";
        driver.get("https://testautomationpractice.blogspot.com/");

        String actualPlaceholder = driver.findElement(By.xpath("//*[@id=\"name\"]")).getAttribute("placeholder");

        String expectedPlaceHolder = "Enter erff Name";

        String actualTitle = driver.getTitle();

        softassert.assertEquals(actualTitle, expectedTitle);

        softassert.assertEquals(actualPlaceholder, expectedPlaceHolder);

        driver.close();

        softassert.assertAll("softassert");

    }
}
