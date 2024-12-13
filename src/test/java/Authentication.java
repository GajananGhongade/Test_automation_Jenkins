import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Authentication {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        //
        WebDriverManager.edgedriver().setup();
        EdgeDriver driver1 = new EdgeDriver();

        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[3]/a")).click();

        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

        // edge browser
        driver1.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

    }
}
