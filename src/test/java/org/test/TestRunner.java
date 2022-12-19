package org.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Sabari\\eclipse-workspace\\Cucumber\\src\\test\\resources\\Facebook.feature"
,glue="org.step",monochrome=true,dryRun=false)
public class TestRunner {
	
}
