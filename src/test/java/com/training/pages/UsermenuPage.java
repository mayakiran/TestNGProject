package com.training.pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.training.base.BasePage;
import com.training.utilities.PropertiesReader;

public class UsermenuPage extends BasePage {
	


	public UsermenuPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[@title='My Profile']")
	WebElement myprofilebutton;

	public void myprofilebtn() {
		myprofilebutton.click();
	}

	@FindBy(xpath = "//*[@id=\"chatterTab\"]/div[2]/div[2]/div[1]/h3/div/div/a/img")
	WebElement editprofile;

	public void editprofilebtn() {
		editprofile.click();
	}

	@FindBy(id = "contactInfoContentId")
	WebElement iframe;
	@FindBy(xpath = "//*[@id=\"aboutTab\"]/a")
	WebElement aboutbtn;

	public void abouttab() {
		waittimelocator(iframe,By.id("contactInfoContentId"));
		driver.switchTo().frame(iframe);
		aboutbtn.click();
	}

	@FindBy(id = "lastName")
	WebElement lastnameadded;

	public void lastname(String str) {
		lastnameadded.clear();
		lastnameadded.sendKeys(str);
	}

	@FindBy(xpath = "//input[@value='Save All']")
	WebElement saveall;

	public void saveallbtn() {
		saveall.click();
		driver.switchTo().defaultContent();
	}
	
	
	@FindBy(linkText="My Settings")
	WebElement mysettings;
    public void mysettingsoption() {
	mysettings.click();
    }
    
    @FindBy(xpath="//span[text()='Personal']")
	WebElement personalbtn;
    public void personalbutton() {
	personalbtn.click();
    }
    
    @FindBy(xpath="//span[text()='Login History']")
	WebElement loginhistorybtn;
    @FindBy(partialLinkText="Download login history for last six months")
    WebElement downloadlogin;
    public void loginhistory() {
	loginhistorybtn.click();
	downloadlogin.click();
    }
    
    @FindBy(xpath="//span[text()='Display & Layout']")
	WebElement displaybtn;
    public void dispalybutton() {
	displaybtn.click();
    }
    
    @FindBy(id="CustomizeTabs_font")
	WebElement customtab;
    public void customtabbutton() {
	customtab.click();
    }
    
    @FindBy(xpath="//select[@name='p4']")
	WebElement salesdropdown;
    public void salesdropdownlink() {
	salesdropdown.click();
	Select salesforcedrpdwn=new Select(salesdropdown);
	salesforcedrpdwn.selectByVisibleText("Salesforce Chatter");
    }
    
    @FindBy(id="duel_select_0")
	WebElement availabletabdropdown;
    public void reportstabadd() {
	Select reportstab=new Select(availabletabdropdown);
	reportstab.selectByVisibleText("Reports");
    }
    
    @FindBy(xpath="//img[@class='rightArrowIcon']")
	WebElement addbtn;
    public void addbutton() {
//	wait.until(ExpectedConditions.elementToBeClickable(addbtn));
	addbtn.click();
    }
    @FindBy(xpath="//*[@id=\"bottomButtonRow\"]/input[1]")
	WebElement savebtn1;
    public void customtabsave() {
	savebtn1.click();
    }
    
    @FindBy(xpath="//span[text()='Email']")
    WebElement emailbtn;
    public void emailbutton() {
	emailbtn.click();
    }
	@FindBy(xpath="//span[text()='My Email Settings']")
	WebElement myemail;
	public void myemaillink() {
	myemail.click();
	}
	
	@FindBy(id="sender_name")
	WebElement emailname;
	public void nameemail(String stremail) {
	emailname.clear();
	emailname.sendKeys(stremail);
	}
	
	@FindBy(id="sender_email")
	WebElement senderemail;
	public void sendermailfield(String email) {
	senderemail.clear();
	senderemail.sendKeys(email);
	}
	
	@FindBy(xpath="//input[@type='radio' and @value='1']")
	WebElement radiobtn;
    public void radiobuttonmailfield() {
	radiobtn.click();
    }
    
    @FindBy(xpath="//input[@title='Save']")
    WebElement savebtn;
    public void emailfieldsavebutton() {
	savebtn.click();
    }
    
    @FindBy(xpath="//span[text()='Calendar & Reminders']")
    WebElement calendarbtn;
    public void calendarsection() {
	calendarbtn.click();
    }
    
    @FindBy(xpath="//span[text()='Activity Reminders']")
	WebElement activityremainder;
    public void remainder() {
	activityremainder.click();
    }
    
    @FindBy(xpath="//input[@title='Open a Test Reminder']")
	WebElement testremainder;
    public void testremainders() {
	testremainder.click();
    }
    
    @FindBy(linkText="Developer Console")
	WebElement developerconsole;
    public void usermenudeveloperconsole() {
	developerconsole.click();
    }
    public void windowhandlingdriverconsole() {
    	String parentwindow=driver.getWindowHandle();
	
	for (String windowhandle :driver.getWindowHandles()) {
		driver.switchTo().window(windowhandle);
	}
	driver.close();
	driver.switchTo().window(parentwindow);
    }
 
    @FindBy(linkText="Logout")
	WebElement logoutbtn;
    public void logout() {
	logoutbtn.click();
    }
    
    
  
     @FindBy(xpath="//div[@id='userNav-menuItems']//a[contains(@class,'menuButtonMenuLink' )]")
	 List<WebElement>actualElementList;
    public void validateTC05() {
    	List<String>expectedlist=new ArrayList<String>(Arrays.asList("My Profile","My Settings","Developer Console","Switch to Lightning Experience","Logout"));
    	List<String>actualList=new ArrayList<String>();
    	for (WebElement element :actualElementList) {
    		actualList.add(element.getText());
    	}
    	Assert.assertEquals(actualList, expectedlist, "usermenu dropdown is not displayed correctly");	
    }
}
