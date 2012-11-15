package com.app.clintelica.actionsgroups;

import net.thucydides.core.annotations.Steps;

import com.app.clintelica.actions.MenuNavigationActions;
import com.app.clintelica.actions.CompanyActions;

public class CompanyActionsGroups {

	@Steps
	public CompanyActions companyActions;
	
	@Steps
	public MenuNavigationActions commonActions;

	public void addCompany(String companyName) {
		commonActions.clickAddCompanyShortcut();
		companyActions.fillCompanyName(companyName);
		companyActions.saveChanges();
	}

	public void addCompanyNote(String note) {
		companyActions.addCompanyNote(note);
		companyActions.saveCompanyChanges();
	}

}