package model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Scenario_setting {
	private static String Scenario_name;
	private static boolean Scenario_simulateConnections;
	private static float Scenario_updateInterval;
	private static int Scenario_endTime;
	private static int Scenario_maxhopcount;
	private static int Scenario_nrofHostGroups;
	private static int Events_nrof;
	/**
	 * @return the scenario_name
	 */
	public static String getScenario_name() {
		return Scenario_name;
	}
	/**
	 * @param scenario_name the scenario_name to set
	 * @throws IOException 
	 */
	public static void setScenario_name(String scenario_name) throws IOException {
		Scenario_name = scenario_name;
		// prepare file 
		File file = new File(scenario_name+".txt");

		// if file doesnt exists, then create it
		if (!file.exists()) {
			file.createNewFile();
		}
		// overwrite any existing file 
		// start from line 1
		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		// writing to file 
		bw.write("\n #");
		bw.newLine();
		bw.write("\n ## Default settings Generated for the simulation");
		bw.newLine();
		bw.write("\n #");
		bw.newLine();
		bw.write("\n ## Scenario settings");
		bw.newLine();
		bw.write("\n Scenario.name = "+scenario_name);
		bw.newLine();
		
		// close the file 
		bw.close();
		
	}
	/**
	 * @return the scenario_simulateConnections
	 */
	public static boolean isScenario_simulateConnections() {
		return Scenario_simulateConnections;
	}
	/**
	 * @param scenario_simulateConnections the scenario_simulateConnections to set
	 * @throws IOException 
	 */
	public static void setScenario_simulateConnections(
			boolean scenario_simulateConnections) throws IOException {
		Scenario_simulateConnections = scenario_simulateConnections;

		File file = new File(getScenario_name()+".txt");

		// if file doesnt exists, then create it
		if (!file.exists()) {
			file.createNewFile();
		}

		FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
		BufferedWriter bw = new BufferedWriter(fw);
		if(scenario_simulateConnections)
			bw.write("\n /n Scenario.simulateConnections = true");
		else
			bw.write("\n Scenario.simulateConnections = false");
		bw.newLine();		
		bw.close();
	}
	/**
	 * @return the scenario_updateInterval
	 */
	public static float getScenario_updateInterval() {
		return Scenario_updateInterval;
	}
	/**
	 * @param scenario_updateInterval the scenario_updateInterval to set
	 * @throws IOException 
	 */
	public static void setScenario_updateInterval(float scenario_updateInterval) throws IOException {
		Scenario_updateInterval = scenario_updateInterval;

		File file = new File(getScenario_name()+".txt");

		// if file doesnt exists, then create it
		if (!file.exists()) {
			file.createNewFile();
		}

		FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
		BufferedWriter bw = new BufferedWriter(fw);
		String myst = "\n Scenario.updateInterval = "+scenario_updateInterval;
		bw.write(myst);
		bw.newLine();
		bw.close();
	}
	/**
	 * @return the scenario_endTime
	 */
	public static int getScenario_endTime() {
		return Scenario_endTime;
	}
	/**
	 * @param scenario_endTime the scenario_endTime to set
	 * @throws IOException 
	 */
	public static void setScenario_endTime(int scenario_endTime) throws IOException {
		Scenario_endTime = scenario_endTime;
/*
		// prepare writing to file 
		PrintWriter writer = new PrintWriter(getScenario_name()+".txt", "UTF-8");
		
		// writing to file 
		writer.println("# 43200s == 12h");
		writer.println("Scenario.endTime = "+scenario_endTime);
		
		//close file 
		writer.close();*/
		File file = new File(getScenario_name()+".txt");

		// if file doesnt exists, then create it
		if (!file.exists()) {
			file.createNewFile();
		}

		FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
		BufferedWriter bw = new BufferedWriter(fw);
		String myst ="\n Scenario.endTime = "+scenario_endTime; 
		bw.write(myst);
		bw.newLine();		
		bw.close();
	}
	/**
	 * @return the scenario_maxhopcount
	 */
	public static int getScenario_maxhopcount() {
		return Scenario_maxhopcount;
	}
	/**
	 * @param scenario_maxhopcount the scenario_maxhopcount to set
	 * @throws IOException 
	 */
	public static void setScenario_maxhopcount(int scenario_maxhopcount) throws IOException {
		Scenario_maxhopcount = scenario_maxhopcount;

		File file = new File(getScenario_name()+".txt");

		// if file doesnt exists, then create it
		if (!file.exists()) {
			file.createNewFile();
		}

		FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
		BufferedWriter bw = new BufferedWriter(fw);
		String myst ="\n Scenario.maxhopcount = "+scenario_maxhopcount;
		bw.write(myst);
		bw.newLine();
		bw.close();
	}
	/**
	 * @return the scenario_nrofHostGroups
	 */
	public static int getScenario_nrofHostGroups() {
		return Scenario_nrofHostGroups;
	}
	/**
	 * @param scenario_nrofHostGroups the scenario_nrofHostGroups to set
	 * @throws IOException 
	 */
	public static void setScenario_nrofHostGroups(int scenario_nrofHostGroups) throws IOException {
		Scenario_nrofHostGroups = scenario_nrofHostGroups;

		File file = new File(getScenario_name()+".txt");

		// if file doesn't exists, then create it
		if (!file.exists()) {
			file.createNewFile();
		}

		FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("\n Scenario.nrofHostGroups = "+scenario_nrofHostGroups);
		bw.newLine();
		
		//closing file
		bw.close();
	}
	/**
	 * @return the events_nrof
	 */
	public static int getEvents_nrof() {
		return Events_nrof;
	}
	/**
	 * @param events_nrof the events_nrof to set
	 * @throws IOException 
	 */
	public static void setEvents_nrof(int events_nrof) throws IOException {
		Events_nrof = events_nrof;

		File file = new File(getScenario_name()+".txt");

		// if file doesnt exists, then create it
		if (!file.exists()) {
			file.createNewFile();
		}

		FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("\n # How many event generators");
		bw.newLine();
		bw.write("\n Events.nrof = "+events_nrof);
		bw.newLine();
		
		bw.close();
	}
}
