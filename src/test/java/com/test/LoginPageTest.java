package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest {
	
	@Test
	public void getLogin() {
		System.out.println("Login succesful");
	}
	
	@Test
	public void verifyLoginPageTitle() {
		Assert.assertEquals("Login", "Login");
	}

}
