package com.online.sanitySuite;

import java.io.File;
import java.lang.reflect.Method;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;

import com.online.base.ExcelUtils;

public class DataProviderWithExcel {

	public String sTestCaseName;
	 
	public int iTestCaseRow;
	
	ITestContext testContext;
	Method method;
	 @DataProvider
	 
	  public Object[][] Authentication() throws Exception{
	 
		    // Setting up the Test Data Excel file
	 
		    String Path=System.getProperty("user.dir")+ File.separator+"GlobalDatafiles"+ File.separator+"TestData.xlsx";
		 	ExcelUtils.setExcelFile(Path,"Sheet1");
	 
		 	sTestCaseName = this.toString();
 
		 	
		  	// From above method we get long test case name including package and class name etc.
	 
		  	// The below method will refine your test case name, exactly the name use have used
	 
		  	sTestCaseName = ExcelUtils.getTestCaseName(this.toString());
		  	System.out.println("sTestCaseName"+sTestCaseName);
	 
		    // Fetching the Test Case row number from the Test Data Sheet
	 
		    // Getting the Test Case name to get the TestCase row from the Test Data Excel sheet
	 
		 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	 
		    Object[][] testObjArray = ExcelUtils.getTableArray(Path,"Sheet1",11,iTestCaseRow);

		    System.out.println("%%"+testObjArray);
		    	return (testObjArray);
	 
			}

	 @DataProvider
	 
	  public Object[][] Add_A_Registrant() throws Exception{
	 
		    // Setting up the Test Data Excel file
	 
		    String Path=System.getProperty("user.dir")+ File.separator+"GlobalDatafiles"+ File.separator+"TestData.xlsx";
		 	ExcelUtils.setExcelFile(Path,"Add A Registrant");
	 
		 	sTestCaseName = this.toString();

		 	
		  	// From above method we get long test case name including package and class name etc.
	 
		  	// The below method will refine your test case name, exactly the name use have used
	 
		  	sTestCaseName = ExcelUtils.getTestCaseName(this.toString());
		  	System.out.println("sTestCaseName"+sTestCaseName);
	 
		    // Fetching the Test Case row number from the Test Data Sheet
	 
		    // Getting the Test Case name to get the TestCase row from the Test Data Excel sheet
	 
		 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	 
		    Object[][] testObjArray = ExcelUtils.getTableArray(Path,"Add A Registrant",5,iTestCaseRow);

		    System.out.println("%%"+testObjArray);
		    	return (testObjArray);
	 
			}
}
