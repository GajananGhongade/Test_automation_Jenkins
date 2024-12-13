package TestNG.in.ReportGeneration;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ListenerReporter implements ITestListener {


    public void onTestStart(ITestResult result) {
        Reporter.log("test Method name is : " + result.getName());
    }

    public void onTestSuccess(ITestResult result) {
        Reporter.log("Method status is : "+result.getStatus());
    }








//    @Override
//    public void onTestFailure(ITestResult result) {
//        System.out.println("on Failure");
//    }
//
//    @Override
//    public void onTestSkipped(ITestResult result) {
//        System.out.println("on test skipped");
//    }



}
