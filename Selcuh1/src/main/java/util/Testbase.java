package util;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.asserts.Assertion;

public class Testbase {
	WebDriver driver;
	public Testbase(WebDriver driver) {
		this.driver = driver;
		}
	

	// title validate
	public boolean valididator(String suppose) {
		String actual = driver.getTitle();
		String expect = suppose;
		Assertion assertion = new Assertion();
		assertion.assertEquals(actual, expect, "wrong page");
		return true;

	}
	
	// Confirmation 
	public  void Confirmation_valididator(String suppose) {
		WebElement actual= driver.findElement(By.xpath("/html/body/section/div/div[1]/div[3]/div[1]"));
		String expect = suppose;
		Assertion assertion = new Assertion();
		assertion.assertEquals(((WebElement) actual).getText(), expect,"Account number and or name  must  be unique");
		
		
	}
	public void Find_user_new_account(String recent) {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	//Locating element by text and store in variable "Element"        		
    WebElement TextFinder = driver.findElement(By.xpath("//*[contains(text(), '" + recent + "')]"));

    // Scrolling down the page till the element is found		
    js.executeScript("arguments[0].scrollIntoView();", TextFinder);
	}
}

