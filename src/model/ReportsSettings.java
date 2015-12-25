/**
 * 
 */
package model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author MoatazFarid
 *
 */
public class ReportsSettings {

	/* Declaring variables */
	private static int nrOfReports;
	private static int warmup;
	private static String reportDir;
	private static int nrOfCurrentReport;
	private static String reportName;
	/*	Setters and Getters */
	
	/**
	 * @return the nrOfReports
	 */
	public static int getNrOfReports() {
		return nrOfReports;
	}
	/**
	 * @param nrOfReports the nrOfReports to set
	 * @throws IOException 
	 */
	public static void setNrOfReports(int nrOfReports) throws IOException {
		ReportsSettings.nrOfReports = nrOfReports;
		// prepare file (it will resume writing over the file)
		File file = new File(Scenario_setting.getScenario_name()+".txt");

		// if file doesnt exists, then create it
		if (!file.exists()) {
			file.createNewFile();
		}
		// overwrite any existing file 
		FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
		BufferedWriter bw = new BufferedWriter(fw);

		// writing to file 
		bw.newLine();
		bw.newLine();
		bw.newLine();
		bw.write("#+===== Reports Settings ============+");
		bw.newLine();
		
		bw.write("# how many reports to load");
		bw.newLine();

		bw.write("Report.nrofReports = "+nrOfReports);
		bw.newLine();
		//close file 
		bw.close();
	}
	/**
	 * @return the warmup
	 */
	public static int getWarmup() {
		return warmup;
	}
	/**
	 * @param warmup the warmup to set
	 * @throws IOException 
	 */
	public static void setWarmup(int warmup) throws IOException {
		ReportsSettings.warmup = warmup;
		// prepare file (it will resume writing over the file)
		File file = new File(Scenario_setting.getScenario_name()+".txt");

		// if file doesnt exists, then create it
		if (!file.exists()) {
			file.createNewFile();
		}
		// overwrite any existing file 
		FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
		BufferedWriter bw = new BufferedWriter(fw);

		// writing to file 
		
		bw.write("# length of the warm up period (simulated seconds)");
		bw.newLine();

		bw.write("Report.warmup = "+warmup);
		bw.newLine();
		//close file 
		bw.close();
	}
	/**
	 * @return the reportDir
	 */
	public static String getReportDir() {
		return reportDir;
	}
	/**
	 * @param reportDir the reportDir to set
	 * @throws IOException 
	 */
	public static void setReportDir(String reportDir) throws IOException {
		ReportsSettings.reportDir = reportDir;
		// prepare file (it will resume writing over the file)
		File file = new File(Scenario_setting.getScenario_name()+".txt");

		// if file doesnt exists, then create it
		if (!file.exists()) {
			file.createNewFile();
		}
		// overwrite any existing file 
		FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
		BufferedWriter bw = new BufferedWriter(fw);

		// writing to file 
		
		bw.write("# default directory of reports (can be overridden per Report with output setting)");
		bw.newLine();

		bw.write("Report.reportDir = "+reportDir);
		bw.newLine();
		//close file 
		bw.close();

	}
	/**
	 * @return the nrOfCurrentReport
	 */
	public static int getNrOfCurrentReport() {
		return nrOfCurrentReport;
	}
	/**
	 * @param nrOfCurrentReport the nrOfCurrentReport to set
	 */
	public static void setNrOfCurrentReport(int nrOfCurrentReport) {
		ReportsSettings.nrOfCurrentReport = nrOfCurrentReport;
	}
	/**
	 * @return the reportName
	 */
	public static String getReportName() {
		return reportName;
	}
	/**
	 * @param reportName the reportName to set
	 * @throws IOException 
	 */
	public static void setReportName(String reportName) throws IOException {
		ReportsSettings.reportName = reportName;
		// prepare file (it will resume writing over the file)
		File file = new File(Scenario_setting.getScenario_name()+".txt");

		// if file doesnt exists, then create it
		if (!file.exists()) {
			file.createNewFile();
		}
		// overwrite any existing file 
		FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
		BufferedWriter bw = new BufferedWriter(fw);

		// writing to file 
		
		bw.write("# default directory of reports (can be overridden per Report with output setting)");
		bw.newLine();

		bw.write("Report.report"+getNrOfCurrentReport()+" = "+reportName);
		bw.newLine();
		//close file 
		bw.close();

	}
	
}
