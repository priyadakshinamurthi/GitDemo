package resources;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsNG{

	
	public static ExtentReports config()
	{
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter spark = new ExtentSparkReporter(path);
		spark.config().setDocumentTitle("Results");
		spark.config().setReportName("Automation");
		ExtentReports report = new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("Tester", "Priya");
		return report;
	}
}
