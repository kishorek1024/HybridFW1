// launchApp  : To Launch App
// closeApp   : To Close App
// excel_Con  : To connect excel
// elementAvailable  : To Verify element available or not


package com.qshore;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import jxl.Sheet;
import jxl.Workbook;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.DrivenSeleniumLauncher;

public class Methods {
	// Creating Global Variables, Objects, References etc..
	public WebDriver driver;
	public FileInputStream f;
	public Workbook wb;
	public Sheet s;
	
	// Method Name  : launchApp
	// Description  : To Launch Application
	// Author       : Kishore Kumar / kumarki
	// Date Created : 09/28/2019
	// Parameters   : String url, String sspath
	// Reviewd By   : Aparna
	//*************************************************************************
	public void launchApp(String url, String sspath) throws Exception{
		driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File(sspath));	}
	//********************************************************************
	// Method Name  : closeApp
	// Description  : To Close Application
	// Author       : Kishore Kumar / kumarki
	// Date Created : 09/28/2019
	// Parameters   : String url, String sspath
	// Reviewd By   : Aparna
	//*************************************************************************\
	public void closeApp(){
		driver.close();	}
	//***********************************************************
	public void excel_Con(String filepath, String sname) throws Exception {
		f=new FileInputStream(filepath);
		wb=Workbook.getWorkbook(f);
		s=wb.getSheet(sname);	}
	//************************************************************
	public void elementAvailable(WebElement element, boolean exp, String sspath) throws Exception {
		boolean element_Present=element.isDisplayed();
		if(element_Present==exp)
		{
			System.out.println("Pass");
			File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f, new File(sspath));
		}
		else
		{
			System.out.println("Fail");
			File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f, new File(sspath));
		}
	}
	//************************************************************
	public void elements_Count(String locator, int exp, String sspath) throws Exception {
		List<WebElement> elements=driver.findElements(By.tagName(locator));
		if(elements.size()==exp)
		{
			System.out.println("Pass");
			File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f, new File(sspath));
		}
		else
		{
			System.out.println("Fail");
			File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f, new File(sspath));
		}
	}
	//****************************************************************************
	public void titleStarts(String exptext, boolean exp){
		String title=driver.getTitle();
		if(title.startsWith(exptext)==exp)
			System.out.println("Pass");
		else
			System.out.println("Fail");
	}
	//*******************************************************************************
	public void urlContains(String exptext, boolean exp){
		String url=driver.getCurrentUrl();
		if(url.contains(exptext)==exp)
			System.out.println("Pass");
		else
			System.out.println("Fail");
	}
	//*******************************************************************************
	
	
	
	
	
	
	
	
	
	
	
	






}
