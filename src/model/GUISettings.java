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
public class GUISettings {

	/* declaring Variables */
	private static String underlayImagelink;
	private static String underlayImageOffset;
	private static String underlayImageState;
	private static String underlayImageRotate;
	private static String EventLogPanelNoOfEvents;
	private static String EventLogPanelREFilter;
	
	
	/* Setters and Getters */
	
	/**
	 * @return the underlayImagelink
	 */
	public static String getUnderlayImagelink() {
		return underlayImagelink;
	}
	/**
	 * @param underlayImagelink the underlayImagelink to set
	 * @throws IOException 
	 */
	public static void setUnderlayImagelink(String underlayImagelink) throws IOException {
		GUISettings.underlayImagelink = underlayImagelink;
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
		bw.write("#+===== GUI Settings============+");
		bw.newLine();
		
		bw.write("# GUI underlay image settings");
		bw.newLine();

		bw.write("GUI.UnderlayImage.fileName = "+underlayImagelink);
		bw.newLine();
		//close file 
		bw.close();
	}
	/**
	 * @return the underlayImageOffset
	 */
	public static String getUnderlayImageOffset() {
		return underlayImageOffset;
	}
	/**
	 * @param underlayImageOffset the underlayImageOffset to set
	 * @throws IOException 
	 */
	public static void setUnderlayImageOffset(String underlayImageOffset) throws IOException {
		GUISettings.underlayImageOffset = underlayImageOffset;
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
		
		bw.write("# Image offset in pixels (x, y)");
		bw.newLine();

		bw.write("GUI.UnderlayImage.offset = "+underlayImageOffset);
		bw.newLine();
		//close file 
		bw.close();
	}
	/**
	 * @return the underlayImageState
	 */
	public static String getUnderlayImageState() {
		return underlayImageState;
	}
	/**
	 * @param underlayImageState the underlayImageState to set
	 * @throws IOException 
	 */
	public static void setUnderlayImageState(String underlayImageState) throws IOException {
		GUISettings.underlayImageState = underlayImageState;
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
		
		bw.write("# Scaling factor for the image");
		bw.newLine();

		bw.write("GUI.UnderlayImage.scale = "+underlayImageState);
		bw.newLine();
		//close file 
		bw.close();
	}
	/**
	 * @return the underlayImageRotate
	 */
	public static String getUnderlayImageRotate() {
		return underlayImageRotate;
	}
	/**
	 * @param underlayImageRotate the underlayImageRotate to set
	 * @throws IOException 
	 */
	public static void setUnderlayImageRotate(String underlayImageRotate) throws IOException {
		GUISettings.underlayImageRotate = underlayImageRotate;
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
		
		bw.write("# Image rotation (radians)");
		bw.newLine();

		bw.write("GUI.UnderlayImage.rotate = "+underlayImageRotate);
		bw.newLine();
		//close file 
		bw.close();
	}
	/**
	 * @return the eventLogPanelNoOfEvents
	 */
	public static String getEventLogPanelNoOfEvents() {
		return EventLogPanelNoOfEvents;
	}
	/**
	 * @param eventLogPanelNoOfEvents the eventLogPanelNoOfEvents to set
	 * @throws IOException 
	 */
	public static void setEventLogPanelNoOfEvents(String eventLogPanelNoOfEvents) throws IOException {
		EventLogPanelNoOfEvents = eventLogPanelNoOfEvents;
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
		
		bw.write("# how many events to show in the log panel (default = 30)");
		bw.newLine();

		bw.write("GUI.EventLogPanel.nrofEvents = "+eventLogPanelNoOfEvents);
		bw.newLine();
		//close file 
		bw.close();
	}
//	/**
//	 * @return the eventLogPanelREFilter
//	 */
//	public static String getEventLogPanelREFilter() {
//		return EventLogPanelREFilter;
//	}
//	/**
//	 * @param eventLogPanelREFilter the eventLogPanelREFilter to set
//	 * @throws IOException 
//	 */
//	public static void setEventLogPanelREFilter(String eventLogPanelREFilter) throws IOException {
//		EventLogPanelREFilter = eventLogPanelREFilter;
//		// prepare file (it will resume writing over the file)
//		File file = new File(Scenario_setting.getScenario_name()+".txt");
//
//		// if file doesnt exists, then create it
//		if (!file.exists()) {
//			file.createNewFile();
//		}
//		// overwrite any existing file 
//		FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
//		BufferedWriter bw = new BufferedWriter(fw);
//
//		// writing to file 
//		
//		bw.write("# Regular Expression log filter (see Pattern-class from the Java API for RE-matching details)");
//		bw.newLine();
//
//		bw.write("GUI.UnderlayImage.offset = "+underlayImageOffset);
//		bw.newLine();
//		//close file 
//		bw.close();
//	}
	
}
