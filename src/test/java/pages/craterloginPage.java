package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.BrowserUtils;
import Utils.DataReader;
import Utils.driver;

public class craterloginPage {
	BrowserUtils utils = new BrowserUtils();
	public craterloginPage() { 
	PageFactory.initElements(driver.getDriver(), this);
	
	
	}
	
	@FindBy(xpath="//input[@name='email']")
	public WebElement emailInputBox;
	
	@FindBy(xpath="//input[@name='password']")
	public WebElement passwordInputBox;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	public WebElement loginBtn;
		
		public void Login(String user_type) {
			 driver.getDriver().get(DataReader.getProperty("crater_url"));
			
			 switch (user_type) {
			case "level1":
				utils.waitForElementToBeVisible(emailInputBox);
				   utils.sendkeysWithActionsClass(emailInputBox, DataReader.getProperty("level1_username"));
				   utils.sendkeysWithActionsClass(passwordInputBox, DataReader.getProperty("level1_password"));
				   utils.clickWithActionsClass(loginBtn);
				   break;
			case "level2":
				utils.waitForElementToBeVisible(emailInputBox);
				   utils.sendkeysWithActionsClass(emailInputBox, DataReader.getProperty("level2_username"));
				   utils.sendkeysWithActionsClass(passwordInputBox, DataReader.getProperty("level2_password"));
				   utils.clickWithActionsClass(loginBtn);
				   break;
			default:
				utils.waitForElementToBeVisible(emailInputBox);
				   utils.sendkeysWithActionsClass(emailInputBox, DataReader.getProperty("crater_email"));
				   utils.sendkeysWithActionsClass(passwordInputBox, DataReader.getProperty("crater_password"));
				   utils.clickWithActionsClass(loginBtn);
			}
			
			
		}
	}
