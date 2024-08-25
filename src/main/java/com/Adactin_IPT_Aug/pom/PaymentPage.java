package com.Adactin_IPT_Aug.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPage implements Payment{

	@FindBy(id=ccvnobtn_id)
	private WebElement ccvno_btn;
	
	@FindBy(id=booknowbtn_id)
	private WebElement booknow_btn;
	
	public void bookingHotel() {
		System.out.println("booked");
	}
}
