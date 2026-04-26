package TestRunner;

import io.cucumber.core.backend.StepDefinition;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "@target/failed_scenarios.txt",
        glue = {"StepDefinition", "hooks"},
        plugin={"pretty"
        }
)

public class Failedrunner extends AbstractTestNGCucumberTests {
}
