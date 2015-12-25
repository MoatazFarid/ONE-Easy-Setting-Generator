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
public class MessageCreationParameters {
	/** Variables declarations **/
	// current event no to be used in each set 
	private static int CurrentEventNo;
	
	// event class
	private static String EventClass;
	
	// event interval 
	private static String EventInterval;
	
	// event size 
	private static String EventSize;	

	// event host
	private static String EventHost;
	
	// event prefix
	private static String EventPrefix;
	
	/**Getters and setters **/


	/**
	 * @return the currentEventNo
	 */
	public static int getCurrentEventNo() {
		return CurrentEventNo;
	}

	/**
	 * @param currentEventNo the currentEventNo to set
	 */
	public static void setCurrentEventNo(int currentEventNo) {
		CurrentEventNo = currentEventNo;
	}

	/**
	 * @return the eventClass
	 */
	public static String getEventClass() {
		return EventClass;
	}

	/**
	 * @param eventClass the eventClass to set
	 * @throws IOException 
	 */
	public static void setEventClass(String eventClass) throws IOException {
		EventClass = eventClass;
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
		bw.write("#+===== Message creation parameters Settings============+");
		bw.newLine();
		
		bw.write("# Class of the first event generator");
		bw.newLine();

		bw.write("Events"+getCurrentEventNo()+".class = "+eventClass);
		bw.newLine();
		//close file 
		bw.close();
	}

	/**
	 * @return the eventInterval
	 */
	public static String getEventInterval() {
		return EventInterval;
	}

	/**
	 * @param eventInterval the eventInterval to set
	 * @throws IOException 
	 */
	public static void setEventInterval(String eventInterval) throws IOException {
		EventInterval = eventInterval;
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
		
		bw.write("# Creation interval in seconds (one new message every 25 to 35 seconds)");
		bw.newLine();

		bw.write("Events"+getCurrentEventNo()+".interval = "+eventInterval);
		bw.newLine();
		//close file 
		bw.close();
	}

	/**
	 * @return the eventSize
	 */
	public static String getEventSize() {
		return EventSize;
	}

	/**
	 * @param eventSize the eventSize to set
	 * @throws IOException 
	 */
	public static void setEventSize(String eventSize) throws IOException {
		EventSize = eventSize;
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
		
		bw.write("# Message sizes (500kB - 1MB)");
		bw.newLine();

		bw.write("Events"+getCurrentEventNo()+".size = "+eventSize);
		bw.newLine();
		//close file 
		bw.close();
	}

	/**
	 * @return the eventHost
	 */
	public static String getEventHost() {
		return EventHost;
	}

	/**
	 * @param eventHost the eventHost to set
	 * @throws IOException 
	 */
	public static void setEventHost(String eventHost) throws IOException {
		EventHost = eventHost;
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
		
		bw.write("## range of message source/destination addresses");
		bw.newLine();

		bw.write("Events"+getCurrentEventNo()+".hosts = "+eventHost);
		bw.newLine();
		//close file 
		bw.close();
	}

	/**
	 * @return the eventPrefix
	 */
	public static String getEventPrefix() {
		return EventPrefix;
	}

	/**
	 * @param eventPrefix the eventPrefix to set
	 * @throws IOException 
	 */
	public static void setEventPrefix(String eventPrefix) throws IOException {
		EventPrefix = eventPrefix;
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
		
		bw.write("# Message ID prefix");
		bw.newLine();

		bw.write("Events"+getCurrentEventNo()+".prefix = "+eventPrefix);
		bw.newLine();
		//close file 
		bw.close();
	}

}
