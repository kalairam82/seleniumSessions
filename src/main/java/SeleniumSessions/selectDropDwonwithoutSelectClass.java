package SeleniumSessions;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class selectDropDwonwithoutSelectClass {
    static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
                driver = new ChromeDriver();
                driver.get("https://www.orangehrm.com/30-day-free-trial");
                driver.manage().window().maximize();
                By CountryList = By.xpath("//select[@id = 'Form_getForm_Country']/option");
//                List<WebElement> Options = driver.findElements(CountryList);
//                
//                for(WebElement e: Options)
//                {
//                	String text = e.getText();
//                	System.out.println(text);
//                	
//                }
                
                getOptionsWithoutSelectClass(CountryList, "India");
	}
	public static void getOptionsWithoutSelectClass(By locator, String value)
	{
		List<WebElement> Options = getElements(locator);
		boolean flag = false;
        for(WebElement e: Options)
        {
        	String text = e.getText();
        	System.out.println(text);
        	        	
        	if(text.contains(value))
            {
	              e.click();
	              flag = true;
	              break;
              }
           }
        if(flag)
        {
        	System.out.println(value + " is selected");
        }
        else
        {
        	System.out.println("The value is not selected");
        }
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	

}
