package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isElementDisplayed {
     static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
             driver = new ChromeDriver();
             driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
             By email= By.id("input-email");
             Boolean status=isElementExist(email);
            System.out.println(status);
             
             By forgottenpwd= By.linkText("Forgotten Password");
             Boolean flag= isElementExist(forgottenpwd, 2);
             System.out.println(flag);
             
             By usernameLink = By.linkText("Forgotten Username");
     		 System.out.println(isElementExist(usernameLink, 0));
             
        try
        {
        	driver.findElement(By.id("Kalai")).isDisplayed();

        }
        catch(NoSuchElementException e)
        {
        	System.out.println("element not present");
        }
        
     		
    		     		 
     		
	}

	  public static List<WebElement> getElements(By locator)
	  {
		  return driver.findElements(locator);
	  }
	  public static boolean isElementExist(By locator)
	  {
		  if(getElements(locator).size() ==1)
		  {
			  System.out.println("element is present");
			  return true;
		  }
		  else
		  {
			System.out.println("The element is not present");	
			return false;
	      }
	  }
	  public static boolean isElementExist(By locator,int elementcount)
	  {
		  if(getElements(locator).size() == elementcount)
		  {
			  System.out.println("element is present " + elementcount + " times");
			  return true;
		  }
		  else
		  {
			System.out.println("The element count is incorrect");	
			return false;
	      }
	  }
	  
	 
}
