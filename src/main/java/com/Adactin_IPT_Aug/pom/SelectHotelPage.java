package com.Adactin_IPT_Aug.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectHotelPage implements SelectHotel {

	@FindBy(id = ratiobutton_id)
	private WebElement ratiobutton;

	@FindBy(id = continue_id)
	private WebElement continuebutton;

	public void sethunandhini() {
		System.out.println("sethunandhini");
	}

}
