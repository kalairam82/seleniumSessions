package mytests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class OpenCartTest extends BaseTest{

   @Test
   public void titleTest()
   {
	String Title = driver.getTitle();
	System.out.println("The title is: " +Title);
	Assert.assertEquals(Title, "Account Login");
   }
   
   @Test
   public void forgotPasswordLinkExitTest()
   {
	  // driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login"); 
	   Assert.assertTrue(driver.findElement(By.linkText("Forgotten Password")).isDisplayed());
   }
	
	 
}

