package com.digiboxx.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.digiboxx.page.DigiboxxLoginPage;

public class DigiboxxLoginTest {
	
	@Test
	public void loginHomePage() {
		
		WebDriver driver1=BaseTest.browserSetup("chrome", "https://apptest.digiboxx.com/login");
		
		DigiboxxLoginPage login=PageFactory.initElements(driver1, DigiboxxLoginPage.class);
		
		login.loginDigiboxx("intern3", "testing2510932@gmail.com", "Gaurav@123");
	}

}
