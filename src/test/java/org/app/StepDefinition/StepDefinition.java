package org.app.StepDefinition;

import java.io.IOException;

import org.testng.Assert;

import com.app.LoginExecutions.LoginExecutions;
import com.app.LoginExecutions.SearchHotelPageExecutions;
import com.app.base.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends SearchHotelPageExecutions
{
	@Given("Browser opens")
	public void browser_opens() 
	{
	    BaseClass.loadDriver("https://adactinhotelapp.com/index.php");
	}
	
	@When("user enters username")
	public void user_enters_username() throws IOException
	{
		username();
	}
	@When("user enters password")
	public void user_enters_password() throws IOException
	{
		password();   
	}
	@When("click the login button")
	public void click_the_login_button() 
	{
		login();  
	}
	@Then("validates to homepage")
	public void validates_to_homepage() 
	{
       Assert.assertTrue(driver.getCurrentUrl().contains("https://adactinhotelapp.com/SearchHotel.php"));

	}
	
	@Given("Enter all the required details")
	public void enter_all_the_required_details() throws IOException, InterruptedException 
	{
		location();
		waiting();
		hotels();
		waiting();
		roomType("Deluxe");
		waiting();
		noofrooms("3 - Three");
		waiting();
		chkindate();
		waiting();
		chkoutdate();
		waiting();
		adultrooms();
		waiting();
		childrooms("3 - Three");
		
	}
	@Then("click search")
	public void click_search()
	{
		submit();
	}
	
	
}
