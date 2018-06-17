package com.online.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.online.base.PageBase;

public class Syn_enterprise_People extends PageBase {

	public Syn_enterprise_People(WebDriver driver) {
		super(driver);
	}
	
	  @FindBy(xpath = "//h1[contains(text(),'People')]")
		WebElement PeopleheaderText;
	  
	  @FindBy(css = "span.icon-add-student")
			WebElement AddStudentIcon;

	  public void verify_People_header_text(){
		  iWillWaitToSee(PeopleheaderText);
		  isElementVisible(PeopleheaderText);
	  }
	  
	  public void click_Add_Student(){
		  iWillWaitToSee(AddStudentIcon);
		  clickElement(AddStudentIcon);
	  }
	  
}

