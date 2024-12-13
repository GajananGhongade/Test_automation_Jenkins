package TestNG.in;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDTDataProvider {
//    validating login using dataprovider via data driven testing

    @Test(dataProvider = "dataset", dataProviderClass = DDTProviderDemo3.class)  // just update here the dataset method name
    public void test(String username, String password   ){
        System.out.println(username + " : " + password);
    }

    @Test(dataProvider = "dataset1", dataProviderClass = DDTProviderDemo3.class)
    public void test1(String username, String password,  String test ){
        System.out.println(username + " : " + password + " " + test);
    }

    // Another way to set values into DataProvider
    @DataProvider
    public Object[][] dataset1(){
        return new Object[][]
                {
                        {"username1", "password1", "test1"},
                        {"username2", "password2", "test2"},
                        {"username3", "password3", "test3"},
                        {"username4", "password4", "test4"},
                };
    }

//
//    @DataProvider
//    public Object[][] dataset(){
//        Object[][] dataset = new Object[4][2];
//
//        dataset[0][0]="user1";
//        dataset[0][1]="pass1";
//
//
//        dataset[1][0]="user2";
//        dataset[1][1]="pass2";
//
//        dataset[2][0] = "user3";
//        dataset[2][1] = "pass3";
//
//        dataset[3][0] = "user4";
//        dataset[3][1] = "pass4";
//
//        return dataset;
//    }

}
