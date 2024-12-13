//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.NoSuchElementException;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Wait;
//
//import java.time.Duration;
//
//public class FluentWait {
//    public static void main(String[] args) {
//
//
//
//ChromeDriver driver = new ChromeDriver();
//        WebDriverManager.chromedriver().setup();
//
//
//        driver.get("https://www.ebay.com.au/");
//        driver.manage().window().maximize();
//
//        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//                .withTimeout(Duration.ofSeconds(15))
//                .pollingEvery(Duration.ofSeconds(2))
//                .ignoring(NoSuchElementException.class);
//
//        WebElement element = driver.findElement(By.xpath("  WebElement element = driver.findElement(By.xpath(\"//body/div[@id='mainContent']/div[@class='page-grid-container hp-grid-container']/div[@class='page-grid hp-grid']/div[@id='vl-flyout-nav']/ul[@class='vl-flyout-nav__container']/li[2]/a[1]\"));"));
//
//          wait.until

// Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
// .withTimeout(Duration.ofSeconds(10))
// .pollingEvery(Duration.ofSeconds(1))
// .ignoring(NoSuchElementException.class)


// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1))


// explicit wait
//WebDriverWait wait = new WebDriverWait(driver, 10);
// WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("")))



//    }
//}

//FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//        .withTimeout(Duration.ofSeconds(10))
//        .pollingEvery(Duration.ofSeconds(2))
//        .ignoring(NoSuchElementException.class)




//
//FluentWait <WebDriver> wait = new FluentWait<WebDriver>(driver)
//        .withTimeout(Duration.ofSeconds(10))
//        .pollingEvery(Duration.ofSeconds(2))
//        .ignoring(NoSuchElementException.class)



