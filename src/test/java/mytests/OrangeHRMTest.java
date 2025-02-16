package mytests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class OrangeHRMTest extends BaseTest
   {
	
	@Test
	
	public void titleTest()
	{
		String Title = driver.getTitle();
		System.out.println("The title is: " +Title);
		Assert.assertEquals(Title, "Human Resources Management Software | OrangeHRM");
	}
	
	@Test
	public void isExist()
	{
		//driver.get("https://www.orangehrm.com/");
		Assert.assertTrue(driver.findElement(By.linkText("Resources")).isDisplayed());
	}

}
