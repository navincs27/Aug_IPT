package com.Adactin_IPT_Aug.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
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
	
	@FindBy(id = "User_id")
	private WebElement username;
	
	@FindBy(name= password_name)
	private WebElement password;
	
	@FindBy(name = Login_name)
	private WebElement LoginBtn;
	
	public void malikbasha() {
		System.out.println("malik");

	}
	
	public void lakshmiPriya() {
		System.out.println("Hello Lakshmi Priya");
	}
  
	public void backlogBusters() {
		System.out.println("Hello!!!!!! Backlog Busters");
	}

public static void main(String args[]) {

	System.out.println("Hello! Welcome");

	
}

}