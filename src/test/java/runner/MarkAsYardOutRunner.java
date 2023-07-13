package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\java\\feature",
		glue = "stepDefinition",tags="@Click_On_Mark_As_Yard_Out")

public class MarkAsYardOutRunner {

}
