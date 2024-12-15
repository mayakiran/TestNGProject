package com.training.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.pages.AccountsPage;
import com.training.pages.LoginPage;



public class accountsTest extends BaseTest{
	WebDriver driver;
	AccountsPage accountspage;
	LoginPage loginpage;
	
	@BeforeMethod
	public void beforemethod() {
		driver=getdriver();
		accountspage=new AccountsPage(driver);
		loginpage=new LoginPage(driver);	
	}
	
	@Test
	public void TC010CreateAccount() {
		loginpage.entermainusername();
		loginpage.entermainpassword();
		loginpage.loginclick();
		accountspage.accountstabclick();
		accountspage.newaccount();
		accountspage.accountname();
		accountspage.selecttype();
		accountspage.selectcustomerpriority();
		accountspage.savebuttonaccounts();
		
	}
	
	@Test
	public void TC011CreateNewView() {
		loginpage.entermainusername();
		loginpage.entermainpassword();
		loginpage.loginclick();
		accountspage.accountstabclick();
		accountspage.newviewmethod();
		accountspage.newviewnamemethod();
		accountspage.UniqueName();
		accountspage.NewViewNameSave();
	}
	
	@Test
	public void TC012EditView() {
		loginpage.entermainusername();
		loginpage.entermainpassword();
		loginpage.loginclick();
		accountspage.accountstabclick();
		accountspage.ViewNameDropDown();
		accountspage.viewnameEdit();
		accountspage.NewViewName();
		accountspage.FieldName();
		accountspage.operatorfield();
		accountspage.ValueField();
		accountspage.FieldDisplay();
		accountspage.EditViewSave();
	}
	
	@Test
	public void TC013MergeAccounts() {
		loginpage.entermainusername();
		loginpage.entermainpassword();
		loginpage.loginclick();
		accountspage.accountstabclick();
		accountspage.Mergeaccountslink();
		accountspage.Finddaccountsfield();
		accountspage.Findaccountsbutton();
		accountspage.checkboxone();
		accountspage.checkboxtwo();
		accountspage.nextbutton();
		accountspage.merging();
		accountspage.alert();
	}
	
	@Test
	public void TC014CreateAccountreport() {
		loginpage.entermainusername();
		loginpage.entermainpassword();
		loginpage.loginclick();
		accountspage.accountstabclick();
		accountspage.lastactivityreport();
		accountspage.startdate();
		accountspage.todaysdate();
		accountspage.endDate();
		accountspage.endDateToday();
		accountspage.datesavebutton();
		accountspage.newreportname();
		accountspage.UniqueReportName();
		accountspage.savinandrun();
	}
	@AfterMethod
	public void teardown() {
		closebrowser();
	}


}
