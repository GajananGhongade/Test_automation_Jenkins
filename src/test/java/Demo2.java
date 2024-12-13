import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
    public static String browser = "edge";
    public static WebDriver driver;


    public static void main(String[] args) {
        if(browser.equals("chrome")){
            WebDriverManager.chromedriver().setup();
             driver = new ChromeDriver();
        }else {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }

        driver.get("https://www.saucedemo.com");
        System.out.println(driver.getTitle());;
        driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard-user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        System.out.println(driver.getWindowHandle());
        driver.close();


    }
}


