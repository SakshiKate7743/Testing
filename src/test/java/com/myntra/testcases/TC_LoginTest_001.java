package com.myntra.testcases;


import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.myntra.login.MyntraPage;


public class TC_LoginTest_001 extends BaseClass
{

	@Test
	public void myntrapage() throws IOException 
	{
			
		logger.info("URL is opened");
		
		MyntraPage mp=new MyntraPage(driver);
		
		mp.clickmentab();
		
		mp.clickphonecase();
		
		/*if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("Login test passed");
		}
		else
		{
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}*/
		
	}
}
