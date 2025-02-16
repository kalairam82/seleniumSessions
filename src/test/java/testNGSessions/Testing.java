package testNGSessions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testing {
    @Test
    public void AddMethod()
    {
    	System.out.println("This is Add method");
    	int a = 10;
    	int b = 40;
    	int sum = a+b;
        Assert.assertEquals(sum,40 ,"Both are equal");
     }
    @Test
    public void SubMethod()
    {
    	System.out.println("This is subtract method");
    	int c = 50;
    	int d = 40;
    	int diff = c-d;
        Assert.assertEquals(diff,10);
     }
}
