package com.gallop.net;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleTest{
	
	@Test
	public void launchTest(){
		
		WebDriver driver = BaseTest.getBrowser(BaseTest.CHROME_BROWSER);
		driver.get("http://www.google.com");
		try{
			String title = driver.findElement(By.tagName("title")).getAttribute("textContent");
			Assert.assertEquals(title,"Google");
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			driver.quit();
		}
		
	}

}
