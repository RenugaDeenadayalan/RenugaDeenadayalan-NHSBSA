package resources;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extentReports {
	
	static ExtentReports report;
	public static ExtentReports getreports() {
		
		String Path = System.getProperty("User.dir")+"//reports//extentreport.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(Path);
		reporter.config().setReportName("Automation Web Results");
		reporter.config().setDocumentTitle("Test Report");
		report = new ExtentReports();
		report.attachReporter(reporter);
		report.setSystemInfo("Tester", "Renuga Deenadayalan");
		return report;
	}

}
