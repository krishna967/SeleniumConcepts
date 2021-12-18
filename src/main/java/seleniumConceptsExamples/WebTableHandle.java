package seleniumConceptsExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandle {
	// static web table
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(3000);
		By row = By.xpath("//table[@id='customers']/tbody/tr");
		By col = By.xpath("//table[@id='customers']/tbody/tr[1]/th");

		String beforeXpath = "//table[@id='customers']/tbody/tr[";
		String afterXpath = "]/td[";
		printTable(row, col, beforeXpath, afterXpath);

	}

	public static void printTable(By rowLocator, By colLocator, String beforeXpath, String afterXpath) {
		int rowCount = driver.findElements(rowLocator).size();
		int colCount = driver.findElements(colLocator).size();
		for (int row = 2; row <= rowCount; row++) {

			for (int col = 1; col <= colCount; col++) {
				String finalXpath = beforeXpath + row + afterXpath + col + "]";
				String text = driver.findElement(By.xpath(finalXpath)).getText();
				System.out.print(text + "       ||     ");
			}
			System.out.println();

		}
	}
}
