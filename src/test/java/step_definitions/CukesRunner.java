package step_definitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = { "Resources/SearchScenario.feature" },
		glue= {"stepDefinitions"},
		format = {"pretty", "html:target/cucumber"})
public class CukesRunner {

}
