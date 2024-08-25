package com.Adactin_IPT_Aug.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchHotelPage implements SearchHotel {

	@FindBy(id = RoomType_id)
	private WebElement roomType;

	@FindBy(id = NoOfRooms_id)
	private WebElement noOfRooms;

	public void name() {
		System.out.println("Rossie");
	}

}
