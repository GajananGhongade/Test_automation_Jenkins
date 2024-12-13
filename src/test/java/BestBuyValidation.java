import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class BestBuyValidation {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.bestbuy.com/?intl=nosplash");

        driver.manage().window().maximize();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//nav[@aria-label='Main']")).click();


        WebElement applience = driver.findElement(By.xpath("//button[normalize-space()='Appliances']"));

        Actions action = new Actions(driver);
        action.moveToElement(applience).perform();

        Thread.sleep(2000);

        applience.click();


        driver.findElement(By.xpath("//button[normalize-space()='Major Kitchen Appliances']")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//li[contains(@class,'liDropdownList')]//a[contains(@class,'')][normalize-space()='Refrigerators']")).click();

        Thread.sleep(2000);


        WebElement element = driver.findElement(By.xpath("//a[normalize-space()='Mini Fridges']"));
        element.click();




        WebElement moveToCart = driver.findElement(By.xpath("//div[@id='shop-sponsored-listing-76090105']//div[1]//a[1]//img[1]"));



        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].scrollIntoView();", moveToCart);
//
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//
//        String windoHandle = driver.getWindowHandle();
//        System.out.println(windoHandle);
//
//        driver.switchTo().window(windoHandle);
//
//
//


        driver.findElement(By.xpath("//div[@id='fulfillment-add-to-cart-button-85621688']//div[contains(@class,'fulfillment-add-to-cart-button')]//div//div//button[contains(@type,'button')][normalize-space()='Add to Cart']//*[name()='svg']")).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));


        driver.findElement(By.xpath("//a[normalize-space()='Go to Cart']")).click();









        //*[@id="widget-966b63f6-f2e1-44f8-a434-e9daf7f3bb66"]/div/div[2]/div[1]/div[1]/div/a
    }
}
