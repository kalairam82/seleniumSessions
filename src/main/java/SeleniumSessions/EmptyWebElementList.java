package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmptyWebElementList {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
	    driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	    //driver.findElement(By.className("naveen")).click();//NSE
        List<WebElement> emptyList = driver.findElements(By.className("kalai"));
        System.out.println(emptyList);
        
        System.out.println(emptyList.size());

	}

}
