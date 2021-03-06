package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.*;
import org.testng.Assert;		
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {

	private WebDriver driver; 
	@BeforeTest
	public void beforeTest(){
	 driver = new ChromeDriver();
	}
		
	@AfterTest
	public void afterTest() {
			driver.quit();			
	}	
	
	@Test
	public void testEasy() {
		driver.get("http://demo.guru99.com/selenium/guru99home/");  
		String title = driver.getTitle();				 
		Assert.assertTrue(title.contains("Demo Guru99 Page"));
	}
	

}
