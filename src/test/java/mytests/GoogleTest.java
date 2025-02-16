package mytests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class GoogleTest extends BaseTest{

	@Test
	
	public void titleTest()
	{
		  String title = driver.getTitle();
		  System.out.println("The title is: " +title);
		  Assert.assertEquals(title, "Google");
	}
	@Test
	public void urlTest()
	{
		//driver.get("https://www.google.com");
		String url = driver.getCurrentUrl();
		System.out.println("The url is: " +url);
		Assert.assertTrue(url.contains("google"));
	}
}
