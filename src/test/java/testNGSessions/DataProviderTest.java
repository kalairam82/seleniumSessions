package testNGSessions;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {


	//dp - test data
     @DataProvider
     public Object[][] getTestData()
     {
    	 return new Object[][] {
    		 {4,5, 9},
    		 {4,7, 11},
    		 {3,8, 11},
    		 
    	 };
     }

    //TDD: Test Driven Development
 	//tc with different test data -- data driven test approach: Parameterization

	 @Test(dataProvider ="getTestData")
	 public void addTest(int num1,int num2, int expsum)
	 {
		 int actSum = add(num1,num2);
		 Assert.assertEquals(actSum, expsum);
	 }
	 
		//functionality
	public int add(int num1,int num2)
	{
		int sum = num1+num2;
		return sum;
	}

}
