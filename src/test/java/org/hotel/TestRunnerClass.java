package org.hotel;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Feature\\Hotel.Feature",glue = "org.step",monochrome = true)
public class TestRunnerClass {
	
	
	

}
