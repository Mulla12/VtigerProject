package com.crm.listener;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import BaseClass.VtigerBaseClass;

public class Listener_Vtiger extends VtigerBaseClass implements ITestListener {
	ExtentSparkReporter spark;
	ExtentReports report;
	ExtentTest test;
	
	public void onTestStart(ITestResult result) {
		String name = result.getMethod().getMethodName();
		Reporter.log(name,true);
		test = report.createTest(name);
	}

	public void onTestSuccess(ITestResult result) {
		String name = result.getMethod().getMethodName();
		Reporter.log("onTestSuccess",true);
		test.log(Status.PASS, name+" is Passed !");
	}

	public void onTestFailure(ITestResult result) {
		String name = result.getMethod().getMethodName();
		String message = result.getThrowable().toString();
		Reporter.log("onTestFailure",true);
		test.log(Status.FAIL, message);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		String from = ts.getScreenshotAs(OutputType.BASE64);
		test.addScreenCaptureFromBase64String(from);
	}

	public void onTestSkipped(ITestResult result) {
		String name = result.getMethod().getMethodName();
		Reporter.log("onTestSkipped",true);
		test.log(Status.SKIP, name+" is Skipped !");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		Reporter.log("onTestFailedButWithinSuccessPercentage",true);
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		Reporter.log("onTestFailedWithTimeout",true);
	}

	public void onStart(ITestContext context) {
		Reporter.log("onStart",true);
		
		spark = new ExtentSparkReporter("./ExtentReports/Vtiger_Report");
		spark.config().setDocumentTitle("Demo Web Shop");
		spark.config().setTheme(Theme.DARK);
		spark.config().setReportName("Manikandan Sir");
		
		report = new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("OS", "Windows 10 pro");
		report.setSystemInfo("Browser", "Chrome");
		report.setSystemInfo("Version", "125");
		report.setSystemInfo("Author", "sumaiyya");
	}

	public void onFinish(ITestContext context) {
		report.flush();
	}
}



