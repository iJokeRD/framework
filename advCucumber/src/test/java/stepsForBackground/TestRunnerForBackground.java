package stepsForBackground;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/background.feature", glue= {"abcd"}, 
monochrome = true,
plugin = {"pretty","html:FeatureReportCucumberFormat/HTMLReport/html"})

public class TestRunnerForBackground {

}
