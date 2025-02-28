package com.videostori.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.videostori.pageobject.createvideodocument;
import com.videostori.pageobject.createvideofromdocument;

import junit.framework.Assert;

public class TC07_createvideofromdocument extends loginforall {

@Test(enabled=false, priority=1)
	
	public void CreateVideoDocumentppt() throws InterruptedException, IOException 
	{
		createvideodocument createdoc=new createvideodocument(driver);
		createdoc.videomanagementmenu();
		logger.info("Video Management clicked");
		createdoc.createvideodocumentmenu();
		logger.info("Create Video Document clicked");
		createdoc.contenttype(2);
		logger.info("Content type ppt select");
		createvideofromdocument cd=new createvideofromdocument(driver);
		cd.createvideoclick();
		logger.info("Create Video clicked");
		cd.selectall();
		logger.info("Select All checkbox clicked");
		cd.framedurationeraser();
		logger.info("frameduration erased");
		cd.frameduration("2");
		logger.info("2 second is input in the frameduration");
		cd.applybutton();
		logger.info("Apply button clicked");
		cd.videotitlename("Video with Doc 4");
		logger.info("Video title is Video with Doc 4");
		cd.uploadmusic("C:\\Users\\Admin\\Downloads\\watr-fluid-10149.mp3");
		logger.info("MP3 file uploaded");
		cd.audioffseterase();
		cd.audiooffsettime("2");
		logger.info("offset time 2");
		cd.audiodurationerase();
		cd.audiodurationtime("24");
		logger.info("audio duration 24 sec");
		cd.process();
		logger.info("Process clicked");
		Thread.sleep(1000);
		String createvideosuccessalerttexttwo=cd.createvideosuccessalert();
		System.out.println("alert text is : " +createvideosuccessalerttexttwo);
		if(createvideosuccessalerttexttwo.equals("Request submit success!!")) 
		{
			logger.info("Verify create video from document successfully");
			Assert.assertTrue(true);
		}
		else 
		{
			logger.info("Verify create video from document not successfully");
			captureScreenShot(driver,"CreateVideoDocumentppt");
			Assert.assertTrue(false);
		}
		
	}


@Test(enabled=true, priority=2)

public void CreateVideoDocumentwithoutselectingframe() throws InterruptedException, IOException 
{
	createvideodocument createdoc=new createvideodocument(driver);
	createdoc.videomanagementmenu();
	logger.info("Video Management clicked");
	createdoc.createvideodocumentmenu();
	logger.info("Create Video Document clicked");
	createdoc.contenttype(2);
	logger.info("Content type ppt select");
	createvideofromdocument cd=new createvideofromdocument(driver);
	cd.createvideoclick();
	logger.info("Create Video clicked");
	//cd.selectall();
	logger.info("Select All checkbox not clicked");
	cd.framedurationeraser();
	logger.info("frameduration erased");
	cd.frameduration("2");
	logger.info("2 second is input in the frameduration");
	cd.applybutton();
	logger.info("Apply button clicked");
	cd.videotitlename("Video with Doc 3");
	logger.info("Video title is Video with Doc 3");
	cd.uploadmusic("C:\\Users\\Admin\\Downloads\\watr-fluid-10149.mp3");
	logger.info("MP3 file uploaded");
	cd.audioffseterase();
	cd.audiooffsettime("2");
	logger.info("offset time 2");
	cd.audiodurationerase();
	cd.audiodurationtime("24");
	logger.info("audio duration 24 sec");
	cd.process();
	logger.info("Process clicked");
	Thread.sleep(1000);
	String noframealerttexttwo=cd.noframealert();
	System.out.println("alert text is : " +noframealerttexttwo);
	if(noframealerttexttwo.equals("No frame(s) selected !!")) 
	{
		logger.info("Verify create video from document not successful without selecting frame");
		Assert.assertTrue(true);
	}
	else 
	{
		logger.info("Verify create video from document successfully without selecting frame");
		captureScreenShot(driver,"CreateVideoDocumentwithoutselectingframe");
		Assert.assertTrue(false);
	}
	
}

}
