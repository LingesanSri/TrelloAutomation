package com.trello.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloHomePage {

	WebDriver driver;

	public TrelloHomePage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// Home page Elements
	@FindBy(xpath = "//button[@aria-label='Open member menu' and @data-testid='header-member-menu-button']")
	private WebElement accountNavMenu;

	@FindBy(xpath = "//button[@data-testid='account-menu-logout']//span/span[text()='Log out']")
	private WebElement logoutOption;

	@FindBy(xpath = "//button[@aria-label='Create board or Workspace']//p[text()='Create']")
	private WebElement createBoardButton;

	@FindBy(xpath = "//button[@data-testid='header-create-board-button']//span[text()='Create board']")
	private WebElement createBoardNavButton;

	@FindBy(xpath = "//nav[@id='header']/descendant::span[@data-testid='ApplicationSwitcherIcon']")
	private WebElement atlassianNavButton;

	@FindBy(xpath = "//nav[@id='header']/descendant::a[@aria-label='Back to home']")
	private WebElement trelloMainHomePageNavButton;

	@FindBy(xpath = "//nav[@id='header']/descendant::button[@data-testid='workspace-switcher']")
	private WebElement workspaceNavButton;

	@FindBy(xpath = "//nav[@id='header']/descendant::button[contains(@data-testid,'recently')]")
	private WebElement recentNavButton;

	@FindBy(xpath = "//nav[@id='header']/descendant::button[contains(@data-testid,'starred')]")
	private WebElement starredNavButton;

	@FindBy(xpath = "//nav[@id='header']/descendant::button[contains(@data-testid,'templates')]")
	private WebElement templatesNavButton;

	@FindBy(css = "input[placeholder='Search']")
	private WebElement navSearchTextfield;
	
	@FindBy(css = "input[placeholder='Search Trello']")
	private WebElement navSearchTextfieldLarge;
	

	@FindBy(xpath = "//nav[@id='header']/descendant::button[contains(@data-testid,'notifications-button')]")
	private WebElement notificationBellNavButton;

	@FindBy(xpath = "//nav[@id='header']/descendant::button[contains(@data-testid,'info-button')]")
	private WebElement helpNavButton;

	@FindBy(xpath = "//span[text()='Boards']/preceding::a[contains(@class,'oTmCsFlPhDLGz2 AQ0dAIzWIJDFUU')]")
	private WebElement boardsSectionOption;

	@FindBy(xpath = "//li[@data-testid='templates']//a[@class='oTmCsFlPhDLGz2']")
	private WebElement templatesSectionOption;

	@FindBy(xpath = "//span[text()='Home']/ancestor::a[@class='oTmCsFlPhDLGz2']")
	private WebElement homeSectionOption;

	@FindBy(xpath = "//span[text()='Trello Workspace']")
	private WebElement trelloWorkspacelink;

	@FindBy(xpath = "//a[contains(@data-testid,'home-team-boards-tab')]")
	private WebElement boardsTab;

	@FindBy(xpath = "//a[contains(@data-testid,'home-team-highlights-tab')]")
	private WebElement highlightsTab;

	@FindBy(xpath = "//a[contains(@data-testid,'home-team-views-tab')]")
	private WebElement viewsTab;

	@FindBy(xpath = "//a[contains(@data-testid,'home-team-members-tab')]")
	private WebElement membersTab;

	@FindBy(xpath = "//span[text()='Members']/following-sibling::span[@class='YcdC3OLMMfYkHA']")
	private WebElement addMemberIcon;
	
	@FindBy(css = "span[data-testid='CloseIcon']")
	private WebElement addMemeberCloseIcon;

	@FindBy(xpath = "//span[text()='Settings']/parent::a[@data-testid='home-team-settings-tab']")
	private WebElement settingsTab;

	public WebElement getAccountNavMenu() {
		return accountNavMenu;
	}

	public WebElement getLogoutOption() {
		return logoutOption;
	}

	public WebElement getCreateBoardNavOption() {
		return createBoardNavButton;
	}

	public WebElement getCreateBoardButton() {
		return createBoardButton;
	}
	public WebElement getAtlassianNavButton() {
		return atlassianNavButton;
	}

	public WebElement getTrelloMainHomePageNavButton() {
		return trelloMainHomePageNavButton;
	}

	public WebElement getWorkspaceNavButton() {
		return workspaceNavButton;
	}

	public WebElement getRecentNavButton() {
		return recentNavButton;
	}

	public WebElement getStarredNavButton() {
		return starredNavButton;
	}

	public WebElement getTemplatesNavButton() {
		return templatesNavButton;
	}

	public WebElement getNavSearchTextfield() {
		return navSearchTextfield;
	}
	
	public WebElement getNavSearchTextfieldLarge() {
		return navSearchTextfieldLarge;
	}

	public WebElement getNotificationBellNavButton() {
		return notificationBellNavButton;
	}

	public WebElement getHelpNavButton() {
		return helpNavButton;
	}

	public WebElement getBoardsSectionOption() {
		return boardsSectionOption;
	}

	public WebElement getTemplatesSectionOption() {
		return templatesSectionOption;
	}

	public WebElement getHomeSectionOption() {
		return homeSectionOption;
	}

	public WebElement getTrelloWorkspacelink() {
		return trelloWorkspacelink;
	}

	public WebElement getBoardsTab() {
		return boardsTab;
	}

	public WebElement getHighlightsTab() {
		return highlightsTab;
	}

	public WebElement getViewsTab() {
		return viewsTab;
	}

	public WebElement getMembersTab() {
		return membersTab;
	}

	public WebElement getAddMemberIcon() {
		return addMemberIcon;
	}

	public WebElement getSettingsTab() {
		return settingsTab;
	}
	
	public WebElement getAddMemeberCloseIcon() {
		return addMemeberCloseIcon;
	}

}
