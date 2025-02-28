package com.videostori.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import com.videostori.pageobject.LogIn;
import com.videostori.pageobject.importVideo;

import junit.framework.Assert;

public class TC04_importVideo extends loginforall {
	
	@Test(priority=1, enabled=false)
	public void TC04_importVideoTest() throws InterruptedException 
	{
		/*
		 * driver.get(url); logger.info("User is at login page");
		 * 
		 * LogIn lg=new LogIn(driver); lg.logIntest();
		 * logger.info("LogIn button clicked");
		 * lg.emailaddress("siddharth.anyan@msdi.in");
		 * logger.info("Email Address siddharth.anyan@msdi.in");
		 * lg.loginpwd("Msdi@1234"); logger.info("login password Msdi@1234");
		 * lg.loginbtn(); logger.info("login button clicked for login");
		 * Thread.sleep(2000);
		 * System.out.println("Test Case Passed and user is able to login");
		 */
		logger.info("User is at video management page");
		importVideo iv = new importVideo(driver);
		iv.videomanagementmenu();
		logger.info("Video Management clicked");
		iv.importvideomenu();
		logger.info("Import Video Menu clicked");
		iv.videoUpload("C:\\Users\\Admin\\Downloads\\Ad 34. Act II Pop Corn.mp4");
		Thread.sleep(2000);
		logger.info("Video uploaded name is Ad 34. Act II Pop Corn.mp4");
		iv.videoDescription("This is for testing purpose");
		logger.info("Description is This is for testing purpose");
	    iv.Upload();
		Thread.sleep(2000);
		logger.info("Upload button clicked");
		iv.ok(); 
		logger.info("OK button clicked");
		iv.profileinfo();
		logger.info("Profile clicked");
		System.out.print("Test Case 1 Passed user is able to import video from local drive");
		
		}
	
	
	@Test(priority=2, enabled=true)
	public void TC04_importVideoTestwithduplicatetitle() throws InterruptedException, IOException 
	{
		
		
		logger.info("User is at video management page");
		
		importVideo iv = new importVideo(driver);
		iv.videomanagementmenu();
		logger.info("Video Management clicked");
		iv.importvideomenu();
		logger.info("Import Video Menu clicked");
		iv.videoUpload("C:\\Users\\Admin\\Downloads\\Ad 34. Act II Pop Corn.mp4");
		logger.info("Video uploaded name is Ad 34. Act II Pop Corn");
		//Thread.sleep(2000);
		iv.videoDescription("This is for testing purpose");
		logger.info("Description is This is for testing purpose");
		iv.Upload();
		//Thread.sleep(2000);
		logger.info("Upload button clicked");
		iv.ok(); 
		logger.info("OK button clicked");
		 
		Thread.sleep(3000);
		String duplicatealert=iv.duplicatevideotitlealert();
		System.out.println("alert text is : " +duplicatealert);
		if(duplicatealert.equals("Error: Duplicate Video Title !!")) 
		{
			logger.info("Verify video import -Passed");
			Assert.assertTrue(true);
		}
		else 
		{
			logger.info("Verify video import - Failed");
			captureScreenShot(driver,"TC04_importVideoTestwithduplicatetitle");
			Assert.assertTrue(false);
			
	    }
		System.out.print("Test Case 2 Passed user is not able to import video from local drive");
		
		}

	
	
	@Test(priority=3, enabled=true)
	public void TC04_importVideoTestwithouttitle() throws InterruptedException, IOException 
	{
		
		
		logger.info("User is at video management page");
		
		
		 importVideo iv = new importVideo(driver); 
			
			  iv.videomanagementmenu(); 
			  logger.info("Video Management clicked");
			  iv.importvideomenu(); 
			  logger.info("Import Video Menu clicked");
			 
		 
		iv.videoUpload("C:\\Users\\Admin\\Downloads\\Ad 34. Act II Pop Corn.mp4");
		logger.info("Video uploaded name is Ad 34. Act II Pop Corn");
		Thread.sleep(3000);
		iv.videoTitleTextclear();
		logger.info("video title is cleared");
		
		/*
		 * iv.videoTitleText("video test 17 may");
		 * logger.info("video title is test 17 may");
		 */
		 
		iv.videoDescription("This is for testing purpose");
		logger.info("Description is This is for testing purpose");
		iv.Upload();
		Thread.sleep(2000);
		logger.info("Upload button clicked");
		iv.ok(); 
		logger.info("OK button clicked");
		 
		Thread.sleep(2000);
		String alert=iv.videotitlealert();
		System.out.println("alert text is : " +alert);
		if(alert.equals("Please input video title !!")) 
		{
			logger.info("Verify video import -Passed");
			Assert.assertTrue(true);
		}
		else 
		{
			logger.info("Verify video import - Failed");
			captureScreenShot(driver,"TC04_importVideoTestwithouttitle");
			Assert.assertTrue(false);
			
	    }
		System.out.print("Test Case 3 Passed user is not able to import video from local drive");
		
		}
	
	


}
