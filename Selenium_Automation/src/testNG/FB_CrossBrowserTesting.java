package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class FB_CrossBrowserTesting {
	WebDriver driver;

	@Test
	public void f() throws InterruptedException {
		driver.findElement(By.name("email")).sendKeys("test123@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("dsafsdfsdF");
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(5000);
	}

	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browser) {
		// browser ="ie";

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", ".\\BrowserDrivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", ".\\BrowserDrivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.out.println("Please enter valid browser name***");

		}

		driver.get("https://www.facebook.com/");
	}

}
