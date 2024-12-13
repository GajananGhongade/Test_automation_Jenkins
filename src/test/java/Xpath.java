import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class Xpath {
    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        EdgeDriver driver = new EdgeDriver();

//         Open a webpage
        driver.get("https://developer.salesforce.com/signup");
        driver.manage().window().maximize();
        driver.findElement(By.id("select")).click();
        driver.findElement(By.xpath("//option[@value='Architect/CTO']//preceding-sibling::option")).click();
    }
}
