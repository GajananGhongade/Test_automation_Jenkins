package TestNG.in;

import TestNG.in.CommonPkgSuites.in.CommonDataSetup;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupTestCases extends CommonDataSetup {

    @Test(priority = 1, description = "Login test", groups="regression")
    public void aTest(){
        System.out.println("test1 login");
    }

    @Test(priority = 2, groups = "bvt")
    public void bTest(){
        System.out.println("test2 ");
        Assert.assertTrue(false);
    }

    @Test(groups = "regression")
    public void cTest(){
        System.out.println("test3");
    }

    @Test(priority = 3, groups = "bvt")
    public void dTest(){
        System.out.println("test4");
    }


}
