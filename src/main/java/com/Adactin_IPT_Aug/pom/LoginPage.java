package com.Adactin_IPT_Aug.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage implements Login{
	
	
	@FindBy(name = Login_name)
	private WebElement LoginBtn;
	

}
