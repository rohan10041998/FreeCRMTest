package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase{
	@FindBy(xpath = "//input[@name='first_name']")
	WebElement firstName;
	
	@FindBy(xpath="//input[@name='last_name']")
	WebElement lastName;
	
	@FindBy(xpath ="//div[@name='company']")
	WebElement company;
	
	@FindBy(xpath = "//i[@class='save icon']")
	WebElement saveBtn;
	
	public void createNewContact(String ftName, String ltName, String comp){
		//Select select = new Select(driver.findElement(By.name("title")));
		//select.selectByVisibleText(title);
		
		firstName.sendKeys(ftName);
		lastName.sendKeys(ltName);
		company.sendKeys(comp);
		saveBtn.click();
}
}
