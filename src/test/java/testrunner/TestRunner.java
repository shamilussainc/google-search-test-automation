package testrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/java/features",glue ={"stepdefinition"},
        plugin = {"pretty","junit:target/JUnitReports/report.xml",
                "html:target/HtmlReports/report.html",
                "json:target/JSONReports/report.json"})
public class TestRunner {
}
