package com.digiboxx.page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DigiboxxFileUploadPage {

	WebDriver driver;
	
	public DigiboxxFileUploadPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	@FindBy(how=How.XPATH,using="//span[@class='add-btn']")
	WebElement addButton;
	
	@FindBy(how=How.XPATH,using="//ul[@class='add-pro-opt ng-star-inserted']/child::li[1]/child::a")
	WebElement uploadFile;
	
	public void uploadFile() throws AWTException {
		
		addButton.click();
		uploadFile.click();
		upload("C:\\Users\\rikky\\OneDrive\\Desktop\\FirstFile.txt");	
	}
	
	
	public static void setClipBoard(String file) {
		
		StringSelection object = new StringSelection(file);
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(object, null);	
		
	}	
	
	
	public static void upload(String filePath) throws AWTException {
	
	    setClipBoard(filePath);
	
	    Robot rb = new Robot();
	
	    rb.keyPress(KeyEvent.VK_CONTROL);
	    rb.keyPress(KeyEvent.VK_V);
	    rb.keyRelease(KeyEvent.VK_CONTROL);
	    rb.keyRelease(KeyEvent.VK_V);
	    rb.keyPress(KeyEvent.VK_ENTER);
	    rb.keyRelease(KeyEvent.VK_ENTER);
	
}	
	
}
