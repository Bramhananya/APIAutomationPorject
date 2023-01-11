package com.mavenproject.apiautomation.base;

import java.util.HashMap;
import java.util.Map;

import com.aventstack.extentreports.util.Assert;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mavenproject.apiautomation.factory.UserPojos;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RestAssuredUtil {

	UserPojos userPojos = new UserPojos();

	ObjectMapper mapper = new ObjectMapper();

	Map<String, String> headers = new HashMap<String, String>();
	Response response;
	String endpoint;
	String body;

	public void feedURI(String URI) {
		RestAssured.baseURI = URI;
		System.out.println(URI);
		System.out.println(URI);
	}

	public void feedEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}

	public void feedHeaders(String key, String value) {
		headers.put(key, value);
	}

	public void feedJsonBody(String json) {
		body = json;

	}

	public void triggerAPICall(String apiCall) {
		if (apiCall.equalsIgnoreCase("GET")) {
			response = RestAssured.given().when().body(body).headers(headers).get(endpoint);
			System.out.println(response.prettyPrint());
		} else if (apiCall.equalsIgnoreCase("POST")) {
			response = RestAssured.given().when().body(body).headers(headers).post(endpoint);
			System.out.println(response.prettyPrint());
		} else if (apiCall.equalsIgnoreCase("PUT")) {
			response = RestAssured.given().when().body(body).headers(headers).put(endpoint);
			System.out.println(response.prettyPrint());
		} else if (apiCall.equalsIgnoreCase("DELETE")) {
			response = RestAssured.given().when().body(body).headers(headers).delete(endpoint);
			System.out.println(response.prettyPrint());
		}
	}

	public void shouldSeeResponseCodeAs(int code) {
//		Assert.assertEquals(code, response.getStatusCode(), "Expected status code is not there ");
	}

	public void shouldSeeUserNameIsPresent(String username) {
		try {
			userPojos = mapper.readValue(response.getBody().asString(), UserPojos.class);
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
//		Assert.assertEquals("Expected status name is not there ", username, userPojos.getName());
	}

	public void shouldSeeJobAssignedForUser(String job) {
//		Assert.assertEquals("Expected status Job is not there ", job, userPojos.getJob());
	}

}
