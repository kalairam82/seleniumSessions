package testNGSessions;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNGAnnotation {
  //global precondition
	//pre condition
	//test cases: test steps  --->actual vs expected Results
	//post global steps
	
	 @BeforeSuite
	 public void connectwithDB()
	 {
		 System.out.println("BS connect to database");
	 }
	  @BeforeTest
	  public void createUser()
	  {
		  System.out.println("BT create user");
	  }
	  @BeforeClass
	  public void launchBrowser()
	  {
		  System.out.println("BC Launch browser");
	  }
	  @BeforeMethod
	  public void loginAPP()
	  {
		  System.out.println("BM login to APP");
	  }
	  @Test
	  public void titleTest()
	  {
		  System.out.println("title test");
	  }
	  @Test
	  public void loginTest()
	  {
		  System.out.println("login test");
		  Assert.assertEquals(false,true);
	  }
	  @Test
	  public void searchTest()
	  {
		  System.out.println("search test");
	  }
	  @AfterMethod
	  public void logoutAPP()
	  {
		  System.out.println("AM logout of APP");
	  }
	  @AfterClass
	  public void closeBrowser()
	  {
		  System.out.println("AC close browser");
	  }
	  @AfterTest
	  public void deleteUser()
	  {
		  System.out.println("AT delete user");
	  }
	  @AfterSuite
	 public void disconnectwithDB()
	 {
	  System.out.println("AS disconnect to database");
	 }
			 
  }
