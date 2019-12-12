package Runnerclass;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features = 
{"src\\test\\resources\\Property\\MyImages.feature"},glue="stepDefinition",
		monochrome = true,tags= {"@smoketest"},
plugin={"com.cucumber.listener.ExtentCucumberFormatter:target/html/ExtentReport.html"})

//tags= {"@smoketest"}

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






















//plugin= {"pretty","html:target"},
//D:\\SELENIUM\\Click2mail\\C2M\\src\\test\\resources\\Property\\Shipped.feature",
//"D:\\SELENIUM\\Click2mail\\C2M\\src\\test\\resources\\Property\\Print.feature
//tags= {"@smoketest"},