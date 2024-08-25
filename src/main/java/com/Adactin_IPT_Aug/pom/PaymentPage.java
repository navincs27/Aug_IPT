package com.Adactin_IPT_Aug.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPage implements Payment{

		

	@FindBy(name = firstname_name)
	private WebElement firstname;

	@FindBy(name = lastname_name)
	private WebElement lastname;
	
	public void print() {
		System.out.println("This is Swathy");
	}
	
}
