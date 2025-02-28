package com.videostori.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class createvideofromdocument {
WebDriver ldriver;
	

	public createvideofromdocument(WebDriver rdriver) 
	{
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver, this);
	}
	
	/*
	 * @FindBy(xpath="//span[normalize-space()='Video Management']") WebElement
	 * videomanagementmenu;
	 * 
	 * @FindBy(xpath="//span[normalize-space()='Create Video - Document']")
	 * WebElement createvideodocumentmenu;
	 * 
	 * @FindBy(xpath="//select[@name='contentType']") WebElement contenttype;
	 */
	
	@FindBy(xpath="//tbody/tr[1]/td[6]/div[1]/span[2]/i[1]")
	WebElement createvideo;
	
	@FindBy(xpath="//div[@class='col-md-3']//input[@type='checkbox']")
	WebElement selectallbox;
	
	@FindBy(xpath="//input[@value='5']")
	WebElement framedurattion;
	
	@FindBy(xpath="//button[normalize-space()='Apply']")
	WebElement apply;
	
	@FindBy(xpath="//input[@placeholder='Video Title']")
	WebElement videotitle;
	
	@FindBy(xpath="//div[@class='col-md-5']//input[@id='inputGroupFile02']")
	WebElement uploadmp3;
	
	@FindBy(xpath="//input[@placeholder='Audio max duration']")
	WebElement audioduration;
	
	@FindBy(xpath="//input[@placeholder='Audio start time']")
	WebElement audiooffset;
	
	@FindBy(xpath="//span[normalize-space()='Process Video Creation Request']")
	WebElement processvideo;
	
	@FindBy(xpath="//div[@role='alert' or text()='Request submit success!!']")
	WebElement createvideosuccess;
	
	@FindBy(xpath="//div[@role='alert' or text()='No frame(s) selected !!']")
	WebElement noframe;
	/*
	 * public void videomanagementmenu() { videomanagementmenu.click();; }
	 * 
	 * public void createvideodocumentmenu() { createvideodocumentmenu.click(); }
	 * 
	 * public void contenttype(int index) { Select conttype=new Select(contenttype);
	 * conttype.selectByIndex(index); }
	 */
	
	public void createvideoclick()
	{
		createvideo.click();
	}
	
	public void selectall() 
	{
		selectallbox.click();
	}
	
	public void framedurationeraser() 
	{
		framedurattion.clear();
	}
	
	public void frameduration(String time)
	{
		framedurattion.sendKeys(time);
	}
	
	public void applybutton() 
	{
		apply.click();
	}
	
	public void videotitlename(String title)
	{
		videotitle.sendKeys(title);
	}
	
	public void uploadmusic(String music)
	{
		uploadmp3.sendKeys(music);
	}
	
	public void audiooffsettime(String offset)
	{
		audiooffset.sendKeys(offset);
	}
	
	public void audioffseterase() 
	{
		audiooffset.clear();
	}
	
	public void audiodurationtime(String duration)
	{
		audioduration.sendKeys(duration);
	}
	
	public void audiodurationerase() 
	{
		audioduration.clear();
	}
	
	public void process() 
	{
		processvideo.click();
	}
	
	public String createvideosuccessalert() 
	{
		String createvideosuccessalerttext=createvideosuccess.getText();
		return createvideosuccessalerttext;
	} 
	
	public String noframealert() 
	{
		String noframealerttext=noframe.getText();
		return noframealerttext;
	} 
	
}
