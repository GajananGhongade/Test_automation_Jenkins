package TestNG.in;

import org.testng.annotations.Test;


public class TestNG {

    @Test(priority = 1, description = "Login page")
    public void loginTest(){
        System.out.println("Login test is successful");
    }

    @Test(priority = 2)
    public void logOut(){
        System.out.println("Logout");
    }
}
