package com.qshore;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

// PageObject Name : PO_HomePage
// Page Name       : Home Page
// Module Name     : Module 1
// Project Name    : SCF
// Author          : Kishore Kumar
// Date            : 09282019
// Reviewd By      : Neeraja
//**********************************************************************************
public class PO_HomePage {
	public @FindBy(xpath="//button[@title='I am a Fresher' and @value='fresher']") WebElement Home_IAMFresher;
	public @FindBy(xpath="//button[@title='I am a Professional' and @value='exp']") WebElement Home_IAMProf;

}
