package com.online.sanitySuite;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.online.base.TestBase;
import com.online.pages.Syn_enterprise_Sidebar;

public class TestCase_1_Enterprise_side_menu {
	WebDriver driver;
	Syn_enterprise_Sidebar obj_enterprise_sidebar;

	TestCase_1_Enterprise_side_menu(){
		this.driver=TestCase_1_Enterprise_Login.driver;
	}
	
	@Test (priority=5, description = "Verify Executable Logo")	
	public void verify_executable_log_visibility_on_side_menu() {
		obj_enterprise_sidebar=new Syn_enterprise_Sidebar(driver);
		obj_enterprise_sidebar.verify_executable_logo_visible();
		
    }
	
	@Parameters({ "EPSideMenuPeople" })
	@Test (priority=6, description = "Click  on People text")	
	public void verify_executable_log_visibility_on_side_menu(String EPSideMenuPeople) {
		obj_enterprise_sidebar.click_text_on_side_menu(EPSideMenuPeople);
    }
}
