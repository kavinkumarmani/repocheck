package Dataproviderconcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Dataprovidertest {
	
		WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver","\\c:\\Users\\Saran\\Downloads\\selenium\\chromedriver.exe");
		//create reference object
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://mobile.walkaroo.in/vkcweb/index.php/site/login_request");
		driver.manage().window().maximize();
	}
	
	@Test
	public void vkcloginrequesttest(String name,String shopname,String address,String state,String email,String phone,String password,String confirmpassword) {
		
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys(name);
		
		driver.findElement(By.id("shop_name")).clear();
		driver.findElement(By.id("shop_name")).sendKeys(shopname);
		
		driver.findElement(By.id("address")).clear();
		driver.findElement(By.id("address")).sendKeys(address);
		
		Select select=new Select(driver.findElement(By.id("state")));
		select.selectByVisibleText(state);
		
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(email);
		
		driver.findElement(By.id("phone")).clear();
		driver.findElement(By.id("phone")).sendKeys(phone);
		
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(password);
		
		driver.findElement(By.id("confirm_password")).clear();
		driver.findElement(By.id("confirm_password")).sendKeys(confirmpassword);
		
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
