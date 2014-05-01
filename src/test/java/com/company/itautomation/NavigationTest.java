package com.company.itautomation;

import static org.junit.Assert.*;


import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationTest {
	
	@Test
	public void startWebDriver(){
		WebDriver driver = new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.yahoo.com");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		assertTrue("Web Page Tittle: ", driver.getTitle().startsWith("Yahoo  "));
		
		driver.quit();
		
	}

}
