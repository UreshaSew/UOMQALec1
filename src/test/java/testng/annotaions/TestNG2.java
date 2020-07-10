package testng.annotaions;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG2 {
    @BeforeMethod
    public void setUp() {
        System.out.println("before method ");

    }

    @Test(priority =0)
    public void test1() {
        System.out.println("test1");
    }

    @Test(priority = 0)
    public void test2() {
        System.out.println("test2");
    }

    @Test()
    public void test() {
        System.out.println("test");
    }


    @AfterMethod
    public void tearDown() {
        System.out.println("after method ");
    }


}
