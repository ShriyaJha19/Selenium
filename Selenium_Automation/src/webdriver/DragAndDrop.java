package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		// driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/samples/05_drag_n_drop/08_pro_drag_out.html");
		driver.navigate().to("https://dhtmlx.com/docs/products/dhtmlxTree/samples/05_drag_n_drop/08_pro_drag_out.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		Actions act= new Actions(driver);
		
		//WebElement source = "//*[text()='Stephen King']"
		String xpath = "//*[@id=\"treeboxbox_tree\"]/div/table/tbody/tr[2]/td[2]/table/tbody/tr[4]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr/td[4]/span";
		WebElement source = driver.findElement(By.xpath(xpath));
		WebElement target = driver.findElement(By.xpath("//*[@id='sInput']"));
		//act.dragAndDrop(source, target).build().perform();
		act.clickAndHold(source).moveToElement(target).release(target).build().perform();
		

	}

}
