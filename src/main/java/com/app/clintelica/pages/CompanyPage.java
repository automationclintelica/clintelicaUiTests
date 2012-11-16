package com.app.clintelica.pages;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompanyPage extends GenericPage  {

	public CompanyPage(WebDriver driver) {
		super(driver);
	}
	
    @FindBy(id = "cc_company_name")
	private WebElement companyName;
    
    @FindBy(id = "edit-company-name")
    private WebElement editCompany;

    @FindBy(id = "comm_textarea")
	private WebElement companyNoteTextArea;
   
	@FindBy(className = "btn-set-center")
	private WebElement addCompanyNoteButton;
    
    @FindBy(id = "changes-present")
	private WebElement saveChangesButton;

    @FindBy(id = "save-button-company")
	private WebElement saveCompanyButton;
    
    @FindBy(name = "edit-company-form")
    private WebElement editCompanyForm;
    
    @FindBy(id = "sarlink-img")
    private WebElement sarDatabaseLink;
    
    @FindBy(id = "cc_company_name_up_search_ico")
    private WebElement searchCompany;
    
    @FindBy(id = "view-company-name")
    private WebElement viewCompanyName;
    
    @FindBy(id = "company-created")
    private WebElement companyCreated;
    
    @FindBy(id = "company-comments-holder")
    private WebElement companyCommentsHolder;
    
    @FindBy(className = "edit_comm_block")
    private WebElement firstCommentBlock;
    
    @FindBy(className = "lblPargraf")
    private WebElement firstComment;
    
    
    private void waitCompanyPageToLoad() {
    	element(editCompanyForm).waitUntilVisible();
    	element(saveCompanyButton).waitUntilVisible();
    	element(sarDatabaseLink).waitUntilVisible();
    	element(searchCompany).waitUntilVisible();
    	evaluateImagesLoading();
    }
    
    public void fillCompanyName(String company) {
    	waitCompanyPageToLoad();
    	element(editCompany).waitUntilVisible();
		element(companyName).waitUntilVisible();
		element(companyName).click();
		companyName.sendKeys(company);
	}

    public void waitForSaveCompanyChanges(String companyName) {
    	getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//    	waitForAnyTextToAppear(viewCompanyName, companyName);
    	element(companyCreated).waitUntilVisible();    	
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
    
    public String getCompanyNameFromHeader() {
		element(viewCompanyName).waitUntilVisible();
		return element(viewCompanyName).getText();
	}
    
	public void saveChanges() {
		element(saveChangesButton).waitUntilVisible();
		element(saveChangesButton).click();
	}
    
	public void addCompanyNote(String note) {
		element(companyNoteTextArea).waitUntilVisible();
		element(companyNoteTextArea).click();
		companyNoteTextArea.sendKeys(note);
	}
	
	public void saveCompanyNote() {
		element(addCompanyNoteButton).waitUntilVisible();
		element(addCompanyNoteButton).click();
	}

	public void waitForSaveCompanyNote() {
		getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		element(companyCommentsHolder).waitUntilVisible();
		element(firstCommentBlock).waitUntilVisible();
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public String getCompanyFirstNote() {
		element(firstComment).waitUntilVisible();
		return element(firstComment).getText();
	}

	public void saveCompanyChanges() {
		element(saveCompanyButton).waitUntilVisible();
		element(saveCompanyButton).click();
	}
    
}