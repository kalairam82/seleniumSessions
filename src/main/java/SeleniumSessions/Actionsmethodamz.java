package SeleniumSessions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsmethodamz {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
            ChromeDriver driver = new ChromeDriver();
            
            driver.get("https://amazon.com");
            Thread.sleep(6000);
            driver.manage().window().maximize();
                        Actions act = new Actions(driver);
            
                      act.pause(500)
                             .sendKeys(Keys.TAB)
                               .pause(500)
                                 .sendKeys(Keys.TAB)
                                    .pause(500)
                                        .sendKeys(Keys.TAB)
                                          .pause(500)
                                                .sendKeys(Keys.TAB)
                                                    .pause(500)
                                                           .sendKeys(Keys.TAB)
                                                                .pause(500)
                                                                    .sendKeys("tablet")
                                                                        .pause(500)
                                                                             .sendKeys(Keys.ENTER)
                                                                                   .build()
                                                                                      .perform();
  
       
	}

}
