package com.app.clintelica.actionsgroups;

import net.thucydides.core.annotations.Steps;

import com.app.clintelica.actions.CommonActions;
import com.app.clintelica.actions.CompanyActions;

public class CompanyActionsGroups {

	@Steps
	public CompanyActions companySteps;
	
	@Steps
	public CommonActions commonSteps;

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