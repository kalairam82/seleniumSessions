package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageTest {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserUtil br = new BrowserUtil();
	    WebDriver driver = br.initDriver("chrome");
		br.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		System.out.println(br.getTitle());
		System.out.println(br.getPageUrl());
		
		//By firstname = By.id("input-firstname");
		By Lastname = By.id("input-lastname");
		By email = By.id("input-email");
		By telephone = By.id("input-telephone");
		By password = By.id("input-password");
		By confirmPwd = By.id("input-confirm");
		By LoginButton = By.className("list-group-item");
		By Register = By.xpath("//*[@id=\"column-right\"]/div/a[2]");
		By header = By.cssSelector("#content > h1");
		
		ElementUtil er = new ElementUtil(driver);
		
	//	er.doSendKeys(firstname, "sunita");
		er.doSendKeys(Lastname, "saba");
		er.doSendKeys(email, "suni123@gmail.com");
		er.doSendKeys(telephone,"5257598745");
		er.doSendKeys(password,"saba123");
		er.doSendKeys(confirmPwd, "saba123");
		er.doClick(LoginButton);
	    er.doClick(Register);
	    String headerTxt = er.dogetText(header);
	    System.out.println(headerTxt);
	    
		//String headerText = driver.findElement(header).getText();
		//System.out.println(headerText);
		//br.quit();
		

	}

}
