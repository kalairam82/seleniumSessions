package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendKeysConcept {
         static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          driver = new ChromeDriver();
          driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
          
          WebElement fname = driver.findElement(By.id("input-firstname"));
         // WebElement lname = driver.findElement(By.id("input-lastname"));
          
          String name = "kalai";
        	StringBuffer bf= new StringBuffer("selvi");
        	StringBuilder bd= new StringBuilder("suthanthra");
        	String space= " ";
          fname.sendKeys(name,space,bf,space,bd,space,"Pragasan");
        //  lname.sendKeys(null);
}
}