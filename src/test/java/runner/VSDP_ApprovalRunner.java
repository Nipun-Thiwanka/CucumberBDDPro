package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\java\\feature",
		glue = "stepDefinition",tags="@Click_on_VSDPApproval")
public class VSDP_ApprovalRunner {

}
