package SeleniumSessions;

import java.util.HashSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectwithduplicatevalue {
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          WebDriver driver = new ChromeDriver();
          driver.get("https://testautomationpractice.blogspot.com/");
          By listbox = By.id("colors");
          WebElement listBoxEle = driver.findElement(listbox);
          
          Select select = new Select(listBoxEle);	
          
          HashSet<String> listset = new HashSet<String>();
          
          for(WebElement e:select.getOptions())
          {
        	  String list = e.getText();
        	  System.out.println(list);
        	  if(!listset.add(list))
        	  {
        		  System.out.println("Duplicate Element found");
        		  System.out.println("The duplicate value is:" +list);
        	  }
          }
          System.out.println(listset);
      driver.quit();
          
	}

}
