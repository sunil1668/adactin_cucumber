package com.app.LoginExecutions;

import java.io.IOException;

import com.app.base.BaseClass;
import com.app.locators.SearchHotelPageLocator;

public class SearchHotelPageExecutions extends LoginExecutions

{

	public static void location()
	{
	BaseClass.dropselectvisibletext(BaseClass.findelementobject(new SearchHotelPageLocator().getLocation()), "Melbourne");
	}

	public static void hotels()
	
	{
     BaseClass.dropselectbyindex(BaseClass.findelementobject(new SearchHotelPageLocator().getHotes()), 3);
	}
	
	public static void roomType(String data)
	{
		BaseClass.dropselectvisibletext(BaseClass.findElement(SearchHotelPageLocator.Roomtype), data);
	}
	
	public static void noofrooms(String rooms)
	{
		BaseClass.dropselectvisibletext(BaseClass.findElement(SearchHotelPageLocator.Noofrooms), rooms);
	}
	
	public static void chkindate() throws IOException
	{
		BaseClass.sendData(BaseClass.findElement(SearchHotelPageLocator.checkindate), BaseClass.Exceldata("Sheet1", 0, 0));
	}
	
	public static void chkoutdate() throws IOException
	{
		BaseClass.sendData(BaseClass.findElement(SearchHotelPageLocator.checkout), BaseClass.Exceldata("Sheet1", 1, 0));
	}
	
	public static void adultrooms()
	{
		BaseClass.dropselectbyindex(BaseClass.findElement(SearchHotelPageLocator.Adultsroom), 3);
	}
	
	public static void childrooms(String rooms)
	{
		BaseClass.dropselectvisibletext(BaseClass.findElement(SearchHotelPageLocator.Childroom), rooms);
	}
	
	public static void submit()
	{
		BaseClass.clickData(BaseClass.findElement(SearchHotelPageLocator.clicksearch));
	}
}	
