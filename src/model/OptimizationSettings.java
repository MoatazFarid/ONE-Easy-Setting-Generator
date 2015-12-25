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
public class OptimizationSettings {

	/*	declaring variables */
	private static int cellSizeMult;
	private static String randomizeUpdateOrder;
	
	/*	Setters and Getters */
	/**
	 * @return the cellSizeMult
	 */
	public static int getCellSizeMult() {
		return cellSizeMult;
	}
	/**
	 * @param cellSizeMult the cellSizeMult to set
	 * @throws IOException 
	 */
	public static void setCellSizeMult(int cellSizeMult) throws IOException {
		OptimizationSettings.cellSizeMult = cellSizeMult;
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
		bw.write("#+===== Optimization Settings============+");
		bw.newLine();
		
		bw.write("## see World class for details.");
		bw.newLine();

		bw.write("Optimization.cellSizeMult = "+cellSizeMult);
		bw.newLine();
		//close file 
		bw.close();
	}
	/**
	 * @return the randomizeUpdateOrder
	 */
	public static String getRandomizeUpdateOrder() {
		return randomizeUpdateOrder;
	}
	/**
	 * @param randomizeUpdateOrder the randomizeUpdateOrder to set
	 * @throws IOException 
	 */
	public static void setRandomizeUpdateOrder(String randomizeUpdateOrder) throws IOException {
		OptimizationSettings.randomizeUpdateOrder = randomizeUpdateOrder;
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

		bw.write("Optimization.randomizeUpdateOrder = "+randomizeUpdateOrder);
		bw.newLine();
		//close file 
		bw.close();
	}
	
}
