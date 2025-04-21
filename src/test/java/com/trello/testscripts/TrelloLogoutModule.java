package com.trello.testscripts;

import org.testng.Reporter;

import com.trello.genericutility.Baseclass;
import com.trello.pomrepository.TrelloHomePage;
import com.trello.pomrepository.TrelloLogoutPage;

public class TrelloLogoutModule extends Baseclass{


	//@Test(priority = 2,dependsOnGroups = "login")
	public void logoutFromYourAtlassainAccount() {
		
		// Creating implict wait by passing reference to WebDriverUtility
				webDriverUtility.implicitWait();
				
		//Checking if user is currently in Trello BoardsPage
		if (webDriverUtility.waitUntilVisible("Boards | Trello")) {
			
			//Creating Trello Home Page object Reference
			TrelloHomePage homePage = new TrelloHomePage(super.driver);
			
			//Clicking on Account menu option
			homePage.getAccountNavMenu().click();
			
			//clicking in logout option 
			homePage.getLogoutOption().click();
			
			Reporter.log("Pass : Trello Boards page is Displayed");
		}
		else {
			Reporter.log("Fail : Trello Boards page is not Displayed");
		}
		
		
		
		if (webDriverUtility.waitUntilVisible("Log out of your Atlassian account - Log in with Atlassian account")) {
			
			//Creating Object Reference for Trello Logout Page
			TrelloLogoutPage logoutPage = new TrelloLogoutPage(super.driver);
			
			//clicking on logout button
			
			logoutPage.getLogoutButton().click();
			
			Reporter.log("Pass : Your Trello|Atlassaian Account logout is Successful");
		}
		else {
			Reporter.log("Fail : Your Trello|Atlassaian Account logout is Unsuccessful");
		}
			
		
	}
	
}
