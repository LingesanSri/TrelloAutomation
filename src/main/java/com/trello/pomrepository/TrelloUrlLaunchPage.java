package com.trello.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloUrlLaunchPage {

	WebDriver driver;

	public TrelloUrlLaunchPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[text()='Get Trello for free']/preceding-sibling::a[text()='Log in']")
	private WebElement loginOption;

	@FindBy(xpath = "//div[contains(@class,'BigNavstyles')]//a[@data-testid='logo_link']")
	private WebElement homePageButton;

	@FindBy(xpath = "//div[contains(@class,'Tabsstyles__TabGroup')]/button[text()='Features']")
	private WebElement featuresTab;

	@FindBy(xpath = "//div[contains(@class,'Tabsstyles__TabGroup')]/button[text()='Solutions']")
	private WebElement solutionsTab;

	@FindBy(xpath = "//div[contains(@class,'Tabsstyles__TabGroup')]/button[text()='Plans']")
	private WebElement plansTab;

	@FindBy(xpath = "//a[contains(@class,'Tabsstyles__')][text()='Pricing']")
	private WebElement pricingLink;

	@FindBy(xpath = "//div[contains(@class,'Tabsstyles__TabGroup')]/button[text()='Resources']")
	private WebElement resourcesTab;

	@FindBy(xpath = "//span[text()='Watch video']/preceding::input[@name='email']")
	private WebElement signupEmailTextfield;

	@FindBy(xpath = "//span[text()='Watch video']/preceding::button[contains(@aria-label,'Sign up')]")
	private WebElement signupButton;

	public WebElement getLoginOption() {
		return loginOption;
	}

	public WebElement getHomePageButton() {
		return homePageButton;
	}

	public WebElement getFeauturesTab() {
		return featuresTab;
	}

	public WebElement getSolutionsTab() {
		return solutionsTab;
	}

	public WebElement getPlansTab() {
		return plansTab;
	}

	public WebElement getPricingLink() {
		return pricingLink;
	}

	public WebElement getResourcesTab() {
		return resourcesTab;
	}

	public WebElement getSignupEmailTextfield() {
		return signupEmailTextfield;
	}

	public WebElement getSignupButton() {
		return signupButton;
	}
}
