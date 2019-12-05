package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		// driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/samples/05_drag_n_drop/08_pro_drag_out.html");
		driver.navigate().to("https://www.google.co.in/?gws_rd=ssl");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		Actions act= new Actions(driver);
		
		WebElement apps = driver.findElement(By.xpath("//*[@id='gbwa']/div/a"));
		//move curosr point to google app element
		act.moveToElement(apps).build().perform();
		
		System.out.println(apps.getAttribute("title"));
		
		
		

	}

}
