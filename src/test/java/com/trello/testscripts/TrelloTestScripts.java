package com.trello.testscripts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.trello.genericutility.BaseClass;
import com.trello.pomrepository.TrelloBoardsPage;
import com.trello.pomrepository.TrelloHomePage;
import com.trello.pomrepository.TrelloLoginPage;
import com.trello.pomrepository.TrelloLogoutPage;
import com.trello.pomrepository.TrelloUrlLaunchPage;

public class TrelloTestScripts extends BaseClass {

	// creating object Reference for soft assert as global reference type
	public SoftAssert softAssert = new SoftAssert();

	@Test(priority = 1)
	public void loginIntoYourAtlassainAccount() throws Throwable {

		// Creating implicit wait by passing reference to WebDriverUtility
		webDriverUtility.implicitWait();

		// Creating object reference for URL launch Page
		TrelloUrlLaunchPage launchPage = new TrelloUrlLaunchPage(super.driver);

		// Explicitly Waiting for the page to be Loaded
		Assert.assertEquals(webDriverUtility.waitUntilVisible(excelUtility.readStringData("titleAndUrls", 0, 1)), true,
				"Trello Launch Page has not been launched Sucessfully...");

		// clicking on login Option
		launchPage.getLoginOption().click();

		// logging statement
		Reporter.log("Trello Launch page has been Displayed...");

		Assert.assertEquals(webDriverUtility.waitUntilVisible(excelUtility.readStringData("titleAndUrls", 1, 1)), true,
				"Trello Login to Continue Page has not been loaded Sucessfully...");

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

		// if mfa verfication asked if
		/*
		 * if (webDriverUtility.waitUntilVisible(excelUtility.readStringData(
		 * "titleAndUr'ls", 2, 1))) {
		 * 
		 * loginPage.getMfaLinktextSkip().click();
		 * 
		 * Assert.assertEquals(webDriverUtility.waitUntilVisible(excelUtility.
		 * readStringData("titleAndUr'ls", 2, 1)), false);
		 * 
		 * // logging statement
		 * Reporter.log("Log in with Atlassian account page has been Displayed..."); }
		 * 
		 * else {
		 * 
		 * // logging statement
		 * Reporter.log("Log in with Atlassian account page has not been Displayed...");
		 * }
		 */
		// Explicitly Waiting for the page to be Loaded and logging statements`

		Reporter.log("Login To Continue page has been Displayed...");

		// asserting conditions to wait for excepted page to be displayed
		Assert.assertEquals(webDriverUtility.waitUntilVisible(excelUtility.readStringData("titleAndUrls", 3, 1)), true,
				"Trello Boards Page has hot been loaded Sucessfully...");

		// logging statement
		Reporter.log("Login Into your Account is Successful...");

		softAssert.assertAll();

	}

	@Test(priority = 2)
	public void CreateNewBoard() throws Throwable {

		// Creating implict wait by passing reference to WebDriverUtility
		webDriverUtility.implicitWait();

		// asserting conditions to wait for excepted page to be displayed
		Assert.assertEquals(webDriverUtility.waitUntilVisible(excelUtility.readStringData("titleAndUrls", 3, 1)), true,
				"Trello Boards Page has not been loaded Sucessfully...");

		// creating object reference for trello boards page
		TrelloBoardsPage boardsPage = new TrelloBoardsPage(super.driver);

		// creating Trello Home Page object refernece
		TrelloHomePage homePage = new TrelloHomePage(super.driver);

		// creating an String array for storing board names
		String boardName[] = { "Animals", "Robots", "Food&Beverages", "Earth", "Candy" };

		// creating an String array for storing board names
		String backgroundPictureName[] = { "Panda", "Wall E", "Coffee", "Fields", "Chocolate" };

		// looping until all the boards got created
		for (int i = 0; i < boardName.length; i++) {

			// Board Limit is Only 10 on Free Account");
			if (boardsPage.getBoardsList().size() < 10) {

				// Clicking on Create new board button
				boardsPage.getCreateNewBoardButton().click();

				// Clearing in case of append happens
				boardsPage.getBoardTitleTextfield().clear();

				// entering board name in textfield
				boardsPage.getBoardTitleTextfield().sendKeys(boardName[i]);

				// selecting visiblity of board dropdown
				boardsPage.getBoardVisibilityDropDown().click();

				// selecting visibility of board to private
				boardsPage.getSelectBoardVisibility().click();

				// selecting background field kebab option
				boardsPage.getBackgroundPictureMoreOption().click();

				// selecting background picture see more option
				boardsPage.getSelectBackgroundPictureSeeMoreOption().click();

				// Clearing in case of append happens
				boardsPage.getBackgroundPicturetextfield().clear();

				// entering desired picture to search on background picture textfield
				boardsPage.getBackgroundPicturetextfield().sendKeys(backgroundPictureName[i]);

				// creating random object reference and setting limit
				Random random = new Random();

				// getting size of the images generated and storing it
				int pictureCount = boardsPage.getBackgroundPictureSelection().size();

				// selecting random picture as it generated in real time
				boardsPage.getBackgroundPictureSelection().get(random.nextInt(pictureCount)).click();

				// closing the background picture pop-up close button
				boardsPage.getBackgroundPicturePopupCloseButton().click();

				// clicking in create board button and creating the board
				boardsPage.getCreateBoardSubmitButton().click();

				// waiting until page to be loaded and ready to be interacted
				Assert.assertEquals(webDriverUtility.urlContains(excelUtility.readStringData("titleAndUrls", 5, 1)),
						true, "Boards has not been created Successfully...");

				// navigation back to boards Page
				homePage.getTrelloMainHomePageNavButton().click();

			}

		}

		// logging statement
		Reporter.log("Boards has been Created Successfully");
		softAssert.assertAll();
	}

	@Test(priority = 3)
	public void addNewList() throws Throwable {

		// Creating implicit wait by passing reference to WebDriverUtility
		webDriverUtility.implicitWait();

		// Creating Trello Boards Page object Reference
		TrelloBoardsPage boardsPage = new TrelloBoardsPage(super.driver);

		// creating Trello Home Page object refernece
		TrelloHomePage homePage = new TrelloHomePage(super.driver);

		// Asserting conditions to wait for excepted page to be displayed
		Assert.assertEquals(webDriverUtility.waitUntilVisible(excelUtility.readStringData("titleAndUrls", 3, 1)), true,
				"Trello Boards Page has not been loaded Sucessfully...");

		// select boards section
		boardsPage.getBoards().click();

		// selext
		webDriverUtility.urlContains(excelUtility.readStringData("titleAndUrls", 6, 1));

		// select your

		// creating loop for adding multiple list
		for (int i = 0; i < boardsPage.getYourBoardsList().size(); i++) {

			// selecting board
			boardsPage.getYourBoardsList().get(i).click();

			// explicitly waiting to load page and to verify Url
			Assert.assertEquals(webDriverUtility.urlContains(excelUtility.readStringData("titleAndUrls", 5, 1)), true,
					"The url is not loaded as per Requirements...");

			// checking if addList button is not selected
			if (!boardsPage.getAddNewList().isSelected()) {

				// not selected so we clicking it to perform further action
				boardsPage.getAddNewList().click();

				// Creating array of list names
				String listNames[] = { "Citrus", "Banana", "Dragon Fruit", "Apple" };

				// entering list names one by one
				for (String listname : listNames) {

					// webDriverUtility.elementToBeClickable(boardsPage.getListNameTextfield());

					// clearing list name textfield
					boardsPage.getListNameTextfield().clear();

					// entering list name
					boardsPage.getListNameTextfield().sendKeys(listname);

					// clicking on add list button
					boardsPage.getAddToListButton().click();
				}

				// if add list button is selected
			} else if (boardsPage.getAddNewList().isSelected()) {

				// Creating array of list names
				String listNames[] = { "Apple", "Banana", "Citrus", "Dope" };

				// entering list names one by one
				for (String listname : listNames) {

					// webDriverUtility.elementToBeClickable(boardsPage.getListNameTextfield());

					// clearing list name textfield
					boardsPage.getListNameTextfield().clear();

					// entering list name
					boardsPage.getListNameTextfield().sendKeys(listname);

					// clicking on add list button
					boardsPage.getAddToListButton().click();
				}

			}

		}

		// logging statements
		Reporter.log("List has been added Successfully...");

		// navigating to workspace page
		homePage.getTrelloMainHomePageNavButton().click();

		// asserting all conditions
		softAssert.assertAll();
	}

	@Test(priority = 5)
	public void closeBoard() throws Throwable {

		// Creating implicit wait by passing reference to WebDriverUtility
		webDriverUtility.implicitWait();

		// Asserting conditions to wait for excepted page to be displayed
		Assert.assertEquals(webDriverUtility.waitUntilVisible(excelUtility.readStringData("titleAndUrls", 3, 1)), true,
				"Trello Boards Page has not been loaded Sucessfully...");

		// Creating Trello Boards Page object Reference
		TrelloBoardsPage boardsPage = new TrelloBoardsPage(super.driver);

		// creating Trello Home Page object refernece
		TrelloHomePage homePage = new TrelloHomePage(super.driver);

		// clicking on Boards Option to view your boards
		boardsPage.getBoards().click();

		// storing boards count in container to update each time due to dynamic list in
		// real time
		List<WebElement> closedBoards = boardsPage.getYourBoardsList();

		// to maintain loop until all boards closed
		while (!closedBoards.isEmpty()) {

			// select board by index
			boardsPage.getYourBoardsList().get(0).click();

			// selectyour board kebab option
			boardsPage.getVerticalKebabButtonforYourBoardList().get(0).click();

			// select close board button
			boardsPage.getCloseBoardButton().click();

			// select confirm close board button
			boardsPage.getConfirmCloseBoardPopoverButton().click();

			// waiting to close board confirmatioon to be appear
			Assert.assertEquals(
					webDriverUtility.textToBePresentInElement(boardsPage.getPopupDeleteConfirmNotification(),
							excelUtility.readStringData("attributeNameValue", 0, 1)),
					true, "Closed board confirmation not appeared...");

			// updating boards list after closing to iterate the loop until all the boards
			// has been closed.
			closedBoards = boardsPage.getYourBoardsList();

		}

		// navigating to workspace page
		homePage.getTrelloMainHomePageNavButton().click();

		// logging statement
		Reporter.log("Boards has been Closed Successfully...");

		// asserting all conditionss
		softAssert.assertAll();

	}

	@Test(priority = 6)
	public void permanentlyCloseBoard() throws Throwable {

		// Creating implicit wait by passing reference to WebDriverUtility
		webDriverUtility.implicitWait();

		// Asserting conditions to wait for excepted page to be displayed
		Assert.assertEquals(webDriverUtility.waitUntilVisible(excelUtility.readStringData("titleAndUrls", 3, 1)), true,
				excelUtility.readStringData("attributeNameValue", 1, 1));

		// Creating Trello Boards Page object Reference
		TrelloBoardsPage boardsPage = new TrelloBoardsPage(super.driver);

		// creating Trello Home Page object refernece
		TrelloHomePage homePage = new TrelloHomePage(super.driver);

		// click on view closed boards button
		boardsPage.getViewClosedBoardsButton().click();

		// storing boards list for deletion
		List<WebElement> deleteBoard = boardsPage.getListClosedBoards();

		// looping until all the boards has been get deleted

		while (!deleteBoard.isEmpty()) {

			// selecting board one by one for deletion
			boardsPage.getListClosedBoards().get(0).click();

			// waiting for the element to be clickable
			webDriverUtility.elementToBeClickable(boardsPage.getDeleteBoardButton());
			// selecting delete option
			boardsPage.getDeleteBoardButton().click();

			// waiting for the element to be clickable
			Assert.assertEquals(
					webDriverUtility.textToBePresentInElement(boardsPage.getPermanentlyDeleteBoardButton(),
							excelUtility.readStringData("attributeNameValue", 2, 1)),
					true, "Delete board button not yet interactable.");

			// selecting confirm delete board button
			boardsPage.getPermanentlyDeleteBoardButton().click();

			// waiting until alert comes up to proceed further
			Assert.assertEquals(webDriverUtility.invisibilityofElement(boardsPage.getBoardDeleteNotification()), true,
					"Delete board confirm notification does not occured.");
			// updating boards list to iterate until all the boards to be closed.
			deleteBoard = boardsPage.getListClosedBoards();

		}

		// clicking on close delete board popover button
		boardsPage.getPermanentlyDeleteBoardPopupCloseButton().click();

		// logging statements
		Reporter.log("Boards has been Deleted Successfully...");

		// navigating back to boards page after closing all the boards
		homePage.getTrelloMainHomePageNavButton().click();

		// sserting all statement
		softAssert.assertAll();
	}

	@Test(priority = 7)
	public void logoutFromYourAtlassainAccount() throws Throwable {

		// Creating implict wait by passing reference to WebDriverUtility
		webDriverUtility.implicitWait();

		// asserting conditions to wait for excepted page to be displayed
		Assert.assertEquals(webDriverUtility.waitUntilVisible(excelUtility.readStringData("titleAndUrls", 3, 1)), true,
				"Trello Boards Page has hot been loaded Sucessfully...");

		// Creating Trello Home Page object Reference
		TrelloHomePage homePage = new TrelloHomePage(super.driver);

		// Clicking on Account menu option
		homePage.getAccountNavMenu().click();

		// clicking in logout option
		homePage.getLogoutOption().click();

		Reporter.log("Trello Boards page is Displayed");

		Assert.assertEquals(webDriverUtility.waitUntilVisible(excelUtility.readStringData("titleAndUrls", 4, 1)), true,
				"Trello Logout Page has hot been loaded Sucessfully...");

		// Creating Object Reference for Trello Logout Page
		TrelloLogoutPage logoutPage = new TrelloLogoutPage(super.driver);

		// clicking on logout button

		logoutPage.getLogoutButton().click();

		Reporter.log("Your Trello|Atlassaian Account logout is Successful");

		softAssert.assertAll();
	}

	@Test(priority = 4)
	public void listSort() throws Throwable {

		// Implicit wait (applied once globally)
		webDriverUtility.implicitWait();

		// POM & Actions setup
		TrelloHomePage homePage = new TrelloHomePage(super.driver);
		TrelloBoardsPage boardsPage = new TrelloBoardsPage(super.driver);
		Actions actions = new Actions(super.driver);

		// Wait for homepage to load
		webDriverUtility.waitUntilVisible(excelUtility.readStringData("titleAndUrls", 3, 1));

		// Navigate to Boards
		boardsPage.getBoards().click();

		// Wait for Boards page to load
		webDriverUtility.urlContains(excelUtility.readStringData("titleAndUrls", 6, 1));

		// Iterate through each board
		for (WebElement board : boardsPage.getYourBoardsList()) {
			board.click();

			// Wait for specific board to load
			webDriverUtility.urlContains(excelUtility.readStringData("titleAndUrls", 5, 1));

			// Initial fetch of list elements and titles
			List<WebElement> initialList = boardsPage.getListCount();
			List<WebElement> sortedList = new ArrayList<WebElement>();
			List<String> currentTitles = initialList.stream().map(WebElement::getText).collect(Collectors.toList());
			
			
			List<String> sortedTitles = new ArrayList<>(currentTitles);
			Collections.sort(sortedTitles);
			
			for (String title : sortedTitles) {
				for (WebElement element : initialList) {
					if (element.getText().equals(title)) {
						sortedList.add(element);
					}

				}
			}

	
			for (int i = 0; i < initialList.size(); i++) {
				String expectedtitleIndex = sortedTitles.get(i);
				String actualTitleIndex = currentTitles.get(i);
				WebElement source = sortedList.get(i);
				WebElement target = initialList.get(i);
				if (!expectedtitleIndex.equals(actualTitleIndex)) {

					actions.dragAndDrop(source, target).perform();

				}
        
			}

		}
		
		// Navigate back to home
		homePage.getTrelloMainHomePageNavButton().click();
	}


}
