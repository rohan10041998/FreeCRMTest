package com.crm.qa.testcases;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class ContactsPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;	
	TestUtil testUtil;
	ContactsPage contactsPage;
	
	public ContactsPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException{
		initialization();
		Thread.sleep(5000);
		loginPage = new LoginPage();
		loginPage.clickonInitialLogin();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		testUtil = new TestUtil();
		contactsPage = new ContactsPage();		
		
	}
	
	@Test(priority=1)
	public void validateCreateNewContact()
	{
		homePage.clickOnNewContactLink();
		//Actions act = new Actions(driver);
		//act.moveByOffset(10,20).build().perform();
		//contactsPage.createNewContact("Rohan","Gandewar","ACN");
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
}
