package TestNG.in.CommonPkgSuites.in;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

@Test
public class CommonDataSetup {

    // before and after suites

    @BeforeSuite
    public void dataSetup(){
        System.out.println("Before suite Common data setup");
    }

    @AfterSuite
    public void dataTearDown(){
        System.out.println("After suite common data cleanup");
    }


}
