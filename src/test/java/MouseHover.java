import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://demo.opencart.com/");

        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.xpath("//a[normalize-space()='Laptops & Notebooks']"));
        WebElement e = driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[1]/nav[1]/div[2]/ul[1]/li[2]/div[1]/div[1]/ul[1]/li[1]/a[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
        actions.moveToElement(e).perform();
        e.click();
//      actions.moveToElement(e).doubleClick(e);

        Thread.sleep(2000);




    }
}
