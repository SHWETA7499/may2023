package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features="src/test/resources/Business_logic",
		glue="mapping",
		plugin="pretty",
		monochrome=true
)	
	
	
	
	
	
public class RunTest extends AbstractTestNGCucumberTests
{

	
	
	
	
	
}
