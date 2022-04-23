package org.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportGeneration {

	public static void reportGenerte(String json) {
		File file = new File("D:\\eclipse-workspace\\CucuberBassclass\\Reports");

		Configuration configuration = new Configuration(file, "Adactin");
		configuration.addClassifications("Platform", "Win 10");
		configuration.addClassifications("Browser", "Chrome");
		configuration.addClassifications("Browser Version", "97.0.4692.99");
		configuration.addClassifications("Sprint No", "07");
		configuration.addClassifications("Environment", "QA Environment");

		List<String> l = new ArrayList<String>();
		l.add(json);

		ReportBuilder builder = new ReportBuilder(l, configuration);
		builder.generateReports();

	}

}
