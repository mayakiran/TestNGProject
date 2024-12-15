package com.training.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.pages.LoginPage;
import com.training.pages.UsermenuPage;


public class UsermenuTestcase extends BaseTest {
	WebDriver driver;
	UsermenuPage usermenupage;
	LoginPage loginpage;
	

	@BeforeMethod
	public void beforemethod() {
		driver=getdriver();
		loginpage=new LoginPage(driver);
		usermenupage=new UsermenuPage(driver);
	}
	@Test
	public void TC05usermenudropdown() {
	
		loginpage.entermainusername();
		loginpage.entermainpassword();
		loginpage.loginclick();
		loginpage.usermenudropdown();
		usermenupage.validateTC05();
	}
	@Test
	public void  TC06myprofileoption(){
		loginpage.entermainusername();
		loginpage.entermainpassword();
		loginpage.loginclick();
		loginpage.usermenudropdown();
		usermenupage.myprofilebtn();
		usermenupage.editprofilebtn();
		usermenupage.abouttab();
		usermenupage.lastname("kiran");
		usermenupage.saveallbtn();	
	}
	@Test
	public void TC07mysettingsoption() {
	     loginpage.entermainusername();
	     loginpage.entermainpassword();
	     loginpage.loginclick();
		loginpage.usermenudropdown();
		usermenupage.mysettingsoption();
		usermenupage.personalbutton();
		usermenupage.loginhistory();

		usermenupage.dispalybutton();
		usermenupage.customtabbutton();
		usermenupage.salesdropdownlink();
		usermenupage.reportstabadd();
		usermenupage.addbutton();
		usermenupage.customtabsave();

		usermenupage.emailbutton();
		usermenupage.myemaillink();
		usermenupage.nameemail("maya rem");
		usermenupage.sendermailfield("maya.remcy@gmail.com");
		usermenupage.radiobuttonmailfield();
		usermenupage.emailfieldsavebutton();

		usermenupage.calendarsection();
		usermenupage.remainder();
		usermenupage.testremainders();
	}

	@Test
	public void TC08displayconsole() {
		loginpage.entermainusername();
		loginpage.entermainpassword();
		loginpage.loginclick();
		loginpage.usermenudropdown();
		usermenupage.usermenudeveloperconsole();

	}

	@Test
	public void TC09logout() {

        loginpage.entermainusername();
        loginpage.entermainpassword();
        loginpage.loginclick();
		loginpage.usermenudropdown();
		usermenupage.logout();
	}

	@AfterMethod
	public void teardown() {
		closebrowser();
	}

}


