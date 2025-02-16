package SeleniumSessions;

//import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class carDekhoOptionsList {

		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {

			driver = new ChromeDriver();
			driver.get("https://www.cardekho.com/");
			driver.manage().window().maximize();
			Thread.sleep(4000);
			By options = By.xpath("//input[@id='vehicleTypeName']");
		//WebElement options =driver.findElement(By.xpath("//input[@id='vehicleTypeName']"));
	//options.click();
   	 By OptionList = By.xpath("(//input[@id='vehicleTypeName']//ancestor::li//child::div)[last()]/ul/li");
//		 List<WebElement> choices = driver.findElements(OptionList);
//         System.out.println(choices.size());
//         List<String> SelectValues = new ArrayList<String>();
//         for(WebElement e:choices)
//         {
//        	 String choiceValues = e.getText();
//        	 SelectValues.add(choiceValues);
//        	 
//        	 if(SelectValues.contains("Hybrid"))
//        	 {
//        		 e.click();
//        		 break;
//        	 }
//         }
// 		System.out.println(SelectValues);
	 //getOptionsWithoutSelectClass(OptionList, "Hybrid");
 		getOptionsWithoutSelectClass(options,OptionList, "Convertible");
		}

		
		public static void getOptionsWithoutSelectClass(By dropdown,By locator, String value)
		{
			 doClick(dropdown);
			List<WebElement> Options = getElements(locator);
			System.out.println(Options.size());
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
		 public static void doClick(By locator)
		    {
		    	getElement(locator).click();
		    }
		 public static WebElement getElement(By locator)
		    {
		    	return driver.findElement(locator);
		    }
}
