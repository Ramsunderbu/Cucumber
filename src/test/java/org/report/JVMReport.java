package org.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	
	public static void main(String[] args) {
		File f=new File("C:\\Users\\Sabari\\eclipse-workspace\\Cucumber\\target");
		Configuration c=new Configuration(f, "CucumberProject");
		
		c.addClassifications("OS Name:","windows");
		c.addClassifications("OS Version:","10");
		c.addClassifications("Browser Name:","chrome");
		c.addClassifications("Browser Version:","104");
		c.addClassifications("Sprint Num:","2");
		
		List<String> l=new ArrayList<>();
		
		ReportBuilder r=new ReportBuilder(l, c);
		r.generateReports();
	}

}
