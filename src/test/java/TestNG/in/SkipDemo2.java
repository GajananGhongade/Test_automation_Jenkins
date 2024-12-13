package TestNG.in;

import org.testng.SkipException;
import org.testng.annotations.Test;
@Test
public class SkipDemo2 {

    Boolean dataSetup = false;

    @Test(enabled = false)
    public void skipTest1(){
        System.out.println("Skipping this rest as it is not complete");

    }

    @Test
    public void skipTest2(){
        System.out.println("does not skip this test");
        throw new SkipException("skip2");

    }

    @Test(enabled = false)
    public void skipTest3() {
        System.out.println("skipping the test case as condition does not meet");
        if (dataSetup) {
            System.out.println("execute the test");
        } else {
            System.out.println("do not execute further step");
            throw new SkipException("skip3");
        }
    }
}








