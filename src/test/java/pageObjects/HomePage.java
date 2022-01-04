package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//webdriver instance
	WebDriver driver;
	
//constructor
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Locators
	@FindBy(xpath="//span[text()='My Account']")
	WebElement lnkMyaccount;
	
	@FindBy(linkText="Register")
	WebElement lnkRegister;
	
	
	@FindBy(linkText="Login")
	WebElement lnkLogin;
	
	@FindBy(xpath="//input[@placeholder='Search']")
	WebElement srch_txt;
	
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']")
	WebElement srch_btn;
	
	public void clickMyAccount()
	{
		lnkMyaccount.click();
	}
	
	public void clickRegister()
	{
		lnkRegister.click();
	}
	
	public void clickLogin()
	{
		lnkLogin.click();
	}
	
	public void setSearchBox(String itemname )
	{
		srch_txt.sendKeys(itemname);
	}
	
	public void clickSearch()
	{
		srch_btn.click();
	}
	
}
