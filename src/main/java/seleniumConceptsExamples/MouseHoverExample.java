package seleniumConceptsExamples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHoverExample {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		WebElement mousehoverLocator= driver.findElement(By.xpath("//div[text()='Fashion']"));
		
		// mousehover logic
		
		Actions act= new Actions(driver);
		act.moveToElement(mousehoverLocator).perform();
		
		driver.findElement(By.xpath("//a[@class='_6WOcW9']")).click();
		System.out.println(driver.getTitle());	
		
		
	}

}
