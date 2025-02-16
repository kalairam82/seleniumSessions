package SeleniumSessions;

public class browserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          BrowserUtil browser = new BrowserUtil();
          browser.initDriver("Chrome");
          browser.launchUrl("https://naveenautomationlabs.com");
          String title = browser.getTitle();
          System.out.println("The title is: " +title);
         if(title.contains("naveen automationlabs"))
         {
        	 System.out.println("right browser");
        	 		        	 		
         }
         else
        	 System.out.println("Pls pass the correct url");
          browser.closeBrowser();
	}

}
