package com.online.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.online.base.PageBase;

public class enterprise_Create_New_Auditor extends PageBase {
	public static String Auditor_password;

	public enterprise_Create_New_Auditor(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath = "//h1[contains(text(),'Create New Auditor')]")
	WebElement CreateNewAuditorHeader;
  
  @FindBy(id = "auditor_registration_first_name")
		WebElement NewAuditor_FirstName;

  @FindBy(id = "auditor_registration_last_name")
	WebElement NewAuditor_LastName;
 
  @FindBy(id = "auditor_registration_email")
	WebElement NewAuditor_email;
	
  @FindBy(id = "auditor_registration_password")
	WebElement NewAuditor_password;
  
  @FindBy(id = "auditor_registration_password_confirmation")
	WebElement NewAuditor_password_confirmation;
  
  @FindBy(id = "auditor_registration_organization_id_chosen")
		WebElement NewAuditor_Organization_Select_One;
  
  @FindBy(xpath = "//*[@id='auditor_registration_organization_id_chosen']/div/div[@class='chosen-search']/input")
	WebElement NewAuditor_Organization_Box;

  @FindBy(id = "auditor_registration_course_id_chosen")
	WebElement NewAuditor_Program_Select_One;

  @FindBy(xpath = "//*[@id='auditor_registration_course_id_chosen']/div/div[@class='chosen-search']/input")
    WebElement NewAuditor_Program_Box;

  
  @FindBy(id = "Auditor_registration_student_status_chosen")
	WebElement NewAuditor_StudentStatus_Select_One;

@FindBy(xpath = "//*[@id='Auditor_registration_student_status_chosen']/div/div[@class='chosen-search']/input")
    WebElement NewAuditor_AuditorStatus_Box;

@FindBy(id = "auditor_registration_section_id_chosen")
		WebElement NewAuditor_AuditorSection_Select_One;

  @FindBy(xpath = "//*[@id='auditor_registration_section_id_chosen']/div/div[@class='chosen-search']/input")
	    WebElement NewAuditor_AuditorSection_Box;
  
  @FindBy(id = "auditor_registration_team_id_chosen")
		WebElement NewAuditor_AuditorTeam_Select_One;

    @FindBy(xpath = "//*[@id='auditor_registration_team_id_chosen']/div/div[@class='chosen-search']/input")
	    WebElement NewAuditor_AuditorTeam_Box;
    
  @FindBy(xpath = "li.active-result.highlighted")
	WebElement NewAuditor_Organization_Select;
  
  @FindBy(id = "auditor_registration_ignore_time_gating")
	WebElement Ignore_Time_Gating;
  
  @FindBy(id = "student_registration_test_user")
	WebElement QA_User_Checkbox;
  
  @FindBy(id = "student_registration_alumni_offering")
	WebElement Impact_Accelerator_Checkbox;
  
  @FindBy(css = "ul.select2-selection__rendered>li>input")
		WebElement Student_Tags;
  
  @FindBy(id = "auditor_registration_send_registration_email")
	WebElement Send_Registration_Email;
  
  @FindBy(id = "auditor_registration_submit_action")
	WebElement Create_Auditor_Submit;
  
  @FindBy(xpath = "//*[@id=\"flash_header\"]/div[contains(text(),'Auditor added successfully')]")
		WebElement AuditorSuccessfullValidationMessage;
	
  public void verify_Create_New_Auditor_Header_Text(){
	iWillWaitToSee(CreateNewAuditorHeader);
	isElementVisible(CreateNewAuditorHeader);
}

  public void enter_first_name(String firstName){
	  firstName=createRandomName(firstName);
	  iFillInText(NewAuditor_FirstName,firstName);  
  }
  
  public void enter_last_name(String lastname){
	  lastname=createRandomName(lastname);
	  iFillInText(NewAuditor_LastName,lastname);  
  }
  
  public void enter_email_address(String email){
	  email=createRandomEmail(email+"+");
	  iFillInText(NewAuditor_email,email); 
  }
  public void enter_password(String password){
	  longDelay();
//	  Student_password=createRandomName("A");
//	  System.out.println("@@Password"+Student_password);
	  iFillInText(NewAuditor_password,password); 
  }
  
  public void enter_password_confirmation(String passwordconfirmation){
	  longDelay();
	//  System.out.println("@@Confirm Password"+Student_password);
	  iFillInText(NewAuditor_password_confirmation,passwordconfirmation); 
  }
  
  public void select_organization(String organization){
	  Select_dropdown_text(NewAuditor_Organization_Select_One,NewAuditor_Organization_Box,organization);
  }
  
  public void select_program(String program){
	  Select_dropdown_text(NewAuditor_Program_Select_One,NewAuditor_Program_Box,program);  
  }
  
  public void select_auditor_status(String auditor_status){
	  Select_dropdown_text(NewAuditor_StudentStatus_Select_One,NewAuditor_AuditorStatus_Box,auditor_status);  
  }
  
  public void select_auditor_section(String auditor_section){
	  Select_dropdown_text_Scroll_to_View(NewAuditor_AuditorSection_Select_One,NewAuditor_AuditorSection_Box,auditor_section);  
  }
  
  public void select_auditor_Team(String auditor_team){
	  Select_dropdown_text(NewAuditor_AuditorTeam_Select_One,NewAuditor_AuditorTeam_Box,auditor_team);  
  }
  
  public void click_QA_User_checkbox(){
	  clickElement(QA_User_Checkbox);
	  wait(1);
  }
  
  public void click_Impact_Accelerator_checkbox(){
	  clickElement(Impact_Accelerator_Checkbox);
	  wait(1);
  }
  
  public void select_tags(String tags){
	  iFillInText(Student_Tags,tags);
	  wait(2);
	  clickElement(driver.findElement(By.cssSelector("li.select2-results__option--highlighted")));
	  wait(1);
  }
  
  public void click_on_create_auditor(){
	  clickElement(Create_Auditor_Submit);
	  wait(4);
  }
  
  public void verify_Auditor_Successful_ValidationMessage() {
	  iWillWaitToSee(AuditorSuccessfullValidationMessage);
	  isElementVisible(AuditorSuccessfullValidationMessage);
  }
  

	
	
}
