package com.pom.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pom.qa.base.testbase;

public class loginpage extends testbase {
	
	//pagefactory or object repository
	@FindBy(xpath="//input[@class='_2zrpKA _1dBPDZ']")
	WebElement emailaddress;
	
	@FindBy(xpath="//input[@class='_2zrpKA _3v41xv _1dBPDZ']")
	WebElement password;
	
	@FindBy(xpath="//button[@class='_2AkmmA _1LctnI _7UHT_c']")
	WebElement loginbutton;
	
	//initilization
	
	public loginpage() throws Exception{
		PageFactory.initElements(driver, this);
	}
	//actions
	
	public homepage login(String usr,String pwd) throws Exception {
		
		emailaddress.sendKeys(usr);
		password.sendKeys(pwd);
		loginbutton.click();
		
		return new homepage();
		
		
	}
	
	

}


