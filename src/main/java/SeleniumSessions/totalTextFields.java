package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class totalTextFields {
  static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
	    driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	    
	    List<WebElement> textFields=driver.findElements(By.className("form-control"));
              List<WebElement> regFields= driver.findElements(By.xpath("//form//child::input[@class ='form-control']"));
	    System.out.println(textFields.size());
	    System.out.println(regFields.size());
	    driver.quit();
	}

}
