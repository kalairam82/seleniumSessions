package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getDomAttributes {
       static WebDriver driver;
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		 driver =new ChromeDriver();
		 driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		 
//	   WebElement fname = driver.findElement(By.id("input-firstname"));
//       String fnameattr = fname.getDomAttribute("input-firstnamer");
//       System.out.println(fnameattr);
//       
//       String fnameProp = fname.getDomProperty("placeholder");
//       System.out.println(fnameProp);
//       
//       String outerHtml = fname.getDomProperty("outerHTML");
//       System.out.println(outerHtml);
//       
//       System.out.println("___________________________");
//       fname.sendKeys("Kalai");
//       String value = fname.getDomProperty("value");
//       System.out.println(value);
		 
		 By fname = By.id("input-firstname");
		 String fnameProp = dogetDomProperty(fname, "placeholder");
		 System.out.println(fnameProp);
		 
		 String fnameAttr = dogetDomAttributes(fname, "placeholder");
		 System.out.println(fnameAttr);
		  
         getElement(fname).sendKeys("kalai");
         System.out.println(dogetDomProperty(fname, "value"));
         
	}
	
	public static WebElement getElement(By locator)
	{
		
	return driver.findElement(locator);
	}
	
	public static String dogetDomAttributes(By locator, String attrName)
	{
       return getElement(locator).getDomAttribute(attrName);
     }
	
	public static String dogetDomProperty(By locator, String propName)
	{
       return getElement(locator).getDomProperty(propName);
     }
}
	
