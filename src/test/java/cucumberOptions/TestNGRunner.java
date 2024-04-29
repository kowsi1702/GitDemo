package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features",glue = "stepDefinitions",
monochrome = true, tags = "@RegressionTest",
plugin = {"pretty","html:target/cuccumber.html","json:target/cuccumber.json"},
dryRun = true)
public class TestNGRunner extends AbstractTestNGCucumberTests{

}
