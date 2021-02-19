package com.myntra.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class MyntraPage {
	WebDriver rdriver;
	Actions action = new Actions(rdriver);
	
	public MyntraPage(WebDriver ldriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
		
		
		@FindBy(how=How.XPATH,using="//*[@id='desktop-header-cnt']/div[2]/nav/div/div[1]/div/a")
		@CacheLookup
		WebDriver mentab;
		
		
		@FindBy(how=How.XPATH,using="//*[@id='desktop-header-cnt']/div[2]/nav/div/div[1]/div/div/div/div/li[5]/ul/li[11]/a")
		@CacheLookup
		WebElement phonecases;  
		
		public void clickmentab()
		{
			
			action.click();
		}	
		
		public void clickphonecase()
		{
			phonecases.click();
		}
		
		
		
	
	

}
