package com.pom.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pom.qa.base.TestBase;
import com.pom.qa.pages.HomePage;

public class HomePageTests extends TestBase {

	HomePage homePage;

	public HomePageTests() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialize();
		homePage = new HomePage();
	}

	@Test(priority = 1, description = "First Test Case")
	public void homePageTitleTest() {
		// String title = homePage.validatePageTitle();
		// Assert.assertEquals(title, "Facebook – log in or sign up");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
