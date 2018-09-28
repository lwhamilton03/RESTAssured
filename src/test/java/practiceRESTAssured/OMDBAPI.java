package practiceRESTAssured;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.equalTo;

public class OMDBAPI {
	
	private Response response; 
	private RequestSpecification request; 
	private ValidatableResponse json; 
	
	@Before 
	public void setUp()
	{
		
	}
	
	@Given("^a film exists with the Title Guardians of the Galaxy Two$")
	public void a_film_exists_with_the_Title_Guardians_of_the_Galaxy_Two() 
	{
		request = given().contentType(ContentType.JSON);
	}

	@When("^a user retrieves the film by the title Guardians of the Galaxy Two$")
	public void a_user_retrieves_the_film_by_the_title_Guardians_of_the_Galaxy_Two() 
	{
	   // response = request.when().get(Constants.APILINK + "&t=Guardians of the Galaxy Vol. 2");
		response = request.when().get(Constants.APLINK + "&t=Guardians of the Galaxy Vol .2");
	}

	@Then("^the status code reads (\\d+)$")
	public void the_status_code_reads(int arg1) 
	{
		json = response.then().statusCode(arg1);
		
	}

	@Given("^a film exists with the Title IT$")
	public void a_film_exists_with_the_Title_IT() 
	{
	    request = given().contentType(ContentType.JSON);
	}

	@When("^a user retrieves the film by the title IT$")
	public void a_user_retrieves_the_film_by_the_title_IT() 
	{
		response = request.when().get(Constants.APILINK + "&t=IT");
	}

	@Then("^the Rated Field is equal to R$")
	public void the_Rated_Field_is_equal_to_R() 
	{
		json = response.then().body("Rated", equalTo("R")); 
	}

	@Given("^a film exists with the Title \"([^\"]*)\"$")
	public void a_film_exists_with_the_Title(String arg1) 
	{
	    request = given().contentType(ContentType.JSON);
	}

	@When("^a user retrieves the film by the title \"([^\"]*)\"$")
	public void a_user_retrieves_the_film_by_the_title(String arg1) 
	{
		response = request.when().get(Constants.APILINK + "&t=" + arg1);
	}

	@Then("^the Rated Field is equal to \"([^\"]*)\"$")
	public void the_Rated_Field_is_equal_to(String arg1) 
	{
	    json = response.then().body("Rated", equalTo(arg1));
	}
	
	@After
	public void tearDown()
	{
		
	}
}
