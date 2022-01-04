package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.SearchCriteriaPage;
import testBase.BaseClass;

public class TC_004_SearchCriteria extends BaseClass {
	@Test
	public void testsearchcriteria()
	{
		HomePage hp = new HomePage(driver);
		hp.clickSearch();
		
		SearchCriteriaPage scp = new SearchCriteriaPage(driver);
		scp.setkeyword("iMac");
		scp.selectcategory("Mac");
		scp.clicksearchbutton();
		
	}

}
