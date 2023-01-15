package com.mavenproject.apiautomation.StepDefinations.api;

import org.json.JSONObject;

import com.mavenproject.apiautomation.base.RestAssuredUtil;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class UpdateUser extends RestAssuredUtil {

	@Then("update the name {string} & job as {string}")
	public void update_the_name_job_as(String name, String job) {
		JSONObject body = new JSONObject();
		body.put("name", name);
		body.put("job", job);

	}

	@Then("user hit the {string} method")
	public void user_hit_the_method(String call) {
		triggerAPICall(call);
	}

	@And("Validate the updated user responce contain name as {string}")
	public void validate_the_updated_user_responce_contain_name_as(String name) {
		shouldSeeUserNameIsPresent(name);
	}

	@And("validate the updated user contain job as {string}")
	public void validate_the_updated_user_contain_job_as(String job) {
		shouldSeeJobAssignedForUser(job);
	}

	@Then("Verify username is displayed Correctly")
	public void verify_Username_Is_Displayed_Correctly() {

	}
}
