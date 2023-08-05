package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/feature", glue = "step", tags = "@techfios_newAccount", dryRun = false, plugin = {
		"pretty", "html:target/reports/cucumber.html", "json:target/reports/cucumber.json", })


public class NewAccount_runner {

}
