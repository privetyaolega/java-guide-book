package testing.bdd.cucumber.runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        // define location of feature files
        features = "src/main/java/testing/bdd/cucumber/features",

        // define location of step definition classes
        glue = {"testing/bdd/cucumber/steps"},

        // generate different type of reporting
        format = {"pretty", "html:test-output", "json:test-output/cucumber.json", "junit:test-output/cucumber.xml"},

        // verify mapping of each feature step with step definition method. helps to define which step definition is missed.
        dryRun = false,

        // display the console output in a proper readable format
        monochrome = false,

        // if 'true' test is passed even if some step definition method is absent
        strict = true
)
public class CucumberRunner { }