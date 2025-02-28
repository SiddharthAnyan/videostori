package com.videostori.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class importVideo {
	
WebDriver ldriver;
	

	public importVideo(WebDriver rdriver) 
	{
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver, this);
		
	}
	
	
	
	@FindBy(xpath="//span[normalize-space()='Video Management']")
	WebElement videomanagementmenu;
	
	@FindBy(xpath="//span[normalize-space()='Import Video - Local Drive']")
	WebElement importvideomenu;
	
	@FindBy(xpath="//input[@id='inputGroupFile02']")
	WebElement videoUpload;
	
	@FindBy(xpath="//input[@placeholder='Video Title Text ']") 
	WebElement videoTitleTextclear;
	
	@FindBy(xpath="//input[@placeholder='Video Title Text ']") 
	WebElement videoTitleText;
	
	 @FindBy(xpath="//input[@placeholder='Input Video Description']") 
	 WebElement videoDescription;
	
	@FindBy(xpath="//button[normalize-space()='Upload']")
	WebElement Upload;
	
	
	 @FindBy(xpath="//button[normalize-space()='OK']") 
	 WebElement ok;
	 
	
	@FindBy(xpath="//div[@role='alert']")
	WebElement videotitlealert;
	
	@FindBy(xpath="//div[@role='alert' and text()='Error: Duplicate Video Title !!']")
	WebElement duplicatevideotitlealert;
	
	@FindBy(xpath="//a[normalize-space()='Siddharth Anyan']")
	WebElement profileinfo;
	
	
	public void videomanagementmenu() 
	{
		videomanagementmenu.click();
	}
	
	public void importvideomenu() 
	{
		importvideomenu.click();
	}
	
	public void videoUpload(String file) 
	{
		videoUpload.sendKeys(file);
		
	}
	
	public void videoTitleTextclear()
	{
		videoTitleTextclear.clear();
	}
	
	 public void videoTitleText(String title) 
	 { 
		 videoTitleText.sendKeys(title); 
		 
	 }
	 
	 public void videoDescription(String description) 
		{
			videoDescription.sendKeys(description);
		}
	
	public void Upload() 
	{
		
		Upload.click();
	
	}

	
	public void ok() 
	{
		ok.click(); 
		
	}
	 
	public String videotitlealert() 
	{
		String alerttext=videotitlealert.getText();
		return alerttext;
		
	}
	
	public String duplicatevideotitlealert() 
	{
		String duplicatealerttext=duplicatevideotitlealert.getText();
		return duplicatealerttext;
		
	}
	
	public void profileinfo() 
	{
		profileinfo.click();
	}

}
