import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CssSelector {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

//         Open a webpage
        driver.get("https://developer.salesforce.com/signup");
        driver.manage().window().maximize();
//        driver.findElement(By.id("input")).click();
        driver.findElement(By.cssSelector("#input")).sendKeys("Gajanan");
    }
}



