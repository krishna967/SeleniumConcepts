package waitsConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomWait {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();

		int timeOut = 10;
		int attempts = 0;
		while (attempts < timeOut) {
			try {
				driver.findElement(By.name("firstname")).sendKeys("Mohan Krishna");
				System.out.println(attempts);
				break;
			} catch (NoSuchElementException e) {
				System.out.println("element is not found in attempt : " + attempts);
				try {
					Thread.sleep(500);
					
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
			attempts++;
		}

	}

}
