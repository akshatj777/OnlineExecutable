package com.online.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.online.base.PageBase;

public class Syn_enterprise_Create_New_Student extends PageBase {

	public static String Student_password;
	public Syn_enterprise_Create_New_Student(WebDriver driver) {
		super(driver);
	}
	
	
	
	  @FindBy(xpath = "//h1[contains(text(),'Create New Student')]")
		WebElement CreateNewStudentHeader;
	  
	  @FindBy(id = "student_registration_first_name")
			WebElement NewStudent_FirstName;
	
	  @FindBy(id = "student_registration_last_name")
		WebElement NewStudent_LastName;
	 
	  @FindBy(id = "student_registration_email")
		WebElement NewStudent_email;
		
	  @FindBy(id = "student_registration_password")
		WebElement NewStudent_password;
	  
	  @FindBy(id = "student_registration_password_confirmation")
		WebElement NewStudent_password_confirmation;
	  
	  @FindBy(id = "student_registration_organization_id_chosen")
			WebElement NewStudent_Organizarion_Select_One;
	  
	  @FindBy(xpath = "//*[@id='student_registration_organization_id_chosen']/div/div[@class='chosen-search']/input")
		WebElement NewStudent_Organization_Box;
	
	  @FindBy(id = "student_registration_course_id_chosen")
		WebElement NewStudent_Program_Select_One;

      @FindBy(xpath = "//*[@id='student_registration_course_id_chosen']/div/div[@class='chosen-search']/input")
	    WebElement NewStudent_Program_Box;

      
      @FindBy(id = "student_registration_student_status_chosen")
		WebElement NewStudent_StudentStatus_Select_One;

    @FindBy(xpath = "//*[@id='student_registration_student_status_chosen']/div/div[@class='chosen-search']/input")
	    WebElement NewStudent_StudentStatus_Box;

    @FindBy(id = "student_registration_section_id_chosen")
  		WebElement NewStudent_StudentSection_Select_One;

      @FindBy(xpath = "//*[@id='student_registration_section_id_chosen']/div/div[@class='chosen-search']/input")
  	    WebElement NewStudent_StudentSection_Box;
      
      @FindBy(id = "student_registration_team_id_chosen")
    		WebElement NewStudent_StudentTeam_Select_One;

        @FindBy(xpath = "//*[@id='student_registration_team_id_chosen']/div/div[@class='chosen-search']/input")
    	    WebElement NewStudent_StudentTeam_Box;
        
	  @FindBy(xpath = "li.active-result.highlighted")
		WebElement NewStudent_Organization_Select;
	  
	  @FindBy(id = "student_registration_test_user")
		WebElement QA_User_Checkbox;
	  
	  @FindBy(id = "student_registration_alumni_offering")
		WebElement Impact_Accelerator_Checkbox;
	  
	  @FindBy(css = "ul.select2-selection__rendered>li>input")
			WebElement Student_Tags;
	  
	  @FindBy(id = "student_registration_submit_action")
		WebElement Create_Student_Submit;
		
	  public void verify_Create_New_Student_Header_Text(){
		iWillWaitToSee(CreateNewStudentHeader);
		isElementVisible(CreateNewStudentHeader);
	}
	
	  public void enter_first_name(String firstName){
		  firstName=createRandomName(firstName);
		  iFillInText(NewStudent_FirstName,firstName);  
	  }
	  
	  public void enter_last_name(String lastname){
		  lastname=createRandomName(lastname);
		  iFillInText(NewStudent_LastName,lastname);  
	  }
	  
	  public void enter_email_address(String email){
		  email=createRandomEmail(email);
		  iFillInText(NewStudent_email,email); 
	  }
	  
	  public void enter_password(String password){
		  longDelay();
//		  Student_password=createRandomName("A");
//		  System.out.println("@@Password"+Student_password);
		  iFillInText(NewStudent_password,password); 
	  }
	  
	  public void enter_password_confirmation(String passwordconfirmation){
		  longDelay();
		//  System.out.println("@@Confirm Password"+Student_password);
		  iFillInText(NewStudent_password_confirmation,passwordconfirmation); 
	  }
	  
	  public void select_organization(String organization){
		  Select_dropdown_text(NewStudent_Organizarion_Select_One,NewStudent_Organization_Box,organization);
	  }
	  
	  public void select_program(String program){
		  Select_dropdown_text(NewStudent_Program_Select_One,NewStudent_Program_Box,program);  
	  }
	  
	  public void select_student_status(String student_status){
		  Select_dropdown_text(NewStudent_StudentStatus_Select_One,NewStudent_StudentStatus_Box,student_status);  
	  }
	  
	  public void select_student_section(String student_section){
		  Select_dropdown_text_Scroll_to_View(NewStudent_StudentSection_Select_One,NewStudent_StudentSection_Box,student_section);  
	  }
	  
	  public void select_student_Team(String student_team){
		  Select_dropdown_text(NewStudent_StudentTeam_Select_One,NewStudent_StudentTeam_Box,student_team);  
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
	  
	  public void click_on_create_student(){
		  clickElement(Create_Student_Submit);
		  wait(4);
	  }
	  
	  
}
