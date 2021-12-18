package testApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import seleniumConceptsExamples.BrowserUtil;
import seleniumConceptsExamples.ElementUtil;

public class RegPageTest {

	public static void main(String[] args) throws InterruptedException {

		BrowserUtil browserUtil = new BrowserUtil();
		WebDriver driver = browserUtil.launchBrowser("chrome");
		browserUtil.enterUrl("https://demo.opencart.com/index.php?route=account/register");
		String title = browserUtil.getPageTitle();
		System.out.println(title);
		ElementUtil eleutil = new ElementUtil(driver);
		By firstname = By.id("input-firstname");
		By lastname = By.id("input-lastname");
		eleutil.doSendKeys(firstname, "Mohan");
		eleutil.doSendKeys(lastname, "Krishna");
		Thread.sleep(5000);
		browserUtil.closeBrowser();
		System.out.println("Browser closed......");
	}

}
