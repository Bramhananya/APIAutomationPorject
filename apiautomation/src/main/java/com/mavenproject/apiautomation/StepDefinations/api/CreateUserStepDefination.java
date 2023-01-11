package com.mavenproject.apiautomation.StepDefinations.api;

import com.mavenproject.apiautomation.base.RestAssuredUtil;
import com.mavenproject.apiautomation.entities.UserPayload;

import io.cucumber.java.en.When;

public class CreateUserStepDefination extends RestAssuredUtil {

	@When("User provides the body as {string} and {string} for adminUser Creation")
	public void user_Provides_The_Body_To_Create_AdminUser(String name, String job) {
		feedJsonBody(String.format(UserPayload.CREATE_USER_PAYLOAD, name, job));

		// String payload = String.format(UserPayload.CREATE_USER_PAYLOAD, name, job);
		// feedJsonBody(payload);
	}

	@When("User hits the POST method to create adminUser")
	public void user_Hits_The_POST_Method_To_Create_AdminUser() {
		triggerAPICall("POST");
	}

	@When("User hits the POST method to create clarkuser")
	public void user_Hits_The_POST_Method_To_Create_clarkuser() {
		triggerAPICall("POST");
	}
}
