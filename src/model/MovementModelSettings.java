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
public class MovementModelSettings {
	/* declaring variables */
	private static int rngSeed;
	private static String worldSize;
	private static int wormup;
	private static int nrOfMapSize;
	private static int currentMapNo;
	private static String MapFile;
	
	/* Getters and setters*/

	/**
	 * @return the currentMapNo
	 */
	public static int getCurrentMapNo() {
		return currentMapNo;
	}
	/**
	 * @param currentMapNo the currentMapNo to set
	 */
	public static void setCurrentMapNo(int currentMapNo) {
		MovementModelSettings.currentMapNo = currentMapNo;
	}
	/**
	 * @return the rngSeed
	 */
	public static int getRngSeed() {
		return rngSeed;
	}
	/**
	 * @param rngSeed the rngSeed to set
	 * @throws IOException 
	 */
	public static void setRngSeed(int rngSeed) throws IOException {
		MovementModelSettings.rngSeed = rngSeed;
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
		bw.write("#+===== Movement model Settings============+");
		bw.newLine();
		
		bw.write("# seed for movement models' pseudo random number generator (default = 0)");
		bw.newLine();

		bw.write("MovementModel.rngSeed = "+rngSeed);
		bw.newLine();
		//close file 
		bw.close();
	}
	/**
	 * @return the worldSize
	 */
	public static String getWorldSize() {
		return worldSize;
	}
	/**
	 * @param worldSize the worldSize to set
	 * @throws IOException 
	 */
	public static void setWorldSize(String worldSize) throws IOException {
		MovementModelSettings.worldSize = worldSize;
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
		
		bw.write("# World's size for Movement Models without implicit size (width, height; meters)");
		bw.newLine();

		bw.write("MovementModel.worldSize = "+worldSize);
		bw.newLine();
		//close file 
		bw.close();
	}
	/**
	 * @return the wormup
	 */
	public static int getWormup() {
		return wormup;
	}
	/**
	 * @param wormup the wormup to set
	 * @throws IOException 
	 */
	public static void setWormup(int wormup) throws IOException {
		MovementModelSettings.wormup = wormup;
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

		bw.write("# How long time to move hosts in the world before real simulation");
		bw.newLine();

		bw.write("MovementModel.warmup = "+wormup);
		bw.newLine();
		//close file 
		bw.close();
	}
	/**
	 * @return the nrOfMapSize
	 */
	public static int getNrOfMapSize() {
		return nrOfMapSize;
	}
	/**
	 * @param nrOfMapSize the nrOfMapSize to set
	 * @throws IOException 
	 */
	public static void setNrOfMapSize(int nrOfMapSize) throws IOException{
		MovementModelSettings.nrOfMapSize = nrOfMapSize;
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

		bw.write("## Map based movement -movement model specific settings");
		bw.newLine();

		bw.write("MapBasedMovement.nrofMapFiles = "+nrOfMapSize);
		bw.newLine();
		//close file 
		bw.close();
	}
	/**
	 * @return the mapFile
	 */
	public static String getMapFile() {
		return MapFile;
	}
	/**
	 * @param mapFile the mapFile to set
	 * @throws IOException 
	 */
	public static void setMapFile(String mapFile) throws IOException {
		MapFile = mapFile;
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

		bw.write("MapBasedMovement.mapFile"+getCurrentMapNo()+" = "+mapFile);
		bw.newLine();
		//close file 
		bw.close();
	}
	
}
