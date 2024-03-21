package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.driver;

public class Crater_Customers_page {

	
	public Crater_Customers_page() {
		PageFactory.initElements(driver.getDriver(), this);
	
	}
	@FindBy(xpath="(//*[contains(@class,'font-base block w-full sm:text-sm')])[2]")
	public WebElement Search_Customer;
	@FindBy(xpath="(//*[contains(@class,'inline-flex whitespace-nowrap items-center')])[1]")
	public WebElement Save_Customer_button;
	@FindBy(xpath="//*[contains(text(),'Shipping Address')]")
	public WebElement ShippingAddress_Title;
	@FindBy(xpath="//*[contains(text(),'Billing Address')]")
	public WebElement Billing_address_Title;
	@FindBy(xpath="//*[contains(text(),'Basic Info')]")
	public WebElement basicinfo_Title;
	@FindBy(xpath="//a[contains(text(), ' Customers')]")
	public WebElement Customers_link;
	@FindBy(xpath="//button[contains(@class, 'hover:bg-primary-700 focus:ring-primary-500')]")
	public WebElement New_customer_btt;
	@FindBy(name="name")
	public WebElement Display_name_txtbox;
	@FindBy(xpath="//input[contains(@name,'email')]")
	public WebElement emaitxtbox_Basicinfo;
	@FindBy(xpath="(//*[contains(@class,'text-black focus:ring-primary-400 focus:border-primary-400')] )[2]")
	public WebElement Primary_contactname_Basicinfo;
	@FindBy(xpath="(//*[contains(@name,'phone')])[2]")
	public WebElement Phone_Basic_info;
	@FindBy(xpath="//*[contains(@type,'url')]")
	public WebElement Website_basic_info;
	@FindBy(xpath="(//*[contains(@class,'w-full absolute inset-0 outline-none app')])[1]")
	public WebElement Currency_Basic_info;
	@FindBy(xpath="((//*[contains(@class,'text-black focus:ring-primary-400 focus:border-primary-400')])[6]")
	public WebElement Prefix_basic_info;
	@FindBy(xpath="//*[contains(@class,'translate-x-1 inline-block w-4 h-4')]")
	public WebElement Portal_Access_button;
	@FindBy (xpath="(//input[@name='address_name'])[1]")
	public WebElement Name_txtbox_BillingAddy;
	@FindBy(xpath="(//*[contains(@class,'text-black focus:ring-primary-400 focus:border-primary-400')])[8]")
	public WebElement State_txtbox_Billingaddy;
	@FindBy(xpath="//*[contains(@name,\"billing_street1\")]")
	public WebElement Address_Line1_txtbox;
	@FindBy (xpath="//*[contains(@name,\"billing_street2\")]")
	public WebElement Address_line2_txtbox;
	@FindBy(xpath="(//*[contains(@class, 'appearance-none box-border border-0 text-sm font-sans bg-white rounded-md pl-3.5')])[2]")
	public WebElement Country_dropbox;
	@FindBy(xpath="//input[@name='billing.city']")
	public WebElement City_billing_box;
	@FindBy(xpath="(//input[@name='phone'])[2]")
	public WebElement phone_billing_box;
	@FindBy(xpath="(//input[@name='zip'])[1]")
	public WebElement zipcode_billing;
	@FindBy(xpath="//*[contains(@class,'inline-flex whitespace-nowrap items-center border font-medium focus:outline-none focus:ring-2 focus:ring-offset-2 px-3')]")
	public WebElement Copy_billing_button;
	@FindBy(xpath="(//*[contains(@class, 'hover:bg-primary-200 shadow-inner focus:ring-primary-500')])[1]")
	public WebElement Filter_Button;
	@FindBy(xpath="(//*[contains(@name, 'name')])[1]")
	public WebElement DisplayName_Filter;
	@FindBy(xpath="(//*[contains(@name, 'address_name')])[2]")
	public WebElement ContactName_Filter;
	@FindBy(xpath="(//*[contains(@name, 'phone')])[2]")
	public WebElement Phone_Filter_Customer;
	
	
//	(//div[contains(text(), 'Select Country')])[1]
	
	
	
	
	
}
