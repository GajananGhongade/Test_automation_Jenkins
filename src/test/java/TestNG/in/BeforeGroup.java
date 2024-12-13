package TestNG.in;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

@Test
public class BeforeGroup {

    @BeforeGroups(value = "bvt")
    public void beforeClass(){
        System.out.println("Run this before bvt groups test");
    }

    @AfterGroups(value = "bvt")
    public void afterGroupTest(){
        System.out.println("test1");
    }

}







