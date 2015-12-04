package controller;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.swing.JFrame;

import model.settingFileOp;

import sun.swing.PrintingStatus;
import view.main;

public class reportGenerate {

	/**
	 * @param frame 
	 * @param args
	 * @return 
	 * @throws UnsupportedEncodingException 
	 * @throws FileNotFoundException 
	 */
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
	public static  void mainWindow(main frame/**JFrame m**/) throws FileNotFoundException, UnsupportedEncodingException{

		main mainframe = frame;

		// getting scenario name
		String settingName = mainframe.get_settingName();
		System.out.println(settingName);
		settingFileOp.setSettingfileName(settingName);	
		
		
	}

}
