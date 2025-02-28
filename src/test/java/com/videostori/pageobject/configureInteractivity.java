package com.videostori.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class configureInteractivity {
	
WebDriver ldriver;
	

	public configureInteractivity(WebDriver rdriver) 
	{
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//span[normalize-space()='Video Management']")
	WebElement videomanagementmenu;
	
	@FindBy(xpath="//span[normalize-space()='Import Video - Local Drive']")
	WebElement importvideomenu;
	
	@FindBy(xpath="//tbody/tr[1]/td[9]/div[1]/span[1]/a[1]")
	WebElement configureinteractivity;
	
	@FindBy(xpath="//input[@value='4']")
	WebElement timeframe;
	
	@FindBy(xpath="//h5[normalize-space()='Hotspot']")
	WebElement hotspotmenu;
	
	@FindBy(xpath="//input[@value='rectangle']")
	WebElement circleshape;
	
	@FindBy(xpath="//div[@class='col-sm-3']//select[@class='form-control form-control-sm valid']")
	WebElement stroke;
	
	@FindBy(xpath="//div[@class='form-row small']//div[@class='col-sm-12']//select[@class='form-control form-control-sm valid']")
	WebElement clickaction;
	
	@FindBy(xpath="//span[@class='MuiButtonBase-root MuiSwitch-switchBase MuiSwitch-colorPrimary Mui-checked PrivateSwitchBase-root MuiSwitch-switchBase MuiSwitch-colorPrimary Mui-checked Mui-checked css-1nr2wod']//input[@type='checkbox']")
	WebElement showhotspot;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[4]/label[1]/span[1]/span[1]/input[1]")
	WebElement blinkhotspot;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[5]/label[1]/span[1]/span[1]/input[1]")
	WebElement pausehotspot;
	
	@FindBy(xpath="//input[@placeholder='Name']")
	WebElement hotspotname;
	
	@FindBy(xpath="//button[normalize-space()='Submit']")
	WebElement submit;
	
	@FindBy(xpath="//button[normalize-space()='Cancel']")
	WebElement cancel;
	
	@FindBy(xpath="//div[@class='pt-1 col-sm-12']//div[1]//div[1]//input[1]")
	WebElement autoplay;
	
	@FindBy(xpath="//div[@class='custom-ibox-bottom form-row d-flex align-items-center nav-justified p-2']//div[2]//input[1]")
	WebElement playicon;
	
	@FindBy(xpath="//div[@class='pt-1 col-sm-12']//div[3]//input[1]")
	WebElement showpausableonce;
	
	@FindBy(xpath="//div[4]//input[1]")
	WebElement enableseekbar;
	
	@FindBy(xpath="//input[@placeholder='Enter title here...']")
	WebElement interactivetitle;
	
	@FindBy(xpath="//select[@class='form-control form-control-sm valid']")
	WebElement selecttemplate;
	
	@FindBy(xpath="//button[@class='btn-sm btn btn-success']")
	WebElement saveinteractivity;
	
	public void videomanagementmenu() 
	{
		videomanagementmenu.click();
	}
	
	public void importvideomenu() 
	{
		importvideomenu.click();
	}
	
	public void configureinteractivitymenu() 
	{
		configureinteractivity.click();
	}
	
	public void timeframesec() 
	{
		timeframe.click();
	}
	
	public void hotspotmenu()
	{
		hotspotmenu.click();
	}
	
	public void circleshape()
	{
		circleshape.click();
	}
	
	public void strokecolor(int index)
	{
		Select str=new Select(stroke);
		str.selectByIndex(index);
	}
	
	public void clickactionmenu(int index) 
	{
		Select clkaction=new Select(clickaction);
		clkaction.selectByIndex(index);
	}
	
	public void hotspotindicator() 
	{
		showhotspot.click();
	}
	
	public void blinkhotspot() 
	{
		blinkhotspot.click();
	}
	
	public void pausehotspot() 
	{
		pausehotspot.click();
	}
	
	public void hotspotname(String name) 
	{
		hotspotname.sendKeys(name);
		
	}
	
	public void submitbutton() 
	{
		submit.click();
	}
	
	public void cancelbutton() 
	{
		cancel.click();
	}
	
	public void autoplay() 
	{
		autoplay.click();
	}
	
	public void playicon() 
	{
		playicon.click();
	}
	
	public void showpausable() 
	{
		showpausableonce.click();
	}
	
	public void enableseekbarbutton()
	{
		enableseekbar.click();
	}
	
	public void interactivetitle(String title) 
	{
		interactivetitle.sendKeys(title);
	}
	
	public void template(int index) 
	{
		Select temp=new Select(selecttemplate);
		temp.selectByIndex(index);
	}
	
	public void saveinteractivity() 
	{
		saveinteractivity.click();
	}
	
}
