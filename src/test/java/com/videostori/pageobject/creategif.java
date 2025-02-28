package com.videostori.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class creategif {

WebDriver ldriver;
	

	public creategif(WebDriver rdriver) 
	{
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver, this);
	}
	
	
	
	 @FindBy(xpath="//span[normalize-space()='Video Management']") 
	 WebElement videomanagementmenu;
	 
	 @FindBy(xpath="//span[normalize-space()='Create GIF - Video']")
	  WebElement creategifmenu;
	 
	 @FindBy(xpath="//div[@class='input-group-prepend']//select[@class='form-control form-control-sm valid']")
	 WebElement contenttype;
	 
	 @FindBy(xpath="//body/div[@id='root']/div[@class='App']/div[@class='wrapper']/div[@id='content']/div[@class='row']/div[@class='bg-white col-sm-12']/div/div[@class='row']/div[@class='col-md-9 border-right']/div[@class='row']/div[@class='col-md-8 m-auto input-group']/select[1]")
	 WebElement selectvideo;
	 
	 @FindBy(xpath="//button[normalize-space()='PROCEED']")
	 WebElement proceed;
	 
	 @FindBy(xpath="//button[normalize-space()='Play']")
	 WebElement play;
	 
	 @FindBy(xpath="//input[@type='text']")
	 WebElement giftitle;
	 
	 @FindBy(xpath="//span[normalize-space()='Process & Create GIF']")
	 WebElement processgif;
	 
	 @FindBy(xpath="//div[@role='alert' or text()='SUCCESS']")
	 WebElement successalert;
	 
	 public void videomanagementmenu()
	{
		 videomanagementmenu.click();
	}
		
	 public void creategifmenu() 
	 {
		 creategifmenu.click();
	 }
	 
	 public void contenttype(int index)
		{
			Select contype=new Select(contenttype);
			contype.selectByIndex(index);
		}
	 
	 public void selectvideo(int video)
		{
			Select videotype=new Select(selectvideo);
			videotype.selectByIndex(video);
		}
	 public void proceedclick()
		{
			 proceed.click();
		}
	 
	 public void playbutton() 
	 {
		 play.click();
	 }
	 
	 public void giftitle(String title) 
	 {
		 giftitle.sendKeys(title);
	 }
	 
	 public void processgif() 
	 {
		 processgif.click();
	 }
	 
	 public String success() 
	 {
		 String successalerttext=successalert.getText();
		 return successalerttext;
		 
	 }
	 
	 
}
