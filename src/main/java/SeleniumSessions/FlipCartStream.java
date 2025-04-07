package SeleniumSessions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipCartStream {
     
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		//driver.findElements(By.tagName("a"))
//		  .stream()
//		     .forEach(e -> System.out.println(e.getText()));
//     
		
//		driver.findElements(By.tagName("a"))
//		      .stream()
//		          .filter(e -> !e.getText().isEmpty())
//		              .forEach(e -> System.out.println(e.getText()));
//		
		System.out.println("_________________________________");
		driver.findElements(By.tagName("a"))
		     .stream()
		         .filter(e -> e.getText().startsWith("Flipkart"))
		            .forEach(e -> System.out.println(e.getText()));
		  
		System.out.println("_____________________________________");
		
		List<WebElement> Flipkartlist = driver.findElements(By.tagName("a"))
		      .stream()
		          .filter(e -> e.getText().startsWith("Flipkart"))
		             .collect(Collectors.toList());
		System.out.println(Flipkartlist.size());
	   List<String> List = new ArrayList<String>();
		  
		for(WebElement e:Flipkartlist)
		{
			String text = e.getText();
			List.add(text);
			
		}
	    System.out.println(List);
	    
	    System.out.println("____________________________________");
	 
       List<String> flipkartList = new ArrayList<String>();//pc=0, []
		
		driver.findElements(By.tagName("a"))
			.stream()
				.filter(e -> e.getText().startsWith("Flipkart"))
					.forEach(e -> flipkartList.add(e.getText()));
		
		System.out.println(flipkartList);
		
		//use it for limited number of items
		//debugging it hard

	
	}
	
}