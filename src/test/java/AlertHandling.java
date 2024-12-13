import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AlertHandling {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();


        // for simple alert
        Thread.sleep(1000);
        driver.findElement(By.id("alertBtn")).click();
        Thread.sleep(1000);

        System.out.println(driver.switchTo().alert().getText()); ;
        Thread.sleep(1000);

        driver.switchTo().alert().accept();
        Thread.sleep(1000);


// for confirmation alert

    WebElement alert =  driver.findElement(By.id("confirmBtn"));
    Thread.sleep(2000);
        alert.click();

        Thread.sleep(2000);

        driver.switchTo().alert().dismiss();
        driver.switchTo().alert().accept();


        // for prompt alert which take some text as input
        WebElement promptAlert =  driver.findElement(By.id("promptBtn"));
        Thread.sleep(2000);
        promptAlert.click();

        Thread.sleep(2000);

        promptAlert.sendKeys("Ram");
        System.out.println(promptAlert.getText()); ;
        System.out.println(driver.getTitle());
        driver.switchTo().alert().accept();


    }
}
