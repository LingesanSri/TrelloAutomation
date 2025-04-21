package com.trello.testscripts;

import org.testng.annotations.Test;

import com.trello.genericutility.Baseclass;


public class ExecutorTrelloTestScripts extends Baseclass{

	@Test
	public void loginTest() throws Throwable {
		TrelloLoginModule loginModule = new TrelloLoginModule();
		loginModule.loginIntoYourAtlassainAccount();

		TrelloLogoutModule logoutModule = new TrelloLogoutModule();
		
		logoutModule.logoutFromYourAtlassainAccount();
	}
}
