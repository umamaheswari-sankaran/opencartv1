package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchCriteriaPage {
	//Driver instance
	WebDriver driver;
	
	//Constructor
	public SearchCriteriaPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	//Locators
	@FindBy(xpath="//input[@id='input-search']")
	WebElement keyword_txt;
	
	@FindBy(xpath="//select[@name='category_id']")
	WebElement category_dd;
	
	@FindBy(xpath="//input[@id='button-search']")
	WebElement search_btn;
	
	public void setkeyword(String keword)
	{
		keyword_txt.sendKeys(keword);
	}
	
	public void clicksearchbutton()
	{
		search_btn.click();		
	}
	
	public void selectcategory(String cat)
	{
		Select category = new Select(category_dd);
		category.selectByVisibleText(cat);
	}

}
