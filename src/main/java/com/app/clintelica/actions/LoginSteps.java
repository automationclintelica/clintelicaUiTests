package com.app.clintelica.actions;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;

public class LoginSteps extends AbstractSteps {

	private static final long serialVersionUID = -1598136159248782258L;


	public LoginSteps(Pages pages) {
        super(pages);
    }

	@Step
    public void fillUsername(String username) {
    	loginPage().fillUsername(username);
    }
	
	@Step
    public void fillPassword(String password) {
    	loginPage().fillPassword(password);
    }
	
	@Step
    public void clickGoButton() {
    	loginPage().clickGoButton();
    }
	
	@Step
	public void waitForLogoutButton() {
		loginPage().waitForLogoutButton();
	}
}
