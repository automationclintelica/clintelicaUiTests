package com.app.clintelica.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommonPage extends AbstractPage  {

	public CommonPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//div[@id='shortcuts']/div[1]")
	private WebElement companyShortcut;

	public void clickAddCompany() {
		element(companyShortcut).waitUntilVisible();
		element(companyShortcut).click();
	}

	
}