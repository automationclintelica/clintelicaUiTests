package com.app.clintelica.testsuites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.app.clintelica.tests.CreateCompanyTest;
import com.app.clintelica.tests.LoginTest;
import com.app.clintelica.tests.SearchCompanyTest;

@RunWith(Suite.class)
@SuiteClasses({LoginTest.class, CreateCompanyTest.class, SearchCompanyTest.class})
public class VerifySolution {

}
