package webdriver;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShot {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//get the system date
		Date d = new Date();
		System.out.println(d);//Thu Nov 21 19:30:43 EST 2019
		DateFormat df =new SimpleDateFormat("yyyyMMMdd_HHmmss");
		String timestamp = df.format(d);
		System.out.println(timestamp);
//		Thu Nov 21 19:33:07 EST 2019
//		2019Nov21_193307


		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.get("https://ttdsevaonline.com/#/registration");
		driver.navigate().to("https://ttdsevaonline.com/#/registration");
		//click on back button on browser
		driver.navigate().back();
		Thread.sleep(5000);
		//click on frwd button on browser
		driver.navigate().forward();
		Thread.sleep(5000);
		//click on refresh button on browser
		driver.navigate().refresh();
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		String path = ".\\screenshots\\";
		File abc = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(abc, new File(path + "test"+timestamp+".png"));
		
		
		driver.quit();
		
	}

}
