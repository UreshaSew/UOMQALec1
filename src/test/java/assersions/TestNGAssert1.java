package assersions;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAssert1 {
    @Test
    public void testAssert1() {
        int x= 10;
        Assert.assertEquals(x,10,"Failed to match value");
    }

    @Test
    public void testAssert2() {
        boolean val =false;
        Assert.assertFalse(val,"Failed to match boolean");
    }
}

