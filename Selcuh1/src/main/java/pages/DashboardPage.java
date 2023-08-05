package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashboardPage {
	WebDriver driver;
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
		}
	@FindBy(how=How.XPATH,using="//*[@id=\"page-wrapper\"]/div[2]/div/h2")WebElement dashboardmenu;
	@FindBy(how=How.XPATH,using="//*[@id=\"side-menu\"]/li[3]/a/span[1]")WebElement customermenu;
	@FindBy(how=How.XPATH,using="//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a")WebElement addcustomer;
	@FindBy(how=How.XPATH,using="//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div/div[1]/h5")WebElement addcustomerHeader;
	@FindBy(how=How.XPATH,using="//*[@id=\"side-menu\"]/li[3]/ul/li[2]/a")WebElement listcustomer;
	@FindBy(how=How.XPATH,using="//*[@id=\"side-menu\"]/li[10]/a/span[1]") WebElement bank_and_cash;
	@FindBy(how=How.XPATH,using="//*[@id=\"side-menu\"]/li[10]/ul/li[1]/a") WebElement new_account;
	@FindBy(how=How.XPATH,using="//*[@id=\"side-menu\"]/li[5]/a/span[1]") WebElement transactions;
	@FindBy(how=How.XPATH,using="//*[@id=\"side-menu\"]/li[5]/ul/li[1]/a") WebElement add_deposit;

	
	
	public void switchTo_ADD_CUSTOMER() {
		
		customermenu.click();
		addcustomer.click();
	}

	public void switchTo_LIST_CUSTOMER() {
listcustomer.click();		
	}
	
	public void switchTo_NEW_ACCOUNT() {

bank_and_cash.click();	
new_account.click();


	}
	
	public void switchTo_ADD_DEPOSIT() {
		transactions.click();	
		add_deposit.click();
	}
	
}