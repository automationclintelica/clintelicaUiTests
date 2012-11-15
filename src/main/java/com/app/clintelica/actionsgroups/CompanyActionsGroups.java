package com.app.clintelica.actionsgroups;

import net.thucydides.core.annotations.Steps;

import com.app.clintelica.actions.CommonSteps;
import com.app.clintelica.actions.CompanySteps;

public class CompanyActionsGroups {

	@Steps
	public CompanySteps companySteps;
	
	@Steps
	public CommonSteps commonSteps;

	public void addCompany(String companyName) {
		commonSteps.clickAddCompany();
		companySteps.fillCompanyName(companyName);
		companySteps.saveChanges();
	}

	public void addCompanyNote(String note) {
		companySteps.addCompanyNote(note);
		companySteps.saveCompanyChanges();
	}

}