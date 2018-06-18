package com.online.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.online.base.PageBase;

public class Syn_enterprise_Add_Registrant extends PageBase {

	public Syn_enterprise_Add_Registrant(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//h4[text()='Add a Registrant']")
	WebElement Add_A_Registrant_Pop_Up;
	
	@FindBy(xpath = "//input[@name='firstName']")
	WebElement Add_A_Registrant_First_Name;
	
	@FindBy(xpath = "//input[@name='lastName']")
	WebElement Add_A_Registrant_Last_Name;
	
	@FindBy(xpath = "//input[@name='email']")
	WebElement Add_A_Registrant_Email;
	
	@FindBy(xpath = "//div[@class='form-group'] //span[@class='EXOInputLabel__text___3KO2u' and contains(text(),'Program') and not(contains(text(),'Next Program'))]/../following-sibling::div")
	WebElement Add_A_Registrant_Program_Select_One;
	
	@FindBy(xpath = "//div[@class='form-group'] //span[@class='EXOInputLabel__text___3KO2u' and contains(text(),'Next Program')]/../following-sibling::div")
	WebElement Add_A_Registrant_NextProgram_Select_One;
	
	@FindBy(xpath = "//div[contains(text(),'QA Program')]")
		WebElement AddRegisternt_Program_Select;
	
	@FindBy(xpath = "//div[contains(text(),'ExecOnline')]")
	WebElement AddRegisternt_ConfirmProgram_Select;
	
	@FindBy(xpath="//input[@value='Save Registrant']")
	    WebElement Save_registrant;
	 
	public void verify_Add_a_registrant_pop_up(){
		iWillWaitToSee(Add_A_Registrant_Pop_Up);
		isElementVisible(Add_A_Registrant_Pop_Up);
	}
	  public void enter_first_name(String firstName){
		  firstName=createRandomName(firstName);
		  iFillInText(Add_A_Registrant_First_Name,firstName);  
	  }
	  
	  public void enter_last_name(String lastname){
		  lastname=createRandomName(lastname);
		  iFillInText(Add_A_Registrant_Last_Name,lastname);  
	  }
	  
	  public void enter_email_address(String email){
		  email=createRandomEmail(email+"+");
		  iFillInText(Add_A_Registrant_Email,email); 
	  }
	  
	  public void select_program(String program){
		  clickElement(Add_A_Registrant_Program_Select_One);
		  wait(1);
		  iFillInText(driver.findElement(By.xpath("//div[@class='form-group'] //span[@class='EXOInputLabel__text___3KO2u' and contains(text(),'Program') and not(contains(text(),'Next Program'))]/../following-sibling::div/div/span/div/following-sibling::div/input")),program);
		  delay();
		  clickElement(AddRegisternt_Program_Select);
	  }
	  
	  public void select_confirm_program(String confirm_program){
		  longDelay();
		  clickElement(Add_A_Registrant_NextProgram_Select_One);
		  wait(1);
		  iFillInText(driver.findElement(By.xpath("//div[@class='form-group'] //span[@class='EXOInputLabel__text___3KO2u' and contains(text(),'Next Program')]/../following-sibling::div//div/span/div/following-sibling::div/input")),confirm_program);
		  delay();
		  clickElement(AddRegisternt_ConfirmProgram_Select);
		  wait(1);
	  }
	  
	  public void click_on_save_registrant(){
		  iWillWaitToSee(Save_registrant);
		  clickElement(Save_registrant);
		  longDelay();
	  }
	  
	  
	  
}
