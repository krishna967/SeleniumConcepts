package seleniumConceptsExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementd {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--incognito");
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		/*
		 * List<WebElement> listoflinks = driver.findElements(By.tagName("a"));
		 * System.out.println(listoflinks.size());
		 */
		By listOfLinks = By.tagName("a");
		List<WebElement> list = getElements(listOfLinks);
		int countOfLinks = getCount(listOfLinks);
		System.out.println(countOfLinks);
		for (WebElement e : list) {
			String text = e.getText();
			if (!(text.equals(""))) {
				System.out.println(e.getText());
			}
		}
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static int getCount(By locator) {
		return getElements(locator).size();
	}
}
