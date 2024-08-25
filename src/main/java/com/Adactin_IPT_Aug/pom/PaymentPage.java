package com.Adactin_IPT_Aug.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPage implements Payment{
	
	@FindBy(id = billingadress_id)
	private WebElement adress;
	
	@FindBy(id = creditcard_xpath)
	private WebElement creditno;
	
	private void sample() {
		
		System.out.println("vishnu");

	}

	@FindBy(id=ccvnobtn_id)
	private WebElement ccvno_btn;
	
	@FindBy(id=booknowbtn_id)
	private WebElement booknow_btn;
	
	public void bookingHotel() {
		System.out.println("booked");
	}
}
