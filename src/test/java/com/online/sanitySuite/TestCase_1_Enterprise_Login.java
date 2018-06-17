package com.online.sanitySuite;

import org.testng.annotations.Test;

import com.online.base.TestBase;
import com.online.pages.Syn_google_search;



public class TestCase_1_GoogleSearch extends TestBase{

	Syn_google_search obj_google_search;


	@Test (priority=1, description = "Open Google Search URL")	
	public void open_url() {

		log.info("Open Google Search URL.");
		driver.get(data.getProperty("base.url"));

//		log.info("Get input string from properties file and put it into the search box.");
//		obj_google_search = new Syn_google_search (driver);
//		obj_google_search.search_by_first_option(data.getProperty("TestCase_1.searchString_1"));
//		
//		log.info("Assert actual searched string with expected string from properties file.");
//		assertStrings(obj_google_search.get_first_option(),data.getProperty("TestCase_1.assertString_1"));

		//	  Assert.assertTrue(obj_google_search.get_first_option().equals(getPropertyValue("TestCase_1.assertString_1")));

	}

	@Test (priority=2, description = "Enter email adress on EP Portal")	
	public void enter_email_adress_on_enterprise_portal() {
        log.info("Enter email address on EP login page");
        System.out.println("Value is"+data.getProperty("TestCase_1.enterEmailString_1"));
		obj_google_search.enter_emailaddress(data.getProperty("TestCase_1.enterEmailString_1"));

	}
	
	@Test (priority=3, description = "Enter password on EP Portal")	
	public void enter_password_on_enterprise_portal() {
        log.info("Enter Password on EP login page");
		obj_google_search.enter_Password_EP_Portal(data.getProperty("TestCase_1.enterPasswordString_1"));

	}
	
	@Test (priority=4, description = "Click  on EP Portal")	
	public void click_on_login_on_enterprise_portal() {
        log.info("Click On Sign In EP login page");
		obj_google_search.click_on_login_EP_Portal();

	}
	
	
	
	

}
