package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\java\\feature\\Mark_as_Repossess.feature",
		glue = "stepDefinition", tags="@search_by_serial_number_in_Mark_as_Repossess")
public class MarkAsRepossessSeizeRunner {

}
