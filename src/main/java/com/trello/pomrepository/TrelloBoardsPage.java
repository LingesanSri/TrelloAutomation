package com.trello.pomrepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloBoardsPage {

	WebDriver driver;

	public TrelloBoardsPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public WebElement getCreateNewBoardButton() {
		return createNewBoardButton;
	}

	public WebElement getCreateBoardSubmitButton() {
		return createBoardSubmitButton;
	}

	public WebElement getBoardTitleTextfield() {
		return boardTitleTextfield;
	}

	public WebElement getBackgroundPictureMoreOption() {
		return backgroundPictureMoreOption;
	}

	public WebElement getSelectBackgroundPictureSeeMoreOption() {
		return selectBackgroundPictureSeeMoreOption;
	}

	public WebElement getBackgroundPicturetextfield() {
		return backgroundPicturetextfield;
	}

	public List<WebElement> getBackgroundPictureSelection() {
		return backgroundPictureSelection;
	}

	public WebElement getBackgroundPicturePopupCloseButton() {
		return backgroundPicturePopupCloseButton;
	}

	public WebElement getBoardVisibilityDropDown() {
		return boardVisibilityDropDown;
	}

	public WebElement getSelectBoardVisibility() {
		return selectBoardVisibility;
	}

	public WebElement getAddNewList() {
		return addNewList;
	}

	public WebElement getListNameTextfield() {
		return listNameTextfield;
	}

	public WebElement getAddToListButton() {
		return addToListButton;
	}

	public WebElement getAddNewCardOption() {
		return addNewCardOption;
	}

	public WebElement getAddCardTextfield() {
		return addCardTextfield;
	}

	public WebElement getAddCardButton() {
		return addCardButton;
	}

	public WebElement getAddCardCancelButton() {
		return addCardCancelButton;
	}

	public WebElement getRememberMeCheckBox() {
		return rememberMeCheckBox;
	}
	// create board

	public List<WebElement> getBoardsList() {
		return boardsList;
		
	}

	public List<WebElement> getYourBoardsList() {
		return yourBoardsList;
	}

	public List<WebElement> getVerticalKebabButtonforYourBoardList() {
		return VerticalKebabButtonforYourBoardList;
	}

	public WebElement getCloseBoardButton() {
		return closeBoardButton;
	}

	public WebElement getCloseBoardPopoverCloseButton() {
		return closeBoardPopoverCloseButton;
	}

	public WebElement getViewClosedBoardsButton() {
		return viewClosedBoardsButton;
	}

	public List<WebElement> getListClosedBoards() {
		return listClosedBoards;
	}


	public WebElement getReopenClosedBoardButton() {
		return reopenClosedBoardButton;
	}

	public WebElement getWorksapceCancelButton() {
		return worksapceCancelButton;
	}

	public WebElement getWorksapceSaveButton() {
		return worksapceSaveButton;
	}

	public WebElement getWorksapceShortNameTextField() {
		return worksapceShortNameTextField;
	}

	public WebElement getWorksapceNameTextField() {
		return worksapceNameTextField;
	}

public WebElement getPermanentlyDeleteBoardButton() {
	return permanentlyDeleteBoardButton;
}

public WebElement getConfirmCloseBoardPopoverButton() {
	return confirmCloseBoardPopoverButton;
}

public WebElement getDeleteBoardButton() {
	return deleteBoardButton;
}

public WebElement getPermanentlyDeleteBoardPopupCloseButton() {
	return permanentlyDeleteBoardPopupCloseButton;
}


	public WebElement getTrelloWorkspaceEditButton() {
		return trelloWorkspaceEditButton;
	}
	
	
	

	public WebElement getListActionskebabButton() {
		return listActionskebabButton;
	}

	public WebElement getArchiveThisListButton() {
		return archiveThisListButton;
	}

	public WebElement getBoardsMenuKebabButton() {
		return boardsMenuKebabButton;
	}

	public WebElement getArchivedItems() {
		return archivedItems;
	}

	public List<WebElement> getArchivedCardItems() {
		return archivedCardItems;
	}

	public WebElement getArchivedCardItemsDeleteButton() {
		return archivedCardItemsDeleteButton;
	}

	public WebElement getSwitchToArchievdListItems() {
		return SwitchToArchievdListItems;
	}

	public WebElement getArchivedListItemsDeleteButton() {
		return archivedListItemsDeleteButton;
	}

	public List<WebElement> getArchivedAddListsList() {
		return archivedAddListsList;
	}

	public WebElement getArchivedCardConfirmDelteButton() {
		return archivedCardConfirmDelteButton;
	}
	
	public List<WebElement> getListCount() {
		return listCount;
	}
	
	public WebElement getBoardName() {
		return boardName;
	}
	
	public WebElement getBoards() {
		return boards;
	}
	public WebElement getArchivePopoverCloseButton() {
		return archivePopoverCloseButton;
	}

	public WebElement getBoardDeleteNotification() {
		return boardDeleteNotification;
	}

	public List<WebElement> getCardsList() {
		return cardsList;
	}
	
	public WebElement getPopupDeleteConfirmNotification() {
		return popupDeleteConfirmNotification;
	}








	@FindBy(css = "div[class='board-tile mod-add']")
	private WebElement createNewBoardButton;

	@FindBy(xpath = "//label[@class='fMvxkh4DHKJGnq']//input[contains(@class,'nch-textfield__input')]")
	private WebElement boardTitleTextfield;

	@FindBy(xpath = "//button[@data-testid='create-board-submit-button' and text()='Create']")
	private WebElement createBoardSubmitButton;

	@FindBy(xpath = "//button[@class='bxgKMAm3lq5BpA SEj5vUdI3VvxDc' and not(@title) or (@style='')]")
	private WebElement backgroundPictureMoreOption;

	@FindBy(xpath = "//header[h1[text()='Photos']]//button[text()='See more']")
	private WebElement selectBackgroundPictureSeeMoreOption;

	@FindBy(xpath = "//input[@class='jhR9pta4kgYESQ' and @placeholder='Photos']")
	private WebElement backgroundPicturetextfield;

	@FindBy(xpath = "//div/div[@class='jobpuSsxR75JMo']")
	private List<WebElement> backgroundPictureSelection;

	@FindBy(xpath = "//h2[text()='Photos by ']/following::button[@data-testid='popover-close']")
	private WebElement backgroundPicturePopupCloseButton;

	@FindBy(xpath = "//div[@data-testid='create-board-select-visibility']")
	private WebElement boardVisibilityDropDown;

	@FindBy(xpath = "//div[text()='Private']")
	private WebElement selectBoardVisibility;

	// add new list option
	@FindBy(css = "button[data-testid='list-composer-button']")
	private WebElement addNewList;

	@FindBy(xpath = "//form[@class='vVqwaYKVgTygrk']//textarea[@data-testid='list-name-textarea']")
	private WebElement listNameTextfield;

	@FindBy(xpath = "//button[@data-testid='list-composer-add-list-button' and text()='Add list']")
	private WebElement addToListButton;

	// add new card option
	@FindBy(xpath = "//li[@data-list-id='67d99283e96ea47a224795e8']/descendant::button[@data-testid='list-add-card-button']")
	private WebElement addNewCardOption;

	@FindBy(xpath = "//textarea[@data-testid='list-card-composer-textarea']")
	private WebElement addCardTextfield;

	@FindBy(xpath = "//button[contains(@data-testid,'list-card-composer-add-card-button')][text()='Add card']")
	private WebElement addCardButton;

	@FindBy(xpath = "//button[contains(@data-testid,'list-card-composer-cancel-button')]")
	private WebElement addCardCancelButton;

	@FindBy(xpath = "//ul[@class='boards-page-board-section-list']/child::li[@class='boards-page-board-section-list-item' and not (@data-testid)]")
	private List<WebElement> boardsList;

	@FindBy(css = "input[data-testid='remember-me-checkbox--hidden-checkbox']")
	private WebElement rememberMeCheckBox;

	@FindBy(xpath = "//div[@class='jv7QDCKI8FPToj']/child::li")
	private List<WebElement> yourBoardsList;

	@FindBy(xpath = "//div[@class='jv7QDCKI8FPToj']/descendant::span[@data-testid='OverflowMenuHorizontalIcon']")
	private List<WebElement> VerticalKebabButtonforYourBoardList;

	@FindBy(css = "button[aria-label='Close board']")
	private WebElement closeBoardButton;

	@FindBy(css = "button[data-testid='popover-close-board-confirm']")
	private WebElement confirmCloseBoardPopoverButton;

	@FindBy(css = "button[data-testid='popover-close']")
	private WebElement closeBoardPopoverCloseButton;

	@FindBy(xpath = "//button[text()='View all closed boards']")
	private WebElement viewClosedBoardsButton;

	@FindBy(xpath = "//ul/li[@class='KIigWC5xzGtpZ7']")
	private List<WebElement> listClosedBoards;

	@FindBy(css = "button[data-testid='close-board-delete-board-button']")
	private WebElement deleteBoardButton;

	@FindBy(css = "button[data-testid='workspace-chooser-trigger-button']")
	private WebElement reopenClosedBoardButton;

	@FindBy(xpath = "//button[contains(.,'Cancel')]")
	private WebElement worksapceCancelButton;

	@FindBy(xpath = "//button[contains(.,'Save')]")
	private WebElement worksapceSaveButton;

	@FindBy(css = "input[id='name']")
	private WebElement worksapceShortNameTextField;

	@FindBy(css = "input[data-testid='workspace-display-name']")
	private WebElement worksapceNameTextField;

	@FindBy(xpath = "//button[contains(@class,'Ch1Opdvr77xkJp')]")
	private WebElement trelloWorkspaceEditButton;
	
	@FindBy(css = "button[data-testid='close-board-delete-board-confirm-button']")
	private WebElement permanentlyDeleteBoardButton;
	
	@FindBy(xpath  = "//button[contains(@class,'iQIJMv98X1MtTG')]")
	private WebElement permanentlyDeleteBoardPopupCloseButton;

	@FindBy(css  = "button[data-testid='list-edit-menu-button']")
	private WebElement listActionskebabButton;
	
	@FindBy(css  = "button[data-testid='list-actions-archive-list-button']")
	private WebElement archiveThisListButton;
	
	@FindBy(css  = "button[aria-label='Show menu']")
	private WebElement boardsMenuKebabButton;
	
	@FindBy(xpath  = "//div[text()='Archived items']")
	private WebElement archivedItems;
	
	@FindBy(xpath  = "//div[@class='js-react-root']/child::div[@class='archived-list-card']")
	private List<WebElement> archivedCardItems;
	
	@FindBy(xpath  = "//button[text()='Delete']")
	private WebElement archivedCardItemsDeleteButton;
	
	@FindBy(xpath  = "//button[text()='Switch to lists']")
	private WebElement SwitchToArchievdListItems;
	
	@FindBy(xpath  = "//button[@class='bxgKMAm3lq5BpA SEj5vUdI3VvxDc']")
	private WebElement archivedListItemsDeleteButton;
	
	@FindBy(xpath  = "//span[@class='s_VsB_Itg2La0V']/..")
	private List<WebElement> archivedAddListsList;
	
	@FindBy(xpath  = "//button[text()='Delete'][@aria-label='delete-confirm']")
	private WebElement archivedCardConfirmDelteButton;
	
	@FindBy(css  = "button[data-testid='board-menu-close-button']")
	private WebElement archivePopoverCloseButton;
	
	@FindBy(xpath  = "//div[@data-testid='list-header']")
	private List<WebElement> listCount;
	
	@FindBy(css = "h1[data-testid='board-name-display']")
	private WebElement boardName;
	
	@FindBy(xpath = "//div[contains(@class,'boards-page-board-section-header-options')]/a[1]")
	private WebElement boards;
	
	@FindBy(css = "span[class='QMKgZFIlTLiEJN']")
	private WebElement boardDeleteNotification;
	
	@FindBy(css = "div[class='xJP6EH9jYQiWkk']")
	private WebElement popupDeleteConfirmNotification;
	
	@FindBy(css = "li[data-testid='list-card']")
	private List<WebElement> cardsList;
	
	
	

}
