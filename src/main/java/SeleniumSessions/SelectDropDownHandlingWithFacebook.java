package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownHandlingWithFacebook {
    static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		
		By month =By.id("month");
		By day = By.id("day");
		By year = By.id("year");
//		
//          WebElement monthEle= driver.findElement(month);
//          WebElement dayEle= driver.findElement(day);
//          WebElement yearEle = driver.findElement(year);
//          
//          Select selectmonth = new Select(monthEle);
//          selectmonth.selectByVisibleText("Jul");
//          
//          Select selectday = new Select(dayEle);
//          selectday.selectByVisibleText("23");
//          
//          Select selectyear = new Select(yearEle);
//          selectyear.selectByVisibleText("2011");
		
		doSelectDropDownbyIndex(month, 7);
		doSelectDropDownbyValue(day, "23");
		doSelectDropDownbyVisibleText(year, "2011");
		printDropDownOptionsText(month);
		printDropDownOptionsText(day);
		printDropDownOptionsText(year);
		
		}
	 public static WebElement getElement(By locator)
	    {
	    	return driver.findElement(locator);
	    }
	public static void doSelectDropDownbyIndex(By locator, int index)
	{
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	public static void doSelectDropDownbyValue(By locator, String value)
	{
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	public static void doSelectDropDownbyVisibleText(By locator, String text)
	{
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
		}
	
	public static void printDropDownOptionsText(By locator) {
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();
		for (WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
		}
		System.out.println("-------end of the list-------");
	}

}
