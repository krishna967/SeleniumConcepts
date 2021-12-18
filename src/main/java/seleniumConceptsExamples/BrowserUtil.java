package seleniumConceptsExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserUtil {

	public WebDriver driver;

	/*
	 * launch browser takes string as parameter and based on value the browser
	 * should launch
	 */
	public WebDriver launchBrowser(String browserName) {

		switch (browserName) {

		case "chrome":

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Krishna\\Downloads\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "Edge":
			System.setProperty("webdriver.edge.driver", "C:\\Users\\Krishna\\Downloads\\msedgedriver.exe");
			driver = new EdgeDriver();
			break;

		default:
			System.out.println(" Please enter valid browser name" + browserName);
			break;

		}
		return driver;
	}

	public void enterUrl(String urlName) {

		if (urlName == null) {
			System.out.println("No Url available for load the page");
			return;
		}
		if (urlName.indexOf("http") == -1) {
			System.out.println(" Http was not there in Url ");
			return;
		}
		driver.get(urlName);

	}

	public String getPageTitle() {

		return driver.getTitle();
	}

	public void closeBrowser() {
		driver.close();
	}

	public String getAppCurrentUrl() {
		return driver.getCurrentUrl();
	}
}
