package CucumberOptions;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import java.io.*;

//feature
//stepDefinition
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/Feature",
		glue = "stepDefinition",
		plugin = {"pretty", 
					"junit:target/ReportsToBeSentToClient/report.xml"},
		publish= true)
public class TestRunner {

	
	
}
