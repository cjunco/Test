package runner;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.Test;

@CucumberOptions(
        features = {"src/test/java/features"},
        glue = {"steps"},
        plugin = {"pretty", "html:target/cucumber-reports"},
        tags = {"@Regression"},
        monochrome = true
)

@Test
public class TestRunner extends AbstractTestNGCucumberTests {

}
