package com.digiboxx.Testcases;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.digiboxx.page.DigiboxxFileUploadPage;
import com.digiboxx.page.DigiboxxLoginPage;

public class DigiboxxUploadFileTest {
	
	@Test
	public void fileUpload() throws AWTException {
		
		WebDriver driver= BaseTest.browserSetup("chrome", "https://apptest.digiboxx.com/login");
		
		DigiboxxLoginPage login=PageFactory.initElements(driver, DigiboxxLoginPage.class);
		login.loginDigiboxx("intern3", "testing2510932@gmail.com", "Gaurav@123");
		
		DigiboxxFileUploadPage upload =PageFactory.initElements(driver, DigiboxxFileUploadPage.class);
		upload.uploadFile();
		
	}

}
