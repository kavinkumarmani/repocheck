package com.pom.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pom.qa.base.testbase;
import com.pom.qa.pages.homepage;
import com.pom.qa.pages.loginpage;

public class Loginpagetest extends testbase {
	
	loginpage Loginpage;
	homepage Homepage;
	public Loginpagetest() throws Exception {
		super();
	}
	
	@BeforeMethod
	public void setup() throws Exception {
		initilization();
		Loginpage=new loginpage();
	}
	
	@Test(priority=1)
	public void logintest() throws Exception {
		Homepage=Loginpage.login(prop.getProperty("email"), prop.getProperty("password"));
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
