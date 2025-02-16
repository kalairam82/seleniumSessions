package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class actionsDragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            WebDriver driver = new ChromeDriver();
            driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
            WebElement draggable = driver.findElement(By.id("draggable"));
            WebElement droppable = driver.findElement(By.id("droppable"));
            
            Actions act = new Actions(driver);
            
//            act
//                .clickAndHold(draggable)
//                   .moveToElement(droppable)
//                        .release() 
//                           .build()
//                               .perform();
            
            Action Myact =  act
                                .clickAndHold(draggable)
                                   .moveToElement(droppable)
                                      .release() 
                                         .build();
                                             
             Myact.perform();
          // act.dragAndDrop(draggable, droppable).build().perform();            
	}

}
