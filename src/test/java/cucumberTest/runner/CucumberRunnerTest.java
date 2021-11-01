package cucumberTest.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "com.epam.reportportal.cucumber.ScenarioReporter"},
        monochrome = true,
        glue = "cucumberTest",
        features = "classpath:features"
)
public class CucumberRunnerTest {
}
