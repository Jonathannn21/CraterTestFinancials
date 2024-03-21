package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.driver;

public class CraterDashboardPage {
	
	
	public CraterDashboardPage() {
	PageFactory.initElements(driver.getDriver(), this);
		
	}
	
	@FindBy(xpath= "(//*[contains(text(),'Amount Due')])[1]")
	public WebElement AmountDue;
	@FindBy(xpath="(//a[contains(@href, '/admin/items')])[1]")
	public WebElement Items;
	@FindBy(xpath="//button[starts-with(@class, 'inline-flex')][2]")
	public  WebElement AddItemBtn;
	@FindBy(xpath="(//*[contains(text(), 'New Item')])[1]")
	public WebElement NewItemtitle;
	@FindBy(xpath="(//*[contains(@class, 'font-base block w-full')])[2]")
	public WebElement Nameinputtxtbox;
	@FindBy(xpath="//input[@id='0']")
	public WebElement PriceInputtxtbox;
	@FindBy(xpath="//*[contains(@class,'w-full absolute inset-0')]")
	public WebElement UnitDropDown;
	@FindBy(xpath="//*[@name='description']")
	public WebElement ItemDescripTxtbox;
	@FindBy(xpath="//button[contains(@class,'inline-flex whitespace-nowrap')]")
	public WebElement SaveItemBtt;
	@FindBy (xpath="//a[contains(text(), 'itemName')])[1]")
	public WebElement ItemsTable;
	@FindBy(xpath= "(//*[@class='h-5 w-5 h-5 text-gray-500'])[1]")
	public WebElement OptionsTabItems;
	@FindBy(xpath="//a[text()=' Edit']")
	public WebElement EditItem_InOptions;
	@FindBy (xpath= "//a[text()=' Delete']")
	public WebElement DeleteItem_Options;
	@FindBy(xpath= "//button[contains(@class, 'duration-150 text-primary-500 hover:bg-primary-200 ')][1]")
	public WebElement Filterbutton;
	@FindBy (xpath= "//input[@name=\"name\"]")
	public WebElement NameSearch;
	@FindBy(xpath="//button[text()='Ok']")
	public WebElement OK_Delete_permant;
	@FindBy(xpath="//span[text()= 'No Results Found']")
	public WebElement No_Result_found_txt;

	
	
}
