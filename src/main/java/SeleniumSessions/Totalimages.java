package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Totalimages {
    static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver =new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		List<WebElement> allimages=driver.findElements(By.tagName("img"));
		System.out.println(allimages.size());
		
		

	}

}
