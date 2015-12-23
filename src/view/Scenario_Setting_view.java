package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import model.Scenario_setting;

public class Scenario_Setting_view extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5204707399889653579L;
	private JPanel contentPane;
	private JTextField txtScenarioName;
	private JTextField txtScenarioUpdateinterval;
	private JTextField txtScenarioEndtime;
	private JTextField txtScenarioMaxhopcount;
	private static JTextField txtScenarioNrofhostgroups;
	private static JTextField txtNoOfEvent;
	private JTextField txtScenarioSimulateConnections;
	
	private static int noOfGroupHosts;

	/**
	 * @return the noOfGroupHosts
	 */
	public static int getNoOfGroupHosts() {
		return getTxtScenarioNrofhostgroups();
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Scenario_Setting_view frame = new Scenario_Setting_view();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Scenario_Setting_view() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 401);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0};
		gbl_contentPane.rowHeights = new int[]{58, 7, 2, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JPanel panel_headers = new JPanel();
		GridBagConstraints gbc_panel_headers = new GridBagConstraints();
		gbc_panel_headers.anchor = GridBagConstraints.NORTH;
		gbc_panel_headers.insets = new Insets(0, 0, 5, 0);
		gbc_panel_headers.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel_headers.gridx = 0;
		gbc_panel_headers.gridy = 0;
		contentPane.add(panel_headers, gbc_panel_headers);
		GridBagLayout gbl_panel_headers = new GridBagLayout();
		gbl_panel_headers.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_headers.rowHeights = new int[]{0, 0};
		gbl_panel_headers.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_headers.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_headers.setLayout(gbl_panel_headers);
		
		JLabel lblScenarioSettings = new JLabel("Scenario Settings");
		lblScenarioSettings.setFont(new Font("Tahoma", Font.BOLD, 18));
		GridBagConstraints gbc_lblScenarioSettings = new GridBagConstraints();
		gbc_lblScenarioSettings.gridx = 9;
		gbc_lblScenarioSettings.gridy = 0;
		panel_headers.add(lblScenarioSettings, gbc_lblScenarioSettings);
		
		JPanel panel_txtfield = new JPanel();
		GridBagConstraints gbc_panel_txtfield = new GridBagConstraints();
		gbc_panel_txtfield.insets = new Insets(0, 0, 5, 0);
		gbc_panel_txtfield.fill = GridBagConstraints.BOTH;
		gbc_panel_txtfield.gridx = 0;
		gbc_panel_txtfield.gridy = 1;
		contentPane.add(panel_txtfield, gbc_panel_txtfield);
		GridBagLayout gbl_panel_txtfield = new GridBagLayout();
		gbl_panel_txtfield.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panel_txtfield.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_txtfield.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_txtfield.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_txtfield.setLayout(gbl_panel_txtfield);
		
		JLabel lblScenarioName = new JLabel("Scenario Name:");
		GridBagConstraints gbc_lblScenarioName = new GridBagConstraints();
		gbc_lblScenarioName.insets = new Insets(0, 0, 5, 5);
		gbc_lblScenarioName.gridx = 2;
		gbc_lblScenarioName.gridy = 0;
		panel_txtfield.add(lblScenarioName, gbc_lblScenarioName);
		
		txtScenarioName = new JTextField();
		txtScenarioName.setText("Scenario Name");
		GridBagConstraints gbc_txtScenarioName = new GridBagConstraints();
		gbc_txtScenarioName.insets = new Insets(0, 0, 5, 0);
		gbc_txtScenarioName.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtScenarioName.gridx = 5;
		gbc_txtScenarioName.gridy = 0;
		panel_txtfield.add(txtScenarioName, gbc_txtScenarioName);
		txtScenarioName.setColumns(10);
		
		JLabel lblScenarioSimulateconnections = new JLabel("Scenario simulateConnections");
		GridBagConstraints gbc_lblScenarioSimulateconnections = new GridBagConstraints();
		gbc_lblScenarioSimulateconnections.insets = new Insets(0, 0, 5, 5);
		gbc_lblScenarioSimulateconnections.gridx = 2;
		gbc_lblScenarioSimulateconnections.gridy = 1;
		panel_txtfield.add(lblScenarioSimulateconnections, gbc_lblScenarioSimulateconnections);
		
		txtScenarioSimulateConnections = new JTextField();
		txtScenarioSimulateConnections.setText("true");
		GridBagConstraints gbc_txtScenarioSimulateConnections = new GridBagConstraints();
		gbc_txtScenarioSimulateConnections.insets = new Insets(0, 0, 5, 0);
		gbc_txtScenarioSimulateConnections.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtScenarioSimulateConnections.gridx = 5;
		gbc_txtScenarioSimulateConnections.gridy = 1;
		panel_txtfield.add(txtScenarioSimulateConnections, gbc_txtScenarioSimulateConnections);
		txtScenarioSimulateConnections.setColumns(10);
		
		JLabel lblScenarioUpdateinterval = new JLabel("Scenario updateInterval");
		GridBagConstraints gbc_lblScenarioUpdateinterval = new GridBagConstraints();
		gbc_lblScenarioUpdateinterval.insets = new Insets(0, 0, 5, 5);
		gbc_lblScenarioUpdateinterval.gridx = 2;
		gbc_lblScenarioUpdateinterval.gridy = 2;
		panel_txtfield.add(lblScenarioUpdateinterval, gbc_lblScenarioUpdateinterval);
		
		txtScenarioUpdateinterval = new JTextField();
		txtScenarioUpdateinterval.setText("0.1");
		GridBagConstraints gbc_txtScenarioUpdateinterval = new GridBagConstraints();
		gbc_txtScenarioUpdateinterval.insets = new Insets(0, 0, 5, 0);
		gbc_txtScenarioUpdateinterval.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtScenarioUpdateinterval.gridx = 5;
		gbc_txtScenarioUpdateinterval.gridy = 2;
		panel_txtfield.add(txtScenarioUpdateinterval, gbc_txtScenarioUpdateinterval);
		txtScenarioUpdateinterval.setColumns(10);
		
		JLabel lblScenarioEndtime = new JLabel("Scenario endTime");
		GridBagConstraints gbc_lblScenarioEndtime = new GridBagConstraints();
		gbc_lblScenarioEndtime.insets = new Insets(0, 0, 5, 5);
		gbc_lblScenarioEndtime.gridx = 2;
		gbc_lblScenarioEndtime.gridy = 3;
		panel_txtfield.add(lblScenarioEndtime, gbc_lblScenarioEndtime);
		
		txtScenarioEndtime = new JTextField();
		txtScenarioEndtime.setText("43333");
		GridBagConstraints gbc_txtScenarioEndtime = new GridBagConstraints();
		gbc_txtScenarioEndtime.insets = new Insets(0, 0, 5, 0);
		gbc_txtScenarioEndtime.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtScenarioEndtime.gridx = 5;
		gbc_txtScenarioEndtime.gridy = 3;
		panel_txtfield.add(txtScenarioEndtime, gbc_txtScenarioEndtime);
		txtScenarioEndtime.setColumns(10);
		
		JLabel lblScenarioMaxHop = new JLabel("Scenario Max Hop Count");
		GridBagConstraints gbc_lblScenarioMaxHop = new GridBagConstraints();
		gbc_lblScenarioMaxHop.insets = new Insets(0, 0, 5, 5);
		gbc_lblScenarioMaxHop.gridx = 2;
		gbc_lblScenarioMaxHop.gridy = 4;
		panel_txtfield.add(lblScenarioMaxHop, gbc_lblScenarioMaxHop);
		
		txtScenarioMaxhopcount = new JTextField();
		txtScenarioMaxhopcount.setText("2");
		GridBagConstraints gbc_txtScenarioMaxhopcount = new GridBagConstraints();
		gbc_txtScenarioMaxhopcount.insets = new Insets(0, 0, 5, 0);
		gbc_txtScenarioMaxhopcount.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtScenarioMaxhopcount.gridx = 5;
		gbc_txtScenarioMaxhopcount.gridy = 4;
		panel_txtfield.add(txtScenarioMaxhopcount, gbc_txtScenarioMaxhopcount);
		txtScenarioMaxhopcount.setColumns(10);
		
		JLabel lblScenarioNrofhostgroups = new JLabel("Scenario nrofHostGroups");
		GridBagConstraints gbc_lblScenarioNrofhostgroups = new GridBagConstraints();
		gbc_lblScenarioNrofhostgroups.insets = new Insets(0, 0, 5, 5);
		gbc_lblScenarioNrofhostgroups.gridx = 2;
		gbc_lblScenarioNrofhostgroups.gridy = 5;
		panel_txtfield.add(lblScenarioNrofhostgroups, gbc_lblScenarioNrofhostgroups);
		
		txtScenarioNrofhostgroups = new JTextField();
		txtScenarioNrofhostgroups.setText("5");
		GridBagConstraints gbc_txtScenarioNrofhostgroups = new GridBagConstraints();
		gbc_txtScenarioNrofhostgroups.insets = new Insets(0, 0, 5, 0);
		gbc_txtScenarioNrofhostgroups.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtScenarioNrofhostgroups.gridx = 5;
		gbc_txtScenarioNrofhostgroups.gridy = 5;
		panel_txtfield.add(txtScenarioNrofhostgroups, gbc_txtScenarioNrofhostgroups);
		txtScenarioNrofhostgroups.setColumns(10);
		
		JLabel lblNoOfEventGenerators = new JLabel("No Of Event Generators");
		GridBagConstraints gbc_lblNoOfEventGenerators = new GridBagConstraints();
		gbc_lblNoOfEventGenerators.insets = new Insets(0, 0, 0, 5);
		gbc_lblNoOfEventGenerators.gridx = 2;
		gbc_lblNoOfEventGenerators.gridy = 6;
		panel_txtfield.add(lblNoOfEventGenerators, gbc_lblNoOfEventGenerators);
		
		txtNoOfEvent = new JTextField();
		txtNoOfEvent.setText("1");
		GridBagConstraints gbc_txtNoOfEvent = new GridBagConstraints();
		gbc_txtNoOfEvent.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNoOfEvent.gridx = 5;
		gbc_txtNoOfEvent.gridy = 6;
		panel_txtfield.add(txtNoOfEvent, gbc_txtNoOfEvent);
		txtNoOfEvent.setColumns(10);
		
		JPanel panel_btns = new JPanel();
		GridBagConstraints gbc_panel_btns = new GridBagConstraints();
		gbc_panel_btns.insets = new Insets(0, 0, 5, 0);
		gbc_panel_btns.fill = GridBagConstraints.BOTH;
		gbc_panel_btns.gridx = 0;
		gbc_panel_btns.gridy = 2;
		contentPane.add(panel_btns, gbc_panel_btns);
		GridBagLayout gbl_panel_btns = new GridBagLayout();
		gbl_panel_btns.columnWidths = new int[]{0};
		gbl_panel_btns.rowHeights = new int[]{0};
		gbl_panel_btns.columnWeights = new double[]{Double.MIN_VALUE};
		gbl_panel_btns.rowWeights = new double[]{Double.MIN_VALUE};
		panel_btns.setLayout(gbl_panel_btns);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					// scenario name 
					Scenario_setting.setScenario_name(getTxtScenarioName());
					
					//Scenario_simulateConnections
					Scenario_setting.setScenario_simulateConnections(getTxtScenarioSimulateConnections());
					
					//Scenario_updateInterval
					Scenario_setting.setScenario_updateInterval(getTxtScenarioUpdateinterval());
					
					//Scenario_maxhopcount
					Scenario_setting.setScenario_maxhopcount(getTxtScenarioMaxhopcount());
					
					//Scenario_nrofHostGroups
					Scenario_setting.setScenario_nrofHostGroups(getTxtScenarioNrofhostgroups());
					
					//Events_nrof
					Scenario_setting.setEvents_nrof(getTxtNoOfEvent());
					
					//open the next interface
					interfaceSpecificSettings_view newinterface = new interfaceSpecificSettings_view(getTxtScenarioName());
					newinterface.setVisible(true);
					// close the window 
					setVisible(false); //you can't see me!
					dispose(); //Destroy the JFrame object
					
				} catch (FileNotFoundException | UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		GridBagConstraints gbc_btnNext = new GridBagConstraints();
		gbc_btnNext.gridx = 0;
		gbc_btnNext.gridy = 3;
		contentPane.add(btnNext, gbc_btnNext);
	}


	/**Getters and setters**/

	/**
	 * @return the txtScenarioName
	 */
	public String getTxtScenarioName() {
		return txtScenarioName.getText();
	}

	/**
	 * @return the txtScenarioUpdateinterval
	 */
	public float getTxtScenarioUpdateinterval() {
		return Float.parseFloat(txtScenarioUpdateinterval.getText());
	}

	/**
	 * @return the txtScenarioEndtime
	 */
	public int getTxtScenarioEndtime() {
		return Integer.parseInt(txtScenarioEndtime.getText());
	}

	/**
	 * @return the txtScenarioMaxhopcount
	 */
	public int getTxtScenarioMaxhopcount() {
		return Integer.parseInt(txtScenarioMaxhopcount.getText());
	}

	/**
	 * @return the txtScenarioNrofhostgroups
	 */
	public static int getTxtScenarioNrofhostgroups() {
		return Integer.parseInt(txtScenarioNrofhostgroups.getText());
	}

	/**
	 * @return the txtNoOfEvent
	 */
	public static int getTxtNoOfEvent() {
		return Integer.parseInt(txtNoOfEvent.getText());
	}

	/**
	 * @return the txtScenarioSimulateConnections
	 */
	public boolean getTxtScenarioSimulateConnections() {
		
		if(txtScenarioSimulateConnections.getText() == "true")
			return true;
		else 
			return false;
	}


}
