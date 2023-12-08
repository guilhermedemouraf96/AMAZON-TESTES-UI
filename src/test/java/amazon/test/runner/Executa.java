package amazon.test.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions( 
		features = "src/test/resources/features",
		glue = "amazon.test.steps",
		tags = "@regressivos",
		dryRun = false,
		monochrome = false,
		plugin = {"pretty","html:target/cucumber-report.html "},
		snippets = SnippetType.CAMELCASE
		
		
		
		)

public class Executa {

}
