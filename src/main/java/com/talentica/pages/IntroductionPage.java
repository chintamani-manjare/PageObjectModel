package com.talentica.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.talentica.testbase.TestBase;

public class IntroductionPage extends TestBase {
	
	//Page factory
	@FindBy(linkText="Page 4")
	WebElement contactLink;
	
	//Initialization
	public IntroductionPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public ContactPage clickOnContactLink(){
		contactLink.click();
		return new ContactPage();
	}

}
