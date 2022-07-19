package stepsForHooks;

import org.junit.runner.RunWith;

import com.beust.jcommander.Parameters;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/hooksInBDD.feature", glue= {"stepsForHooks"}, 
monochrome = true,
plugin = {"pretty","html:FeatureReportCucumberFormat/HTMLReport/html"})
public class TestRunnerWithHooks {

	
}
