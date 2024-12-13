package TestNG.in;


import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listners implements ITestListener {


//    TestNG provides different kinds of listeners which can perform
//    different actions whenever the event is triggered. The most widely
//    used listener in TestNG is ITestListener interface.


    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("test  is started");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("On success screenshot capture");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("on Failure");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("on test skipped");
    }


}
