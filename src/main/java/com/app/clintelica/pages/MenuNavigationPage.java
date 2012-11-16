package com.app.clintelica.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuNavigationPage extends GenericPage  {

	public MenuNavigationPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//div[@id='shortcuts']/div[1]")
	private WebElement companyShortcut;
	
//	Main Menu
	
//	@FindBy(xpath = "//li[@class='sfHover']//a[normalize-space(.)='CRM »']")
//	/html/body/div/div[2]/div[2]/ul/li/a
	@FindBy(css ="html body div#wrap div#masthead div#menu-bar.menu-bar ul.sf-menu li a.toplevel")
	private WebElement crmMainMenu;
	private String crmMainMenuCss = "html body div#wrap div#masthead div#menu-bar.menu-bar ul.sf-menu li a.toplevel" ;
	
	@FindBy(xpath = "//div[@id='menu-bar']//a[normalize-space(.)='View Companies Info']")
	private WebElement companyInfoSubMenu;

	
	public void clickCrmMenu() {
		element(crmMainMenu).waitUntilVisible();
		focusWebElement(crmMainMenuCss, 0);
		mouseOverWebElement(crmMainMenuCss, 0);
	}
	
	public void clickCompanyInfoSubMenu() {
		element(companyInfoSubMenu).waitUntilVisible();
		element(companyInfoSubMenu).click();
	}
	
	public void clickAddCompanyShortcut() {
		element(companyShortcut).waitUntilVisible();
		element(companyShortcut).click();
	}

	
}