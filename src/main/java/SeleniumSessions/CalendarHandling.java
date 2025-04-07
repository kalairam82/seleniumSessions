package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarHandling {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.id("datepicker")).click();
        //selectDate(25);
		//selectFutureDate("March 2025", 20);
		selectPastDate("February 2024", 28);
	}
     
	
	 public static void selectPastDate(String expMonthYear, int date)
	 {
		 if(expMonthYear.contains("February") && date>29)
		 {
			 System.out.println("wrong date is passed");
			 throw new RuntimeException("Invalid date");
		 }
		 if(date <=0 || date>31)
		 {
			 System.out.println("wrong date is passed");
			 throw new RuntimeException("Invalid date");
		 }
		 String actMonthYear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
		 System.out.println(actMonthYear);
		 while(!actMonthYear.equalsIgnoreCase(expMonthYear))
		 {
			 driver.findElement(By.xpath("//span[text()='Prev']")).click();
			 actMonthYear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
		 }
		 selectDate(date);
	 }
	 public static void selectFutureDate(String expMonthYear, int date)
	 {
		 if(expMonthYear.contains("February") && date>29)
		 {
			 System.out.println("wrong date is passed");
			 throw new RuntimeException("Invalid date");
		 }
		 if(date <=0)
		 {
			 System.out.println("wrong date is passed");
			 throw new RuntimeException("Invalid date");
		 }
		 if(date >31)
		 {
			 System.out.println("wrong date is passed");
			 throw new RuntimeException("Invalid date");
		 }
		 String actMonthYear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
		 System.out.println(actMonthYear);
		 while(!actMonthYear.equalsIgnoreCase(expMonthYear))
		 {
			 driver.findElement(By.xpath("//span[text()='Next']")).click();
			 actMonthYear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText(); 
		 }
		selectDate(date); 
	 }
	
	 public static void selectDate(int date)
	 {
		 try {
		 driver.findElement(By.xpath("//a[text()='"+date+"']")).click();
		 }
		 catch(NoSuchElementException e)
		 {
		 System.out.println("Invalid date");
		 }		
	 }
}
