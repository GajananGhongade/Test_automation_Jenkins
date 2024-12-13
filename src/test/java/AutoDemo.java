import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.edge.EdgeDriver;
//import io.github.bonigarcia.wdm.WebDriverManager;
public class AutoDemo {
    public static void main(String[] args) {
//        System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\Downloads\\edgedriver_win64\\msedgedriver.exe");

        // Initialize WebDriver
        WebDriverManager.edgedriver().setup();
        EdgeDriver driver = new EdgeDriver();

//         Open a webpage
        driver.get("https://www.youtube.com");
        driver.manage().window().maximize();
        // Print the title of the page
        System.out.println("Page title is: " + driver.getTitle());;
        driver.close();
    }
}
