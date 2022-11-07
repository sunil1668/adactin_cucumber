package com.app.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPageLocator extends LoginLocators
{
	
public SearchHotelPageLocator()
{
	PageFactory.initElements(driver, this);
}
@FindBy(id="location")
private WebElement location;

@FindBy(id="hotels")
private WebElement hotes;

public WebElement getLocation() {
	return location;
}

public WebElement getHotes() {
	return hotes;
}

public static By Roomtype = By.id("room_type");

public static By Noofrooms = By.id("room_nos");

public static By checkindate = By.id("datepick_in");

public static By checkout = By.id("datepick_out");

public static By Adultsroom = By.id("adult_room");

public static By Childroom = By.id("child_room");

public static By clicksearch = By.id("Submit");

}
