package TestNG.in;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//It is annotation used by TestNG to execute the test method multiple numbers
//of times based on the data provided by the DataProvider.

public class DDTDataproviderLogin {



    @Test(dataProvider = "create")
    public void test1(String username, String password ){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/");
         driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(username);
         driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
         driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
         driver.close();
        System.out.println(username + " : " + password);
    }

    // Another way to set values into DataProvider
    @DataProvider(name = "create")
    public Object[][] create(){
        return new Object[][]
                {
                        {"standard_user", "secret_sauce"},
                        {"locked_out_user", "secret_sauce"},
                        {"problem_user\n", "secret_sauce"},
                        {"performance_glitch_user\n", "secret_sauce"},
                };
    }

}


//public Object[][] create(){
//    return new Object[][]{
//            {"username", "password"},
//            {"username", "password"},
//            {"username", "password"},
//
//    };
//}


//@Test(dataProvider = "create")
//public void test(String username, String password){
//

//}


// @DataProvider(name = "create")
//public Object[][] create(){
//    return new Object[][]
//            {
//                    {"username" , "password"}
//            };
//}


