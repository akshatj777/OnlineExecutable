package com.online.pages;

/*******************************************************************************************
 * Page Factory class Template
 * @author Shirish Kawatkar
 *******************************************************************************************/

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.online.base.PageBase;


public class Syn_enterprise_login extends PageBase {

	public Syn_enterprise_login(WebDriver driver) {
		super(driver);
	}

	/*******************************************************************************************
	 * All WebElements are identified by @FindBy annotation
	 *******************************************************************************************/

	
	// Web Element for Google Search Box
    @FindBy(name = "q")
	WebElement searchBox;
    
 // Web Element for email
    @FindBy(id = "email")
   	WebElement emailaddress;
    
 // Web Element for email
    @FindBy(id = "password")
   	WebElement EPpassword;
    
 // Web Element for email
    @FindBy(xpath = "//input[@value='Sign in']")
   	WebElement EPSignIn;
    
	// Web Element for Google Search first option
	@FindBy(xpath = "//*[@id='sbse0']/div[2]")
	WebElement searchFirstOption;

	/*******************************************************************************************
	 * All Methods for performing actions
	 * @return 
	 *******************************************************************************************/

	 public void enter_emailaddress(String enterpriseemal){
	    	PageBase.wait(2);
			log.info("Enter text for email address: "+enterpriseemal);
			iWillWaitToSee(emailaddress);
			iFillInText(emailaddress,enterpriseemal);
			
		}
		
	    public void enter_Password_EP_Portal(String Enterprisepassword){
			log.info("Enter text for Password: "+Enterprisepassword);
	  		iFillInText(EPpassword,Enterprisepassword);
	  		
	  	}
	    
	    public void click_on_login_EP_Portal(){
			log.info("Click on Sign In on EP Portal:");
			clickElement(EPSignIn);
	  		
	  	}
		
	 
	}
