package com.app.clintelica.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//@DefaultUrl("http://en.wiktionary.org/wiki/Wiktionary:Main_Page")
public class LoginPage extends AbstractPage  {

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="password-placeh-span")
	private WebElement usernamePlaceHolder;
	
	@FindBy(id="password-placeh-span")
	private WebElement passwordPlaceHolder;
	
    @FindBy(id = "username")
	private WebElement usernameWebElement;
	
	@FindBy(id="password")
	private WebElement passwordWebElement;
	
	@FindBy(id="go-login")
	private WebElement loginButton;
	
//	@FindBy(id = "img[title='Log Out']")
	@FindBy(xpath = "//div[@id='welcome']/img")
	private WebElement logoutButton;
	

	public void fillUsername(String username) {
		getDriver().switchTo().defaultContent();
		element(usernamePlaceHolder).waitUntilVisible();
		element(usernamePlaceHolder).click();
		element(usernameWebElement).waitUntilVisible();
		usernameWebElement.sendKeys(username);
	}
	
	public void fillPassword(String password) {
		getDriver().switchTo().defaultContent();
		element(passwordPlaceHolder).waitUntilVisible();
		element(passwordPlaceHolder).click();
		element(passwordWebElement).waitUntilVisible();
		passwordWebElement.sendKeys(password);
	}
	
	public void clickGoButton() {
		element(loginButton).waitUntilVisible();
		element(loginButton).click();
	}
	
	public void waitForLogoutButton() {
		getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		element(logoutButton).waitUntilVisible();
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
}


