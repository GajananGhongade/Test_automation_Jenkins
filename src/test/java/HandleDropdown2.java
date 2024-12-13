import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandleDropdown2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("colors")).click();
        WebElement multiSelect =  driver.findElement(By.id("colors"));
        // select class
        Select select = new Select(multiSelect);
        select.selectByValue("red");
        select.selectByValue("blue");
        System.out.println(select.getOptions());;
        select.selectByVisibleText("Yellow");
        select.selectByVisibleText("Green");
        System.out.println(select.getFirstSelectedOption());;
        WebElement a = select.getFirstSelectedOption();
        System.out.println(a.getText());

        Thread.sleep(2000);

        List<WebElement> allList = select.getAllSelectedOptions();
        System.out.println(allList);
        for (WebElement element : allList){
            System.out.println(element);
            System.out.println(element.getSize());
        }

        select.deselectByVisibleText("Yellow");

        Thread.sleep(2000);
        select.deselectByValue("blue");

        Thread.sleep(2000);
        select.deselectAll();


    }
}
