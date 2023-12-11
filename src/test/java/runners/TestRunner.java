package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\USER\\eclipse-workspace\\RLL-Login-Cucumber\\src\\test\\java\\features\\LoginBooksWagon.feature",
				glue= {"stepDefinition"},
				dryRun=false,
						plugin={"pretty",
								"html:target/myreport2.html",
								  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
								  "timeline:test-output-thread/"}
)
public class TestRunner {

}
