package TestNG.in;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependsOnMethods {
    public static WebDriver driver;

    @Test
    public void LaunchBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/v1/");
        driver.manage().window().maximize();
    }

    @Test(dependsOnMethods = "LaunchBrowser")
    public void Login() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");

        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();

        Thread.sleep(3000);
        driver.close();
    }

}
