import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("#country")).click();
        WebElement webele =  driver.findElement(By.id("country"));
        Select select = new Select(webele);
        select.selectByIndex(1);;
        Thread.sleep(2000);

       select.selectByValue("india");
       select.selectByIndex(1);
       Thread.sleep(1000);

        System.out.println(select.getOptions());;
        select.selectByVisibleText("India");


        // all below-mentioned methods will work in only multiselect dropdown
        select.deselectAll();
        select.deselectByIndex(1);
        select.deselectByValue("india");
        select.deselectByVisibleText("India");
        select.getAllSelectedOptions();
        select.getFirstSelectedOption();



    }
}





//Select select = new Select(Dropdownsrootelement);
//select.selectByIndex(1)
//    select.selectByValue("");
//select.selectByVisibleText("India");



