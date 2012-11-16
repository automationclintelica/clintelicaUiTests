package com.app.clintelica.actionsgroups;

import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.annotations.Steps;

import com.app.clintelica.actions.CompanyActions;
import com.app.clintelica.actions.MenuNavigationActions;

public class CompanyActionsGroups {

	@Steps
	public CompanyActions companyActions;
	
	@Steps
	public MenuNavigationActions menuNavigationActions;

	@StepGroup
	public void addCompany(String companyName) {
		menuNavigationActions.clickAddCompanyShortcut();
		companyActions.fillCompanyName(companyName);
		companyActions.saveChanges();
		companyActions.waitForSaveChanges(companyName);
		companyActions.verifyCompanyName(companyName);
	}

	@StepGroup
	public void addCompanyNote(String companyNote) {
		companyActions.addCompanyNote(companyNote);
		companyActions.saveCompanyNote();
		companyActions.saveCompanyChanges();
		companyActions.waitForSaveCompanyNote();
		companyActions.verifyCompanyNote(companyNote);
	}
	
	public void deleteCompany(String companyName) {
		menuNavigationActions.clickCrmMenu();
		menuNavigationActions.clickCompanyInfoSubMenu();
	}

	public void searchCompany(String companyName) {
		menuNavigationActions.clickCrmMenu();
		menuNavigationActions.clickCompanyInfoSubMenu();
		companyActions.fillCompanySearchName(companyName);
		companyActions.searchCompany();
	}
}