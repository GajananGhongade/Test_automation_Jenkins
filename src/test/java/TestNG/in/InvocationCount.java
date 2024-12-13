package TestNG.in;

// invocation count in testng decides how many
//  number of times test is  going to be executed

import org.testng.annotations.Test;


public class InvocationCount {

    @Test(invocationCount = 5)
    public static void method(){
        System.out.println("method count");
    }

}




