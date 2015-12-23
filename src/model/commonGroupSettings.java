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
public class commonGroupSettings {
	/*Group.movementModel = ShortestPathMapBasedMovement
Group.router = SprayAndWaitRouterHopLimitedVersion
Group.bufferSize = 5M
Group.waitTime = 0, 120
Group.nrofInterfaces = 1
Group.interface1 = btInterface
Group.speed = 0.5, 1.5
Group.msgTtl = 300
Group.nrofHosts = 40
	 * */
	
	
	// movement model used 
	private static String Group_movementModel;
	
	// group routing protocol  name 
	private static String Group_router;
	
	// group buffer size
	private static String Group_bufferSize;
	
	// the min wait time for each node
	private static String Group_waitTime;
	
	// The no of interfaces in each node in group
	private static int Group_noOfInterfaces;

	//The name of the interface for example btInterface 
	private static String Group_interfaceName;
	
	//Group nodes min speed 
	private static String Group_speed;

	// Time to live for each message in the group
	private static int Group_msgTtl;

	// no of hosts per group
	private static int Group_nrOfHosts;
	
	
	
	/**
	 * @return the group_movementModel
	 */
	public static String getGroup_movementModel() {
		System.out.println();
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
		bw.write("+=====Group-specific Settings============+");
		bw.newLine();
		bw.write("+=====Common Settings============+");
		bw.newLine();
		bw.write("Group.movementModel = "+group_movementModel);
		bw.newLine();
		//close file 
		bw.close();
		
	}
	/**
	 * @return the group_router
	 */
	public static String getGroup_router() {
		return Group_router;
	}
	/**
	 * @param group_router the group_router to set
	 * @throws IOException 
	 */
	public static void setGroup_router(String group_router) throws IOException {
		Group_router = group_router;
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
		bw.write("Group.router = "+group_router);
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
		bw.write("Group.bufferSize = "+group_bufferSize);
		bw.newLine();
		//close file 
		bw.close();
	}
	/**
	 * @return the group_waitTimeF
	 */
	public static String getGroup_waitTime() {
		return Group_waitTime;
	}
	/**
	 * @param group_waitTimeF the group_waitTimeF to set
	 * @throws IOException 
	 */
	public static void setGroup_waitTime(String group_waitTime) throws IOException {
		Group_waitTime = group_waitTime;
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
		bw.write("Group.waitTime = "+group_waitTime);
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
		bw.write("Group.nrofInterfaces = "+group_noOfInterfaces);
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
		bw.write("Group.interface"+interfaceNo+" = "+group_interfaceName);
		bw.newLine();
		//close file 
		bw.close();
	}
	/**
	 * @return the group_speedF
	 */
	public static String getGroup_speed() {
		return Group_speed;
	}
	/**
	 * @param group_speedF the group_speedF to set
	 * @throws IOException 
	 */
	public static void setGroup_speed(String group_speedF) throws IOException {
		Group_speed = group_speedF;
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
		bw.write("Group.speed = "+group_speedF);
		bw.newLine();
		//close file 
		bw.close();
	}
	
	/**
	 * @return the group_msgTtl
	 */
	public static int getGroup_msgTtl() {
		return Group_msgTtl;
	}
	/**
	 * @param group_msgTtl the group_msgTtl to set
	 * @throws IOException 
	 */
	public static void setGroup_msgTtl(int group_msgTtl) throws IOException {
		Group_msgTtl = group_msgTtl;
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
		bw.write("Group.msgTtl = "+group_msgTtl);
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
		bw.write("Group.nrofHosts = "+group_nrOfHosts);
		bw.newLine();
		//close file 
		bw.close();
	}

}
