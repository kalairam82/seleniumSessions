package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectDropDownHandling {
      static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          driver = new ChromeDriver();
          driver.get("https://www.orangehrm.com/30-day-free-trial");
          By country = By.id("Form_getForm_Country");
         // WebElement countryEle = driver.findElement(country);
         // Select select = new Select(countryEle);
          //select.selectByIndex(9);
          //select.selectByValue("Brazil");
          //select.selectByVisibleText("India");
          //select.selectByContainsVisibleText("Barbuda");
          doselectByContainsVisibleText(country, "Barbuda");
	}

	
	   public static void doselectByContainsVisibleText(By locator, String value)
	   {
		   Select select = new Select(getElement(locator));
		   select.selectByContainsVisibleText(value);
	   }
	   public static WebElement getElement(By locator) {
			return driver.findElement(locator);
		}
}
