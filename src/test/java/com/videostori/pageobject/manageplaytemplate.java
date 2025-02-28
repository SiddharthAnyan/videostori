package com.videostori.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class manageplaytemplate {
	
	WebDriver ldriver;
	public manageplaytemplate(WebDriver rdriver) 
	{
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//span[normalize-space()='Template Builder']")
	WebElement templatebuildermenu;
	
	@FindBy(xpath="//span[normalize-space()='Manage Play Templates']")
	WebElement manageplaytemplatesubmenu;
	
	@FindBy(xpath="//button[normalize-space()='Add New Play Template']")
	WebElement addtemplate;
	
	@FindBy(xpath="//button[normalize-space()='Next']")
	WebElement next;
	
	@FindBy(xpath="//input[@placeholder='Input Template Name']")
	WebElement templatename;
	
	@FindBy(xpath="//input[@placeholder='Input Template Description']")
	WebElement templatdescription;
	
	@FindBy(xpath="//button[normalize-space()='Click here to change Logo/Image']")
	WebElement changelogo;
	
	@FindBy(xpath="//input[@value='https://videostori.io']")
	WebElement clickactionurl;
	
	@FindBy(xpath="//button[normalize-space()='Save Play Template']")
	WebElement saveplaytemplate;
	
	@FindBy(xpath="//input[@placeholder='Enter Email']")
	WebElement showemail;
	
	@FindBy(xpath="//input[@placeholder='Enter Mobile Number']")
	WebElement showcall;
	
	@FindBy(xpath="//input[@placeholder='Enter Whatsapp Number']")
	WebElement showwhatsapp;
	
	@FindBy(xpath="//input[@placeholder='Facebook Link Here']")
	WebElement showfacebook;
	
	@FindBy(xpath="//input[@placeholder='Instagram Link Here']")
	WebElement showinstagram;
	
	@FindBy(xpath="//input[@placeholder='Twitter Link Here']")
	WebElement showtwitter;
	
	@FindBy(xpath="//input[@placeholder='Pinterest Link Here']")
	WebElement showpintrest;
	
	@FindBy(xpath="//input[@placeholder='Youtube Link Here']")
	WebElement showyoutube;
	
	@FindBy(xpath="//input[@placeholder='Snapchat Link Here']")
	WebElement showsnapchat;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/input[1]")
	WebElement showemailradiobutton;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/div[2]/input[1]")
	WebElement showcalllradiobutton;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/div[3]/input[1]")
	WebElement showwhatsappradiobutton;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[2]/div[1]/input[1]")
	WebElement showfacebookradiobutton;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[2]/div[2]/input[1]")
	WebElement showinstagramradiobutton;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[2]/div[3]/input[1]")
	WebElement showtwitterradiobutton;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[3]/div[1]/input[1]")
	WebElement showpintrestradiobutton;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[3]/div[2]/input[1]")
	WebElement showyoutuberadiobutton;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[3]/div[3]/input[1]")
	WebElement showsnapchatradiobutton;
	
	@FindBy(xpath="//textarea[@class='my-text-area']")
	WebElement textarea;
	
	@FindBy(xpath="//input[@class='cursor-pointer']")
	WebElement sharepersonalise;
	
	@FindBy(xpath="//body/div[@id='root']/div[@class='App']/div[@class='wrapper']/div[@id='content']/div[@class='row']/div[@class='bg-white col-sm-12']/div[2]/div[2]/input[1]")
	WebElement logoimageradiobutton;
	
	@FindBy(xpath="//div[@class='form-row small']//div[3]//input[1]")
	WebElement contactdetailsradiobutton;
	
	@FindBy(xpath="//div[@class='form-row small']//div[4]//input[1]")
	WebElement textarearadiobutton;
	
	@FindBy(xpath="//input[@value='video-logo-social-text']")
	WebElement templateone;
	
	@FindBy(xpath="//input[@value='video-social-logo-text']")
	WebElement templatetwo;
	
	@FindBy(xpath="//input[@value='video-text-social-logo']")
	WebElement templatethree;
	
	@FindBy(xpath="//input[@value='video-logo-text-social']")
	WebElement templatefour;
	
	@FindBy(xpath="//div[@role='alert' or text()='Save Template: Success']")
	WebElement success;
	
	@FindBy(xpath="//div[@role='alert' or text()='Invalid Facebook Url !!']")
	WebElement invalidfacebookurl;
	
	@FindBy(xpath="//div[@role='alert' or text()='Invalid Instagram Url !!']")
	WebElement invalidinstagramurl;
	
	@FindBy(xpath="//div[@role='alert' or text()='Invalid Twitter Url !!']")
	WebElement invalidtwitterurl;
	
	@FindBy(xpath="//div[@role='alert' or text()='Invalid Pinterest Url !!']")
	WebElement invalidpinteresturl;
	
	@FindBy(xpath="//div[@role='alert' or text()='Invalid Youtube Url !!']")
	WebElement invalidyoutubeurl;
	
	@FindBy(xpath="//div[@role='alert' or text()='Invalid Snapchat Url !!']")
	WebElement invalidsnapchaturl;
	
	
	
	public void templatebuilder() 
	{
		templatebuildermenu.click();
	}
	
	public void manageplaytemplatesubmenu() 
	{
		manageplaytemplatesubmenu.click();
	}
	
	public void addtemplate() 
	{
		addtemplate.click();
	}
	
	public void templateone() 
	{
		templateone.click();
	}
	
	public void templatetwo() 
	{
		templatetwo.click();
	}
	
	public void templatethree() 
	{
		templatethree.click();
	}
	
	public void templatefour() 
	{
		templatefour.click();
	}
	
	public void next() 
	{
		next.click();
	}
	
	public void templatename(String name) 
	{
		templatename.sendKeys(name);
	}
	
	public void templatedescription(String description) 
	{
		templatdescription.sendKeys(description);
	}
	
	public void logoimage(String logo) 
	{
		changelogo.sendKeys(logo);
	}
	
	public void contactdetails() 
	{
		contactdetailsradiobutton.click();
	}
	
	public void textarea() 
	{
		textarearadiobutton.click();
	}
	
	public void changelogo(String logo) 

	{
		changelogo.sendKeys(logo);
	}
	
	public void actionurl(String url) 
	{
		clickactionurl.sendKeys(url);
	}
	
	public void actionurlclear() 
	{
		clickactionurl.clear();
	}
	
	public void savetemplate() 
	{
		saveplaytemplate.click();
	}
	
	public void showcall(String call) 
	{
		showcall.sendKeys(call);
	}
	
	public void showcallclear() 
	{
		showcall.clear();
	}
	
	public void showemail(String email) 
	{
		showemail.sendKeys(email);
	}
	
	public void showemailclear() 
	{
		showemail.clear();
	}
	
	public void showwhatsapp(String whatsapp) 
	{
		showwhatsapp.sendKeys(whatsapp);
	}
	
	public void showwhatsappclear() 
	{
		showwhatsapp.clear();
	}
	
	public void showfacebook(String facebook)
	{
		showfacebook.sendKeys(facebook);
	}	
	
	public void showinstagram(String insta) 
	{
		showinstagram.sendKeys(insta);
	}
	
	public void showtwitter(String twitter) 
	{
		showtwitter.sendKeys(twitter);
	}
	
	public void showpintrest(String pintrest) 
	{
		showpintrest.sendKeys(pintrest);
	}
	
	public void showyoutube(String youtube) 
	{
		showyoutube.sendKeys(youtube);
	}
	
	public void showsnapchat(String snapchat) 
	{
		showsnapchat.sendKeys(snapchat);
	}
	
	public void textarea(String text) 
	{
		textarea.sendKeys(text);
	}
	
	public void textareaclear() 
	{
		textarea.clear();
	}
	
	public void sharepersonalised() 
	{
		sharepersonalise.click();
	}
	
	public String successalert() 
	{
		String successalerttext=success.getText();
		return successalerttext;
	}
	
	public String facebookinvalidalert() 
	{
		String facebookinvalidalerttext=invalidfacebookurl.getText();
		return facebookinvalidalerttext;
	}
	
	public String instagraminvalidalert() 
	{
		String instagraminvalidalerttext=invalidinstagramurl.getText();
		return instagraminvalidalerttext;
	}
	
	public String twitterinvalidalert() 
	{
		String twitterinvalidalerttext=invalidtwitterurl.getText();
		return twitterinvalidalerttext;
	}
	
	public String pinterestinvalidalert() 
	{
		String pinterestinvalidalerttext=invalidpinteresturl.getText();
		return pinterestinvalidalerttext;
	}
	
	public String youtubeinvalidalert() 
	{
		String youtubeinvalidalerttext=invalidyoutubeurl.getText();
		return youtubeinvalidalerttext;
	}
	
	public String snapchatinvalidalert() 
	{
		String snapchatinvalidalerttext=invalidsnapchaturl.getText();
		return snapchatinvalidalerttext;
	}

}
