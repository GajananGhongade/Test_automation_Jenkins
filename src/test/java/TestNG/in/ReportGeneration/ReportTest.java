package TestNG.in.ReportGeneration;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class ReportTest{

    @Test
    public void Reportstest1(){
//        Reporter.log("This is Test1");
        Assert.assertTrue(true);
        System.out.println("test1");
    }

    @Test
    public void Reportstest2(){
//        Reporter.log("This is Test2");
        Assert.assertTrue(true);

        System.out.println("test2");
    }

    @Test
    public void Reportstest3(){
//        Reporter.log("This is Test3");
        Assert.assertTrue(true);

        System.out.println("test3");
    }

    @Test
    public void Reportstest4(){
//        Reporter.log("This is Test4");
        Assert.assertTrue(true);

        System.out.println("test4");
    }


}
