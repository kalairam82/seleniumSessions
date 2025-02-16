package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultileSelectionWithSelectClass {
    static WebDriver driver;
	public static void main(String[] args) {
	       
		
		driver = new ChromeDriver();
		driver.get("https://html.com/attributes/select-multiple/");
		driver.manage().window().maximize();
		By multipleSelect = By.xpath("//select[@multiple]");
		WebElement multiSelect = driver.findElement(multipleSelect);
		
		Select select = new Select(multiSelect);
		
		System.out.println(select.isMultiple());
		if(select.isMultiple())
		{
		    System.out.println("Mulitple selection is available");
		 select.selectByVisibleText("American flamingo");
		 select.selectByVisibleText("Chilean flamingo");
		 select.selectByVisibleText("James's flamingo");
		}
		  
//		select.deselectByVisibleText("James's flamingo");
//		select.deselectAll();
//		dodeselectByVisibleText(multipleSelect, "James's flamingo");
//		dodeselectByIndex(multipleSelect, 0);
		//dodeSelectDropDownbyValue(multipleSelect,"American");
		dodeselectByContainsVisibleText(multipleSelect, "James's");
	}
	
	  
	
	public static void dodeselectByVisibleText(By locator, String value)
	{
	
		 Select select = new Select(getElement(locator));
		 select.deselectByVisibleText(value);
	}

	public static void dodeselectByIndex(By locator, int number)
	{
	
		 Select select = new Select(getElement(locator));
		 select.deselectByIndex(number);
	}
	
	
	public static  void dodeSelectDropDownbyValue(By locator, String value)
	{
		Select select = new Select(getElement(locator));
		select.deselectByValue(value);
	}
	
	public static void dodeselectByContainsVisibleText(By locator, String value)
	   {
		   Select select = new Select(getElement(locator));
		   select.deSelectByContainsVisibleText(value);
	   }
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
}
