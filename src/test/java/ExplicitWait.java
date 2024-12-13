import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static TestNG.in.TestNGXmlFile.driver;

public class ExplicitWait {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.ebay.com.au/");

        driver.manage().window().maximize();
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//body/div[@id='mainContent']/div[@class='page-grid-container hp-grid-container']/div[@class='page-grid hp-grid']/div[@id='vl-flyout-nav']/ul[@class='vl-flyout-nav__container']/li[2]/a[1]"));
        WebElement e = driver.findElement(By.xpath("//a[normalize-space()='Electronic Sales']"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(2000));
        // explicit wait set for specific element to load or specific condition is met
        // waiting until below element is to be loading
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='mainContent']/div[@class='page-grid-container hp-grid-container']/div[@class='page-grid hp-grid']/div[@id='vl-flyout-nav']/ul[@class='vl-flyout-nav__container']/li[2]/a[1]")));
        actions.moveToElement(element).perform();
//        wait.until(ExpectedConditions.visibilityOf(element));
        //  actions.moveToElement(e).perform();




    }
}

// driver.get("https://example.com");
//
//// Explicit wait for a specific element to be visible
//WebDriverWait wait = new WebDriverWait(driver, 10);  // 10 seconds timeout
//WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("elementId")));
//
//        element.click();

// explicit wait
//WebDriverWait wait = new WebDriverWait(driver, 10);
// WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("")))

//WebDriverWait wait1 = new WebDriverWait(driver, 10);
//WebElement element = wait.until(ExpectedConditions.VisibilityOfElementLocated(By.xpath("//div")));
//element.click();
