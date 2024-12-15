package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.training.base.BasePage;

public class AccountsPage extends BasePage{
	WebDriverWait wait;
	public AccountsPage(WebDriver driver) {
		super(driver);
		
	}

	
	@FindBy(xpath="//a[text()='Accounts']")
	WebElement accountstab;
	
    public void accountstabclick() {
    waittimelocator(accountstab,By.xpath("//a[text()='Accounts']"));
	accountstab.click();
    }
    
    @FindBy(xpath="//input[@value=' New ']")
	WebElement newaccount;
    public void newaccount() {
	newaccount.click();
    }
    
    @FindBy(id="acc2")
	WebElement accntname;
    public void accountname() {
	accntname.sendKeys("newtest3");
    }
    @FindBy(id="acc6")
	WebElement typebtn;
    public void selecttype() {
	Select type=new Select(typebtn);
	type.selectByValue("Technology Partner");
    }
    @FindBy(id="00Naj000006YS1f")
	WebElement customerpriority;
    public void selectcustomerpriority() {
	Select customerp=new Select(customerpriority);
	customerp.selectByVisibleText("High");
    }
    @FindBy(xpath="//input[@name='save' and @tabindex='34']")
    WebElement savebtn;
    public void savebuttonaccounts() {
	savebtn.click();
    }
   
    @FindBy(linkText="Create New View")
	WebElement newview;
    public void newviewmethod() {
	newview.click();
    }
    @FindBy(id="fname")
	WebElement newviewname;
    public void newviewnamemethod() {
	newviewname.sendKeys("teststage");
    }
    @FindBy(id="devname")
	WebElement uniquename;
    public void UniqueName() {
	uniquename.sendKeys("teststage0");
	uniquename.clear();
	uniquename.sendKeys("teststage0");
    }
    @FindBy(xpath="//input[@class='btn primary' and @data-uidsfdc='3']")
	WebElement savebutn;
    public void NewViewNameSave() {
	savebutn.click();
    }
    
    
    @FindBy(id="fcf")
    WebElement viewnamedropdown;
    public void ViewNameDropDown() {
	viewnamedropdown.click();
	Select viewname=new Select(viewnamedropdown);
	viewname.selectByVisibleText("new flowers");
    }
    
    @FindBy(linkText="Edit")
	WebElement editbtn;
    public void viewnameEdit() {
	editbtn.click();
    }
    
    @FindBy(id="fname")
	WebElement viewnamenew;
    public void NewViewName() {
	viewnamenew.clear();
	viewnamenew.sendKeys("latest flowers");
    }
    
    @FindBy(id="fcol1")
	WebElement field;
    public void FieldName() {
	Select fieldname=new Select(field);
	fieldname.selectByVisibleText("Account Name");
    }
    
    @FindBy(id="fop1")
	WebElement operator;
    public void operatorfield() {
	Select operatorfield=new Select(operator);
	operatorfield.selectByVisibleText("contains");
    }
    @FindBy(id="fval1")
	WebElement valuefieldbtn;
    public void ValueField() {
	valuefieldbtn.sendKeys("a");
    }
    @FindBy(id="colselector_select_0")
	WebElement selectfielddisplay;
    public void FieldDisplay() {
	Select displaybtn=new Select(selectfielddisplay);
	displaybtn.selectByValue("ACCOUNT.LAST_ACTIVITY");
    }
    @FindBy(xpath="//input[@value=' Save ' and @data-uidsfdc='3']")
	WebElement save;
    public void EditViewSave() {
	save.click();
    }
    
    
    @FindBy(xpath="//a[text()='Merge Accounts']")
    WebElement mergeaccountslink;
    public void Mergeaccountslink() {
	mergeaccountslink.click();
    }
    @FindBy(id="srch")
	WebElement findaccounts;
    public void Finddaccountsfield() {
	findaccounts.sendKeys("column");
    }
    @FindBy(xpath="//input[@value='Find Accounts']")
	WebElement findaccountsbtn;
    public void Findaccountsbutton() {
	findaccountsbtn.click();
    }
    @FindBy(xpath="//input[@title='Select row 1']")
	WebElement checkbox1;
    public void checkboxone() {
	checkbox1.click();
    }
    @FindBy(xpath="//input[@title='Select row 0']")
	WebElement checkbox2;
    public void checkboxtwo() {
	checkbox2.click();
    }
    @FindBy(xpath="//*[@id=\"stageForm\"]/div/div[2]/div[5]/div/input[1]")
	WebElement nextbtn;
    public void nextbutton() {
	nextbtn.click();
    }
    @FindBy(xpath="//*[@id=\"stageForm\"]/div/div[2]/div[1]/div/input[2]")
	WebElement merge;
    public void merging() {
	merge.click();
    }
	
	public void alert() {
		driver.switchTo().alert().accept();
	}
	
	@FindBy(linkText="Accounts with last activity > 30 days")
	WebElement lastactivityreportlink;
	public void lastactivityreport() {
	lastactivityreportlink.click();
	}
	@FindBy(xpath="//img[@id='ext-gen152']")
	WebElement startdate;
	public void startdate() {
	startdate.click();
	}
	@FindBy(xpath="(//button[text()='Today'])[1]")
	WebElement todaysdate;
	public void todaysdate() {
		todaysdate.click();	
	}
	@FindBy(id="ext-gen154")
	WebElement enddate;
	public void endDate() {
	enddate.click();
	}
	@FindBy(id="ext-gen292")
	WebElement enddatetoday;
	public void endDateToday() {
	enddatetoday.click();
	}
	@FindBy(id="ext-gen49")
	WebElement datesavebtn;
	public void datesavebutton() {
	datesavebtn.click();
	}
	@FindBy(xpath="//input[@name='reportName']")
	WebElement reportname;
	public void newreportname() {
	reportname.sendKeys("testingreport0100");
	}
	@FindBy(xpath="//input[@name='reportDevName']")
	WebElement uniquereportname;
	public void UniqueReportName() {
	uniquereportname.clear();
	uniquereportname.sendKeys("testingreport00");
	uniquereportname.clear();
	uniquereportname.sendKeys("testingreportnewone");
	}
	//Thread.sleep(5000);
	@FindBy(id="ext-gen312")
	WebElement savenrun;
	public void savinandrun() {
   // waittimeElement(savenrun);
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	savenrun.click();
	}
}
