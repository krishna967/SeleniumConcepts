package seleniumConceptsExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetVsManageTo {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		// load url
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		//load the url --> internally calls get() method only
		driver.navigate().to("https://demo.opencart.com/index.php?route=account/login");
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.getTitle());
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		driver.quit();
		
		
		
	}

}
