package step;

import java.util.List;
import java.util.Map;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.google.protobuf.Field;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DashboardPage;
import pages.LoginPage;
import pages.NewAccountPage;
import util.BrowserFactory;
import util.Testbase;

public class StepDefintion {
	WebDriver driver;
	LoginPage PreTestConfig;
	Testbase commons;
	DashboardPage Dashboard;
	NewAccountPage Account;
	private String SearchTarget;

//setup
	@Given("I am on biling page")
	public void i_am_on_biling_page() {
		driver = BrowserFactory.init();
		driver.get("https://www.techfios.com/billing/?ng=login/");
	}

	@When("I login with my <username> and <password>")
	public void i_login_with_my_username_and_password(DataTable Credentials) {
		PreTestConfig = PageFactory.initElements(driver, LoginPage.class);

		List<Map<String, String>> LoginCredentials = Credentials.asMaps();
		for (Map<String, String> LoginField : LoginCredentials) {

			PreTestConfig.setup(LoginField.get("username"), LoginField.get("password"));
		}

	}

	@Then("I land on the dashboard page")
	public void i_land_on_the_dashboard_page() throws InterruptedException {
		commons = PageFactory.initElements(driver, Testbase.class);
		commons.valididator("Dashboard- iBilling");
		Thread.sleep(2000);

	}

	/// end of setup

	// start of new account steps
	@When("I clicks on the new account page")
	public void i_clicks_on_the_new_account_page() throws InterruptedException {
		Dashboard = PageFactory.initElements(driver, DashboardPage.class);
		Thread.sleep(2000);
		Dashboard.switchTo_NEW_ACCOUNT();
		Thread.sleep(2000);

	}

	@Then("I land on the new account page")
	public void i_land_on_the_new_account_page() {
		commons = PageFactory.initElements(driver, Testbase.class);
		commons.valididator("Accounts- iBilling");
	}

	@When("I input those fields from the  following columns:")
	public  void i_input_those_fields_from_the_following_columns(DataTable Accountinformation) {
		List<Map<String, String>> newAccount = Accountinformation.asMaps();
		for (Map<String, String> Field : newAccount) {
			Account = PageFactory.initElements(driver, NewAccountPage.class);
			 
			Account.account_type(Field.get("acctname"));
			Account.account_purpose(Field.get("purpose"));
			Account.account_balance(Field.get("balance"));
			Account.account_rounting_number(Field.get("accountNumber"));
			Account.account_contact_person(Field.get("contactPerson"));
			Account.account_contact_phone(Field.get("Phone"));
			Account.account_url(Field.get("internetBankingURL"));
			
		}
	

	}

	@When("user clicks on save")
	public void user_clicks_on_save() {
		Account = PageFactory.initElements(driver, NewAccountPage.class);
		Account.account_save();
	}

	@Then("user should be able to validate account created successfully")
	public void user_should_be_able_to_validate_account_created_successfully(DataTable SearchTarget) {
		commons = PageFactory.initElements(driver, Testbase.class);
		// internal Assertion check
	commons.Confirmation_valididator("Account Created Successfully");
		// Visually check account in list
		List<Map<String, String>> Search = SearchTarget.asMaps();
		for (Map<String, String> Field : Search) {
        commons.Find_user_new_account(Field.get("acctname"));
	}
	}
}
