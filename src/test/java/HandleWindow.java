import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class HandleWindow {

    // switch (window) method is used handle multiple window


    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        Thread.sleep(1000);

        driver.findElement(By.xpath("//button[@id='PopUp']")).click();
        driver.manage().window().maximize();

        Thread.sleep(1000);
        Set<String> windowhandles =  driver.getWindowHandles();  // stores the unique addresses of each window which opened
        System.out.println(windowhandles.size());

        Iterator<String> iterator = windowhandles.iterator();
        String parentwindow = iterator.next();
        String childwindow = iterator.next();
        String child2Window = iterator.next();
        System.out.println(parentwindow);
        System.out.println(childwindow);
        System.out.println(child2Window);

        driver.manage().window().maximize();

        System.out.println(driver.switchTo().window(childwindow));
        Thread.sleep(1000);

        driver.findElement(new By.ByLinkText("Learn more & submit!")).click();
//      driver.findElement(By.xpath("//div[@id='docsearch-1']//span[@class='DocSearch-Button-Container']//*[name()='svg']")).sendKeys("locator");

    }
}
//Set<String> windoHandles = driver.getWindowHandles();
//Iterator<String> iterator = windoHandles.iterator();
//String parentWindow = iterator.next();
//String ChildWindow  = iterator.next();







