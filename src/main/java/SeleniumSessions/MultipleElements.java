package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElements {
          static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://amazon.com/");
		
		Thread.sleep(6000);
		
		List<WebElement> allList =driver.findElements(By.tagName("a"));
		System.out.println(allList.size());
		
		for(int i = 0; i<allList.size();i++)
		{
			String LinkText=allList.get(i).getText();
			if(LinkText.length()!=0)
			{
				System.out.println(LinkText);
			}
				
		}
		System.out.println("_____________________________________________");
		for(WebElement e: allList)
		{
					
			String List=e.getText();
			if(List.length()!=0)
			{
				System.out.println(List);
			}
		}
		

	}

}
