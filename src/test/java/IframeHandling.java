import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeHandling {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://demo.automationtesting.in/Frames.html");
        driver.manage().window().maximize();
        driver.findElement(By.xpath(" //a[normalize-space()='Single Iframe']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();
        driver.switchTo().frame("");  // switch to particular frame
        driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/input[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("GP");

        driver.switchTo().parentFrame();  // switch back to parent frame
    }
}
