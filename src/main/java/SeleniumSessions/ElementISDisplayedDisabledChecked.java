package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementISDisplayedDisabledChecked {
   static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");	
		
		 WebElement pwd =driver.findElement(By.id("pass"));  
         WebElement fname = driver.findElement(By.id("fname"));
     		boolean isDisplayed = pwd.isDisplayed();
     		System.out.println(isDisplayed);//true
     		
     		boolean isEnabled = pwd.isEnabled();
     		System.out.println(isEnabled);//false
     		
     		System.out.println(fname.isDisplayed());//true
     		System.out.println(fname.isEnabled());//true
     		
     		driver.navigate().to("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
            WebElement policyCheckBox = driver.findElement(By.name("agree"));
            System.out.println( policyCheckBox.isSelected());//false
            policyCheckBox.click();
            System.out.println( policyCheckBox.isSelected());//true
            
	}

}
