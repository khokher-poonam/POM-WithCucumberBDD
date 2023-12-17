package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ={"src/test/Resources/Features"},
glue = {"StepDefinitions"},
        plugin = {"pretty", "html:target/cucumber-reports/reports.html"},
        monochrome = true
//        publish = true
)

public class TestRunner{

    }


