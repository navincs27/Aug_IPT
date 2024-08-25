package com.Adactin_IPT_Aug.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage implements Login {
	WebDriver adactinDriver;

	public LoginPage(WebDriver driver) {
		adactinDriver=driver;
		PageFactory.initElements(driver,this);		
	}

	@FindBy(name = Login_name)
	private WebElement LoginBtn;
	
	public void lakshmiPriya() {
		System.out.println("Hello Lakshmi Priya");
	}

}
