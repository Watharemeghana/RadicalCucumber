package com.basic;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HRMSBasic_StepDef {
	@Given("Login with admin user")
	public void login_with_admin_user() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Step:Login with admin user ");
	   //WebDriver driver=new ChromeDriver();
	   //driver.get("url");
	}

	
	@Then("validate user gettting searched")
	public void validate_user_gettting_searched() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step:validate user gettting searched ");
		//
	}

	@When("Go to PIM Tab")
	public void go_to_pim_tab() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step:Go to PIM Tab ");
	}

	@Then("User should not be searchable")
	public void user_should_not_be_searchable() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step:User should not be searchable ");
	}




}
