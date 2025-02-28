package com.videostori.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createvideoimage {
WebDriver ldriver;
	public createvideoimage(WebDriver rdriver) 
	{
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//span[normalize-space()='Video Management']")
	WebElement videomanagementmenu;
	
	@FindBy(xpath="//span[normalize-space()='Create Video - Images']")
	WebElement createvideoimagemenu;
	
	@FindBy(xpath="//input[@placeholder='Input image group title here...']")
	WebElement imagegrouptitle;
	
	@FindBy(xpath="//button[normalize-space()='Create New Image Group & Proceed']")
	WebElement createnewimagegroupbutton;
	
	@FindBy(xpath="//input[@id='inputGroupFile02']")
	WebElement imageupload;
	
	@FindBy(xpath="//button[normalize-space()='Upload']")
	WebElement uploadbutton;
	
	@FindBy(xpath="//div[@role='alert' or text()='SUCCESS']")
	WebElement success;
	
	@FindBy(xpath="//div[@class='form-row bg-dark text-white']//input[@type='checkbox']")
	WebElement selectall;
	
	@FindBy(xpath="//a[normalize-space()='Click here to Proceed']")
	WebElement clickproceed;
	
	@FindBy(xpath="//div[@role='alert' or text()='Duplicate Group Title']")
	WebElement duplicatetitle;
	
	@FindBy(xpath="//b[normalize-space()='Click here to go to Image Group List']")
	WebElement imagegrouplist;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/div[1]/span[3]/a[1]")
	WebElement createvideo;
	
	@FindBy(xpath="//input[@value='5']")
	WebElement frameduration;
	
	@FindBy(xpath="//button[normalize-space()='Apply']")
	WebElement apply;
	
	@FindBy(xpath="//input[@placeholder='Video Title']")
	WebElement videotitle;
	
	@FindBy(xpath="//input[@placeholder='Video Description']")
	WebElement videodescription;
	
	@FindBy(xpath="//div[@class='col-md-5']//input[@id='inputGroupFile02']")
	WebElement uploadmusic;
	
	@FindBy(xpath="//div[@class='col-md-5']//button[@type='button'][normalize-space()='Upload']")
	WebElement uploadbtn;
	
	@FindBy(xpath="//input[@placeholder='Audio start time']")
	WebElement audiooffset;
	
	@FindBy(xpath="//input[@placeholder='Audio max duration']")
	WebElement audioduration;
	
	@FindBy(xpath="//span[normalize-space()='Process Video Creation Request']")
	WebElement processvideo;
	
	@FindBy(xpath="//div[@role='alert' or text()='Request submit success!!']")
	WebElement successalert;
	
	public void videomanagementmenu() 
	{
		videomanagementmenu.click();
	}
	
	public void createvideoimagemenu() 
	{
		createvideoimagemenu.click();
	}
	
	public void imagegrouptitle(String title)
	{
		imagegrouptitle.sendKeys(title);
	
	}
	
	public void createimagegroupbutton() 
	{
		createnewimagegroupbutton.click();
	}
	
	public void imageupload(String image) 
	{
		imageupload.sendKeys(image);
	}
	
	public void uploadbutton() 
	{
		uploadbutton.click();
	}
	
	public String success() 
	{
		String successalerttext=success.getText();
		return successalerttext;
		
	}
	
	public void selectall() 
	{
		selectall.click();
	}
	
	public void clickproceed() 
	{
		clickproceed.click();
	}
	
	public String duplicateimagegrouptitle() 
	{
		String duplicatetitletext=duplicatetitle.getText();
		return duplicatetitletext;
	}
	
	public void imagegrouplist() 
	{
		imagegrouplist.click();
	}
	
	public void createvideo() 
	{
		createvideo.click();
	}
	
	public void framedurationclear() 
	{
		frameduration.clear();
	}
	
	public void frameduration(String sec) 
	{
		frameduration.sendKeys(sec);
	}
	
	public void videotitle(String title) 
	{
		videotitle.sendKeys(title);
	}
	
	public void applybutton() 
	{
		apply.click();
	}
	
	public void videodescription(String description) 
	{
		videodescription.sendKeys(description);
	}
	
	public void uploadmusic(String music) 
	{
		uploadmusic.sendKeys(music);
	}
	
	public void uploadbtn() 
	{
		uploadbtn.click();
	}
	
	public void audiooffsetclear() 
	{
		audiooffset.clear();
	}
	
	public void audiooffset(String num) 
	{
		audiooffset.sendKeys(num);
	}
	
	public void audiodurationclear() 
	{
		audioduration.clear();
	}
	
	public void audioduration(String duration) 
	{
		audioduration.sendKeys(duration);
	}
	
	public void processvideo() 
	{
		processvideo.click();
	}
	
	public String createvideoimagesuccessalert() 
	{
		String createvideoimagesuccessalerttext=successalert.getText();
		return createvideoimagesuccessalerttext;
	} 
	
	
	
}
