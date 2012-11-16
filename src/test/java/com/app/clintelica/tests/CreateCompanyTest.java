package com.app.clintelica.tests;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import java.util.Random;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.app.clintelica.actionsgroups.CompanyActionsGroups;
import com.app.clintelica.actionsgroups.LoginActionsGroups;
import com.app.clintelica.requirements.Application;

@Story(Application.Company.CreateCompany.class)
@RunWith(ThucydidesRunner.class)
public class CreateCompanyTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @ManagedPages(defaultUrl = "")
    public Pages pages;

    @Steps
    public LoginActionsGroups loginActionsGroups;

    @Steps
    public CompanyActionsGroups companyActionsGroups;

    public String companyName;
    public String companyNote;

    
    @Before
    public void before() {
    	companyName = "NewCompany" + (new Random()).nextInt();
    	companyNote = "NewNote" + (new Random()).nextInt();

    	loginActionsGroups.login("automationclintelica@gmail.com", "6EH1n2jVgY");
    }
    
    @Test
    public void addCompanyAndNote() {
    	companyActionsGroups.addCompany(companyName);
    	companyActionsGroups.addCompanyNote(companyNote);
    }
    
    @After
    public void after() {
    	companyActionsGroups.deleteCompany(companyName);
    }
} 