package TestNG.in.ReportGeneration;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReportNgPlugin {
    @Test
    public void testSuccess() {
        System.out.println("This test passes!");
        Assert.assertTrue(true);
    }

    @Test
    public void testFailure() {
        System.out.println("This test fails!");
        Assert.assertTrue(false);
    }

}
