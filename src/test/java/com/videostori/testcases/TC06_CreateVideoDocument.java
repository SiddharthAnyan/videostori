package com.videostori.testcases;

import java.io.IOException;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.videostori.pageobject.createvideodocument;

import junit.framework.Assert;

public class TC06_CreateVideoDocument extends loginforall {
	
	
	@Test(enabled=true, priority=1)
	
	public void CreateVideoDocumentppt() throws InterruptedException, IOException 
	{
		createvideodocument createdoc=new createvideodocument(driver);
		createdoc.videomanagementmenu();
		logger.info("Video Management clicked");
		createdoc.createvideodocumentmenu();
		logger.info("Create Video Document clicked");
		createdoc.contenttype(2);
		logger.info("Content type ppt select");
		Thread.sleep(2000);
		createdoc.fileupload("C:\\Users\\Admin\\Downloads\\Sheetal Bapat.ppt");
		logger.info("fileupload");
		Thread.sleep(2000);
		createdoc.uploadbtn();
		logger.info("Upload Button clicked");
		Thread.sleep(5000);
		String successalerttwotext=createdoc.successalert();
		System.out.println("alert text is : " +successalerttwotext);
		if(successalerttwotext.equals("SUCCESS")) 
		{
			logger.info("Verify ppt file uploaded successfully");
			Assert.assertTrue(true);
		}
		else 
		{
			logger.info("Verify ppt file not uploaded");
			captureScreenShot(driver,"CreateVideoDocument");
			Assert.assertTrue(false);
		}
		
	}
	
    @Test(enabled=true, priority=2)
	
	public void CreateVideoDocumentpdf() throws InterruptedException, IOException 
	{
		createvideodocument createdoc=new createvideodocument(driver);
		createdoc.videomanagementmenu();
		logger.info("Video Management clicked");
		createdoc.createvideodocumentmenu();
		logger.info("Create Video Document clicked");
		createdoc.contenttype(3);
		logger.info("Content type pdf select");
		Thread.sleep(2000);
		createdoc.fileupload("C:\\Users\\Admin\\Downloads\\Siddharth B.tech Marksheet.pdf");
		logger.info("fileupload");
		Thread.sleep(2000);
		createdoc.uploadbtn();
		logger.info("Upload Button clicked");
		Thread.sleep(25000);
		String successalerttwotext=createdoc.successalert();
		System.out.println("alert text is : " +successalerttwotext);
		if(successalerttwotext.equals("SUCCESS")) 
		{
			logger.info("Verify pdf file uploaded successfully");
			Assert.assertTrue(true);
		}
		else 
		{
			logger.info("Verify pdf file not uploaded");
			captureScreenShot(driver,"CreateVideoDocument");
			Assert.assertTrue(false);
		}
		
	}
    
@Test(enabled=true, priority=3)
	
	public void CreateVideoDocumentpptx() throws InterruptedException, IOException 
	{
		createvideodocument createdoc=new createvideodocument(driver);
		createdoc.videomanagementmenu();
		logger.info("Video Management clicked");
		createdoc.createvideodocumentmenu();
		logger.info("Create Video Document clicked");
		createdoc.contenttype(1);
		logger.info("Content type pptx select");
		Thread.sleep(2000);
		createdoc.fileupload("C:\\Users\\Admin\\Downloads\\samplepptx (1).pptx");
		logger.info("fileupload");
		Thread.sleep(2000);
		createdoc.uploadbtn();
		logger.info("Upload Button clicked");
		Thread.sleep(3000);
		String successalerttwotext=createdoc.successalert();
		System.out.println("alert text is : " +successalerttwotext);
		if(successalerttwotext.equals("SUCCESS")) 
		{
			logger.info("Verify pptx file uploaded successfully");
			Assert.assertTrue(true);
		}
		else 
		{
			logger.info("Verify pptx file not uploaded");
			captureScreenShot(driver,"CreateVideoDocument");
			Assert.assertTrue(false);
		}
		
	}

@Test(enabled=true, priority=4)

public void CreateVideoDocumentwithinvalidformat() throws InterruptedException, IOException 
{
	createvideodocument createdoc=new createvideodocument(driver);
	createdoc.videomanagementmenu();
	logger.info("Video Management clicked");
	createdoc.createvideodocumentmenu();
	logger.info("Create Video Document clicked");
	createdoc.contenttype(3);
	logger.info("Content type ppt select");
	Thread.sleep(2000);
	createdoc.fileupload("C:\\Users\\Admin\\Documents\\21st June.pptx");
	logger.info("fileupload");
	Thread.sleep(2000);
	createdoc.uploadbtn();
	logger.info("Upload Button clicked");
	Thread.sleep(1000);
	String invalidalerttwotext=createdoc.invalidfileformatalert();
	System.out.println("alert text is : " +invalidalerttwotext);
	if(invalidalerttwotext.equals("Invalid file format !!")) 
	{
		logger.info("Verify invalid fileformat not uploaded successfully");
		Assert.assertTrue(true);
	}
	else 
	{
		logger.info("Verify invalid file format uploaded");
		captureScreenShot(driver,"CreateVideoDocument");
		Assert.assertTrue(false);
	}
	
}

}
