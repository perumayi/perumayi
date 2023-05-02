package org.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasicProgram {
	public static void main(String[] args) {
		
		//step 1 Browser configuration
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumInmakes\\drivers\\chromedriver.exe");
		
		//step 2: Browser launching
	   WebDriver driver = new ChromeDriver();
	   
	   //get
	   driver.get("https://www.amazon.in/");
	   
	   //manage
	   driver.manage().window().maximize();
	 
	   
	   
	 
		
	}

}
