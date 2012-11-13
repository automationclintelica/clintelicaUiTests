package com.app.clintelica.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import net.thucydides.core.pages.PageObject;

public class AbstractPage extends PageObject {

	public AbstractPage(WebDriver driver) {
		super(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().setScriptTimeout(90, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
}
