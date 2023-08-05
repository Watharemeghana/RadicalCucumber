package com.ValidateTable;

import java.util.List;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ValidateTable_StepDef {
	Response response;
	@Given("hit the URI2")
	public void hit_the_uri2() {
		response = RestAssured.get("https://demoqa.com/BookStore/v1/Books");
	    System.out.println("got the response");
	}

	@Then("Validate Values for below data")
	public void validate_values_for_below_data(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		List<List<String>> allDataInList= dataTable.asLists();
		String firstValue=allDataInList.get(0).get(0);
		System.out.println(firstValue);
		for(int i = 0; i< allDataInList.size();i++) {
			String actualTitleString = response.getBody().jsonPath().getString( allDataInList.get(i).get(0));
			Assert.assertTrue(actualTitleString.equals(allDataInList.get(i).get(1)));
		}
	    //throw new io.cucumber.java.PendingException();
	}


}
