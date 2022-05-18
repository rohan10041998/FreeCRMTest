package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath="//*[@id=\"top-header-menu\"]/div[2]/span[1]")
	WebElement userNameLabel;
	
	@FindBy(xpath="//span[contains(text(),'Contacts')]")
	WebElement contactsLink;
	
	@FindBy(xpath = "//*[@id=\"main-nav\"]/div[3]/button/i")
	WebElement newContactLink;
	
	@FindBy(xpath=" //span[contains(text(),'Deals')]]")
	WebElement dealsLink;
	
	@FindBy(xpath="//span[contains(text(),'Tasks')]")
	WebElement taskLink;
	
	@FindBy(xpath = "//a[contains(text(),'Tasks')]")
	WebElement tasksLink;
	
	//Initializing the Page Objects:
		public HomePage(){
			PageFactory.initElements(driver, this);
		}
	
	public String verifyHomePageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean verifyCorrectUserName()
	{
		return userNameLabel.isDisplayed();
	}
	
	public ContactsPage clickOnContactsLink()
	{
		contactsLink.click();
		return new ContactsPage();
	}
	
	public DealsPage clickOnDealsLink()
	{
		dealsLink.click();
		return new DealsPage();
	}
	
	public TasksPage clickOnTasksLink()
	{
		tasksLink.click();
		return new TasksPage();
	}
	
	public void clickOnNewContactLink()
	{
		Actions action = new Actions(driver);
		action.moveToElement(contactsLink).build().perform();
		newContactLink.click();
	}
	
}
