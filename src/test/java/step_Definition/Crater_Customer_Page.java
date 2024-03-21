package step_Definition;

import org.junit.Assert;
import org.openqa.selenium.Keys;

import Utils.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CraterDashboardPage;
import pages.Crater_Customers_page;
import pages.craterloginPage;

public class Crater_Customer_Page {
	
	BrowserUtils utils = new BrowserUtils();
	craterloginPage login = new craterloginPage();
	CraterDashboardPage  dashboard = new CraterDashboardPage();
	Crater_Customers_page customer = new Crater_Customers_page();
	
	
	@Given("as a {string} user I have logged into crater application")
	public void as_a_user_i_have_logged_into_crater_application(String user_type) {
	   login.Login(user_type);
		// Write code here that turns the phrase above into concrete actions
	    
	}
	@When("user clicks on Customers link")
	public void user_clicks_on_customers_link() {
	    // Write code here that turns the phrase above into concrete actions
	    utils.clickWithActionsClass(customer.Customers_link);
	}
	@When("clicks on the new customer button")
	public void clicks_on_the_new_customer_button() {
	    // Write code here that turns the phrase above into concrete actions
	    utils.clickWithActionsClass(customer.New_customer_btt);
	}
	@When("new page loads user should be on New Customer page")
	public void new_page_loads_user_should_be_on_new_customer_page() {
	    // Write code here that turns the phrase above into concrete actions
		utils.waitForElementToBeVisible(customer.Display_name_txtbox);
	    Assert.assertTrue(customer.Display_name_txtbox.isDisplayed());
	}
	@When("will see Basic Info section")
	public void will_see_basic_info_section() {
		utils.waitForElementToBeVisible(customer.basicinfo_Title);
		Assert.assertTrue(customer.basicinfo_Title.isDisplayed());
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@When("Billing Address")
	public void billing_address() {
	    // Write code here that turns the phrase above into concrete actions
		utils.waitForElementToBeVisible(customer.Billing_address_Title);
		Assert.assertTrue(customer.Billing_address_Title.isDisplayed());
	}
	@When("Shipping Address")
	public void shipping_address() {
	    // Write code here that turns the phrase above into concrete actions
		utils.waitForElementToBeVisible(customer.ShippingAddress_Title);
		Assert.assertTrue(customer.ShippingAddress_Title.isDisplayed());
	}
	@When("Save Customer button")
	public void save_customer_button() {
	    // Write code here that turns the phrase above into concrete actions
		utils.waitForElementToBeVisible(customer.Save_Customer_button);
		Assert.assertTrue(customer.Save_Customer_button.isDisplayed());
	}

	
	@When("provides data in Display Name")
	public void provides_data_in_display_name() {
	    // Write code here that turns the phrase above into concrete actions
	    utils.waitForElementToBeVisible(customer.Display_name_txtbox);
	    utils.clickWithActionsClass(customer.Display_name_txtbox);
	    utils.sendkeysWithActionsClass(customer.Display_name_txtbox, "Bilbobaggins");
	}
	@When("email box")
	public void email_box() {
		
	    // Write code here that turns the phrase above into concrete actions
	    utils.waitForElementToBeVisible(customer.emaitxtbox_Basicinfo);
	    utils.clickWithActionsClass(customer.emaitxtbox_Basicinfo);
	    utils.sendkeysWithActionsClass(customer.emaitxtbox_Basicinfo, "bilbobaggins@yahoo.com");
	}
	@When("primary currency")
	public void primary_currency() {
	    // Write code here that turns the phrase above into concrete actions
	    utils.waitForElementToBeVisible(customer.Currency_Basic_info);
	    utils.clickWithActionsClass(customer.Currency_Basic_info);
	    utils.sendkeysWithActionsClass(customer.Currency_Basic_info, "Eur");
	    customer.Currency_Basic_info.sendKeys(Keys.ENTER);
	}
	@When("Primary contact")
	public void primary_contact() {
	    // Write code here that turns the phrase above into concrete actions
	    utils.waitForElementToBeVisible(customer.Primary_contactname_Basicinfo);
	    utils.clickWithActionsClass(customer.Primary_contactname_Basicinfo);
	    utils.sendkeysWithActionsClass(customer.Primary_contactname_Basicinfo, "Bilbo Baggins");
	}
	@When("Phone")
	public void phone() {
	    // Write code here that turns the phrase above into concrete actions
	    utils.waitForElementToBeVisible(customer.Phone_Basic_info);
	    utils.clickWithActionsClass(customer.Phone_Basic_info);
	    utils.sendkeysWithActionsClass(customer.Phone_Basic_info, "6789998282");
	    //customer.Phone_Basic_info.sendKeys(Keys.ENTER);
	}
	@When("name in billing address")
	public void name_in_billing_address() {
	    // Write code here that turns the phrase above into concrete actions
	    utils.waitForElementToBeVisible(customer.Name_txtbox_BillingAddy);
	    utils.clickWithActionsClass(customer.Name_txtbox_BillingAddy);
	    utils.sendkeysWithActionsClass(customer.Name_txtbox_BillingAddy, "Biblo Baggins");
	}
	@When("state in billing address")
	public void state_in_billing_address() {
	    // Write code here that turns the phrase above into concrete actions
	    utils.waitForElementToBeVisible(customer.State_txtbox_Billingaddy);
	    utils.clickWithActionsClass(customer.State_txtbox_Billingaddy);
	    utils.sendkeysWithActionsClass(customer.State_txtbox_Billingaddy, "Texas");
	}
	@When("Address in billing address")
	public void address_in_billing_address() {
	    // Write code here that turns the phrase above into concrete actions
	    utils.waitForElementToBeVisible(customer.Address_Line1_txtbox);
	    utils.waitForElementToBeVisible(customer.Address_line2_txtbox);
	    utils.clickWithActionsClass(customer.Address_Line1_txtbox);
	    utils.sendkeysWithActionsClass(customer.Address_Line1_txtbox, "2345 shire rd");
	}
	@When("Country in billing address")
	public void country_in_billing_address() {
	    // Write code here that turns the phrase above into concrete actions
	   utils.waitForElementToBeVisible(customer.Country_dropbox);
	   utils.clickWithActionsClass(customer.Country_dropbox);
	   utils.sendkeysWithActionsClass(customer.Country_dropbox, "united states");
	   customer.Country_dropbox.sendKeys(Keys.ENTER);
	}
	@When("city in in billing address")
	public void city_in_in_billing_address() {
	    // Write code here that turns the phrase above into concrete actions
	   utils.waitForElementToBeVisible(customer.City_billing_box);
	   utils.clickWithActionsClass(customer.City_billing_box);
	   utils.sendkeysWithActionsClass(customer.City_billing_box, "Austin");
	}
	@When("phone in billing address")
	public void phone_in_billing_address() {
	    // Write code here that turns the phrase above into concrete actions
	    utils.waitForElementToBeVisible(customer.phone_billing_box);
	    utils.clickWithActionsClass(customer.phone_billing_box);
	    utils.sendkeysWithActionsClass(customer.phone_billing_box, "6789998282");
	}
	@When("zip code in billing address")
	public void zip_code_in_billing_address() {
	    // Write code here that turns the phrase above into concrete actions
	    utils.waitForElementToBeVisible(customer.zipcode_billing);
	    utils.clickWithActionsClass(customer.zipcode_billing);
	    utils.sendkeysWithActionsClass(customer.zipcode_billing, "34562");
	}
	@When("user clicks on Save Customer")
	public void user_clicks_on_save_customer() {
	    // Write code here that turns the phrase above into concrete actions
	    utils.waitForElementToBeVisible(customer.Save_Customer_button);
	    utils.clickWithActionsClass(customer.Save_Customer_button);
	}
	@Then("Customer should be saved")
	public void customer_should_be_saved() {
	    // Write code here that turns the phrase above into concrete actions
	    utils.waitForElementToBeVisible(customer.Search_Customer);
	    utils.clickWithActionsClass(customer.Search_Customer);
	    utils.sendkeysWithActionsClass(customer.Search_Customer, "Bilbo Baggins");
	}

	@When("clicks on Filter button")
	public void clicks_on_filter_button() {
	    // Write code here that turns the phrase above into concrete actions
	    utils.waitForElementToBeVisible(customer.Filter_Button);
	    utils.clickWithActionsClass(customer.Filter_Button);
	}
	@When("they enter date in {string}, {string}, {string}")
	public void they_enter_date_in(String Displayname, String contactName, String Phone) {
	    // Write code here that turns the phrase above into concrete actions
		utils.waitForElementToBeVisible(customer.DisplayName_Filter);
		utils.waitForElementToBeVisible(customer.ContactName_Filter);
		utils.waitForElementToBeVisible(customer.Phone_Filter_Customer);
		utils.clickWithActionsClass(customer.DisplayName_Filter);
		utils.sendkeysWithActionsClass(customer.DisplayName_Filter, Displayname);
	    utils.clickWithActionsClass(customer.ContactName_Filter);
	    utils.sendkeysWithActionsClass(customer.ContactName_Filter, contactName);
	    utils.clickWithActionsClass(customer.Phone_Filter_Customer);
	    utils.sendkeysWithActionsClass(customer.Phone_Filter_Customer, Phone);
	}
//	@Then("it should filter customer")
//	public void it_should_filter_customer() {
//	    // Write code here that turns the phrase above into concrete actions
//	   utils.waitForElementToBeVisible(customer.Filter_Button);
//	   utils.clickWithActionsClass(customer.);
//	}	
	

}
