package com.online.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.online.base.PageBase;

public class Syn_enterprise_Enrollment extends PageBase{

	public Syn_enterprise_Enrollment(WebDriver driver) {
			super(driver);
		}
	
	@FindBy(xpath = "//h1[text()='Enrollment']")
	WebElement EnrollmentHeaderText;
	
	@FindBy(xpath = "//a[contains(text(),'Add Registrant')]")
	WebElement AddRegisterant;
	
	
	public void verify_Enrollment_header_text(){
		iWillWaitToSee(EnrollmentHeaderText);
		isElementVisible(EnrollmentHeaderText);
	}
	
	public void click_Add_Registrant_on_Enrollment_Page(){
		clickElement(AddRegisterant);
	}
	
}

