package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation {

	public static void main(String[] args) {
		// isSelected();
		//isEnabled();
		//isDisplayed():
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//validate female radio button is selected by default?
		if (driver.findElement(By.id("u_0_9")).isSelected()) {
			System.out.println("radio button is selected");
		} else {
			System.out.println("radio button is NOT selected");
		}
		
		
		//validate Forgot account? link isdisplayed?
		if (driver.findElement(By.linkText("Forgot account?")).isDisplayed()) {
			System.out.println("Forgot account? element is displayed");
		} else {
			System.out.println("Forgot account? element is NOT displayed");
		}

		//to close the window
		driver.quit();
	}

}
