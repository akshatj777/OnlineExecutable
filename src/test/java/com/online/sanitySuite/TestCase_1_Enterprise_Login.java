package com.online.sanitySuite;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.online.base.ExcelUtils;
import com.online.base.TestBase;
import com.online.pages.Syn_enterprise_Create_New_Student;
import com.online.pages.Syn_enterprise_People;
import com.online.pages.Syn_enterprise_Sidebar;
import com.online.pages.Syn_enterprise_login;




public class TestCase_1_Enterprise_Login extends TestBase{

	Syn_enterprise_login obj_enterprise_login;
	Syn_enterprise_Sidebar obj_enterprise_sidebar;
	Syn_enterprise_People obj_enterprise_people;
	Syn_enterprise_Create_New_Student obj_create_new_student;
	@Test (priority=1, description = "Open Google Search URL")	
	public void open_url() {

		log.info("Open Google Search URL.");
		driver.get(data.getProperty("base.url"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		obj_enterprise_login = new Syn_enterprise_login(driver);
		
		}

		@Test (priority=2, description = "Enter email adress on EP Portal")	
	public void enter_email_adress_on_enterprise_portal() {
        log.info("Enter email address on EP login page");
        System.out.println("Value is"+data.getProperty("TestCase_1.enterEmailString_1"));
        obj_enterprise_login.enter_emailaddress(data.getProperty("TestCase_1.enterEmailString_1"));

	}
	
	@Test (priority=3, description = "Enter password on EP Portal")	
	public void enter_password_on_enterprise_portal() {
        log.info("Enter Password on EP login page");
        obj_enterprise_login.enter_Password_EP_Portal(data.getProperty("TestCase_1.enterPasswordString_1"));

	}
	
	@Test (priority=4, description = "Click  on EP Portal")	
	public void click_on_login_on_enterprise_portal() {
        log.info("Click On Sign In EP login page");
        obj_enterprise_login.click_on_login_EP_Portal();
        
    }
	
	@Test (priority=5, description = "Verify Executable Logo on side menu")	
	public void verify_executable_log_visibility_on_side_menu() {
		obj_enterprise_sidebar=new Syn_enterprise_Sidebar(driver);
		obj_enterprise_sidebar.verify_executable_logo_visible();
		
    }

	@Parameters({ "EPSideMenuPeople" })
	@Test (priority=6, description = "Click  on People text on side menu")	
	public void verify_executable_log_visibility_on_side_menu(String EPSideMenuPeople) {
		obj_enterprise_sidebar.click_text_on_side_menu(EPSideMenuPeople);
    }
	
	@Test (priority=7, description = "Verify People header text on People page")	
	public void verify_people_text_on_people_page() {
		obj_enterprise_people=new Syn_enterprise_People(driver);
		obj_enterprise_people.verify_People_header_text();
    }
	
	@Test (priority=8, description = "Click on Add Student button on People page")	
	public void Click_on_Add_Student_button_on_people_page() {
		obj_enterprise_people.click_Add_Student();
    }
	
	
	@Test (priority=9, description = "Verify Create New Student header text on Create Student Page")	
	public void Verify_Create_New_Student_header_text_on_Create_Student_Page() {
		obj_create_new_student=new Syn_enterprise_Create_New_Student(driver);
		obj_create_new_student.verify_Create_New_Student_Header_Text();
    }
	
	@Test (priority=9,dataProvider="Authentication",dataProviderClass = DataProviderWithExcel.class,description = "Fill all the fields on Add Student Form  and submit it on Create Student Page")	
	public void Submit_Create_Student_Form(String FName,String LName,String Email,
			String Password,String ConfirmPassword,String Organization,String RegProgram,
			String Status,String Section,String Team,String Tags) {
		obj_create_new_student=new Syn_enterprise_Create_New_Student(driver);
		
		
		obj_create_new_student.enter_first_name(FName);
		obj_create_new_student.enter_last_name(LName);
		obj_create_new_student.enter_email_address(Email);
		obj_create_new_student.enter_password(Password);
		obj_create_new_student.enter_password_confirmation(ConfirmPassword);
		obj_create_new_student.select_organization(Organization);
		obj_create_new_student.select_program(RegProgram);
		obj_create_new_student.select_student_status(Status);
		obj_create_new_student.select_student_section(Section);
		obj_create_new_student.select_student_Team(Team);
		obj_create_new_student.click_QA_User_checkbox();
		obj_create_new_student.click_Impact_Accelerator_checkbox();
		obj_create_new_student.select_tags(Tags);
		obj_create_new_student.click_on_create_student();
	}
	
	
	@DataProvider
	public Object[][] getTestData()
	{
	    List<HashMap<String, String>> arrayMapList = new ArrayList<HashMap<String, String>>();
	    HashMap<String, String> hashMapItems = new HashMap<String, String>();

	    //use a loop to fill in all the parameter name and value pairs
	    hashMapItems.put("CreateStudentFirstName", "RandomFirstName");
	    hashMapItems.put("CreateStudentLastName", "RandomLastName");
	    hashMapItems.put("CreateStudentEmail", "RandomEmail");
	    hashMapItems.put("CreateStudentPassword", "RandomPassword");
	    hashMapItems.put("CreateStudentConfirmPassword", "RandomPassword");
	    hashMapItems.put("CreateStudentOrganization", "QA - org");
	    hashMapItems.put("CreateStudentRegisterProgram", "209");
	    hashMapItems.put("CreateStudentRegisterStudentStatus", "Potential");
	    hashMapItems.put("CreateStudentRegisterStudentSection", "Section QA");
	    hashMapItems.put("CreateStudentRegisterStudentTeam", "Team QA");
	    hashMapItems.put("CreateStudentTags", "Written Feedback");
	    
	    //--------------More put statements here------
	    //finally add hash map to the list
	    arrayMapList.add(hashMapItems);

	    //Iterate the array list and store each HashMap object in an object array. First dimension is the iterator value.
	    Object [][] hashMapObj = new Object [arrayMapList.size()][1];

//	    for(int i=0; i<arrayMapList.size() ; i++) {
//	        hashMapObj[i][0] = searchStrings.get(i);
//	    }
//
	    return hashMapObj;
}
}