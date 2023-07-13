package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\java\\feature",
		glue = "stepDefinition",tags="@Click_On_View_or_Update_Yard_Valuation")

public class YardValuationRunner {

}
