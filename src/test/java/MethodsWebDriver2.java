import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class MethodsWebDriver2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();


        driver.get("https://testautomationpractice.blogspot.com/");  // get take string url and open it in browser
        driver.manage().window().fullscreen(); // open full screen browser window
        driver.manage().window().maximize();
        WebElement we = driver.findElement(By.xpath("//input[@id='name']"));
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Gajanan");

        System.out.println(we);

       List<WebElement> list = driver.findElements(By.tagName("option"));

        for (WebElement webElement : list) {
            System.out.println(webElement);
        }
        System.out.println(list);
        driver.findElement(By.xpath("//button[@class='submit-btn']")).click();

    }
}



