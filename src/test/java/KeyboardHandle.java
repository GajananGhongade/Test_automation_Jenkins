import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardHandle {
    public static void main(String[] args) {

        // there is only two keyboard actions keyup and keydown


        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.tutorialspoint.com/selenium/selenium_keyboard_actions.htm#:~:text=Selenium%20Webdriver%20can%20be%20used,used%20to%20perform%20these%20operations.");
        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[1]/div[1]/div[2]/pre[2]/div[1]"));

        Actions action = new Actions(driver);
        action.keyDown(element, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();

       WebElement pasteArea =  driver.findElement(By.xpath("//input[@id='search-strings']"));

       action.keyDown(pasteArea, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
    }
}


//Actions action = new Actions(driver);
//action.KeyDown(element, Keys.CONTROl).sendKeys("a").sendKeys("c").build().perform();



