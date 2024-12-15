package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.BasePage;
import com.training.utilities.PropertiesReader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage extends BasePage{
  
	WebDriverWait wait;
	PropertiesReader properties=new PropertiesReader();
	String Mainusername;
	String Mainpassword;

	
	@FindBy(id="username")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	
	@FindBy(id="Login")
	WebElement loginbtn;
	
	@FindBy(id="username")
	WebElement mainusername1;
	@FindBy(id="password")
	WebElement mainpassword;
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	

	public void enterusername(String strusername) {
        username.sendKeys(strusername);  
     }
	public void entermainusername() {
		Mainusername=properties.getpropertiesfile("mainusername");
		mainusername1.sendKeys(Mainusername);
		
	}
	public void entermainpassword() {
		Mainpassword=properties.getpropertiesfile("mainpassword");
		mainpassword.sendKeys(Mainpassword);			
	}
     
     public void enterpassword(String strpassword) {
    	 password.sendKeys(strpassword);
     }
     
     public void loginclick() {
    	 loginbtn.click();
     }
     @FindBy(xpath="//input[@id='rememberUn']")
     WebElement rememberme;
     
     public void remembermeCheckbox() {	
 		rememberme.click();
     }
     @FindBy(linkText="Logout")
     WebElement logout;
     
     public void logout() {
 		logout.click();
    	 
     }
     @FindBy(id="userNavButton")
     WebElement usermenu;
     
     public void usermenudropdown() {	
     waittimelocator(usermenu,By.id("userNavButton"));  
     usermenu.click(); 	 
     }
     @FindBy(linkText="Forgot Your Password?")
     WebElement forgotpassword;
     @FindBy(xpath="//input[@id='un']")
     WebElement forgotusername;
     @FindBy(id="continue")
     WebElement continuebutton;
     
     public void forgotpassword() {
 		forgotpassword.click();
     }
     public void usernameenter(String strusername1) {
       forgotusername.sendKeys(strusername1);
        continuebutton.click();
}
     
    @FindBy(xpath="//div[@class='loginError' and @id='error']") 
    WebElement errormessage;
    public void validateTC01() {
    	
	String actualtext=errormessage.getText();
	String expectedtext="Please enter your password.";
	
}
    
    
    @FindBy (xpath="//div[@id='idcard']")
    WebElement actualusername;
    public void validateTC03() {
    	waittimelocator(actualusername, By.xpath("//div[@id='idcard']"));
		String actual=actualusername.getAttribute("aria-label");
		String expected="mayaremcy@homecare.com";
	    Assert.assertEquals(actual, expected);
		
    }
    @FindBy(xpath="//p[contains(text(),'We’ve sent you an email with a')]")
    WebElement emailmsg;
    public void TC04() {
    
		String emailmsge=emailmsg.getText();	
		String actualmsge="We’ve sent you an email with a link to finish resetting your password.";
		Assert.assertEquals(actualmsge, emailmsge);
    }
    
    @FindBy(xpath="//div[contains(text(),'Please check your username ')]")
    WebElement expected ;
    public void TC04B() {
    	String expectedtext=expected.getText();
		String actual="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		Assert.assertEquals(actual, expectedtext);
    }


}