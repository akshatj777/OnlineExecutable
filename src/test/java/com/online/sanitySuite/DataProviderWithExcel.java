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
		 	int size = Thread.currentThread().getStackTrace().length;
		 	System.out.println("size -"+size);
		 	String methodName = Thread.currentThread().getStackTrace()[size-29].getMethodName().toLowerCase(); 
		 	System.out.println("##Test Name :: "+methodName);
		  	// From above method we get long test case name including package and class name etc.
	 
		  	// The below method will refine your test case name, exactly the name use have used
	 
		  	sTestCaseName = ExcelUtils.getTestCaseName(this.toString());
	 
		    // Fetching the Test Case row number from the Test Data Sheet
	 
		    // Getting the Test Case name to get the TestCase row from the Test Data Excel sheet
	 
		 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	 
		    Object[][] testObjArray = ExcelUtils.getTableArray(Path,"Sheet1",iTestCaseRow);

		    System.out.println("%%"+testObjArray);
		    	return (testObjArray);
	 
			}

}
