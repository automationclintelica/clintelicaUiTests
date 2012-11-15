package com.app.clintelica.actions;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;

public class CommonSteps extends AbstractSteps {


	/**
	 * 
	 */
	private static final long serialVersionUID = -2102564086496963415L;

	public CommonSteps(Pages pages) {
        super(pages);
    }

	@Step
    public void clickAddCompany() {
		commonPage().clickAddCompany();
    }
	
}