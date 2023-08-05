package com.ApplicationUp;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;


public class ApplicationUp_StepDef {
	Response response;
	@Given("Hit URI")
	public void hit_uri() {
	    response=RestAssured.given().relaxedHTTPSValidation().get("https://demoqa.com/BookStore/v1/Books");
	    System.out.println("Get the response");
	}

	
	@Then("validate the response {string}")
	public void validate_the_response(String StatusCode) {
	    response.then().log().all();
	    String ActualStatusCode=""+response.getStatusCode()+"";
	    
	    Assert.assertEquals(StatusCode, ActualStatusCode);
	}

	
}
