package NewRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.deps.com.thoughtworks.xstream.core.AbstractTreeMarshallingStrategy;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="/Users/waqaskhan/Desktop/eclipse/com.abcProject/features/MyApp.feature",
		glue= {"stepDefination"},
		plugin= {"html:target/site/cucumber-pretty",
				"json:target/cucumber.json",
				"rerun:target/rerun.txt"}
)

public class TestRunnerNew2  {

}
