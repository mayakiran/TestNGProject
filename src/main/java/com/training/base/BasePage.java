package com.training.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.training.utilities.PropertiesReader;

public class BasePage {
	public static WebDriver driver;
	PropertiesReader properties;
	
	public BasePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void waittimeElement(WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	public void waittimevisibility(WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	

	public void waittimelocator(WebElement element, By locator) {
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	
	
	
	}

