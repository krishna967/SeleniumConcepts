package seleniumConceptsExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LunchBrowser {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Krishna\\Downloads\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // launch the browser
		// Web driver is a interface -> we can't create object for interface and with
		// the help of class we are creating the object
		
		driver.get("https://www.google.com/"); // load the url in browser

		// to get current page title use getTitle() method
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);

		// validation for page title

		if (pageTitle.equals("Google")) {
			System.out.println("Pass");
		} else {
			System.out.println("Failed");
		}

		try {
			Thread.sleep(2000); // explicitly wait specified time and do the next step
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.quit(); // close the browser

	}

}
