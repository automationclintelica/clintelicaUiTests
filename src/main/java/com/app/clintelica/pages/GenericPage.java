package com.app.clintelica.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.thucydides.core.pages.PageObject;

public class GenericPage extends PageObject {

	public GenericPage(WebDriver driver) {
		super(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().setScriptTimeout(90, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public Object documentReady() {
		return evaluateJavascript("window.scrollBy(0,50);");
	}
	
	public void focusWebElement(String webElement, int position) {
		evaluateJavascript("var webElement = jQuery(' " + webElement + " ').eq("+ position + "); webElement.focus();");
	}
	
	public void mouseOverWebElement(String webElement, int position) {
		evaluateJavascript("var webElement = jQuery(' " + webElement + " ').eq("+ position + "); webElement.mouseover(); ");
	}
	
	public Object evaluateImagesLoading(){
		
		try {
			waitABit(2000);
			Object object =  evaluateJavascript("var elems = document.getElementsByTagName(\"img\"); var allOk = true; for(var i = 0; i < elems.length; i++) {allOk &= elems[i].complete && typeof elems[i].naturalWidth != \"undefined\" && elems[i].naturalWidth > 0;} !allOk;");
			waitABit(3000);
			return object;
		}
		catch (Exception e){
		}
		return 0;
	}
	
}
