package testng.annotaions;

import org.testng.annotations.*;

public class TestNG3 {

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("after class");
    }

    @Test
    public void test1() {
        System.out.println("Test1");
    }

    @Test
    public void test2() {
        System.out.println("Test2");
    }

    @BeforeMethod
    public void setUp() {
        System.out.println("Before method");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("After method");
    }
}
