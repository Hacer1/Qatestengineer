package com.foursquare.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features/"
		,glue="com/foursquare/steps"
		,dryRun=true
		,monochrome=true
     	//,tags= {"@smoke"}    
		,plugin = {"pretty", "html:target/cucumber-default-reports", "json:target/cucumber.json"}
		)

public class TestRunner  { 

}
