package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(

        features = "src/test/resources/Login.feature",
        glue={"StepDefinition", "hooks"},
         plugin = {"pretty", "html:target/cucumber-report.html",
                 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
         }

)


public class TestRunner extends  AbstractTestNGCucumberTests  {


}



