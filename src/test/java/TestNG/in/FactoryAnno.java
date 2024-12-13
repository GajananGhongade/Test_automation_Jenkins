package TestNG.in;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

@Test
public class FactoryAnno {

//    The @Factory annotation in TestNG is used to create a set of test classes
//    dynamically at runtime. It allows you to pass parameters to test classes
//    or methods and execute them with different data sets, making it useful
//    for parameterized testing.

    private int param;

    public FactoryAnno(int param){
        this.param = param;
    }

    @Test
    public void testMethod(){
        System.out.println("parameter is : " + param);
    }

}

@Test
class TestFactory{

    @Factory
    public Object[] createInstances(){
        return new Object[] {
                new FactoryAnno(1),
                new FactoryAnno(2),
                new FactoryAnno(3),

        };
    }
}




