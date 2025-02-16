package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class jqueryDropdown {
     static WebDriver driver;
	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/#google_vignette");
		By dropdown = By.xpath("//input[@id = 'justAnInputBox']");
		//By choices = By.xpath("//h3[text() ='Multi Selection']//following-sibling::div//ul/li");
        By choices = By.xpath("//h3[text()='Multi Selection']/following-sibling::div//span[contains(@class,'comboTreeItemTitle')]");


//		driver.findElement(dropdown).click();
//		List<WebElement> choice = driver.findElements(choices);
//		System.out.println(choice.size());
//		
//		for(WebElement e:choice)
//		{
//			String text = e.getText();
//			System.out.println(text);
//			if(text.contains("choice 4"))
//			{
//				e.click();
//				break;
//			}
//		}
        selectMultiChoice(dropdown,choices,"choice 4");
        
		//selectMultiChoice(dropdown,choices,"choice 4", "choice 5", "choice 6","choice 6 2");
		//selectMultiChoice(dropdown,choices,"all");
	}
	/**
	 * 	 * this method is handling single/multiple and all choices selection. Please pass "all" to select all the choices.
	 * selectChoice(choiceDropDown, choices, "All");
	 * @param dropdown
	 * @param choices
	 * @param choicevalue
	 */
	public static void selectMultiChoice(By dropdown,By choices , String... choicevalue)
	{
		driver.findElement(dropdown).click();
		List<WebElement> choice = driver.findElements(choices);
		System.out.println(choice.size());
		if(choicevalue[0].equalsIgnoreCase("all"))
		{
			// select all the choice one by one:
			for(WebElement e:choice)
			{
			e.click();
			}
		}
		else
		for(WebElement e:choice)
		{
			String text = e.getText();
			System.out.println(text);
			
			for(String ch:choicevalue)
			{
				if(text.equals(ch))
				{
					e.click();
				}
				
			}
		}	
		
	}

}