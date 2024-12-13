import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioHandling {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='male']")).click();

        WebElement a =  driver.findElement(By.xpath("//input[@id='male']"));
        WebElement b =  driver.findElement(By.xpath("//input[@id='female']"));

        b.click();
        System.out.println(a.isSelected());
        System.out.println(b.isSelected());

        List<WebElement> radios =  driver.findElements(By.xpath("//input[type='radio']"));
        System.out.println(radios.size());
    }

}
