package seleniumConceptsExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerDemo {

	public static void main(String[] args) {

		// webdrivermanager helps to load latest binary files for driver based on
		// browser version
		// it will avoid issues which are related to driver

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.co.in");
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		String titleofthepage = driver.getTitle();
		System.out.println(titleofthepage);
		driver.close();

	}

}
