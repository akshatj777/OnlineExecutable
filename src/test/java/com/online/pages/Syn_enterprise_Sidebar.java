package com.online.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.online.base.PageBase;

public class Syn_enterprise_Sidebar extends PageBase {

	public Syn_enterprise_Sidebar(WebDriver driver) {
		super(driver);
	}

	
	WebElement SideMenuelement;
	WebElement SideMenuSubOptionElement;
	// Web Element for Google Search Box
    @FindBy(xpath = "//img[@alt='Logo simple']")
	WebElement OnlineExecutableLogo;
    @FindBy(xpath = "//span[@class='word' and text()='$text']")
   	WebElement SideMenuButton;
    @FindBy(xpath = "//a[text()='$text']")
	WebElement SideMenuSubOptionButton;

   

	/*******************************************************************************************
	 * All Methods for performing actions
	 * @return 
	 *******************************************************************************************/

	
    public void verify_executable_logo_visible(){
    	PageBase.wait(2);
    	iWillWaitToSee(OnlineExecutableLogo);
    	isElementVisible(OnlineExecutableLogo);
	}
    
    public void click_text_on_side_menu(String text){
       SideMenuelement=driver.findElement(By.xpath("//span[@class='word' and text()='"+text+"']"));
       iWillWaitToSee(SideMenuelement);
       clickElement(SideMenuelement);	
    }
    
    public void click_sub_option_text_on_side_menu(String text){
    	SideMenuSubOptionElement=driver.findElement(By.xpath("//a[text()='"+text+"']"));
        iWillWaitToSee(SideMenuSubOptionElement);
        clickElement(SideMenuSubOptionElement);	
     }
    }
