package SeleniumSessions;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;

public class OpenCartSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.initDriver("chrome");
	    brUtil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	    Thread.sleep(1000);
		By listGroup = By.xpath("//a[@class='list-group-item']");
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.getOptionsWithoutSelectClass(listGroup, "Forgotten Password");
		 
		By button = By.xpath("//button[@class='btn btn-link dropdown-toggle']");
		By Options = By.xpath("//button[@class='btn btn-link dropdown-toggle']/following-sibling::ul/li");
		Thread.sleep(3000);
		//driver.findElement(button).click();
		//eleUtil.selectMultiChoice(button, Options, "€ Euro");
		eleUtil.getOptionsWithoutSelectClass(button,Options,"€ Euro");
//        List<WebElement> list=driver.findElements(Options);
//		System.out.println(list.size());
//		
//		for(WebElement e:list)
//		{
//			String text = e.getText();
//			System.out.println(text);
//			if(text.equals("$ US Dollar"))
//			{
//				e.click();
//				break;
//			}
//		}
		
	}

}
