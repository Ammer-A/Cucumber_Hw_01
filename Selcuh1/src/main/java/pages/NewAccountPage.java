package pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NewAccountPage {
	WebDriver driver;
	public NewAccountPage(WebDriver driver) {
		this.driver = driver;
		}
@FindBy(how=How.XPATH,using="//*[@id=\"account\"]") WebElement account_fund_Type;
@FindBy(how=How.XPATH,using="//*[@id=\"description\"]") WebElement account_Purpose;
@FindBy(how=How.XPATH,using="//*[@id=\"balance\"]") WebElement account_start_Balance;
@FindBy(how=How.XPATH,using="//*[@id=\"account_number\"]") WebElement account_routing_Number;
@FindBy(how=How.XPATH,using="//*[@id=\"contact_person\"]") WebElement account_contact;
@FindBy(how=How.XPATH,using="//*[@id=\"contact_phone\"]")WebElement account_contacr_Number;
@FindBy(how=How.XPATH,using="//*[@id=\"ib_url\"]" )WebElement account_URL;
@FindBy(how=How.XPATH,using="//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[2]/form/button" )WebElement account_save_bttn;
@FindBy(how=How.XPATH,using="//*[@id=\"did2612\"]")WebElement deletebttn;


public void account_type(String label) {
	account_fund_Type.sendKeys(label);
	
}
public void account_purpose(String discript) {
	account_Purpose.sendKeys(discript);
}

public void account_balance(String  start) {
	account_start_Balance.sendKeys(start);
}
public void account_rounting_number(String  accnumber) {
	account_routing_Number.sendKeys(accnumber);
}

public void account_contact_person(String  name) {
	account_contact.sendKeys(name);
}
public void account_contact_phone(String  number) {
	account_contacr_Number.sendKeys(number);
}
public void account_url(String  webpage) {
	account_URL.sendKeys(webpage);
}

public void account_save() {
account_save_bttn.click();}










}
