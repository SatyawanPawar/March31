package com.pom.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.pom.qa.base.TestBase;

import cucumber.api.java.en.Given;

public class HomePage extends TestBase {

	// Page-Factory
	@FindBy(name = "email")
	WebElement username;

	@FindBy(name = "pass")
	WebElement password;

	@FindBy(xpath = "//input[@value='Log In']")
	WebElement loginButton;

	/*
	 * public WebElement getUsername() { return username; }
	 * 
	 * public void setUsername(WebElement username) { this.username = username; }
	 * 
	 * public WebElement getPassword() { return password; }
	 * 
	 * public void setPassword(WebElement password) { this.password = password; }
	 * 
	 * public WebElement getLoginButton() { return loginButton; }
	 * 
	 * public void setLoginButton(WebElement loginButton) { this.loginButton =
	 * loginButton; }
	 * 
	 */
	public HomePage() {
		initialize();
		PageFactory.initElements(driver, this);
	}

	@Given("^validatePageTitle$")
	public void validatePageTitle() {
		// return driver.getTitle();
		String title = driver.getTitle();
		Assert.assertEquals(title, "Facebook – log in or sign up", "Failed");
		// return "";
	}

	public UserHomePage loginSystem(String uname, String pass) {
		username.sendKeys(uname);
		password.sendKeys(pass);
		loginButton.click();
		return new UserHomePage();
	}
}
