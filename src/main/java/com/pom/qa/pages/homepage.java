package com.pom.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pom.qa.base.testbase;

public class homepage extends testbase{
	
	@FindBy(xpath="//span[@class='user-display']")
	WebElement usernamelabel;
	
	@FindBy(xpath="//a[@class='item'][3]")
	WebElement contacts;
	
	@FindBy(xpath="//a[@class='item'][5]")
	WebElement deals;
	
	@FindBy(xpath="//a[@class='item'][6]")
	WebElement tasks;
	
	public homepage() throws Exception {
		
	PageFactory.initElements(driver, this);
		
	}
	public boolean verifyusername() {
		return usernamelabel.isDisplayed();
	}
	public String verifyhomepagetitle() {
		return driver.getTitle();
	}
	
	public Contactspage clickoncontactslink() {
		contacts.click();
		return new Contactspage();
	}
	
	public Taskpage clickonTaskpage() {
		tasks.click();
		return new Taskpage();
	}
	public Dealpage clickondealspage() {
		deals.click();
		return new Dealpage();
	}


}
