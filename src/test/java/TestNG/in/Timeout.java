package TestNG.in;

import org.testng.annotations.Test;

public class Timeout {

    @Test(timeOut = 2000)
    public void SetTimeout(){
        System.out.println("method 1 callled");
    }

    @Test(timeOut = 500)
    public void Method2(){
        System.out.println("Method 2 get called");
    }

}
