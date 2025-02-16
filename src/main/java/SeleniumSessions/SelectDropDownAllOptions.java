package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownAllOptions {
 static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          driver = new ChromeDriver();
          driver.get("https://www.orangehrm.com/30-day-free-trial");
          
         By CountryList = By.id("Form_getForm_Country");
         getDropDownOptionsCount(CountryList);
         List<String> CountryListOptions =getDropDownOptionsTextList(CountryList);
         System.out.println(CountryListOptions);
         System.out.println(CountryListOptions.contains("India"));

         getDropDownOptionsText(CountryList);
	}
	
	public static void getDropDownOptionsText(By locator)
	{
		Select select = new Select(getElement(locator));
		  List<WebElement> OptionsSize = select.getOptions();
		 	for(WebElement e:OptionsSize)
		{
           String text = e.getText();
           System.out.println(text);
		}
					
		
	}
	
	public static List<String> getDropDownOptionsTextList(By locator)
	{
		Select select = new Select(getElement(locator));
		List<WebElement> OptionsSize = select.getOptions();
		System.out.println("Options size: " + OptionsSize.size());
		List<String> OptionsValueList = new ArrayList<String>();
		for(WebElement e: OptionsSize)
		{
			String text = e.getText();
			OptionsValueList.add(text);
					
		}
		return OptionsValueList;
	}
	
	
	
	public static int getDropDownOptionsCount(By locator)
	{
		Select select = new Select(getElement(locator));
		List<WebElement> OptionsSize = select.getOptions();
		System.out.println("Options size: " + OptionsSize.size());
		return OptionsSize.size();
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	} 
}
