package testNGSessions;

import org.testng.annotations.Test;

public class expectedExceptionsClass {
    String name;
	
	@Test(expectedExceptions = {ArithmeticException.class,NullPointerException.class})
	public void test()
	{
		System.out.println("test");
		//int i =9/0;
		//expectedExceptionsClass obj = null;
		//obj.name  = "tom";
	}
	
//	@Test(expectedExceptions = Exception.class)
//	public void aTest() {
//		System.out.println("a test");
//		int i = 9/0;//AE
//
//	}
//
//	@Test(expectedExceptions = Exception.class)
//	public void bTest() {
//		System.out.println("b test");
//		int i = 9/0;//AE
//
//	}
//
//	@Test(expectedExceptions = Exception.class)
//	public void cTest() {
//		System.out.println("c test");
//		int i = 9/0;//AE
//
//	}
//
//	@Test(expectedExceptions = Exception.class)
//	public void dTest() {
//		System.out.println("d test");
//		int i = 9/0;//AE
//
//	}
//
//	@Test(expectedExceptions = Exception.class)
//	public void eTest() {
//		System.out.println("e test");
//		int i = 9/0;//AE
//
//	}

}
