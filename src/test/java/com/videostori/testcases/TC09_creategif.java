package com.videostori.testcases;

import org.testng.annotations.Test;

import com.videostori.pageobject.creategif;

import junit.framework.Assert;

public class TC09_creategif extends loginforall {
	
	@Test(enabled=true, priority=1)
	
	public void creategiftest() throws InterruptedException 
	{
		creategif cg=new creategif(driver);
		cg.videomanagementmenu();
		logger.info("Video Management clicked");
		cg.creategifmenu();
		logger.info("Create Gif clicked");
		Thread.sleep(2000);
		cg.contenttype(1);
		logger.info("content type MP4");
		Thread.sleep(2000);
		cg.selectvideo(32);
		logger.info("Video selected");
		cg.proceedclick();
		logger.info("Proceed clicked");
		//cg.playbutton();
		//logger.info("play button clicked");
		Thread.sleep(2000);
		cg.giftitle("Gif 24 april");
		logger.info("Gif title is 24 april");
		cg.processgif();
		logger.info("Process Gif clicked");
		Thread.sleep(15000);
		String successalerttexttwo=cg.success();
		System.out.println("alert test is: " +successalerttexttwo);
		
		
		if(successalerttexttwo.equals("SUCCESS")) 
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

}
