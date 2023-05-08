package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/features"},
		glue = {"stepdifinations"},
		plugin = {"pretty", "html:test-output", "json:target/cucumber-report/cucumber.json" },
		monochrome = true
		)

public class Runner {

}
