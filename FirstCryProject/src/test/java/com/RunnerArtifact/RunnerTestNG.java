package com.RunnerArtifact;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
 
@CucumberOptions(features = "src\\test\\resource\\com\\Features", glue = { "com.StepsDefinitions" })
public class RunnerTestNG extends AbstractTestNGCucumberTests {
}
