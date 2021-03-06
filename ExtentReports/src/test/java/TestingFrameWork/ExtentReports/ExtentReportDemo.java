package TestingFrameWork.ExtentReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportDemo{

	//Need to declare globally so that the variable can be used in other tests too
	ExtentReports extent;
	@BeforeTest
	public void config()
	{
		//ExtentReports & ExtentSparkreporter classes are needed
		//user.dir will get the project path till the project name(ExtentReports)
		String path=System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter= new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation Results");
	reporter.config().setDocumentTitle("Test Results");
	
	//this is the main class , responsible to generate reports
	extent=new ExtentReports();
	extent.attachReporter(reporter);
	extent.setSystemInfo("Tester", "Kavya");
			
	}
	
	
	@Test
	public void InitialDemo()
	{
		//Actual test case result must go to the report
				//this step is mandatory so that extent object is aware of the test case
		 extent.createTest("Demo");
		
	System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com");
	System.out.println(driver.getTitle());
	extent.flush();
	//even this step is mandatory at the end of last test case & will notify that the test is done.after the flush is done, will specify pass/fail & do the reporting
			
	}
}
