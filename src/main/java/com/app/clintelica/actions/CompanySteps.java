package com.app.clintelica.actions;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;

public class CompanySteps extends AbstractSteps {


	/**
	 * 
	 */
	private static final long serialVersionUID = 3422591601677040409L;

	public CompanySteps(Pages pages) {
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
    public void addCompanyNote(String note) {
		companyPage().addCompanyNote(note);
    }

	@Step
    public void saveCompanyChanges() {
		companyPage().saveCompanyChanges();
    }

}