package com.trello.genericutility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {

	protected WebDriver driver;

	public WebDriverUtility(WebDriver driver) {
		this.driver = driver;

	}

	public void maximize() {

		driver.manage().window().maximize();
	}

	public void minimize() {

		driver.manage().window().minimize();
	}

	public void fullscreen() {

		driver.manage().window().fullscreen();

	}

	public void newWindow() {

		driver.switchTo().newWindow(WindowType.WINDOW);

	}

	public void newWindowTab() {

		driver.switchTo().newWindow(WindowType.TAB);
	}

	public void implicitWait() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	public boolean waitUntilVisible(String expectedResult) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		boolean result = wait.until(ExpectedConditions.titleIs(expectedResult));

		return result;

	}

	public void elementToBeClickable(WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.elementToBeClickable(element));

	}

	public boolean textToBePresentInElement(WebElement element, String text) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		boolean result = wait.until(ExpectedConditions.textToBePresentInElement(element, text));

		return result;
	}

	public boolean urlContains(String url) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		boolean result = wait.until(ExpectedConditions.urlContains(url));

		return result;
	}

	public boolean attributeContains(WebElement element, String attributeName, String attributeValue) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		boolean result = wait.until(ExpectedConditions.attributeContains(element, attributeName, attributeValue));

		return result;
	}

	public boolean invisibilityofElement(WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    boolean result = wait.until(ExpectedConditions.invisibilityOf(element));
	
		return result;
	}

	public void driverQuit() {

		driver.close();
		driver.quit();
	}

}
