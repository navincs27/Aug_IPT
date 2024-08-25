package com.Adactin_IPT_Aug.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage implements Login{
	
	@FindBy(id = User_id)
	private WebElement username;


public static void main(String args[]) {

	System.out.println("Hello! Welcome");
	
}

}