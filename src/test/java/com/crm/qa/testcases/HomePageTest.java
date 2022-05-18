package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.*;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.*;
import com.crm.qa.util.TestUtil;

public class HomePageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	ContactsPage contactsPage;
	
	public HomePageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException{
		initialization();
		Thread.sleep(5000);
		loginPage = new LoginPage();
		loginPage.clickonInitialLogin();
		testUtil = new TestUtil();
		contactsPage = new ContactsPage();		
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void verifyUserNameTest()
	{
		Assert.assertTrue(homePage.verifyCorrectUserName());
	}
	
	@Test(priority=2)
	public void verifyContactsLinkTest(){
		contactsPage = homePage.clickOnContactsLink();
	}
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}
