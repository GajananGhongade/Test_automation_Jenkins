import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSLHandling {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
//        ChromeDriver driver = new ChromeDriver();

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setAcceptInsecureCerts(true);

        ChromeOptions options = new ChromeOptions();
        options.merge(capabilities);

        WebDriver driver = new ChromeDriver(options);


//  another way to define capabilities
        capabilities.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);





        driver.get("https://expired.badssl.com/");
//        driver.manage().window().maximize();

    }
}
