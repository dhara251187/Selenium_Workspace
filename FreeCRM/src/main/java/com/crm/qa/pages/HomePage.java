package com.crm.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.Base;

public class HomePage extends Base{
	
	@FindBy(xpath="//td[contains(@text,'User: dhara patel')]")
	WebElement user;
	
	@FindBy(xpath="//a[contains(@text,'Contacts')]")
	WebElement contactsLink;
	
	@FindBy(xpath="//a[contains(@text,'Deals')]")
	WebElement dealsLink;
	
	@FindBy(xpath="//a[contains(@text,'Tasks')]")
	WebElement taskLink;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle()
	{
		return driver.getTitle();
	}
	
	public ContactsPage clickOnContactsLink()//return contactpage so return type is contactpage
	{
		contactsLink.click();
		return new ContactsPage();//create object of contact page
	}
	
	

}
