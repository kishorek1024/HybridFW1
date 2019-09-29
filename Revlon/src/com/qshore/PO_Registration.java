package com.qshore;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//PageObject Name : PO_Registration
//Page Name       : Registration
//Module Name     : Module 1
//Project Name    : SCF
//Author          : Kishore Kumar
//Date            : 09282019
//Reviewd By      : Neeraja
//**********************************************************************************
public class PO_Registration {
	
	public @FindBy(xpath="//input[@id='fname']") WebElement Registration_Name;
	public @FindBy(xpath="//input[@id='email']") WebElement Registration_Email;

}
