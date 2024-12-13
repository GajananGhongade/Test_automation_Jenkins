import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class WaitImplicit {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.ebay.com.au/");

        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.xpath("//body/div[@id='mainContent']/div[@class='page-grid-container hp-grid-container']/div[@class='page-grid hp-grid']/div[@id='vl-flyout-nav']/ul[@class='vl-flyout-nav__container']/li[2]/a[1]"));
        WebElement e = driver.findElement(By.xpath("//a[normalize-space()='Electronic Sales']"));
        Actions actions = new Actions(driver);
        // implicit wait is set default timeout for all the elements on page
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        actions.moveToElement(element).perform();
        actions.moveToElement(e).perform();
        e.click();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1))




            }
}
