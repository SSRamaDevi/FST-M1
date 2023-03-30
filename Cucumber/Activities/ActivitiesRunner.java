package testRunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "Features",
        glue = {"stepDefinitions"},
        tags = "@SimpleAlert",
        plugin = {"pretty","html: test-reports","json: test-reports/json-report.json"},
        monochrome = true
)

public class ActivitiesRunner {
    //This is intentionally blank
}
