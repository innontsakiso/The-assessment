package CucumberOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;


//@RunWith(Cucumber.class)
//@CucumberOptions
@CucumberOptions(
        features = "src/test/java/Features/Login.feature",
        glue = "StepDefinition", monochrome = true)
public class TestRunner extends AbstractTestNGCucumberTests {


}


