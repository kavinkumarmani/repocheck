package com.pom.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pom.qa.base.testbase;
import com.pom.qa.pages.Contactspage;
import com.pom.qa.pages.Dealpage;
import com.pom.qa.pages.homepage;
import com.pom.qa.pages.loginpage;

import junit.framework.Assert;

public class homepagetest extends testbase {
	loginpage Loginpage;
	homepage Homepage;
	Contactspage contactspage;
	Dealpage Dealspage;
	

	public homepagetest() throws Exception {
		super();
	}
	
	@BeforeMethod
	public void setup() throws Exception {
		initilization();
		Loginpage=new loginpage();
		Homepage=Loginpage.login(prop.getProperty("email"), prop.getProperty("password"));
	}
	
	@Test (priority=1)
	public void homepagetitletest() {
	String homepagetitle=Homepage.verifyhomepagetitle();
	Assert.assertEquals(homepagetitle,"crm","title not matched");	
	}
	@Test (priority=2)
	public void usernametest() {
		Homepage.verifyusername();
		Assert.assertTrue(Homepage.verifyusername());
		
	}
	@Test(priority=3)
	public void contactslinktest() {
		contactspage=Homepage.clickoncontactslink();
	}
	@Test(priority=4)
	public void dealslinktest() {
		Dealspage=Homepage.clickondealspage();
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	} 

}
