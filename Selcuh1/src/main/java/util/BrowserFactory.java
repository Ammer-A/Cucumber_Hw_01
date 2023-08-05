package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserFactory {
 static WebDriver driver;

	public  static   WebDriver init() {  // transfer driver to other pages
		driver= new EdgeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		return driver;
		
	}
	public void teardown() {
	driver.quit();
	driver.close();
	}
}