package failedScenario;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( strict = true,
		features= {"@target/rerun.txt"},
		glue= {"stepDefination"},
		dryRun = false,
		plugin= {"json:target/cucumber.json","html:target/site/cucumber-pretty",
				"rerun:target/rerun.txt"}

)

public class failScenarios2 {

}
