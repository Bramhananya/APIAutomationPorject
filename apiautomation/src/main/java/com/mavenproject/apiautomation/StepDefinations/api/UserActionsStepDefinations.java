package com.mavenproject.apiautomation.StepDefinations.api;

import com.mavenproject.apiautomation.base.RestAssuredUtil;
import com.mavenproject.apiautomation.entities.UserPayload;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserActionsStepDefinations extends RestAssuredUtil {

	String url = "https://reqres.in";

	@Given("User Provides Valid URI")
	public void user_provides_valid_uri() {
		feedURI(url);
	}

	@When("User provides valid endpoint as {string}")
	public void user_provides_valid_endpoint_as(String endpoint) {
		feedEndpoint(endpoint);
	}

	@When("User provides valid content type as {string}")
	public void user_provides_valid_content_type_as(String contentType) {
		feedHeaders("Content-Type", contentType);
	}

	@Then("User provides the body as {string} and {string}")
	public void user_provides_the_body_as(String name, String job) {
		String payload = String.format(UserPayload.CREATE_USER_PAYLOAD, name, job);
		feedJsonBody(payload);
	}

	@Then("User hits the {string} method")
	public void user_hits_the_post_method(String methodType) {
		triggerAPICall(methodType);
	}

	@Then("Verify the response code as {int}")
	public void verify_the_response_code_as(int statusCode) {
		shouldSeeResponseCodeAs(statusCode);
	}

	@And("Verify reponse contains name as {string}")
	public void verify_reponse_contains_valid_data_modified_data(String name) {
		shouldSeeUserNameIsPresent(name);
	}

	@And("Verify reponse contains job as {string}")
	public void Verify_reponse_contains_job(String job) {
		shouldSeeJobAssignedForUser(job);

	}

	/*
	 * @Then("User hit the {string} method") public void
	 * User_hits_the_get_method(String callGET) { triggerAPICall(callGET); }
	 */
	@And("User provides updatedvalid endpoint as {string}")
	public void user_provides_updatedvalid_endpoint_as(String upendpoint) {
		feedEndpoint(upendpoint);
	}

	@And("User hiits the {string} method")
	public void User_hiits_the_PUT_method(String putmethodType) {
		triggerAPICall(putmethodType);
	}

	@When("User provides deletevalid endpoint as {string}")
	public void user_provides_deletevalid_endpoint_as(String deletevalidupendpoint) {
		feedEndpoint(deletevalidupendpoint);
	}

	@And("User hiitsS the {string} method")
	public void User_hiitss_the_PUT_method(String pputmethodType) {
		triggerAPICall(pputmethodType);
	}

	@Then("Verify the response code ass {int}")
	public void Verify_the_response_code_ass(int sstatusCode) {
		shouldSeeResponseCodeAs(sstatusCode);
	}

}
