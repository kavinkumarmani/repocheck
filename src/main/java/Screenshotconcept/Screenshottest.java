package Screenshotconcept;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.pom.qa.base.base;

import TestNglistener.Listenerclas;

@Listeners(Listenerclas.class)

public class Screenshottest extends base {
	
	
	@BeforeMethod
	public void setup() {
		initilization();
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
		
	}
	@Test
	public void takescreenshottest() {
		Assert.assertEquals(false,true);
		
	}
	@Test
	public void takecheckscreen() {
		Assert.assertEquals(false,true);
		
	}
	@Test
	public void screenshotcheck() {
		Assert.assertEquals(false,true);
	}
	
	
	
}
