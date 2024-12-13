package TestNG.in;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Test
public class TestNGXmlFile {

    public static WebDriver driver;

    @Parameters({"browser"})
    @Test
    public void launchApplication(String browser){

        if(browser.equals("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }else {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }

        driver.get("https://www.saucedemo.com");
        System.out.println(driver.getTitle());;
        driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard-user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        System.out.println(driver.getWindowHandle());
        driver.close();
    }
}
