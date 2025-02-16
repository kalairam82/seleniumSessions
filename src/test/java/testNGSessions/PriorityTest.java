package testNGSessions;

import org.testng.annotations.Test;

public class PriorityTest {

	//tcs should be independent
	//AAA -> Arrange act assert
	
	@Test(priority = 4)
	public void aTest()
	{
		System.out.println("This is A test");
	}
	@Test(priority = 5)
	public void bTest()
	{
		System.out.println("This is B test");
	}
	@Test(priority = 3)
	public void cTest()
	{
		System.out.println("This is C test");
	}
	@Test(priority = 1)
	public void dTest()
	{
		System.out.println("This is D test");
	}
	@Test(priority = 2)
	public void eTest()
	{
		System.out.println("This is E test");
	}
}

