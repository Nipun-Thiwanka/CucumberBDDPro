package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/feature",
		glue = "stepDefinition" , tags="@click_on_edit_yard_operation_with_sales_stop_and_bonded_details")
public class ViewUpdateYardOperationRunner {

}
