package verboseconcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Verboseexample {
	
	WebDriver driver;
	
	@BeforeMethod
	
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "\\C:\\Users\\Saran\\Downloads\\selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void titlechecktest() {
		SoftAssert sa=new SoftAssert();
	
		String title=driver.getTitle();
		System.out.println(title);
		
		sa.assertEquals(title, "Facebook – log in or sign up","title page mismatch");
		sa.assertAll();
		
	}
	@Test
	public void titlechecktest2() {
		SoftAssert sa1=new SoftAssert();
	
		String title=driver.getTitle();
		System.out.println(title);
		
		sa1.assertEquals(title, "Facebook – log in or sign up","title page mismatch");
		sa1.assertAll();
		
	}
	@Test(retryAnalyzer=Analyser.Retryanalyzer.class)
	public void titlechecktest3() {
		SoftAssert sa2=new SoftAssert();
	
		String title=driver.getTitle();
		System.out.println(title);
		
		sa2.assertEquals(title, "Facebook – log in or sign uphfdg","title page mismatch");
		sa2 .assertAll();
		
	}
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
