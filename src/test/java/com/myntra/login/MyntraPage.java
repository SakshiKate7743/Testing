package com.myntra.login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.ExpectedExceptions;
import org.testng.annotations.Test;

public class MyntraPage {
	
	@Test
	public void myntrapage(){
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "C://Users//jayes//OneDrive//Desktop//GitStuff//Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		String url = "https://www.myntra.com";
		driver.get(url);
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement men = driver.findElement(By.className("desktop-navLink"));
		Actions actions = new Actions(driver);
		actions.moveToElement(men).perform();
	
		System.out.println("Main Page");
		
		WebElement phonecase =driver.findElement(By.xpath("//*[@id='desktop-header-cnt']/div[2]/nav/div/div[1]/div/div/div/div/li[5]/ul/li[11]/a"));
		phonecase.click();
		System.out.println("Phone Case");
		
		WebElement product = driver.findElement(By.xpath("//*[@id='desktopSearchResults']/div[2]/section/ul/li[11]/a/div[1]"));
		product.click();
		System.out.println("Product clicked");
		
		String price= driver.findElement(By.className("PriceInfo-price")).getText();
		
		//Assert.assertEquals(true, price.isDisplayed());
		{
			System.out.println(price);
		}
		
		
		/*String str = price.getText();
		String mainprice1 = str.substring(3);
		int i = Integer.parseInt(str);
		if(i>10)
		{
			System.out.println("price is  greater than 10");
		}
		else {
			System.out.println("price is less that 10");
		}
			
		WebElement addtobag = driver.findElement(By.xpath("//*[@id='mountRoot']/div/div/div/main/div[2]/div[2]/div[3]/div/div[1]"));
		Assert.assertEquals(true,addtobag.isDisplayed());
		{
			System.out.println(" Add to bag button is displayed");
		}
		
		*/
		
	}
	

}
