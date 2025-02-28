package com.videostori.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class createvideodocument {
	
WebDriver ldriver;
	

	public createvideodocument(WebDriver rdriver) 
	{
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//span[normalize-space()='Video Management']")
	WebElement videomanagementmenu;
	
	@FindBy(xpath="//span[normalize-space()='Create Video - Document']")
	WebElement createvideodocumentmenu;
	
	@FindBy(xpath="//select[@name='contentType']")
	WebElement contenttype;
	
	@FindBy(xpath="//input[@id='inputGroupFile02']")
	WebElement fileupload;
	
	@FindBy(xpath="//button[normalize-space()='Upload']")
	WebElement upload;
	
	@FindBy(xpath="//div[@role='alert']")
	WebElement successalert;
	
	@FindBy(xpath="//div[@role='alert' or text()='Invalid file format !!']")
	WebElement invalidformat;
	
	
	public void videomanagementmenu()
	{
		videomanagementmenu.click();;
	}
	
	public void createvideodocumentmenu()
	{
		createvideodocumentmenu.click();
	}
	
	public void contenttype(int index)
	{
		Select conttype=new Select(contenttype);
		conttype.selectByIndex(index);
	}
	
	public void fileupload(String upload) 
	{
		fileupload.sendKeys(upload);
	}
	
	public void uploadbtn() 
	{
		upload.click();
	}
	
	public String successalert() 
	{
		String successalerttext=successalert.getText();
		return successalerttext;
	} 
	
	public String invalidfileformatalert() 
	{
		String invalidfileformatalerttext=invalidformat.getText();
		return invalidfileformatalerttext;
	} 
	

}
