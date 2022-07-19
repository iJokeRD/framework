package stepDefinitionTestProject;

import org.junit.runner.RunWith;

import com.beust.jcommander.Parameters;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/tagsInBDD.feature", glue= {"stepDefinitionTestProject"}, 
monochrome = true,
tags= "@SmokeTest or  ~@RegressionTest",
plugin = {"pretty","html:FeatureReportCucumberFormat/HTMLReport/html"})
public class TestRunnerWithTags {

	
}
