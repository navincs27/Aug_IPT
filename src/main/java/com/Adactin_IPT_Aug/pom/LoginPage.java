package com.Adactin_IPT_Aug.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage implements Login{
	
	
	
	
	
	
	
	public void lakshmiPriya() {
		System.out.println("Hello Lakshmi Priya");
	}
	
	public AdactinLoginPOM(WebDriver driver) {
		adactinDriver=driver;
		PageFactory.initElements(driver,this);		
	}
	

}
