package com.kishore;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qshore.Methods;
import com.qshore.PO_HomePage;
import com.qshore.PO_Registration;

public class SCF_Module1 {
	
	// Test Name (Manual TC) : SCF_Mod1_TC01
	// Test Script Name      : SCF_Mod1_TC01
	// Module Name           : Mod1
	// Project Name          : SCF
	// Author                : Kishore Kumar
	// Date Created          : 09282019
	// Reviewd By            : Meghna
	//********************************************************************************
	
	public void SCF_Mod1_TC01() throws Exception{
		
		// Importing Methods Class
		Methods m=new Methods();		
		// Importing ExcelCon Method
		m.excel_Con("C:\\Users\\DELL\\Desktop\\FWWeekend\\Test Data\\Kishore\\SCF\\Module1\\TC01.xls", "Sheet1");
		// Launching Application
		m.launchApp(m.s.getCell(0, 0).getContents(), "C:\\Users\\DELL\\Desktop\\FWWeekend\\Test Results Or Test Logs\\Kishore\\SCF\\Mod1\\TC01\\launchApp.png");
		// Imorting Page Objects of Home Page
		PO_HomePage homepage=PageFactory.initElements(m.driver, PO_HomePage.class);
		// Verifying IAM Fresher and prof elements available or not
		m.elementAvailable(homepage.Home_IAMFresher, true, "C:\\Users\\DELL\\Desktop\\FWWeekend\\Test Results Or Test Logs\\Kishore\\SCF\\Mod1\\TC01\\IAMFresherAvailable.png");
		m.elementAvailable(homepage.Home_IAMProf, true, "C:\\Users\\DELL\\Desktop\\FWWeekend\\Test Results Or Test Logs\\Kishore\\SCF\\Mod1\\TC01\\IAMProfAvailable.png");
		// Verifying Title starts with N
		m.titleStarts("n", true);
		// Clicking On IAM Fresher Button
		homepage.Home_IAMFresher.click();
		// Applying WebDriver Wait 
		WebDriverWait ww=new WebDriverWait(m.driver, 30);
		// Importing Page Objects for Registration Page
		PO_Registration registration_Page=PageFactory.initElements(m.driver, PO_Registration.class);
		ww.until(ExpectedConditions.elementToBeClickable(registration_Page.Registration_Name));
		// Verifying URL contains
		m.urlContains("basicdetails", true);
		m.closeApp();		
	}
	//************************************************************************************
	public void TC02() throws Exception {
		
	}

}
