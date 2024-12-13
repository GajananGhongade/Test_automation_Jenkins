import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class CheckBoxHandle {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@id='sunday']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='sunday']")).click();

        System.out.println(driver.findElements(By.className("form-check-input")).size());;

        List<WebElement> web = driver.findElements(By.className("form-check-input"));
        for(WebElement e : web){
            e.click();
        }
        WebElement w =   driver.findElement(By.xpath("//input[@id='sunday']"));
        System.out.println(w.isSelected());

        WebElement radio = driver.findElement(By.id("male"));
        Actions actions = new Actions(driver);
        actions.moveToElement(radio);
        actions.click(radio);

    }
}
