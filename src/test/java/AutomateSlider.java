import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutomateSlider {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://jqueryui.com/slider/");
        driver.manage().window().maximize();

        WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        driver.switchTo().frame(frame);

        WebElement element = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));

        Actions action = new Actions(driver);
        Thread.sleep(2000);
        action.dragAndDropBy(element, 200, 50).perform();
        Thread.sleep(2000);
        action.dragAndDropBy(element, -100, 50).perform();


        //   Actions action = new Actions(driver);
//        action.dragAndDropBy(element, 100, 300).perform();
        // action.dragAndDrop(element, )
//
//
//
    }
}
