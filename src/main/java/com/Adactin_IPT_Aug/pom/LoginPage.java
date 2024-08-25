package com.Adactin_IPT_Aug.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage implements Login{
	
	@FindBy(name= password_name)
	private WebElement password;
	
	public void malikbasha() {
		System.out.println("malik");

	}
	

	
	

}
