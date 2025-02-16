package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cricInfo {

		// TODO Auto-generated method stub
		static WebDriver driver;
		public static void main(String[] args)  {
			
			driver = new ChromeDriver();
			// TODO Auto-generated method stub
			driver.get("https://www.espncricinfo.com/series/australia-vs-india-2024-25-1426547/australia-vs-india-3rd-test-1426557/full-scorecard");
			driver.manage().window().maximize();
		// driver.findElement(By.xpath("//span[text() ='Travis Head']//ancestor::tr//child::a[@title='Travis Head']")).click();	
		
		 //driver.findElement(By.xpath("//span[text() ='Travis Head']//ancestor::tr//child::a[@title = 'Travis Head']//ancestor::tr//child::td//following-sibling::td"));
			By score =By.xpath("//span[text() ='Travis Head']//ancestor::tr//child::a[@title = 'Travis Head']//ancestor::tr//child::td//following-sibling::td");
		  	//driver.findElements(score);
			
		  	List<WebElement> playerscore = driver.findElements(score);
		  	System.out.println(playerscore.size());
		  	List<String> table = new ArrayList<String>();
//		  	System.out.println(table.toString());
			for (WebElement e : playerscore) {
                  //System.out.println(e.getText());
			String Player = e.getText();
			table.add(Player);
					
				}
			System.out.println(table);
			driver.quit();

	}

}
