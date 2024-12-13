import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;

public class HandlingWindow2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        driver.manage().window().maximize();

        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"collapseThree\"]/div/ul/li[1]/a")).click();
        WebElement element =    driver.findElement(By.cssSelector("button[data-bs-target='#collapseThree']"));

        Select select = new Select(element);
        select.selectByIndex(1);

        Thread.sleep(1000);
        Set<String> windowhandles =  driver.getWindowHandles();  // stores the unique addresses of each window which open
        System.out.println(windowhandles.size());








    }
}
