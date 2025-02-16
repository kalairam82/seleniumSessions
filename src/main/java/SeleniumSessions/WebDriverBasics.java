package SeleniumSessions;

import org.openqa.selenium.chrome.ChromeDriver;


public class WebDriverBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ChromeDriver driver = new ChromeDriver();
		//WebDriver driver = new EdgeDriver();
         driver.get("https://www.google.com");
         String title = driver.getTitle();
         System.out.println("page title:" +title);
         if(title.equals("Google"))
         {
        	 System.out.println("pass");
         }
         else
         {
        	 System.err.println("FAIL");
        	 
         }
        driver.quit() ;
      
	}

}
