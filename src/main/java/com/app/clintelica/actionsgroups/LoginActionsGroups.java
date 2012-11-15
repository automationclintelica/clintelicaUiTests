package com.app.clintelica.actionsgroups;

import net.thucydides.core.annotations.Steps;

import com.app.clintelica.actions.LoginActions;

public class LoginActionsGroups {

	@Steps
	public LoginActions loginSteps;

	private void fillLoginRequirements(String username, String password) {
		loginSteps.fillUsername(username);
		loginSteps.fillPassword(password);
		loginSteps.clickGoButton();
		loginSteps.waitForLogoutButton();
	}
	
	public void login(String username, String password) {
		loginSteps.navigate("https://www.clintelica.se/login");
		fillLoginRequirements(username, password);
	}

	public void login(String username, String password, String Url) {
		loginSteps.navigate(Url);
		fillLoginRequirements(username, password);
	}

	
}
