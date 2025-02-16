package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionRightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                 WebDriver driver = new ChromeDriver();
                 driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
                 WebElement rightclick = driver.findElement(By.cssSelector("span.context-menu-one"));
               List<WebElement> options =driver.findElements(By.cssSelector("li.context-menu-item "));
               //List<WebElement> rightClickOptions = driver.findElements(By.cssSelector("ul.context-menu-list span"));
                 Actions act = new Actions(driver);
                 
                 act.contextClick(rightclick).build().perform();
                  System.out.println(options.size());
                  for(WebElement e:options)
                  {
                	  String text = e.getText();
                	  System.out.println(text);
                	  if(text.equals("Delete"))
                	  {
                		  e.click();
                		  System.out.println("The options selected is  " + text);
                		  break;
                	  }
                  }
                 
	}

}
