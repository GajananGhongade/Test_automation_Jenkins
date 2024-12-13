import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionDropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[normalize-space()='From']")).click();
        WebElement from =   driver.findElement(By.xpath("//input[@placeholder='From']"));
        from.sendKeys("Pune");
        Thread.sleep(2000);
        from.sendKeys(Keys.ARROW_DOWN);
        from.sendKeys((Keys.ENTER));
        driver.findElement(By.xpath("//input[@id='fromCity']']")).sendKeys("Pune");
        driver.findElement(By.xpath(" driver.findElement(By.xpath(\"//input[@id='fromCity']']\")).click();")).click();
    }
}

