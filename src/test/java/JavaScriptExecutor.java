import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class JavaScriptExecutor {
    public static void main(String[] args) {
//        JavaScriptExecutor is an interface in Selenium that
//        allows you to execute JavaScript code directly within
//        the browser

//        useful for tasks that are difficult to perform with standard
//        Selenium WebDriver methods, such as interacting with elements
//        that are hidden, scrolling the page, or retrieving browser


        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();


        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].window.scrollBy(0, 400)");

        // get title of the page
        String title = (String) js.executeScript("return document.title");
        System.out.println(title);

        // highlighting element giving border using js executor
        WebElement element = driver.findElement(By.id("comboBox"));
        js.executeScript("arguments[0].style.border='4px solid red'", element);


        // clicking a button or submit button
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(2000));

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement button = driver.findElement(By.xpath("//button[normalize-space()='STOP']"));
        wait.until(ExpectedConditions.visibilityOf(button));
        js.executeScript("arguments[0].click;", button);


    }
}



//JavaScriptExecutor jsexec = (JavaScriptExecutor) driver;
//String title = (String) jsexec.executeScript("return document.title");


