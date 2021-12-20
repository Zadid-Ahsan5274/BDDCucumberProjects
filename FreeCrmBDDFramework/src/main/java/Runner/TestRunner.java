package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./src/main/java/Features/login.feature",
		glue = {"stepDefinitions"},
		dryRun = false,
		monochrome = true,
		plugin = {"pretty","html:test-output"}
		)
public class TestRunner {

}
