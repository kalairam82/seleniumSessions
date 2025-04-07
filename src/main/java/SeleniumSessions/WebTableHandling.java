package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandling {
	public static void main(String[] args)  {
	
	 WebDriver driver = new ChromeDriver();
	      driver.get("https://www.espncricinfo.com/series/australia-vs-india-2024-25-1426547/australia-vs-india-3rd-test-1426557/full-scorecard");
	 
	    List<WebElement> Webtable = driver.findElements(By.xpath("(//div[contains(@class, 'ds-rounded-lg')])[1]"));
	    List<String> table = new ArrayList<String>();
	     for(WebElement e: Webtable)
	     {
	    	String text = e.getText();
//	    	System.out.println(text);
	    	table.add(text);
	     }
	     System.out.println(table);
	     driver.quit();
}

}