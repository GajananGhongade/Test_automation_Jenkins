package TestNG.in;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class BeforeTest {

    @org.testng.annotations.BeforeTest
    public void loginApplication(){
        System.out.println("Login before test");
    }

    @AfterTest
    public void AfterTest(){
        System.out.println("after test");
    }


    @Test(priority = 1, description = "Login page")
    public void loginTest(){
        System.out.println("Login test is successful");
    }

    @Test(priority = 2)
    public void logOut(){
        System.out.println("Logout");
    }

    @AfterMethod
    public void connectedToDB(){
        System.out.println("DB connected successfully");
    }

    @AfterMethod
    public void disconnectedFromDB(){
        System.out.println("Disconnected from db successfully");
    }



}
