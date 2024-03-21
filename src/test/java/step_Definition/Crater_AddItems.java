package step_Definition;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import Utils.BrowserUtils;
import Utils.DataReader;
import Utils.driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CraterDashboardPage;
import pages.craterloginPage;

public class Crater_AddItems {

	BrowserUtils utils = new BrowserUtils();
	craterloginPage login = new craterloginPage();
	CraterDashboardPage  dashboard = new CraterDashboardPage();
	

@Given("As an entity user, I am logged in")
public void as_an_entity_user_i_am_logged_in() throws InterruptedException {
    	driver.getDriver().get(DataReader.getProperty("crater_url"));
    	utils.sendkeysWithActionsClass(login.emailInputBox, DataReader.getProperty("crater_email"));
    	utils.sendkeysWithActionsClass(login.passwordInputBox, DataReader.getProperty("crater_password"));
    	login.loginBtn.click();
}

@Given("I navigate to Items tab")
public void i_navigate_to_items_tab() {
    // Write code here that turns the phrase above into concrete actions
	utils.waitForElementToBeVisible(dashboard.Items);
	dashboard.Items.click();
	
    
}

@When("I click on the Add Item button")
public void i_click_on_the_add_item_button() {
    // Write code here that turns the phrase above into concrete actions
	utils.waitForElementToBeVisible(dashboard.AddItemBtn);
	dashboard.AddItemBtn.click();
	dashboard.AddItemBtn.click();
}

@Then("I should be on item input page")
public void i_should_be_on_item_input_page() {
    // Write code here that turns the phrase above into concrete actions
    utils.waitForElementToBeVisible(dashboard.NewItemtitle);
    Assert.assertTrue(dashboard.NewItemtitle.isDisplayed());
    
}

@When("I provide item information name {string}, price {string}, unit {string}, and description {string}")
public void i_provide_item_information_name_price_unit_and_description(String String1, String string2, String string3, String string4) {
    // Write code here that turns the phrase above into concrete actions
    utils.waitForElementToBeVisible(dashboard.Nameinputtxtbox);
   utils.waitForElementToBeVisible(dashboard.PriceInputtxtbox);
   utils.waitForElementToBeVisible(dashboard.UnitDropDown);
    utils.sendkeysWithActionsClass(dashboard.Nameinputtxtbox, String1);
    utils.sendkeysWithActionsClass(dashboard.PriceInputtxtbox, string2);
    utils.sendkeysWithActionsClass(dashboard.UnitDropDown, string3);
    utils.clickWithActionsClass(dashboard.UnitDropDown);
    dashboard.UnitDropDown.sendKeys(Keys.ENTER);
    utils.sendkeysWithActionsClass(dashboard.ItemDescripTxtbox, string4);
   
}

@When("I click Save Item button")
public void i_click_save_item_button() {
    // Write code here that turns the phrase above into concrete actions
	 utils.clickWithActionsClass(dashboard.SaveItemBtt);
}

@Then("The Item is added to the Item list table")
public void the_item_is_added_to_the_item_list_table() {
	dashboard.Filterbutton.click();
	dashboard.NameSearch.click();
	dashboard.NameSearch.sendKeys("watch");
    // Write code here that turns the phrase above into concrete actions
	
}

@Then("I delete the item")
public void i_delete_the_item() {
	 utils.waitForElementToBeVisible(dashboard.OptionsTabItems);
	  	utils.moveToWithActionsClass(dashboard.OptionsTabItems);
		utils.clickWithActionsClass(dashboard.OptionsTabItems);
		utils.waitForElementToBeVisible(dashboard.DeleteItem_Options);
	   utils.clickWithActionsClass(dashboard.DeleteItem_Options);
	   utils.waitForElementToBeVisible(dashboard.OK_Delete_permant);
	   utils.clickWithActionsClass(dashboard.OK_Delete_permant);
	   utils.clickWithActionsClass(dashboard.Filterbutton);
	   utils.clickWithActionsClass(dashboard.NameSearch);
	   dashboard.NameSearch.sendKeys("Watch");
	   utils.waitForElementToBeVisible(dashboard.No_Result_found_txt);
	   Assert.assertTrue(dashboard.No_Result_found_txt.isDisplayed());

    // Write code here that turns the phrase above into concrete actions
 }


}
