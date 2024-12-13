import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://jqueryui.com/");
        driver.manage().window().maximize();

        Thread.sleep(2000);


        WebElement element = driver.findElement(By.xpath("//p[@class='intro']"));
        Actions action = new Actions(driver);

        // contextClick or Right click
        action.contextClick(element).perform();

        // left click
        Thread.sleep(2000);
        WebElement element2 = driver.findElement(By.xpath("//a[normalize-space()='Draggable']"));
        action.click(element2).perform();



    }
}
