package SeleniumSessions;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BrowserUtil brUtil = new BrowserUtil();

		brUtil.initDriver("chrome");
		//brUtil.launchUrl(null);
		brUtil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		

		String title = brUtil.getTitle();
		//System.out.println(title);
		if (title.equals("Account Login")) {
			System.out.println("title -- pass");
		} else {
			System.out.println("title -- fail");
		}

		String url = brUtil.getPageUrl();
		if (url.contains("route=account/login")) {
			System.out.println("login url is correct");
		}

		brUtil.closeBrowser();

	}

}
