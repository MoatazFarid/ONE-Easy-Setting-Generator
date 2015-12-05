package model;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import view.main_UNUSED;

public class settingFileOp {
	public static  void setSettingfileName(String ScenarioName) throws FileNotFoundException, UnsupportedEncodingException{

		// // test
		System.out.println(ScenarioName);

		// creating writer function to write to file
		PrintWriter writer = new PrintWriter("default_settings.txt", "UTF-8");
		//writer.println("The first line");
		writer.println("# \n # Default settings for the simulation \n # \n");
				
		// starting scenario setting
		writer.println("## Scenario settings");
	
		writer.println("Scenario.name = "+ScenarioName);
	
		
		//closing the file 
		writer.close();
		setSettingfileName1();
	}
	
	public static  void setSettingfileName1() throws FileNotFoundException, UnsupportedEncodingException{

		
		// creating writer function to write to file
		PrintWriter writer = new PrintWriter("default_settings.txt", "UTF-8");
		//writer.println("The first line");
		
	
		writer.println("Scenario.simulateConnections = true \n Scenario.updateInterval = 0.1 \n # 43200s == 12h \n Scenario.endTime = 43200 \n"
		+"Scenario.maxhopcount = 2 \n");
		writer.println("");
		writer.println("");
		writer.println("## Interface-specific settings:");
		writer.println("# \" Bluetooth \" interface for all nodes");
		writer.println("");
		
		//closing the file 
		writer.close();
	}
	/**
	 * That function used to set bt interface 
	 * @param i
	 * @throws FileNotFoundException
	 * @throws UnsupportedEncodingException
	 */
	public static  void setBluetoothInterfaces(int i) throws FileNotFoundException, UnsupportedEncodingException{

		
		// creating writer function to write to file
		PrintWriter writer = new PrintWriter("default_settings.txt", "UTF-8");
		//writer.println("The first line");
		writer.println("");
		writer.println("# \" Bluetooth \" interface for all nodes");
		writer.println("btInterface.type = "+i);
		writer.println("# Transmit speed of 2 Mbps = 250kBps");
		writer.println("btInterface.transmitSpeed = 250k"); // to be set later
		writer.println("btInterface.transmitRange = 10"); // to be set later
		writer.println("");
		writer.println("# High speed, long range, interface for group 4");
		writer.println("highspeedInterface.type = SimpleBroadcastInterface");
		writer.println("highspeedInterface.transmitSpeed = 10M");
		writer.println("highspeedInterface.transmitRange = 1000");
		writer.println("");
		


		
		//closing the file 
		writer.close();
	}
	public static  void setNoOFHostGroups(int noOfHostGroups) throws FileNotFoundException, UnsupportedEncodingException{

		// creating writer function to write to file
		PrintWriter writer = new PrintWriter("default_settings.txt", "UTF-8");
		
		// setting no of host groups
		writer.println("# Define 6 different node groups");
		writer.println("Scenario.nrofHostGroups = "+noOfHostGroups);
	
		
		//closing the file 
		writer.close();
	}
	//public static void
	
	
	

}
