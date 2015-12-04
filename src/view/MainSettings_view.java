package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JDialog;

import model.settingFileOp;

import controller.reportGenerate;

public class MainSettings_view extends JFrame {


	private JPanel contentPane;
	private JTextField textField_settingName;
	private JTextField textField_NoOfHostGroups;
	private JTextField textField_bufferSize;
	private JTextField textField_waitTimeFrom;
	private JTextField textField_waitTimeTo;
	private JTextField textField_nrofInterfaces;
	private JTextField textField_speedFrom;
	private JTextField textField_speedTo;
	private JTextField textField_msgTtl;
	private JTextField textField_noOfHosts;
	private JTextField textField_GroupSymbol;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainSettings_view frame = new MainSettings_view();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public String get_settingName(){
		return textField_settingName.getText();
	}

	/**
	 * Create the frame.
	 */
	public MainSettings_view() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 425);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 414, 60);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblSettingName = new JLabel("Setting(Scenario) name");
		lblSettingName.setBounds(10, 11, 112, 14);
		panel.add(lblSettingName);
		
		textField_settingName = new JTextField();
		textField_settingName.setBounds(132, 8, 86, 20);
		panel.add(textField_settingName);
		textField_settingName.setColumns(10);
		
		JLabel lblNoOfHostGroups = new JLabel("No. of Host Groups");
		lblNoOfHostGroups.setBounds(10, 36, 112, 14);
		panel.add(lblNoOfHostGroups);
		
		textField_NoOfHostGroups = new JTextField();
		textField_NoOfHostGroups.setBounds(132, 33, 86, 20);
		panel.add(textField_NoOfHostGroups);
		textField_NoOfHostGroups.setColumns(10);
		
		JButton btn_CreateHostGroups = new JButton("Create Host Groups");
		btn_CreateHostGroups.setBounds(259, 27, 145, 23);
		panel.add(btn_CreateHostGroups);
		//createSettingFile(btn_CreateHostGroups);
		btn_CreateHostGroups.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					settingFileOp.setSettingfileName(get_settingName());
					settingFileOp.setNoOFHostGroups(Integer.parseInt(textField_NoOfHostGroups.getText()));
					//reportGenerate.mainWindow(frame);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		JButton btnCreateSettingFile = new JButton("Create Setting File");
		btnCreateSettingFile.setBounds(147, 352, 148, 23);
		contentPane.add(btnCreateSettingFile);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 97, 414, 242);
		contentPane.add(scrollPane);
		
		JPanel panel_generalSetting = new JPanel();
		scrollPane.setViewportView(panel_generalSetting);
		panel_generalSetting.setLayout(null);
		
		JLabel lblGroupmovementmodel = new JLabel("Group.movementModel");
		lblGroupmovementmodel.setBounds(11, 53, 120, 14);
		panel_generalSetting.add(lblGroupmovementmodel);
		
		JLabel lblGrouprouter = new JLabel("Group.router");
		lblGrouprouter.setBounds(11, 76, 120, 14);
		panel_generalSetting.add(lblGrouprouter);
		
		JLabel lblGroupbuffersize = new JLabel("Group.bufferSize");
		lblGroupbuffersize.setBounds(11, 99, 120, 14);
		panel_generalSetting.add(lblGroupbuffersize);
		
		JLabel lblGroupwaittime = new JLabel("Group.waitTime");
		lblGroupwaittime.setBounds(11, 127, 120, 14);
		panel_generalSetting.add(lblGroupwaittime);
		
		JLabel lblGroupnrofinterfaces = new JLabel("Group.nrofInterfaces");
		lblGroupnrofinterfaces.setBounds(11, 150, 120, 14);
		panel_generalSetting.add(lblGroupnrofinterfaces);
		
		JLabel lblGroupspeed = new JLabel("Group.speed");
		lblGroupspeed.setBounds(11, 173, 120, 14);
		panel_generalSetting.add(lblGroupspeed);
		
		JLabel lblGroupmsgttl = new JLabel("Group.msgTtl");
		lblGroupmsgttl.setBounds(11, 191, 120, 14);
		panel_generalSetting.add(lblGroupmsgttl);
		
		JLabel lblGroupnrofhosts = new JLabel("Group.nrofHosts");
		lblGroupnrofhosts.setBounds(11, 212, 120, 14);
		panel_generalSetting.add(lblGroupnrofhosts);
		
		JComboBox comboBox_movementModels = new JComboBox();
		comboBox_movementModels.setBounds(195, 50, 210, 20);
		panel_generalSetting.add(comboBox_movementModels);
		
		JComboBox comboBox_router = new JComboBox();
		comboBox_router.setBounds(195, 76, 210, 20);
		panel_generalSetting.add(comboBox_router);
		
		textField_bufferSize = new JTextField();
		textField_bufferSize.setBounds(195, 99, 86, 20);
		panel_generalSetting.add(textField_bufferSize);
		textField_bufferSize.setColumns(10);
		
		textField_waitTimeFrom = new JTextField();
		textField_waitTimeFrom.setBounds(195, 124, 86, 20);
		panel_generalSetting.add(textField_waitTimeFrom);
		textField_waitTimeFrom.setColumns(10);
		
		JLabel label = new JLabel(",");
		label.setBounds(284, 127, 10, 14);
		panel_generalSetting.add(label);
		
		textField_waitTimeTo = new JTextField();
		textField_waitTimeTo.setBounds(294, 124, 86, 20);
		panel_generalSetting.add(textField_waitTimeTo);
		textField_waitTimeTo.setColumns(10);
		
		textField_nrofInterfaces = new JTextField();
		textField_nrofInterfaces.setBounds(195, 147, 86, 20);
		panel_generalSetting.add(textField_nrofInterfaces);
		textField_nrofInterfaces.setColumns(10);
		
		textField_speedFrom = new JTextField();
		textField_speedFrom.setBounds(195, 170, 86, 20);
		panel_generalSetting.add(textField_speedFrom);
		textField_speedFrom.setColumns(10);
		
		JLabel label_1 = new JLabel(",");
		label_1.setBounds(284, 173, 10, 14);
		panel_generalSetting.add(label_1);
		
		textField_speedTo = new JTextField();
		textField_speedTo.setBounds(294, 170, 86, 20);
		panel_generalSetting.add(textField_speedTo);
		textField_speedTo.setColumns(10);
		
		textField_msgTtl = new JTextField();
		textField_msgTtl.setBounds(195, 188, 86, 20);
		panel_generalSetting.add(textField_msgTtl);
		textField_msgTtl.setColumns(10);
		
		textField_noOfHosts = new JTextField();
		textField_noOfHosts.setBounds(195, 209, 86, 20);
		panel_generalSetting.add(textField_noOfHosts);
		textField_noOfHosts.setColumns(10);
		
		JLabel lblGroupNo = new JLabel("Group NO:");
		lblGroupNo.setBounds(10, 31, 121, 14);
		panel_generalSetting.add(lblGroupNo);
		
		JLabel lblGrpnoview = new JLabel("#grpNo");
		lblGrpnoview.setBounds(195, 31, 46, 14);
		panel_generalSetting.add(lblGrpnoview);
		
		JLabel lblGroupSymbol = new JLabel("Group Symbol");
		lblGroupSymbol.setBounds(10, 11, 121, 14);
		panel_generalSetting.add(lblGroupSymbol);
		
		textField_GroupSymbol = new JTextField();
		textField_GroupSymbol.setBounds(195, 8, 86, 20);
		panel_generalSetting.add(textField_GroupSymbol);
		textField_GroupSymbol.setColumns(10);
		
		JButton btnSetInterfaces = new JButton("set interfaces");
		btnSetInterfaces.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// get the no of interfaces 
				//String no = textField_nrofInterfaces.getText();
				int no = Integer.parseInt(textField_nrofInterfaces.getText());
				try {
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		//btnSetInterfaces.setBounds(294, 146, 108, 23);
		//panel_generalSetting.add(btnSetInterfaces);
	}
	
	public void createSettingFile(JButton btn_CreateHostGroups){
		
	}
}
