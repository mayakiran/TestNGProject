package com.training.tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.pages.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginTest extends BaseTest {
	WebDriver driver;
	LoginPage loginpage;
	WebElement wait;

	@BeforeMethod
	public void beforemethod() {
		driver=getdriver();
		loginpage=new LoginPage(driver);

	}

	@Test(priority=1)
	public void TC01() {
		loginpage.enterusername("mayaremcy@homecare.com");
		loginpage.enterpassword("");
		loginpage.loginclick();
	  //  loginpage.validateTC01();
	 //   Assert.assertEquals(actualtext, expectedtext);

	}
	@Test(priority=2)
	public void TC02logintoapp() {
		loginpage.enterusername("mayaremcy@homecare.com");
		loginpage.enterpassword("mayahomecare123");
	    loginpage.loginclick();
	    loginpage.waittimelocator(wait,By.id("userNavButton"));
		String actualtitle=driver.getTitle();
		String expectedtitle="Home Page ~ Salesforce - Developer Edition";
		Assert.assertEquals(actualtitle, expectedtitle);
	}
	
	@Test(priority=3)
	public void TC03loginwithRememberme() {
		loginpage.enterusername("mayaremcy@homecare.com");
	
		loginpage.enterpassword("mayahomecare123");
		loginpage.remembermeCheckbox();
		loginpage.loginclick();
		loginpage.usermenudropdown();
		System.out.println(driver.getTitle());
		loginpage.logout();
		loginpage.validateTC03();
		
	}
	@Test(priority=4)
	public void TC04forgotpassword() {
		loginpage.forgotpassword();
		loginpage.usernameenter("mayaremcy@homecare.com");
		//loginpage.TC04();
	}
	
	@Test(priority=5)
	 public void TC04bvalidLoginErrorMessage() {
		loginpage.enterusername("abcd");
		loginpage.enterpassword("1234");
		loginpage.loginclick();
		loginpage.TC04B();
	
	}
	@AfterMethod
	public void teardown() {
		closebrowser();
	}
}