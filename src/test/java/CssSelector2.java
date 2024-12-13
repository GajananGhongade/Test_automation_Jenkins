import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CssSelector2 {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

//         Open a webpage
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("gajananghongade15@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("Gajanan@1818");
        driver.findElement(By.xpath("//*[@id=\"RememberMe\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]")).sendKeys("laptop");
        driver.findElement(By.className("#small-search-box-form > button")).click();




        driver.findElement(By.cssSelector("#id")).click();  // id cssSelector
        driver.findElement(By.cssSelector(".class-btn")).click();  // class cssSelector



    }
}
