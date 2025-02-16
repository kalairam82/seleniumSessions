package testNGSessions;

import org.testng.annotations.Test;

public class DependOnMethod {

@Test
public void loginTest()
{
	System.out.println("This is LoginTest");
	//int i = 9/3;
}
@Test(dependsOnMethods = "loginTest")
public void homeTest()
{
	System.out.println("This is HomeTest");
	//int i =9/0;
}
@Test(dependsOnMethods = "homeTest")
public void cartTest()
{
	System.out.println("This is CartTest");
}

}

