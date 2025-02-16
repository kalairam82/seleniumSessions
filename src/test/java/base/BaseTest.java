package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;



public class BaseTest {
    protected WebDriver driver;
     @Parameters({"url","browser"})
	 @BeforeTest
	 public void setup(String url , String browserName) 
	 {
		 System.out.println("the browser name is: " +browserName);
		 switch (browserName.trim().toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "firefox":
		    driver = new FirefoxDriver();
		   break;
			
			default:
			System.out.println("Pls pass the right browser" +browserName);
			throw new RuntimeException("Invalid Browser");

		} 
			
		 
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.manage().window().maximize();
		 driver.get(url);
	 }
	 
	 @AfterTest
	 public void teardown()
	 {
		 driver.quit();
	 }
}

