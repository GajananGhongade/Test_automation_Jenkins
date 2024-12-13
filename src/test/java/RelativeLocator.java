import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;
import static org.openqa.selenium.support.locators.RelativeLocator.with;
//import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;

public class RelativeLocator {

    public static String browser = "edge";
    public static WebDriver driver;


    public static void main(String[] args) {
        if(browser.equals("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        if(browser.equals("edge")){
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }

        driver.get("https://letcode.in/");
        driver.findElement(By.xpath("//*[@id=\"navbar-menu\"]/div[2]/div/div/a[2]")).click();
        driver.findElement(By.name("email")).sendKeys("gajananghongade15@gmail.com");



        // finding element by relative locator password
//        driver.findElement(By.name("password")).sendKeys("Gajanan1818");
        driver.findElement(By.xpath("/html/body/app-root/app-signin/div/div/div/div/form/div[3]/p/button")).click();

    }
}
