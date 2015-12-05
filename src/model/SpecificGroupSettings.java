/**
 * 
 */
package model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Moataz
 *
 */
public class SpecificGroupSettings{

	// group symbol 
	private static String Group_ID;

	//# cars can drive only on roads
	private static int Group_okMaps;
	
	//Group nodes min speed 
	private static float Group_speedF;
	
	//Group nodes max speed 
	private static float Group_speedT;
	
	// group buffer size
	private static String Group_bufferSize;
	
	// movement model used 
	private static String Group_movementModel;

	//Group4.routeFile = data/tram3.wkt
	private static String Group_routeFile;
	
	//	Group4.routeType = 1
	private static String Group__routeType;
	
	// the min wait time for each node
	private static int Group_waitTimeF;
	
	// the max wait time for each node
	private static int Group_waitTimeT;
	
	// The no of interfaces in each node in group
	private static int Group_noOfInterfaces;
	
	//The name of the interface for example btInterface 
	private static String Group_interfaceName;
	
	// no of hosts per group
	private static int Group_nrOfHosts;
	
	private static int InterfaceNO;
	/*
	 * Setters and Getters
	 * */
	/**
	 * @return the group_ID
	 */
	public static String getGroup_ID() {
		return Group_ID;
	}

	/**
	 * @param group_ID the group_ID to set
	 * @throws IOException 
	 */
	public static void setGroup_ID(String group_ID,int interfaceNo) throws IOException {
		Group_ID = group_ID;
		//set interface no 
		setInterfaceNO(interfaceNo);
		
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
		bw.write("+=====Group"+interfaceNo+"-specific Settings============+");
		bw.newLine();

		bw.write("Group"+interfaceNo+".groupID = "+group_ID);
		bw.newLine();
		//close file 
		bw.close();
	}

	/**
	 * @return the group_okMaps
	 */
	public static int getGroup_okMaps() {
		return Group_okMaps;
	}

	/**
	 * @param group_okMaps the group_okMaps to set
	 * @throws IOException 
	 */
	public static void setGroup_okMaps(int group_okMaps) throws IOException {
		Group_okMaps = group_okMaps;
	
		// prepare file (it will resume writing over the file)
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
		
		bw.write("# cars can drive only on roads");
		bw.newLine();
		bw.write("Group"+getInterfaceNO()+".okMaps = "+group_okMaps);
		bw.newLine();
		//close file 
		bw.close();
	}

	/**
	 * @return the group_routeFile
	 */
	public static String getGroup_routeFile() {
		return Group_routeFile;
	}

	
	/**
	 * @return the group_speedF
	 */
	public static float getGroup_speedF() {
		return Group_speedF;
	}
	/**
	 * @param group_speedF the group_speedF to set
	 * @throws IOException 
	 */
	public static void setGroup_speedF(float group_speedF) throws IOException {
		Group_speedF = group_speedF;
		// prepare file (it will resume writing over the file)
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
		bw.write("Group"+getInterfaceNO()+".speed = "+group_speedF);
		//close file 
		bw.close();
	}
	/**
	 * @return the group_speedT
	 */
	public static float getGroup_speedT() {
		return Group_speedT;
	}
	/**
	 * @param group_speedT the group_speedT to set
	 * @throws IOException 
	 */
	public static void setGroup_speedT(float group_speedT) throws IOException {
		Group_speedT = group_speedT;
		// prepare file (it will resume writing over the file)
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
		bw.write(", "+group_speedT);
		bw.newLine();
		//close file 
		bw.close();
	}
	/**
	 * @return the group_bufferSize
	 */
	public static String getGroup_bufferSize() {
		return Group_bufferSize;
	}
	/**
	 * @param group_bufferSize the group_bufferSize to set
	 * @throws IOException 
	 */
	public static void setGroup_bufferSize(String group_bufferSize) throws IOException {
		Group_bufferSize = group_bufferSize;
		// prepare file (it will resume writing over the file)
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
		bw.write("Group"+getInterfaceNO()+".bufferSize = "+group_bufferSize);
		bw.newLine();
		//close file 
		bw.close();
	}
	
	/**
	 * @return the group_movementModel
	 */
	public static String getGroup_movementModel() {
		return Group_movementModel;
	}
	/**
	 * @param group_movementModel the group_movementModel to set
	 * @throws IOException 
	 */
	public static void setGroup_movementModel(String group_movementModel) throws IOException {
		Group_movementModel = group_movementModel;
		// prepare file (it will resume writing over the file)
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

		bw.write("Group"+getInterfaceNO()+".movementModel = "+group_movementModel);
		bw.newLine();
		//close file 
		bw.close();
		
	}
	
	/**
	 * @param group_routeFile the group_routeFile to set
	 * @throws IOException 
	 */
	public static void setGroup_routeFile(String group_routeFile) throws IOException {
		Group_routeFile = group_routeFile;
		// prepare file (it will resume writing over the file)
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

		bw.write("Group"+getInterfaceNO()+".routeFile = "+group_routeFile);
		bw.newLine();
		//close file 
		bw.close();
	}

	/**
	 * @return the group__routeType
	 */
	public static String getGroup__routeType() {
		return Group__routeType;
	}

	/**
	 * @param group__routeType the group__routeType to set
	 * @throws IOException 
	 */
	public static void setGroup__routeType(String group__routeType) throws IOException {
		Group__routeType = group__routeType;
		// prepare file (it will resume writing over the file)
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

		bw.write("Group"+getInterfaceNO()+".routeType = "+group__routeType);
		bw.newLine();
		//close file 
		bw.close();
	}
	/**
	 * @return the group_waitTimeF
	 */
	public static int getGroup_waitTimeF() {
		return Group_waitTimeF;
	}
	/**
	 * @param group_waitTimeF the group_waitTimeF to set
	 * @throws IOException 
	 */
	public static void setGroup_waitTimeF(int group_waitTimeF) throws IOException {
		Group_waitTimeF = group_waitTimeF;
		// prepare file (it will resume writing over the file)
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
		bw.write("Group"+getInterfaceNO()+".waitTime = "+group_waitTimeF);
		//close file 
		bw.close();
	}
	/**
	 * @return the group_waitTimeT
	 */
	public static int getGroup_waitTimeT() {
		return Group_waitTimeT;
	}
	/**
	 * @param group_waitTimeT the group_waitTimeT to set
	 * @throws IOException 
	 */
	public static void setGroup_waitTimeT(int group_waitTimeT) throws IOException {
		Group_waitTimeT = group_waitTimeT;
		// prepare file (it will resume writing over the file)
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
		bw.write(", "+group_waitTimeT);
		bw.newLine();
		//close file 
		bw.close();
	}
	/**
	 * @return the group_nrOfHosts
	 */
	public static int getGroup_nrOfHosts() {
		return Group_nrOfHosts;
	}
	/**
	 * @param group_nrOfHosts the group_nrOfHosts to set
	 * @throws IOException 
	 */
	public static void setGroup_nrOfHosts(int group_nrOfHosts) throws IOException {
		Group_nrOfHosts = group_nrOfHosts;
		// prepare file (it will resume writing over the file)
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
		bw.write("Group"+getInterfaceNO()+".nrofHosts = "+group_nrOfHosts);
		bw.newLine();
		//close file 
		bw.close();
	}

	/**
	 * @return the group_noOfInterfaces
	 */
	public static int getGroup_noOfInterfaces() {
		return Group_noOfInterfaces;
	}
	/**
	 * @param group_noOfInterfaces the group_noOfInterfaces to set
	 * @throws IOException 
	 */
	public static void setGroup_noOfInterfaces(int group_noOfInterfaces) throws IOException {
		Group_noOfInterfaces = group_noOfInterfaces;
		// prepare file (it will resume writing over the file)
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
		bw.write("Group"+getInterfaceNO()+".nrofInterfaces = "+group_noOfInterfaces);
		bw.newLine();
		//close file 
		bw.close();
	}
	/**
	 * @return the group_interfaceName
	 */
	public static String getGroup_interfaceName() {
		return Group_interfaceName;
	}
	/**
	 * @param group_interfaceName the group_interfaceName to set
	 * @throws IOException 
	 */
	public static void setGroup_interfaceName(String group_interfaceName,int interfaceNo) throws IOException {
		Group_interfaceName = group_interfaceName;
		// prepare file (it will resume writing over the file)
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
		bw.write("Group"+getInterfaceNO()+".interface"+interfaceNo+" = "+group_interfaceName);
		bw.newLine();
		//close file 
		bw.close();
	}
	/**
	 * @return the interfaceNO
	 */
	public static int getInterfaceNO() {
		return InterfaceNO;
	}

	/**
	 * @param interfaceNO the interfaceNO to set
	 */
	public static void setInterfaceNO(int interfaceNO) {
		SpecificGroupSettings.InterfaceNO = interfaceNO;
	}

	

}
