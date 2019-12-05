package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledSample {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/generate-file-to-download-demo.html");
		// to maximise the window we will use below command
		driver.manage().window().maximize();
		
		if (driver.findElement(By.id("create")).isEnabled()) {
			System.out.println("Generate file button is in enabled state");
		} else {
			System.out.println("Generate file button is in disabled state");
		}
		

	}

}
