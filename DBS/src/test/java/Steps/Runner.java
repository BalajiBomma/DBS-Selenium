package Steps;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/Features",
		glue = {"Steps"},
		monochrome = true,publish = false,
		plugin = {"pretty", "html:Reports/FacebookRepo.htm"}, 
		tags="@Facebook"

		)
public class Runner {

}
