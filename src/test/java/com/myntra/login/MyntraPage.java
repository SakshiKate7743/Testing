package com.myntra.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MyntraPage {
	WebDriver rdriver;
	
	
	public MyntraPage(WebDriver ldriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
		
		
		@FindBy(className="desktop-main")
		@CacheLookup
		WebElement mentab;
		
		
		@FindBy(className="desktop-categoryLink")
		@CacheLookup
		WebElement phonecases;  
		
		public void clickmentab()
		{
			mentab.click();
		}	
		
		public void clickphonecase()
		{
			phonecases.click();
		}
		
		
		
	
	

}
