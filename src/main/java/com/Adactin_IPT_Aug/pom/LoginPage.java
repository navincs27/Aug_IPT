package com.Adactin_IPT_Aug.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

<<<<<<< HEAD
public class LoginPage implements Login{
	
	@FindBy(id = User_id)
	private WebElement username;
=======
	
	
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
	
	@FindBy(name= password_name)
	private WebElement password;
	
	public void malikbasha() {
		System.out.println("malik");

	}

	@FindBy(name = Login_name)
	private WebElement LoginBtn;
	
	public void lakshmiPriya() {
		System.out.println("Hello Lakshmi Priya");
	}
>>>>>>> 06e767499f655570144feeeed19d6055e8381a33

<<<<<<< HEAD
=======

public static void main(String args[]) {

	System.out.println("Hello! Welcome");
>>>>>>> 587838bff02f272bcb6582c390507fec0e7302a3
	
}

}