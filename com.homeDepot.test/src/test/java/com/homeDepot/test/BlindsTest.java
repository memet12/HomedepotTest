package com.homeDepot.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class BlindsTest extends Basepage {
	
	@Test
	public void blindsTest() throws Exception { 
		
		driver.get("http://www.blinds.com");
		Thread.sleep(3000);
		
		
		
		driver.findElement(By.id("gcc-inline-search")).sendKeys("Blinds");
		Thread.sleep(3000);
		
		driver.findElement(By.id("gcc-inline-search-submit")).click();
		Thread.sleep(3000);


		driver.findElement(By.partialLinkText("Price Low-High")).click();
		Thread.sleep(9000);
		
		
		
		driver.close();
		Thread.sleep(3000);
		
		driver.quit();

		
	}
}
