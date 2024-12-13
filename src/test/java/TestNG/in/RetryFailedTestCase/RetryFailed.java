package TestNG.in.RetryFailedTestCase;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailed implements IRetryAnalyzer {

    private int retryCount = 1;
    private  static  final  int maxRetryCount = 3;

    public boolean retry(ITestResult result){
        if(retryCount < maxRetryCount){
            retryCount++;
            return true;
        }
        return false;

    }

}


//public class RetryFailed implements IRetryAnalyzer {
//    private int retrycount = 1;
//    private int maxRetryCount = 4;
//
//    public boolean retry(ItestResult resullt){
//        if(retryCount < maxRetryCount){
//            retryCount++;
//            return true;
//        }
//        return false;
//    }
//
//}
//
//public class RetryListener implements IAnnotaionTransformer{
//    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod){
//        annotation.setRetryAnalyzer(RetryFailed.class);
//    }
//