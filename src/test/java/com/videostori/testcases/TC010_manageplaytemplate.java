package com.videostori.testcases;

import org.testng.annotations.Test;

import com.videostori.pageobject.manageplaytemplate;

import junit.framework.Assert;

public class TC010_manageplaytemplate extends loginforall {
	
	@Test(enabled=true, priority=1)
	
	public void manageplaytemplateone() throws InterruptedException 
	{
		manageplaytemplate mt=new manageplaytemplate(driver);
		mt.templatebuilder();
		logger.info("template builder clicked");
		mt.manageplaytemplatesubmenu();
		logger.info("Manage Play template clicked");
		mt.addtemplate();
		logger.info("Add New Template clicked");
		mt.next();
		logger.info("next button clicked");
		mt.templatename("template 8 feb one ");
		logger.info("template name input");
		mt.templatedescription("This is template one (video-logo-social-text)");
		logger.info("template description input");
		mt.logoimage("C:\\Users\\Admin\\Downloads\\Lakme-Logo-2011.png");
		logger.info("logo uploaded");
		mt.actionurlclear();
		logger.info("actionurl cleared");
		mt.actionurl("https://www.lakmeindia.com/");
		logger.info("actionurl input");
		mt.showemailclear();
		logger.info("Email Cleared");
		mt.showemail("siddharthanyan@gmail.com");
		logger.info("Email Address input");
		mt.showcallclear();
		logger.info("Showcall cleared");
		mt.showcall("7018805794");
		logger.info("Show call input");
		mt.showwhatsappclear();
		logger.info("Show whatsapp cleared");
		mt.showwhatsapp("7018805794");
		logger.info("whatsapp input");
		mt.showfacebook("https://www.facebook.com/lakme");
		logger.info("facebook input");
		mt.showinstagram("https://www.instagram.com/lakmeindia/");
		logger.info("instagram input");
		mt.showtwitter("https://twitter.com/");
		logger.info("twitter input");
		mt.showpintrest("https://www.pinterest.com/lakmeindia/");
		logger.info("pinterest input");
		mt.showyoutube("https://www.youtube.com/user/ILoveLakme");
		logger.info("youtube input");
		mt.showsnapchat("https://www.snapchat.com/explore/lakme");
		logger.info("snapchat input");
		mt.textareaclear();
		logger.info("text area clear");
		mt.textarea("Lakmé is an Indian cosmetics brand, owned by Hindustan Unilever. It was named after the French opera Lakmé, which itself is the French word for goddess Lakshmi who is renowned for her beauty. It was started in 1952 as a 100% subsidiary of Tata Oil Mills, famously after Prime Minister Jawaharlal Nehru was concerned that Indian women were spending precious foreign exchange on beauty products and persuaded JRD Tata to manufacture them in India.");
		logger.info("text area input");
		mt.sharepersonalised();
		logger.info("Share personalised clicked");
		mt.savetemplate();
		logger.info("Save Template clicked");
		Thread.sleep(2000);
		String successalerttexttwo=mt.successalert();
		System.out.println("alert test is: " +successalerttexttwo);
		
		
		if(successalerttexttwo.equals("Save Template: Success")) 
		{
			logger.info("Verify Gif created successfully");
			Assert.assertTrue(true);
		}
		else 
		{
			logger.info("Verify Gif not created successfully");
			Assert.assertTrue(false);
		}
		
		
	}
	
@Test(enabled=true, priority=2)
	
	public void manageplaytemplatetwo() throws InterruptedException 
	{
		manageplaytemplate mt=new manageplaytemplate(driver);
		/*
		 * mt.templatebuilder(); logger.info("template builder clicked");
		 * mt.manageplaytemplatesubmenu(); logger.info("Manage Play template clicked");
		 */
		mt.addtemplate();
		logger.info("Add New Template clicked");
		mt.templatetwo();
		logger.info("Template two selected");
		mt.next();
		logger.info("next button clicked");
		mt.templatename("template 8 feb two");
		logger.info("template name input");
		mt.templatedescription("This is template one (video-logo-social-text)");
		logger.info("template description input");
		mt.logoimage("C:\\Users\\Admin\\Downloads\\Lakme-Logo-2011.png");
		logger.info("logo uploaded");
		mt.actionurlclear();
		logger.info("actionurl cleared");
		mt.actionurl("https://www.lakmeindia.com/");
		logger.info("actionurl input");
		mt.showemailclear();
		logger.info("Email Cleared");
		mt.showemail("siddharthanyan@gmail.com");
		logger.info("Email Address input");
		mt.showcallclear();
		logger.info("Showcall cleared");
		mt.showcall("7018805794");
		logger.info("Show call input");
		mt.showwhatsappclear();
		logger.info("Show whatsapp cleared");
		mt.showwhatsapp("7018805794");
		logger.info("whatsapp input");
		mt.showfacebook("https://www.facebook.com/lakme");
		logger.info("facebook input");
		mt.showinstagram("https://www.instagram.com/lakmeindia/");
		logger.info("instagram input");
		mt.showtwitter("https://twitter.com/");
		logger.info("twitter input");
		mt.showpintrest("https://www.pinterest.com/lakmeindia/");
		logger.info("pinterest input");
		mt.showyoutube("https://www.youtube.com/user/ILoveLakme");
		logger.info("youtube input");
		mt.showsnapchat("https://www.snapchat.com/explore/lakme");
		logger.info("snapchat input");
		mt.textareaclear();
		logger.info("text area clear");
		mt.textarea("Lakmé is an Indian cosmetics brand, owned by Hindustan Unilever. It was named after the French opera Lakmé, which itself is the French word for goddess Lakshmi who is renowned for her beauty. It was started in 1952 as a 100% subsidiary of Tata Oil Mills, famously after Prime Minister Jawaharlal Nehru was concerned that Indian women were spending precious foreign exchange on beauty products and persuaded JRD Tata to manufacture them in India.");
		logger.info("text area input");
		mt.sharepersonalised();
		logger.info("Share personalised clicked");
		mt.savetemplate();
		logger.info("Save Template clicked");
		Thread.sleep(2000);
		String successalerttexttwo=mt.successalert();
		System.out.println("alert test is: " +successalerttexttwo);
		
		
		if(successalerttexttwo.equals("Save Template: Success")) 
		{
			logger.info("Verify Gif created successfully");
			Assert.assertTrue(true);
		}
		else 
		{
			logger.info("Verify Gif not created successfully");
			Assert.assertTrue(false);
		}
		
		
	}

@Test(enabled=true, priority=3)

public void manageplaytemplatethree() throws InterruptedException 
{
	manageplaytemplate mt=new manageplaytemplate(driver);
	/*
	 * mt.templatebuilder(); logger.info("template builder clicked");
	 * mt.manageplaytemplatesubmenu(); logger.info("Manage Play template clicked");
	 */
	mt.addtemplate();
	logger.info("Add New Template clicked");
	mt.templatethree();
	logger.info("Template three selected");
	mt.next();
	logger.info("next button clicked");
	mt.templatename("template 8 feb three");
	logger.info("template name input");
	mt.templatedescription("This is template one (video-logo-social-text)");
	logger.info("template description input");
	mt.logoimage("C:\\Users\\Admin\\Downloads\\Lakme-Logo-2011.png");
	logger.info("logo uploaded");
	mt.actionurlclear();
	logger.info("actionurl cleared");
	mt.actionurl("https://www.lakmeindia.com/");
	logger.info("actionurl input");
	mt.showemailclear();
	logger.info("Email Cleared");
	mt.showemail("siddharthanyan@gmail.com");
	logger.info("Email Address input");
	mt.showcallclear();
	logger.info("Showcall cleared");
	mt.showcall("7018805794");
	logger.info("Show call input");
	mt.showwhatsappclear();
	logger.info("Show whatsapp cleared");
	mt.showwhatsapp("7018805794");
	logger.info("whatsapp input");
	mt.showfacebook("https://www.facebook.com/lakme");
	logger.info("facebook input");
	mt.showinstagram("https://www.instagram.com/lakmeindia/");
	logger.info("instagram input");
	mt.showtwitter("https://twitter.com/");
	logger.info("twitter input");
	mt.showpintrest("https://www.pinterest.com/lakmeindia/");
	logger.info("pinterest input");
	mt.showyoutube("https://www.youtube.com/user/ILoveLakme");
	logger.info("youtube input");
	mt.showsnapchat("https://www.snapchat.com/explore/lakme");
	logger.info("snapchat input");
	mt.textareaclear();
	logger.info("text area clear");
	mt.textarea("Lakmé is an Indian cosmetics brand, owned by Hindustan Unilever. It was named after the French opera Lakmé, which itself is the French word for goddess Lakshmi who is renowned for her beauty. It was started in 1952 as a 100% subsidiary of Tata Oil Mills, famously after Prime Minister Jawaharlal Nehru was concerned that Indian women were spending precious foreign exchange on beauty products and persuaded JRD Tata to manufacture them in India.");
	logger.info("text area input");
	mt.sharepersonalised();
	logger.info("Share personalised clicked");
	mt.savetemplate();
	logger.info("Save Template clicked");
	Thread.sleep(2000);
	String successalerttexttwo=mt.successalert();
	System.out.println("alert test is: " +successalerttexttwo);
	
	
	if(successalerttexttwo.equals("Save Template: Success")) 
	{
		logger.info("Verify Gif created successfully");
		Assert.assertTrue(true);
	}
	else 
	{
		logger.info("Verify Gif not created successfully");
		Assert.assertTrue(false);
	}
	
}

@Test(enabled=true, priority=4)

public void manageplaytemplatefour() throws InterruptedException 
{
	manageplaytemplate mt=new manageplaytemplate(driver);
	/*
	 * mt.templatebuilder(); logger.info("template builder clicked");
	 * mt.manageplaytemplatesubmenu(); logger.info("Manage Play template clicked");
	 */
	mt.addtemplate();
	logger.info("Add New Template clicked");
	mt.templatefour();
	logger.info("Template four selected");
	mt.next();
	logger.info("next button clicked");
	mt.templatename("template 8 feb four");
	logger.info("template name input");
	mt.templatedescription("This is template one (video-logo-social-text)");
	logger.info("template description input");
	Thread.sleep(2000);
	mt.logoimage("C:\\Users\\Admin\\Downloads\\Lakme-Logo-2011.png");
	logger.info("logo uploaded");
	mt.actionurlclear();
	logger.info("actionurl cleared");
	mt.actionurl("https://www.lakmeindia.com/");
	logger.info("actionurl input");
	mt.showemailclear();
	logger.info("Email Cleared");
	mt.showemail("siddharthanyan@gmail.com");
	logger.info("Email Address input");
	mt.showcallclear();
	logger.info("Showcall cleared");
	mt.showcall("7018805794");
	logger.info("Show call input");
	mt.showwhatsappclear();
	logger.info("Show whatsapp cleared");
	mt.showwhatsapp("7018805794");
	logger.info("whatsapp input");
	mt.showfacebook("https://www.facebook.com/lakme");
	logger.info("facebook input");
	mt.showinstagram("https://www.instagram.com/lakmeindia/");
	logger.info("instagram input");
	mt.showtwitter("https://twitter.com/");
	logger.info("twitter input");
	mt.showpintrest("https://www.pinterest.com/lakmeindia/");
	logger.info("pinterest input");
	mt.showyoutube("https://www.youtube.com/user/ILoveLakme");
	logger.info("youtube input");
	mt.showsnapchat("https://www.snapchat.com/explore/lakme");
	logger.info("snapchat input");
	mt.textareaclear();
	logger.info("text area clear");
	mt.textarea("Lakmé is an Indian cosmetics brand, owned by Hindustan Unilever. It was named after the French opera Lakmé, which itself is the French word for goddess Lakshmi who is renowned for her beauty. It was started in 1952 as a 100% subsidiary of Tata Oil Mills, famously after Prime Minister Jawaharlal Nehru was concerned that Indian women were spending precious foreign exchange on beauty products and persuaded JRD Tata to manufacture them in India.");
	logger.info("text area input");
	mt.sharepersonalised();
	logger.info("Share personalised clicked");
	mt.savetemplate();
	logger.info("Save Template clicked");
	Thread.sleep(2000);
	String successalerttexttwo=mt.successalert();
	System.out.println("alert test is: " +successalerttexttwo);
	
	
	if(successalerttexttwo.equals("Save Template: Success")) 
	{
		logger.info("Verify Gif created successfully");
		Assert.assertTrue(true);
	}
	else 
	{
		logger.info("Verify Gif not created successfully");
		Assert.assertTrue(false);
	}
	
}

@Test(enabled=true, priority=5)

public void manageplaytemplateinvalidfacebookurl() throws InterruptedException 
{
	manageplaytemplate mt=new manageplaytemplate(driver);
	
	/*
	 * mt.templatebuilder(); logger.info("template builder clicked");
	 * mt.manageplaytemplatesubmenu(); logger.info("Manage Play template clicked");
	 */
	 
	mt.addtemplate();
	logger.info("Add New Template clicked");
	mt.templatefour();
	logger.info("Template four selected");
	mt.next();
	logger.info("next button clicked");
	mt.templatename("template 7 feb 5");
	logger.info("template name input");
	mt.templatedescription("This is template one (video-logo-social-text)");
	logger.info("template description input");
	Thread.sleep(2000);
	mt.logoimage("C:\\Users\\Admin\\Downloads\\Lakme-Logo-2011.png");
	logger.info("logo uploaded");
	mt.actionurlclear();
	logger.info("actionurl cleared");
	mt.actionurl("https://www.lakmeindia.com/");
	logger.info("actionurl input");
	mt.showemailclear();
	logger.info("Email Cleared");
	mt.showemail("siddharthanyan@gmail.com");
	logger.info("Email Address input");
	mt.showcallclear();
	logger.info("Showcall cleared");
	mt.showcall("7018805794");
	logger.info("Show call input");
	mt.showwhatsappclear();
	logger.info("Show whatsapp cleared");
	mt.showwhatsapp("7018805794");
	logger.info("whatsapp input");
	//mt.showfacebook("https://www.facebook.com/lakme");
	mt.showinstagram("https://www.instagram.com/lakmeindia/");
	logger.info("instagram input");
	mt.showtwitter("https://twitter.com/");
	logger.info("twitter input");
	mt.showpintrest("https://www.pinterest.com/lakmeindia/");
	logger.info("pinterest input");
	mt.showyoutube("https://www.youtube.com/user/ILoveLakme");
	logger.info("youtube input");
	mt.showsnapchat("https://www.snapchat.com/explore/lakme");
	logger.info("snapchat input");
	mt.textareaclear();
	logger.info("text area clear");
	mt.textarea("Lakmé is an Indian cosmetics brand, owned by Hindustan Unilever. It was named after the French opera Lakmé, which itself is the French word for goddess Lakshmi who is renowned for her beauty. It was started in 1952 as a 100% subsidiary of Tata Oil Mills, famously after Prime Minister Jawaharlal Nehru was concerned that Indian women were spending precious foreign exchange on beauty products and persuaded JRD Tata to manufacture them in India.");
	logger.info("text area input");
	mt.sharepersonalised();
	logger.info("Share personalised clicked");
	mt.savetemplate();
	logger.info("Save Template clicked");
	Thread.sleep(1000);
	String facebookinvalidalerttexttwo=mt.facebookinvalidalert();
	System.out.println("alert test is: " +facebookinvalidalerttexttwo);
	
	
	if(facebookinvalidalerttexttwo.equals("Invalid Facebook Url !!")) 
	{
		logger.info("Facebook url is not entered");
		Assert.assertTrue(true);
	}
	else 
	{
		logger.info("Facebook Url is entered");
		Assert.assertTrue(false);
	}
	
}


@Test(enabled=true, priority=6)

public void manageplaytemplateinvalidinstagramurl() throws InterruptedException 
{
	manageplaytemplate mt=new manageplaytemplate(driver);
	
	
	   mt.templatebuilder(); logger.info("template builder clicked");
	   mt.manageplaytemplatesubmenu(); logger.info("Manage Play template clicked");
	 
	mt.addtemplate();
	logger.info("Add New Template clicked");
	mt.templatefour();
	logger.info("Template four selected");
	mt.next();
	logger.info("next button clicked");
	mt.templatename("template 7 feb 6");
	logger.info("template name input");
	mt.templatedescription("This is template one (video-logo-social-text)");
	logger.info("template description input");
	Thread.sleep(2000);
	mt.logoimage("C:\\Users\\Admin\\Downloads\\Lakme-Logo-2011.png");
	logger.info("logo uploaded");
	mt.actionurlclear();
	logger.info("actionurl cleared");
	mt.actionurl("https://www.lakmeindia.com/");
	logger.info("actionurl input");
	mt.showemailclear();
	logger.info("Email Cleared");
	mt.showemail("siddharthanyan@gmail.com");
	logger.info("Email Address input");
	mt.showcallclear();
	logger.info("Showcall cleared");
	mt.showcall("7018805794");
	logger.info("Show call input");
	mt.showwhatsappclear();
	logger.info("Show whatsapp cleared");
	mt.showwhatsapp("7018805794");
	logger.info("whatsapp input");
	mt.showfacebook("https://www.facebook.com/lakme");
	logger.info("Facebook URL input");
	//mt.showinstagram("https://www.instagram.com/lakmeindia/");
	//logger.info("instagram input");
	mt.showtwitter("https://twitter.com/");
	logger.info("twitter input");
	mt.showpintrest("https://www.pinterest.com/lakmeindia/");
	logger.info("pinterest input");
	mt.showyoutube("https://www.youtube.com/user/ILoveLakme");
	logger.info("youtube input");
	mt.showsnapchat("https://www.snapchat.com/explore/lakme");
	logger.info("snapchat input");
	mt.textareaclear();
	logger.info("text area clear");
	mt.textarea("Lakmé is an Indian cosmetics brand, owned by Hindustan Unilever. It was named after the French opera Lakmé, which itself is the French word for goddess Lakshmi who is renowned for her beauty. It was started in 1952 as a 100% subsidiary of Tata Oil Mills, famously after Prime Minister Jawaharlal Nehru was concerned that Indian women were spending precious foreign exchange on beauty products and persuaded JRD Tata to manufacture them in India.");
	logger.info("text area input");
	mt.sharepersonalised();
	logger.info("Share personalised clicked");
	mt.savetemplate();
	logger.info("Save Template clicked");
	Thread.sleep(1000);
	String instagraminvalidalerttexttwo=mt.instagraminvalidalert();
	System.out.println("alert test is: " +instagraminvalidalerttexttwo);
	
	
	if(instagraminvalidalerttexttwo.equals("Invalid Instagram Url !!")) 
	{
		logger.info("Instagram url is not entered");
		Assert.assertTrue(true);
	}
	else 
	{
		logger.info("Instagram Url is entered");
		Assert.assertTrue(false);
	}
	
}

@Test(enabled=true, priority=7)

public void manageplaytemplateinvalidtwitterurl() throws InterruptedException 
{
	manageplaytemplate mt=new manageplaytemplate(driver);
	
	
	 mt.templatebuilder(); logger.info("template builder clicked");
	 mt.manageplaytemplatesubmenu(); logger.info("Manage Play template clicked");
	 
	 
	mt.addtemplate();
	logger.info("Add New Template clicked");
	mt.templatefour();
	logger.info("Template four selected");
	mt.next();
	logger.info("next button clicked");
	mt.templatename("template 5 feb 6");
	logger.info("template name input");
	mt.templatedescription("This is template one (video-logo-social-text)");
	logger.info("template description input");
	Thread.sleep(2000);
	mt.logoimage("C:\\Users\\Admin\\Downloads\\Lakme-Logo-2011.png");
	logger.info("logo uploaded");
	mt.actionurlclear();
	logger.info("actionurl cleared");
	mt.actionurl("https://www.lakmeindia.com/");
	logger.info("actionurl input");
	mt.showemailclear();
	logger.info("Email Cleared");
	mt.showemail("siddharthanyan@gmail.com");
	logger.info("Email Address input");
	mt.showcallclear();
	logger.info("Showcall cleared");
	mt.showcall("7018805794");
	logger.info("Show call input");
	mt.showwhatsappclear();
	logger.info("Show whatsapp cleared");
	mt.showwhatsapp("7018805794");
	logger.info("whatsapp input");
	mt.showfacebook("https://www.facebook.com/lakme");
	logger.info("Facebook URL input");
	mt.showinstagram("https://www.instagram.com/lakmeindia/");
	logger.info("instagram input");
	//mt.showtwitter("https://twitter.com/");
	//logger.info("twitter input");
	mt.showpintrest("https://www.pinterest.com/lakmeindia/");
	logger.info("pinterest input");
	mt.showyoutube("https://www.youtube.com/user/ILoveLakme");
	logger.info("youtube input");
	mt.showsnapchat("https://www.snapchat.com/explore/lakme");
	logger.info("snapchat input");
	mt.textareaclear();
	logger.info("text area clear");
	mt.textarea("Lakmé is an Indian cosmetics brand, owned by Hindustan Unilever. It was named after the French opera Lakmé, which itself is the French word for goddess Lakshmi who is renowned for her beauty. It was started in 1952 as a 100% subsidiary of Tata Oil Mills, famously after Prime Minister Jawaharlal Nehru was concerned that Indian women were spending precious foreign exchange on beauty products and persuaded JRD Tata to manufacture them in India.");
	logger.info("text area input");
	mt.sharepersonalised();
	logger.info("Share personalised clicked");
	mt.savetemplate();
	logger.info("Save Template clicked");
	Thread.sleep(1000);
	String twitterinvalidalerttexttwo=mt.twitterinvalidalert();
	System.out.println("alert test is: " +twitterinvalidalerttexttwo);
	
	
	if(twitterinvalidalerttexttwo.equals("Invalid Twitter Url !!")) 
	{
		logger.info("Twitter url is not entered");
		Assert.assertTrue(true);
	}
	else 
	{
		logger.info("Twitter Url is entered");
		Assert.assertTrue(false);
	}
	
}

@Test(enabled=true, priority=8)

public void manageplaytemplateinvalidpinteresturl() throws InterruptedException 
{
	manageplaytemplate mt=new manageplaytemplate(driver);
	
	
	 mt.templatebuilder(); logger.info("template builder clicked");
	 mt.manageplaytemplatesubmenu(); logger.info("Manage Play template clicked");
	 
	 
	mt.addtemplate();
	logger.info("Add New Template clicked");
	mt.templatefour();
	logger.info("Template four selected");
	mt.next();
	logger.info("next button clicked");
	mt.templatename("template 5 feb");
	logger.info("template name input");
	mt.templatedescription("This is template one (video-logo-social-text)");
	logger.info("template description input");
	Thread.sleep(2000);
	mt.logoimage("C:\\Users\\Admin\\Downloads\\Lakme-Logo-2011.png");
	logger.info("logo uploaded");
	mt.actionurlclear();
	logger.info("actionurl cleared");
	mt.actionurl("https://www.lakmeindia.com/");
	logger.info("actionurl input");
	mt.showemailclear();
	logger.info("Email Cleared");
	mt.showemail("siddharthanyan@gmail.com");
	logger.info("Email Address input");
	mt.showcallclear();
	logger.info("Showcall cleared");
	mt.showcall("7018805794");
	logger.info("Show call input");
	mt.showwhatsappclear();
	logger.info("Show whatsapp cleared");
	mt.showwhatsapp("7018805794");
	logger.info("whatsapp input");
	mt.showfacebook("https://www.facebook.com/lakme");
	logger.info("Facebook URL input");
	mt.showinstagram("https://www.instagram.com/lakmeindia/");
	logger.info("instagram input");
	mt.showtwitter("https://twitter.com/");
	logger.info("twitter input");
	//mt.showpintrest("https://www.pinterest.com/lakmeindia/");
	//logger.info("pinterest input");
	mt.showyoutube("https://www.youtube.com/user/ILoveLakme");
	logger.info("youtube input");
	mt.showsnapchat("https://www.snapchat.com/explore/lakme");
	logger.info("snapchat input");
	mt.textareaclear();
	logger.info("text area clear");
	mt.textarea("Lakmé is an Indian cosmetics brand, owned by Hindustan Unilever. It was named after the French opera Lakmé, which itself is the French word for goddess Lakshmi who is renowned for her beauty. It was started in 1952 as a 100% subsidiary of Tata Oil Mills, famously after Prime Minister Jawaharlal Nehru was concerned that Indian women were spending precious foreign exchange on beauty products and persuaded JRD Tata to manufacture them in India.");
	logger.info("text area input");
	mt.sharepersonalised();
	logger.info("Share personalised clicked");
	mt.savetemplate();
	logger.info("Save Template clicked");
	Thread.sleep(1000);
	String pinterestinvalidalerttexttwo=mt.pinterestinvalidalert();
	System.out.println("alert test is: " +pinterestinvalidalerttexttwo);
	
	
	if(pinterestinvalidalerttexttwo.equals("Invalid Pinterest Url !!")) 
	{
		logger.info("Pinterest url is not entered");
		Assert.assertTrue(true);
	}
	else 
	{
		logger.info("Pinterest Url is entered");
		Assert.assertTrue(false);
	}
	
}


@Test(enabled=true, priority=9)

public void manageplaytemplateinvalidyoutubeurl() throws InterruptedException 
{
	manageplaytemplate mt=new manageplaytemplate(driver);
	
	
	 mt.templatebuilder(); logger.info("template builder clicked");
	 mt.manageplaytemplatesubmenu(); logger.info("Manage Play template clicked");
	 
	 
	mt.addtemplate();
	logger.info("Add New Template clicked");
	mt.templatefour();
	logger.info("Template four selected");
	mt.next();
	logger.info("next button clicked");
	mt.templatename("template 5 feb");
	logger.info("template name input");
	mt.templatedescription("This is template one (video-logo-social-text)");
	logger.info("template description input");
	Thread.sleep(2000);
	mt.logoimage("C:\\Users\\Admin\\Downloads\\Lakme-Logo-2011.png");
	logger.info("logo uploaded");
	mt.actionurlclear();
	logger.info("actionurl cleared");
	mt.actionurl("https://www.lakmeindia.com/");
	logger.info("actionurl input");
	mt.showemailclear();
	logger.info("Email Cleared");
	mt.showemail("siddharthanyan@gmail.com");
	logger.info("Email Address input");
	mt.showcallclear();
	logger.info("Showcall cleared");
	mt.showcall("7018805794");
	logger.info("Show call input");
	mt.showwhatsappclear();
	logger.info("Show whatsapp cleared");
	mt.showwhatsapp("7018805794");
	logger.info("whatsapp input");
	mt.showfacebook("https://www.facebook.com/lakme");
	logger.info("Facebook URL input");
	mt.showinstagram("https://www.instagram.com/lakmeindia/");
	logger.info("instagram input");
	mt.showtwitter("https://twitter.com/");
	logger.info("twitter input");
	mt.showpintrest("https://www.pinterest.com/lakmeindia/");
	logger.info("pinterest input");
	//mt.showyoutube("https://www.youtube.com/user/ILoveLakme");
	//logger.info("youtube input");
	mt.showsnapchat("https://www.snapchat.com/explore/lakme");
	logger.info("snapchat input");
	mt.textareaclear();
	logger.info("text area clear");
	mt.textarea("Lakmé is an Indian cosmetics brand, owned by Hindustan Unilever. It was named after the French opera Lakmé, which itself is the French word for goddess Lakshmi who is renowned for her beauty. It was started in 1952 as a 100% subsidiary of Tata Oil Mills, famously after Prime Minister Jawaharlal Nehru was concerned that Indian women were spending precious foreign exchange on beauty products and persuaded JRD Tata to manufacture them in India.");
	logger.info("text area input");
	mt.sharepersonalised();
	logger.info("Share personalised clicked");
	mt.savetemplate();
	logger.info("Save Template clicked");
	Thread.sleep(1000);
	String youtubeinvalidalerttexttwo=mt.youtubeinvalidalert();
	System.out.println("alert test is: " +youtubeinvalidalerttexttwo);
	
	
	if(youtubeinvalidalerttexttwo.equals("Invalid Youtube Url !!")) 
	{
		logger.info("Youtube url is not entered");
		Assert.assertTrue(true);
	}
	else 
	{
		logger.info("Youtube Url is entered");
		Assert.assertTrue(false);
	}
	
}


@Test(enabled=true, priority=10)

public void manageplaytemplateinvalidsnapchaturl() throws InterruptedException 
{
	manageplaytemplate mt=new manageplaytemplate(driver);
	
	
	 mt.templatebuilder(); logger.info("template builder clicked");
	 mt.manageplaytemplatesubmenu(); logger.info("Manage Play template clicked");
	 
	 
	mt.addtemplate();
	logger.info("Add New Template clicked");
	mt.templatefour();
	logger.info("Template four selected");
	mt.next();
	logger.info("next button clicked");
	mt.templatename("template 7 feb");
	logger.info("template name input");
	mt.templatedescription("This is template one (video-logo-social-text)");
	logger.info("template description input");
	Thread.sleep(2000);
	mt.logoimage("C:\\Users\\Admin\\Downloads\\Lakme-Logo-2011.png");
	logger.info("logo uploaded");
	mt.actionurlclear();
	logger.info("actionurl cleared");
	mt.actionurl("https://www.lakmeindia.com/");
	logger.info("actionurl input");
	mt.showemailclear();
	logger.info("Email Cleared");
	mt.showemail("siddharthanyan@gmail.com");
	logger.info("Email Address input");
	mt.showcallclear();
	logger.info("Showcall cleared");
	mt.showcall("7018805794");
	logger.info("Show call input");
	mt.showwhatsappclear();
	logger.info("Show whatsapp cleared");
	mt.showwhatsapp("7018805794");
	logger.info("whatsapp input");
	mt.showfacebook("https://www.facebook.com/lakme");
	logger.info("Facebook URL input");
	mt.showinstagram("https://www.instagram.com/lakmeindia/");
	logger.info("instagram input");
	mt.showtwitter("https://twitter.com/");
	logger.info("twitter input");
	mt.showpintrest("https://www.pinterest.com/lakmeindia/");
	logger.info("pinterest input");
	mt.showyoutube("https://www.youtube.com/user/ILoveLakme");
	logger.info("youtube input");
	//mt.showsnapchat("https://www.snapchat.com/explore/lakme");
	//logger.info("snapchat input");
	mt.textareaclear();
	logger.info("text area clear");
	mt.textarea("Lakmé is an Indian cosmetics brand, owned by Hindustan Unilever. It was named after the French opera Lakmé, which itself is the French word for goddess Lakshmi who is renowned for her beauty. It was started in 1952 as a 100% subsidiary of Tata Oil Mills, famously after Prime Minister Jawaharlal Nehru was concerned that Indian women were spending precious foreign exchange on beauty products and persuaded JRD Tata to manufacture them in India.");
	logger.info("text area input");
	mt.sharepersonalised();
	logger.info("Share personalised clicked");
	mt.savetemplate();
	logger.info("Save Template clicked");
	Thread.sleep(1000);
	String snapchatinvalidalerttexttwo=mt.snapchatinvalidalert();
	System.out.println("alert test is: " +snapchatinvalidalerttexttwo);
	
	
	if(snapchatinvalidalerttexttwo.equals("Invalid Snapchat Url !!")) 
	{
		logger.info("Snapchat url is not entered");
		Assert.assertTrue(true);
	}
	else 
	{
		logger.info("Snapchat Url is entered");
		Assert.assertTrue(false);
	}
	
}

}
