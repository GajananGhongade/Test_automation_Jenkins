import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TableHandlingDynamic {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");

        List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"rows\"]/tr"));
        System.out.println(rows.size());



        for(WebElement row : rows){
           List <WebElement> columns = row.findElements(By.tagName("td"));
            for(WebElement col : columns){
                System.out.print(col.getText() + " ");
            }
            System.out.println();
        }

    }
}
