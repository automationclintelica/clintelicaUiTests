package com.app.clintelica.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompanyPage extends AbstractPage  {

	public CompanyPage(WebDriver driver) {
		super(driver);
	}
	
    @FindBy(id = "cc_company_name")
	private WebElement companyName;

    @FindBy(id = "comm_textarea")
	private WebElement companyNoteTextArea;
   
	@FindBy(xpath = "xpath = a[@id='add-comm-company']//span[.='Add']")
	private WebElement addCompanyNoteButton;
    
    @FindBy(id = "changes-present")
	private WebElement saveChangesButton;

    @FindBy(id = "xpath = //a[@id='save-button-company']//span[normalize-space(.)='Save']")
	private WebElement saveCompanyButton;
    
    public void fillCompanyName(String company) {
		element(companyName).waitUntilVisible();
		element(companyName).click();
		companyName.sendKeys(company);
	}

	public void saveChanges() {
		element(saveChangesButton).waitUntilVisible();
		element(saveChangesButton).click();
	}
    
	public void addCompanyNote(String note) {
		element(companyNoteTextArea).click();
		companyNoteTextArea.sendKeys(note);
        element(addCompanyNoteButton).click();
	}

	public void saveCompanyChanges() {
		element(saveCompanyButton).waitUntilVisible();
		element(saveCompanyButton).click();
	}
    
}