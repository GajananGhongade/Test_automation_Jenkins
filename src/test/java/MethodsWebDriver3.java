import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//clear
//sendKeys()
//click()
//getAttribute()
//getClassValue()
//getLocation()


public class MethodsWebDriver3 {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Gajanan");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"name\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"name\"]")).getAttribute("id");
        driver.findElement(By.xpath("//*[@id=\"name\"]")).getLocation();
        System.out.println(driver.findElement(By.xpath("//*[@id=\"name\"]")).getCssValue("font-size"));;
        System.out.println(   driver.findElement(By.xpath("//*[@id=\"HTML5\"]/div[1]/button")).getSize());
        System.out.println(   driver.findElement(By.xpath("//*[@id=\"HTML5\"]/div[1]/button")).getTagName());
        System.out.println(   driver.findElement(By.xpath("//*[@id=\"HTML5\"]/div[1]/button")).getText());
        System.out.println(   driver.findElement(By.xpath("//*[@id=\"HTML5\"]/div[1]/button")).getSize());
        System.out.println(driver.findElement(By.id("male")).isSelected());
        System.out.println(driver.findElement(By.id("male")).isEnabled());
        System.out.println(driver.findElement(By.id("male")).isDisplayed());


    }
}
