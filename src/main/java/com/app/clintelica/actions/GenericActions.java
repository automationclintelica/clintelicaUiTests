package com.app.clintelica.actions;

import com.app.clintelica.pages.MenuNavigationPage;
import com.app.clintelica.pages.CompanyPage;
import com.app.clintelica.pages.LoginPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class GenericActions extends ScenarioSteps {

	private static final long serialVersionUID = -3239124734054413026L;

	public GenericActions(Pages pages) {
		super(pages);
		// TODO Auto-generated constructor stub
	}
	
	@Step
	public void navigate(String Url) {
		getDriver().get(Url);
	}
	
	
	//Product Steps - Pages Mappings
    public LoginPage loginPage() {
    	return getPages().currentPageAt(LoginPage.class);
    }

    public CompanyPage companyPage() {
    	return getPages().currentPageAt(CompanyPage.class);
    }

    public MenuNavigationPage commonPage() {
    	return getPages().currentPageAt(MenuNavigationPage.class);
    }

}
