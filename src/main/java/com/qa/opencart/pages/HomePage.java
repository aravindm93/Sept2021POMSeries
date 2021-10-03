package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	private WebDriver driver;
	private By myAccountDropDown = By.xpath("//span[@class='caret']");
	private By myAccountLink = By.linkText("My Account");
	private By myAccountLabel = By.xpath("//h2[text()='My Account']");
	//private By myOrdersLabel = By.xpath("//h2[text()='My Orders']");
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public String getHomePageTitle() {
		return driver.getTitle();
	}
	
	public boolean isMyAccountLinkPresent() {
		driver.findElement(myAccountDropDown).click();
		if (driver.findElement(myAccountLink).isDisplayed()) {
			return true;   	
		}
		return false;
		
	}
	
	public boolean isMyAccountLabelPresent() {
		if (driver.findElement(myAccountLabel).isDisplayed()) {
			return true;
		}
		return false;
	}

}
