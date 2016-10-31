package com.gallop.net;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.*;


public class BaseTest {
	
	public static WebDriver driver;
	public static final String FIREFOX_BROWSER = "firefox";
	public static final String CHROME_BROWSER = "chrome";
	public static final String IE_BROWSER = "IE";
	
	
	public static WebDriver getBrowser(String browser){
		if(browser.equals(FIREFOX_BROWSER)){
			System.out.println("Intializing FireFox Driver");
			String driverPath = "wires";
			System.setProperty("webdriver.gecko.driver", driverPath);
			driver = new FirefoxDriver();
		}else if(browser.equals(CHROME_BROWSER)){
			System.out.println("Intialize chrome browser");
			String driverPath = "resources/chromedriver";
			System.setProperty("webdriver.chrome.driver", driverPath);
			driver = new ChromeDriver();
		}
		
		return driver;
	}
	

}
