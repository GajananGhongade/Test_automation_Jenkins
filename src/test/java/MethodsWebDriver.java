import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsWebDriver {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");  // get take string url and open it in browser
        driver.manage().window().fullscreen(); // open full screen browser window
        driver.manage().window().maximize(); // open
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        System.out.println(driver.getWindowHandle());
        System.out.println(driver.getPageSource());  // return complete html docs
        driver.navigate().to("https://www.google.com");
        Thread.sleep(4000);

        driver.close();

    }
}



