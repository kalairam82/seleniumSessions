package testNGSessions;

import org.testng.annotations.Test;

public class invocationCount {

	@Test(invocationCount = 10)
	public void createUser()
	{
		System.out.println("Create User");
		
	}
}

