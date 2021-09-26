package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	private WebDriver driver;
	
	// 1. By Locators: OR
	
	private By emailTextBox = By.id("input-email");
	private By passwordTextBox = By.id("input-password");
	private By loginButton = By.xpath("//input[@value='Login']");
	private By forgotPasswordLink = By.linkText("Forgotten Password");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean isForgotPasswordLinkPresent() {
		return driver.findElement(forgotPasswordLink).isDisplayed();
	}
	
	public void loginPageTest(String un, String pwd) {
		System.out.println("Login with "+un+"password "+pwd);
		driver.findElement(emailTextBox).sendKeys(un);
		driver.findElement(passwordTextBox).sendKeys(pwd);
		driver.findElement(loginButton).click();
	}

}
