package com.app.clintelica.actions;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;

public class MenuNavigationActions extends GenericActions {


	private static final long serialVersionUID = -2102564086496963415L;

	public MenuNavigationActions(Pages pages) {
        super(pages);
    }

	@Step
    public void clickAddCompanyShortcut() {
		commonPage().clickAddCompanyShortcut();
    }
	
}