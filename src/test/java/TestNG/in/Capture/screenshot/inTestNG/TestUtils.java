package TestNG.in.Capture.screenshot.inTestNG;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.Date;


public class TestUtils extends BaseClass  {
    @Test
    public static void getScreenShot() throws IOException {
        Date currentDate = new Date();
        System.out.println(currentDate);

        String DynamicFileName = currentDate.toString().replace(" ", "_").replace(":", "_");

        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("C:\\Users\\Admin\\Documents\\GP\\Gajanan_SQL_Practice" + DynamicFileName+".png"));

    }
}


