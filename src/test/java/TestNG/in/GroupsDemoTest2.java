package TestNG.in;

import TestNG.in.CommonPkgSuites.in.CommonDataSetup;
import org.testng.annotations.Test;

@Test
public class GroupsDemoTest2 extends CommonDataSetup {

    public void aTest(){
        System.out.println("test1 group 2");
    }

    public void bTest(){
        System.out.println("test2 group 2");
    }

    public void cTest(){
        System.out.println("test3 group 2");
    }

    public void dTest(){
        System.out.println("test4 group 2");
    }


}
