import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TableHandling {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");

        // step 1 --> get the number of rows
        // get the number of columns
        // iterate the rows and columns and get text and print it

    List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr"));
        System.out.println(rows.size());

        // to calculate columns
        List<WebElement> columns = driver.findElements(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr[1]/th"));
        System.out.println(columns.size());

//        for(int i=0; i< rows.size(); i++){
//            List<WebElement> col = rows.get(i).findElements(By.tagName("td"));

        // enhance loop
        for(WebElement row : rows){
            List<WebElement> col = row.findElements(By.tagName("td"));
//            List<WebElement> col = row.findElements(By.tagName("th"));

            for(WebElement c : col){
                System.out.print(c.getText() + " ");
            }
            System.out.println();
        }

    }
}


//for(WebElement e : elements){
//    List<WebElement> col = e.findElements(By>tagName("td"));
//    for(WebElement c : col){
//        sout(c.getText() + " ")
//
//        }
//    sout
//
//
//        }