package com.training.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.training.utilities.PropertiesReader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	WebDriver driver;
	PropertiesReader  properties;
	String browserName,urlLink;
	
	public WebDriver getdriver(){
		 properties=new PropertiesReader();
		 browserName=properties.getpropertiesfile("browser");
		 urlLink=properties.getpropertiesfile("url");
		
		 
		if (driver ==null){
			if(browserName.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
			     driver=new ChromeDriver();
			}else if(browserName.equalsIgnoreCase("edge")) {
				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();	
			}
			
		}
		 driver.get(urlLink);
		 return driver;	
	}
	public void closebrowser() {
		driver.close();
		driver=null;
	}
}
