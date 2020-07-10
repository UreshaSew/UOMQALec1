package testng.annotaions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG4 {
    @BeforeClass
    public void testLogin(){
        System.out.println("login");
    }
    @Test(priority=0)
    public void testCreate(){
        System.out.println("Create");
    }
    @Test(priority=1)
    public void testEdit(){
        System.out.println("Edit");
    }
    @Test(priority = 2)
    public void testDelete(){
        System.out.println("Delete");
    }
    @Test
    public void testLogout(){
        System.out.println("Logout");
    }
}
