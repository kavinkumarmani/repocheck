package Dataproviderconcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pom.qa.util.datautilities;

public class Checkdataprovider {
	
	WebDriver driver;

	
	@BeforeMethod
	public void setup() {
	System.setProperty("webdriver.chrome.driver", "\\C:\\Users\\Saran\\Downloads\\selenium\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://mobile.walkaroo.in/vkcweb/index.php/site/login_request");
	}
	
	@DataProvider
	public Object[][] getexceldata() throws Exception {
		Object[][] data=datautilities.getdata("Sheet1");
		return data;
	}
	
	@Test(dataProvider="getexceldata")
	public void logintest(String name,String shopname,String address,String state,String email,String phone,String password,String confirmpassword) throws Exception {
		
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys(name);
		Thread.sleep(5000);
		
		driver.findElement(By.id("shop_name")).clear();
		driver.findElement(By.id("shop_name")).sendKeys(shopname);
		Thread.sleep(5000);
		
		driver.findElement(By.id("address")).clear();
		driver.findElement(By.id("address")).sendKeys(address);
		Thread.sleep(5000);
		
		Select select=new Select(driver.findElement(By.id("state")));
		select.selectByVisibleText(state);
		Thread.sleep(5000);
		
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(email);
		Thread.sleep(5000);
		
		driver.findElement(By.id("phone")).clear();
		driver.findElement(By.id("phone")).sendKeys(phone);
		Thread.sleep(5000);
		
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(5000);
		
		driver.findElement(By.id("confirm_password")).clear();
		driver.findElement(By.id("confirm_password")).sendKeys(confirmpassword);
		Thread.sleep(5000);
	
		
	}
	
	
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
}
