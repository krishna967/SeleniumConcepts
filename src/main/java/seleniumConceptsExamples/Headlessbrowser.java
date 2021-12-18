package seleniumConceptsExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Headlessbrowser {

	public static void main(String[] args) {
        
		WebDriverManager.chromedriver().setup();
		ChromeOptions ops = new ChromeOptions();
		//ops.addArguments("--headless");
		ops.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(ops);
		// load url
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		// load the url --> internally calls get() method only
		driver.navigate().to("https://demo.opencart.com/index.php?route=account/login");
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.getTitle());
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
