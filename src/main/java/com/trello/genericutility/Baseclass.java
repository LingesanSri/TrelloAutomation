package com.trello.genericutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;




public class Baseclass{
	
	protected WebDriver driver ;
	protected JavaUtility utility = new JavaUtility();
	protected WebDriverUtility webDriverUtility;
	protected ExcelUtility excelUtility = new ExcelUtility();


	@BeforeSuite
	public void launchBrowser() throws Throwable {
		
		String browserName = utility.readDataFromPropertyFile("BrowserName");

		switch (browserName.toLowerCase()) {

		case "chrome":

			driver = new ChromeDriver();
			break;
			
		case "firefox":

			driver = new FirefoxDriver();
			break;

		case "edge":

			driver = new EdgeDriver();
			break;

		default:

			driver = new ChromeDriver();
			break;
		}
	
		webDriverUtility = new WebDriverUtility(driver);
        webDriverUtility.maximize();
		driver.get(utility.readDataFromPropertyFile("Url"));
	}
	
	@AfterSuite
	public void quitBrowser() {
		
		webDriverUtility.minimize();
		driver.quit();
	}

}
