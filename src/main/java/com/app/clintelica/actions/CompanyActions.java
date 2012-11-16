package com.app.clintelica.actions;

import junit.framework.Assert;

import org.apache.regexp.recompile;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;

public class CompanyActions extends GenericActions {

	private static final long serialVersionUID = 3422591601677040409L;

	public CompanyActions(Pages pages) {
        super(pages);
    }

	@Step
    public void fillCompanyName(String company) {
		companyPage().fillCompanyName(company);
    }

	@Step
    public void saveChanges() {
		companyPage().saveChanges();
    }
	
	@Step
	public void waitForSaveChanges(String companyName) {
		companyPage().waitForSaveCompanyChanges(companyName);
	}
	
	@Step
	public String getCompanyNameFromHeader() {
		return companyPage().getCompanyNameFromHeader();
	}
	
	@Step
	public void verifyCompanyName(String companyName) {
		Assert.assertTrue("Company name incorrect", getCompanyNameFromHeader().contentEquals(companyName));
	}

	@Step
    public void addCompanyNote(String note) {
		companyPage().addCompanyNote(note);
    }
	
	@Step
    public void saveCompanyNote() {
		companyPage().saveCompanyNote();
    }
	
	public void waitForSaveCompanyNote() {
		companyPage().waitForSaveCompanyNote();
	}
	

	@Step
	public String getCompanyFirstNote() {
		return companyPage().getCompanyFirstNote();
	}

	@Step
	public void verifyCompanyNote(String companyNote) {
		Assert.assertTrue("Company note incorrect", getCompanyFirstNote().contentEquals(companyNote));
	}

	@Step
    public void saveCompanyChanges() {
		companyPage().saveCompanyChanges();
    }

}