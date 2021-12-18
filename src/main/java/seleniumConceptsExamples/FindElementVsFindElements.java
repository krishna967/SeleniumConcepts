package seleniumConceptsExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementVsFindElements {

	public static void main(String[] args) {

		/*
		 * WebDriverManager.chromedriver().setup(); WebDriver driver = new
		 * ChromeDriver(); driver.get("https://www.google.co.in/"); List<WebElement>
		 * languagelist = driver.findElements(By.xpath("//div[@id='SIvCob']/a")); for
		 * (WebElement ele : languagelist) {
		 * 
		 * String text = ele.getText().trim(); System.out.println(text); }
		 * 
		 */

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.co.in");
		List<WebElement> list = driver.findElements(By.id("q"));
		System.out.println(list.size());

	}

}
