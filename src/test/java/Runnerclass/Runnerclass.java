package Runnerclass;

import java.io.File;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = 
{"src\\test\\resources\\Property\\Myimagesa.feature"},glue="stepDefinition",tags= {"@smoketest"},monochrome = true,
	 plugin={"com.cucumber.listener.ExtentCucumberFormatter:target/html/ExtentReport.html"})

public class Runnerclass
	{
	@AfterClass
	public static void setup()
	{
	Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
	Reporter.setSystemInfo("Test User", System.getProperty("user.name"));
	Reporter.setSystemInfo("User Name", "Raju Tarigoppula");
	Reporter.setSystemInfo("Application Name", "Click2mail");
	Reporter.setSystemInfo("Operating System Type", System.getProperty("os.name").toString());
	Reporter.setSystemInfo("Environment", "Testing");
	Reporter.setTestRunnerOutput("Test Execution Cucumber Report");
	}
}


/* tags= {"@smoketest"}
 * plugin={"com.cucumber.listener.ExtentCucumberFormatter:target/html/ExtentReport.html"})

"src\\test\\resources\\Property\\MyDocuments.feature",
"src\\test\\resources\\Property\\MyImages.feature",
"src\\test\\resources\\Property\\MyMailingLists.feature",
"src\\test\\resources\\Property\\MyProjects.feature",
"src\\test\\resources\\Property\\Print.feature",
"src\\test\\resources\\Property\\Shipped.feature"  */


//plugin= {"pretty","html:target"},
//D:\\SELENIUM\\Click2mail\\C2M\\src\\test\\resources\\Property\\Shipped.feature",
//"D:\\SELENIUM\\Click2mail\\C2M\\src\\test\\resources\\Property\\Print.feature
