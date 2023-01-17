package com.mavenproject.apiautomation;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

  @RunWith(Cucumber.class)
  @CucumberOptions(features = ".\\src\\test\\resources\\features", glue = {"com/mavenproject/apiautomation/StepDefinations"},tags = {"@RunPipeline"}) 
  public class TestRunner {
		
}
