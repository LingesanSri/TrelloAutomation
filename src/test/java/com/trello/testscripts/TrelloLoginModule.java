package com.trello.testscripts;

import org.testng.Reporter;


import com.trello.genericutility.Baseclass;
import com.trello.pomrepository.TrelloLoginPage;

import com.trello.pomrepository.TrelloUrlLaunchPage;

public class TrelloLoginModule extends Baseclass {

	public void loginIntoYourAtlassainAccount() throws Throwable {

		// Creating implict wait by passing reference to WebDriverUtility
		        webDriverUtility.implicitWait();
		// Creating object reference for URL launch Page
		TrelloUrlLaunchPage launchPage = new TrelloUrlLaunchPage(super.driver);
		
		
		
		// Explicitly Waiting for the page to be Loaded and logging statements
		if (webDriverUtility.waitUntilVisible("Capture, organize, and tackle your to-dos from anywhere | Trello")) {

			// clicking on login Option
			launchPage.getLoginOption().click();

			Reporter.log("Pass: Trello Launch page has been Displayed...");

		} else {

			Reporter.log("Fail: Trello Launch page has not been Displayed...");
		}

		if (webDriverUtility.waitUntilVisible("Log in to continue - Log in with Atlassian account")) {

			// Creating Object reference for Trello login To Continue page
			TrelloLoginPage loginPage = new TrelloLoginPage(super.driver);

			// clicking on username text field and passing input data
			loginPage.getUserNameTextField().sendKeys(utility.readDataFromPropertyFile("username"));

			// Clicking on continue button
			loginPage.getContinueButton().click();

			// clicking on password textfield and passing input data
			loginPage.getPassWordTextField().sendKeys(utility.readDataFromPropertyFile("password"));

			// Clicking on Login button
			loginPage.getLoginButton().click();

			// Explicitly Waiting for the page to be Loaded and logging statements`

			Reporter.log("Pass: Login To Continue page has been Displayed...");
		}

		else {

			Reporter.log("Fail: Login To Continue page has not been Displayed...");
		}
		if (webDriverUtility.waitUntilVisible("Boards | Trello")) {
			// Explicitly Waiting for the page to be Loaded and logging statements
			Reporter.log("Pass: Login Into your Account is Successful...");
		}

		else {
			Reporter.log("Fail: Login Into your Account is Unsuccessful...");
		}

	}

}
