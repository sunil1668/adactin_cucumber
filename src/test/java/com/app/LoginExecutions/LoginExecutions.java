package com.app.LoginExecutions;

import java.io.IOException;

import com.app.base.BaseClass;
import com.app.locators.LoginLocators;

public class LoginExecutions extends LoginLocators {

	
	public  static void username() throws IOException 
	{
		BaseClass.sendData(BaseClass.findElement(LoginLocators.username), BaseClass.properties("username"));
	}
	
	public static void password() throws IOException
	{
		BaseClass.sendData(BaseClass.findElement(LoginLocators.password), BaseClass.properties("password"));
	}
	
	public static void login()
	{
		BaseClass.clickData(BaseClass.findElement(LoginLocators.submit));
	}
}
