package com.app.clintelica.tests;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import java.util.Random;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.app.clintelica.actionsgroups.CompanyActionsGroups;
import com.app.clintelica.actionsgroups.LoginActionsGroups;
import com.app.clintelica.requirements.Application;

@Story(Application.LoginLogout.Login.class)
@RunWith(ThucydidesRunner.class)
public class CompanyTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @ManagedPages(defaultUrl = "")
    public Pages pages;

    @Steps
    public LoginActionsGroups loginActions;

    @Steps
    public CompanyActionsGroups companyActions;

  
    @Test
    public void addCompanyAndNote() {
    	loginActions.login("automationclintelica@gmail.com", "6EH1n2jVgY");
    	Random generator = new Random();
    	int companyNumber = generator.nextInt();
    	companyActions.addCompany("my new company" + companyNumber);
    	companyActions.addCompanyNote("my company note");
    }
} 