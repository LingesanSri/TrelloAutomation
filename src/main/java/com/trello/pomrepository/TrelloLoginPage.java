package com.trello.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloLoginPage {
	
	WebDriver driver;
	
	public TrelloLoginPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	  //login

		@FindBy(xpath = "//input[@id='username']") 
		private WebElement userNameTextField;
		
		@FindBy(xpath = "//input[@id='password']")
		private WebElement passWordTextField;
		
		@FindBy(xpath = "//button[@id='login-submit' and span[text()='Continue']]")
		private WebElement continueButton;
		
		@FindBy(xpath = "//button[@id='login-submit' and span[text()='Log in']]")
		private WebElement loginButton;
		
		@FindBy(id = "mfa-promote-dismiss")
		private WebElement mfaLinktextSkip;

		@FindBy(xpath = "//span[text()='Show password']/ancestor::button[@class=' css-o6ruxu']")
		private WebElement fluttericonButton;
		

		public WebElement getUserNameTextField() {
			return userNameTextField;
		}

		public WebElement getPassWordTextField() {
			return passWordTextField;
		}

		public WebElement getContinueButton() {
			return continueButton;
		}

		public WebElement getLoginButton() {
			return loginButton;
		}

		public WebElement getMfaLinktextSkip() {
			return mfaLinktextSkip;
		}
		
		

}
