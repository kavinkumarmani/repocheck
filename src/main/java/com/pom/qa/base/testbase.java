 package com.pom.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.pom.qa.util.utilities;

public class testbase {
	
	   public static Properties prop;
	   public static WebDriver driver;
	public testbase() throws Exception {
		
		prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\Saran\\eclipse-workspace\\Pomconcept\\src\\main\\java\\com\\pom\\qa\\environment\\com.properties ");
		prop.load(fis);
	}
	
	public static void initilization() {
		
		String browsername=prop.getProperty("browse");
		
		if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "\\C:\\Users\\Saran\\Downloads\\selenium\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browsername.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(utilities.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(utilities.IMPLICIT_WAIT,TimeUnit.SECONDS);
		driver.findElement(By.xpath(prop.getProperty("homexpath"))).click();
 }
}