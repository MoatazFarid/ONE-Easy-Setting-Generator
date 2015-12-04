package model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class InterfaceSpecficSettings {
	/** Variables declarations **/
	//	+====="Bluetooth" interface settings============+

	private static String btInterface_type;
	private static String btInterface_transmitSpeed;
	private static int btInterface_transmitRange;
	
	//+=====highspeedInterface Settings============+
	
	private static String highspeedInterface_type;
	private static String highspeedInterface_transmitSpeed;
	private static int highspeedInterface_transmitRange;
	
	/**Getters and setters **/
	
	/**
	 * @return the btInterface_type
	 */
	public static String getBtInterface_type() {
		return btInterface_type;
	}
	/**
	 * @param btInterface_type the btInterface_type to set
	 * @throws IOException 
	 */
	public static void setBtInterface_type(String btInterface_type) throws IOException {
		InterfaceSpecficSettings.btInterface_type = btInterface_type;

		// prepare file 
				File file = new File(Scenario_setting.getScenario_name()+".txt");

				// if file doesnt exists, then create it
				if (!file.exists()) {
					file.createNewFile();
				}
				// overwrite any existing file 
				// start from line 1
				FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
				BufferedWriter bw = new BufferedWriter(fw);
		
		// writing to file 
		bw.write("#");
		bw.newLine();
		bw.write("## Interface-specific settings:");
		bw.newLine();
		bw.write("# type : which interface class the interface belongs to");
		bw.newLine();
		bw.write("# For different types, the sub-parameters are interface-specific");
		bw.newLine();
		bw.write("# For SimpleBroadcastInterface, the parameters are:");
		bw.newLine();
		bw.write("# transmitSpeed : transmit speed of the interface (bytes per second)");
		bw.newLine();
		bw.write("# transmitRange : range of the interface (meters)");
		bw.newLine();
		bw.write("# \"Bluetooth\" interface for all nodes");
		bw.newLine();
		bw.write("btInterface.type = "+btInterface_type);
		bw.newLine();
		
		// close the file 
		bw.close();
		
	}
	/**
	 * @return the btInterface_transmitSpeed
	 */
	public static String getBtInterface_transmitSpeed() {
		return btInterface_transmitSpeed;
	}
	/**
	 * @param btInterface_transmitSpeed the btInterface_transmitSpeed to set
	 * @throws IOException 
	 */
	public static void setBtInterface_transmitSpeed(String btInterface_transmitSpeed) throws IOException {
		InterfaceSpecficSettings.btInterface_transmitSpeed = btInterface_transmitSpeed;
		// prepare file 
		File file = new File(Scenario_setting.getScenario_name()+".txt");

		// if file doesnt exists, then create it
		if (!file.exists()) {
			file.createNewFile();
		}
		// overwrite any existing file 
		// start from line 1
		FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
		BufferedWriter bw = new BufferedWriter(fw);
		
		// writing to file 
		bw.write("#");
		bw.newLine();
		bw.write("btInterface.transmitSpeed = "+btInterface_transmitSpeed);
		bw.newLine();
		
		//close file 
		bw.close();
	}
	/**
	 * @return the btInterface_transmitRange
	 */
	public static int getBtInterface_transmitRange() {
		return btInterface_transmitRange;
	}
	/**
	 * @param btInterface_transmitRange the btInterface_transmitRange to set
	 * @throws IOException 
	 */
	public static void setBtInterface_transmitRange(int btInterface_transmitRange) throws IOException {
		InterfaceSpecficSettings.btInterface_transmitRange = btInterface_transmitRange;

		// prepare file 
		File file = new File(Scenario_setting.getScenario_name()+".txt");

		// if file doesnt exists, then create it
		if (!file.exists()) {
			file.createNewFile();
		}
		// overwrite any existing file 
		// start from line 1
		FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
		BufferedWriter bw = new BufferedWriter(fw);

		// writing to file 
		bw.write("#	");
		bw.newLine();
		bw.write("btInterface.transmitRange = "+btInterface_transmitRange);
		bw.newLine();
		//close file 
		bw.close();
	}
	/**
	 * @return the highspeedInterface_type
	 */
	public static String getHighspeedInterface_type() {
		return highspeedInterface_type;
	}
	/**
	 * @param highspeedInterface_type the highspeedInterface_type to set
	 * @throws IOException 
	 */
	public static void setHighspeedInterface_type(String highspeedInterface_type) throws IOException {
		InterfaceSpecficSettings.highspeedInterface_type = highspeedInterface_type;

		// prepare file 
		File file = new File(Scenario_setting.getScenario_name()+".txt");

		// if file doesnt exists, then create it
		if (!file.exists()) {
			file.createNewFile();
		}
		// overwrite any existing file 
		// start from line 1
		FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
		BufferedWriter bw = new BufferedWriter(fw);

		// writing to file 
		bw.write("#");
		bw.write("highspeedInterface.type = "+highspeedInterface_type);
		
		//close file 
		bw.close();
	}
	/**
	 * @return the highspeedInterface_transmitSpeed
	 */
	public static String getHighspeedInterface_transmitSpeed() {
		return highspeedInterface_transmitSpeed;
	}
	/**
	 * @param highspeedInterface_transmitSpeed the highspeedInterface_transmitSpeed to set
	 * @throws IOException 
	 */
	public static void setHighspeedInterface_transmitSpeed(
			String highspeedInterface_transmitSpeed) throws IOException {
		InterfaceSpecficSettings.highspeedInterface_transmitSpeed = highspeedInterface_transmitSpeed;

		// prepare file 
		File file = new File(Scenario_setting.getScenario_name()+".txt");

		// if file doesnt exists, then create it
		if (!file.exists()) {
			file.createNewFile();
		}
		// overwrite any existing file 
		// start from line 1
		FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
		BufferedWriter bw = new BufferedWriter(fw);

		// writing to file 
		bw.write("#");
		bw.write("highspeedInterface.transmitSpeed = "+highspeedInterface_transmitSpeed);
		
		//close file 
		bw.close();
	}
	/**
	 * @return the highspeedInterface_transmitRange
	 */
	public static int getHighspeedInterface_transmitRange() {
		return highspeedInterface_transmitRange;
	}
	/**
	 * @param highspeedInterface_transmitRange the highspeedInterface_transmitRange to set
	 * @throws IOException 
	 */
	public static void setHighspeedInterface_transmitRange(
			int highspeedInterface_transmitRange) throws IOException {
		InterfaceSpecficSettings.highspeedInterface_transmitRange = highspeedInterface_transmitRange;

		// prepare file 
		File file = new File(Scenario_setting.getScenario_name()+".txt");

		// if file doesnt exists, then create it
		if (!file.exists()) {
			file.createNewFile();
		}
		// overwrite any existing file 
		// start from line 1
		FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
		BufferedWriter bw = new BufferedWriter(fw);

		// writing to file 
		bw.write("# How many event generators");
		bw.write("highspeedInterface.transmitRange = "+highspeedInterface_transmitRange);
		
		//close file 
		bw.close();
	}

}
