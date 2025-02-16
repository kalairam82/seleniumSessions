package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StringLocator {
     static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    driver = new ChromeDriver();
	    driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
       String fname = "input-firstname";
       String lname="input-lastname";
       String email ="email";
       String telephone="//input[@id='input-telephone']";
       String pwd ="input[id = 'input-password']";
       String confirmpwd ="input-confirm";
       String listlogin= "//a[contains(@href ,'account/login') and @class='list-group-item']";
       
//       doSendKeys(getStringLocator("id",fname),"Savitha");
//       doSendKeys(getStringLocator("id",lname),"Prasanna");
//       doSendKeys(getStringLocator("name",email),"savitha.gmail.com");
//       doSendKeys(getStringLocator("xpath",telephone),"9856484585");
//       doSendKeys(getStringLocator("css",pwd),"savitha123");
//       doSendKeys(getStringLocator("id",confirmpwd),"savitha123");
       
       doSendKeys("id", fname,"Saranya");
       doSendKeys("id",lname,"Pranav");
       doSendKeys("name",email,"saranya.gmail.com");
       doSendKeys("xpath",telephone,"9856484585");
       doSendKeys("css",pwd,"saran123");
       doSendKeys("id",confirmpwd,"saran123");
       doClick("xpath",listlogin);
	}

	   public static void doSendKeys(By locator,String value)
	   {
		   getElement(locator).sendKeys(value);
	   }
	
	
	 	 public static WebElement getElement(By locator)
	    {
	    	return driver.findElement(locator);
	    }
	 	
	 	 public static void doClick(String locatortype,String locatorvalue)
	 	 {
	 		 getElement(getStringLocator(locatortype,locatorvalue)).click();
	 	 }
	 	 
	 	 public static void doSendKeys(String locatortype,String locatorvalue, String value)
		   {
			   getElement(getStringLocator(locatortype,locatorvalue)).sendKeys(value);
		   }		
	 	
	 	 
	
	 	 public static By getStringLocator(String locatortype, String locatorvalue)
	   {
		By locator = null;
		
		switch (locatortype.toLowerCase().trim()) {
		case "id":
			locator = By.id(locatorvalue);
			break;
		case "name":
			locator = By.name(locatorvalue);
			break;
		case "classname":
			locator = By.className(locatorvalue);
			break;	
		case "xpath":
			locator = By.xpath(locatorvalue);
			break;
		case "css":
			locator = By.cssSelector(locatorvalue);
			break;
		case "linktext":
			locator = By.linkText(locatorvalue);
			break;	
		case "partiallinktext":
			locator = By.partialLinkText(locatorvalue);
			break;	
		case "tagname":	
			locator =By.tagName(locatorvalue);
			break;
			default:
				System.out.println("This is not a valid locator");
			break;
		} 
	return locator;	
	}

}
