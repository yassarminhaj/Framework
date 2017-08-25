package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pagefactory.AbstractPage;
import pagefactory.HomePage;
import pagefactory.LoginPage;
import wrappers.WdMethods;
import wrappers.testngClass;

public class PF_SecondTestCase extends testngClass{

	@DataProvider(name = "fetchData")
	public Object[][] getdata(){
	
		return  new Object[][] {{"DemoSalesManager","crmsfa"}};           				
	}
	
	@Test(dataProvider="fetchData")
	public void TestCaseTwo(String uname, String pwd) throws InterruptedException {
		// TODO Auto-generated method stub				
		new LoginPage()
		.enterUserName(uname)
		.enterPassword(pwd)
		.clickLogin()
		.clickCrmsSfa()
		.clickLeads()
		.clickFindLeads()
		.enterFirstName()
		.clickFindLeadsButton()
		.clickFirstLead()
		.clickEditButton()
		.editCompanyName()
		.clickUpdateButton()
		.checkCompanyName();				
		
	}

}
