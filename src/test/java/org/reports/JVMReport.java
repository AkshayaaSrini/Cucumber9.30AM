package org.reports;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;


public class JVMReport {
	
	public static void generateJVMReport(String json) {
		File f=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports");
		
		Configuration con=new Configuration(f, "Facebook Application");
		
		con.addClassifications("Platform name", "Windows");
		con.addClassifications("Platform Version", "10");
		con.addClassifications("Browser name", "Chrome");
		con.addClassifications("Browser Version", "88.0");
		con.addClassifications("Sprint no", "12");
		
		List<String> li= new ArrayList<String>();
		li.add(json);
		
		ReportBuilder r = new ReportBuilder(li, con);
		r.generateReports();

	}

}