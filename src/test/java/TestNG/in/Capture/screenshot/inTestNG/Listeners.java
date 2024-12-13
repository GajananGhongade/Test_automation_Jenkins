package TestNG.in.Capture.screenshot.inTestNG;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import java.io.IOException;

public class Listeners extends TestUtils implements ITestListener {
    @Test
    public  void onTestStart(ITestResult result){
        System.out.println("Test case get started");
    }

    public void onTestSuccess(ITestResult result){

    }

    @Test
    public void onTestFailure(ITestResult result){
        try {
            System.out.println("Screenshot captured");
            getScreenShot();
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
        ;
    }





}
