package seleniumConceptsExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForPageLoad {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://api.cogmento.com/register/");
		driver.findElement(By.partialLinkText("Log in here")).click();
		waitForPageLoadByJS(500, "complete");
		driver.findElement(By.name("email")).sendKeys("testing qa");

	}

	public static void waitForPageLoadByJS(int waitForPageload, String value) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		String loadingStatus = js.executeScript("return document.readyState;").toString();
		if (loadingStatus.equals(value)) {

			System.out.println("page loaded succuessfully... ");
		} else {
			for (int i = 0; i < 20; i++) {
				try {
					Thread.sleep(waitForPageload);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				loadingStatus = js.executeScript("return document.readyState;").toString();
				System.out.println("Current page is loading " + loadingStatus);
				if (loadingStatus.equals(value)) {
					break;
				}
			}
		}

	}

}
