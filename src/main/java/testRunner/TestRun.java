package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = ".//Features/RandonScenarios.feature",
		glue = "stepDefinitions",
		dryRun = false,
		monochrome = true,
		plugin = {
		"pretty",
		"html:src/main/resources/demo.html"
}

)
public class TestRun {

}
