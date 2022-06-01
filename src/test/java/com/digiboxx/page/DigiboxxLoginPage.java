package com.digiboxx.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DigiboxxLoginPage {
	
	 WebDriver driver;
	
	public DigiboxxLoginPage(WebDriver driver) {
		this.driver=driver;
	}	

	@FindBy(how=How.ID,using="workspace")
	WebElement digispace;
	 
	@FindBy(how=How.ID,using="Username")
	WebElement username;
	
	@FindBy(how=How.ID,using="Password")
	WebElement password;
	
	@FindBy(how=How.XPATH,using="//button[@class='start-btn']")
	WebElement loginButton;	
	
	@FindBy(how=How.XPATH,using="//a[text()='Click Here']")
	WebElement clickHere;
	
	public void loginDigiboxx(String Digi,String user, String pass) {
		
		digispace.sendKeys(Digi);
		username.sendKeys(user);
		password.sendKeys(pass);
		
		JavascriptExecutor s = (JavascriptExecutor)driver;
		s.executeScript("arguments[0].scrollIntoView(true);", loginButton);
		loginButton.click();
		clickHere.click();
		
		}	
}
