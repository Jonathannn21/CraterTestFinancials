package step_Definition;

import org.junit.Assert;
import org.openqa.selenium.By;

import Utils.BrowserUtils;
import Utils.DataReader;
import Utils.driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CraterDashboardPage;
import pages.craterloginPage;

public class Crater_Loginpage {
	BrowserUtils utils = new BrowserUtils();
	craterloginPage login = new craterloginPage();
	CraterDashboardPage  dashboard = new CraterDashboardPage();
	
	@Given("User is on crater Login page.")
	public void user_is_on_crater_login_page() {
	    driver.getDriver().get(DataReader.getProperty("crater_url"));
	   
	}

	@And("Inputs valid username in username textbox")
	public void inputs_valid_username_in_username_textbox() {
		utils.waitForElementToBeVisible(login.emailInputBox);
	   utils.sendkeysWithActionsClass(login.emailInputBox, DataReader.getProperty("crater_email"));
	}

	@And("Inputs valid password in password textbox")
	public void inputs_valid_password_in_password_textbox() {
		driver.getDriver().findElement(By.xpath("//input[@name='password']")).sendKeys("primetech@school");
	  
	}

	@When("I click on sign in button")
	public void i_click_on_sign_in_button() {
		driver.getDriver().findElement(By.xpath("//button[contains(@class, 'whitespace')]")).click();
	   
	}

	@Then("I should be on the dashboard page of crater.")
	public void i_should_be_on_the_dashboard_page_of_crater() {
	    // Write code here that turns the phrase above into concrete action
	    utils.waitForElementToBeVisible(dashboard.AmountDue);
	    Assert.assertTrue(dashboard.AmountDue.isDisplayed());  
	   }
	
	@Given("Inputs invalid {string} and {string}")
	public void inputs_invalid_and(String email, String password) {
	    // Write code here that turns the phrase above into concrete actions
		utils.waitForElementToBeVisible(login.emailInputBox);
		utils.sendkeysWithActionsClass(login.emailInputBox,email);
		utils.sendkeysWithActionsClass(login.passwordInputBox,password);
		
	}

	@Then("I should still be on login page.")
	public void i_should_see_an_error_message() {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertTrue(login.emailInputBox.isDisplayed());
	    
	}
	
	
	}


	

