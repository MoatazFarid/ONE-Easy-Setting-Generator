package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

import model.SpecificGroupSettings;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;

public class groupSpecificSettings_view extends JFrame {

	private JPanel contentPane;
	private JTextField txtGroupgroupid;
	private JTextField txtGroupokmaps;
	private JTextField txtGroupspeed;
	private JTextField txtGroupbuffersize;
	private JTextField txtGroupmovementmodel;
	private JTextField txtGrouproutefile;
	private JTextField txtGrouproutetype;
	private JTextField txtGroupwaittime;
	private JTextField txtGroupnrofhosts;

	// preparing model
	SpecificGroupSettings sp = new SpecificGroupSettings();
	//
	private static int CurrentinterfaceNO=1 ;  
	

	public static int getCurrentinterfaceNO() {
		return CurrentinterfaceNO;
	}

	public void setCurrentinterfaceNO(int currentinterfaceNO) {
		CurrentinterfaceNO = currentinterfaceNO;
	}

	/**
	 * Create the frame.
	 */
	public groupSpecificSettings_view() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 420);
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
		
		JLabel lblScenarioSettings = new JLabel("Group"+(CurrentinterfaceNO)+" Specific Settings");
		lblScenarioSettings.setFont(new Font("Tahoma", Font.BOLD, 18));
		GridBagConstraints gbc_lblScenarioSettings = new GridBagConstraints();
		gbc_lblScenarioSettings.insets = new Insets(0, 0, 0, 5);
		gbc_lblScenarioSettings.gridx = 6;
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
		gbl_panel_txtfield.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel_txtfield.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_txtfield.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_txtfield.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_txtfield.setLayout(gbl_panel_txtfield);
		
		JLabel groupID = new JLabel("Group"+CurrentinterfaceNO+".groupID");
		GridBagConstraints gbc_groupID = new GridBagConstraints();
		gbc_groupID.insets = new Insets(0, 0, 5, 5);
		gbc_groupID.anchor = GridBagConstraints.EAST;
		gbc_groupID.gridx = 1;
		gbc_groupID.gridy = 1;
		panel_txtfield.add(groupID, gbc_groupID);
		
		txtGroupgroupid = new JTextField();
		txtGroupgroupid.setText("a");
		GridBagConstraints gbc_txtGroupgroupid = new GridBagConstraints();
		gbc_txtGroupgroupid.insets = new Insets(0, 0, 5, 0);
		gbc_txtGroupgroupid.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtGroupgroupid.gridx = 2;
		gbc_txtGroupgroupid.gridy = 1;
		panel_txtfield.add(txtGroupgroupid, gbc_txtGroupgroupid);
		txtGroupgroupid.setColumns(10);
		
		JLabel lblGroupokmaps = new JLabel("Group"+CurrentinterfaceNO+".okMaps");
		GridBagConstraints gbc_lblGroupokmaps = new GridBagConstraints();
		gbc_lblGroupokmaps.anchor = GridBagConstraints.EAST;
		gbc_lblGroupokmaps.insets = new Insets(0, 0, 5, 5);
		gbc_lblGroupokmaps.gridx = 1;
		gbc_lblGroupokmaps.gridy = 2;
		panel_txtfield.add(lblGroupokmaps, gbc_lblGroupokmaps);
		
		txtGroupokmaps = new JTextField();
		txtGroupokmaps.setText("1");
		GridBagConstraints gbc_txtGroupokmaps = new GridBagConstraints();
		gbc_txtGroupokmaps.insets = new Insets(0, 0, 5, 0);
		gbc_txtGroupokmaps.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtGroupokmaps.gridx = 2;
		gbc_txtGroupokmaps.gridy = 2;
		panel_txtfield.add(txtGroupokmaps, gbc_txtGroupokmaps);
		txtGroupokmaps.setColumns(10);
		
		JLabel lblGroupspeed = new JLabel("Group"+CurrentinterfaceNO+".speed");
		GridBagConstraints gbc_lblGroupspeed = new GridBagConstraints();
		gbc_lblGroupspeed.anchor = GridBagConstraints.EAST;
		gbc_lblGroupspeed.insets = new Insets(0, 0, 5, 5);
		gbc_lblGroupspeed.gridx = 1;
		gbc_lblGroupspeed.gridy = 3;
		panel_txtfield.add(lblGroupspeed, gbc_lblGroupspeed);
		
		txtGroupspeed = new JTextField();
		txtGroupspeed.setText("2.7, 13.9");
		GridBagConstraints gbc_txtGroupspeed = new GridBagConstraints();
		gbc_txtGroupspeed.insets = new Insets(0, 0, 5, 0);
		gbc_txtGroupspeed.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtGroupspeed.gridx = 2;
		gbc_txtGroupspeed.gridy = 3;
		panel_txtfield.add(txtGroupspeed, gbc_txtGroupspeed);
		txtGroupspeed.setColumns(10);
		
		JLabel lblGroupbuffersize = new JLabel("Group"+CurrentinterfaceNO+".bufferSize");
		GridBagConstraints gbc_lblGroupbuffersize = new GridBagConstraints();
		gbc_lblGroupbuffersize.anchor = GridBagConstraints.EAST;
		gbc_lblGroupbuffersize.insets = new Insets(0, 0, 5, 5);
		gbc_lblGroupbuffersize.gridx = 1;
		gbc_lblGroupbuffersize.gridy = 4;
		panel_txtfield.add(lblGroupbuffersize, gbc_lblGroupbuffersize);
		
		txtGroupbuffersize = new JTextField();
		txtGroupbuffersize.setText("50M");
		GridBagConstraints gbc_txtGroupbuffersize = new GridBagConstraints();
		gbc_txtGroupbuffersize.insets = new Insets(0, 0, 5, 0);
		gbc_txtGroupbuffersize.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtGroupbuffersize.gridx = 2;
		gbc_txtGroupbuffersize.gridy = 4;
		panel_txtfield.add(txtGroupbuffersize, gbc_txtGroupbuffersize);
		txtGroupbuffersize.setColumns(10);
		
		JLabel lblGroupmovementmodel = new JLabel("Group"+CurrentinterfaceNO+".movementModel");
		GridBagConstraints gbc_lblGroupmovementmodel = new GridBagConstraints();
		gbc_lblGroupmovementmodel.anchor = GridBagConstraints.EAST;
		gbc_lblGroupmovementmodel.insets = new Insets(0, 0, 5, 5);
		gbc_lblGroupmovementmodel.gridx = 1;
		gbc_lblGroupmovementmodel.gridy = 5;
		panel_txtfield.add(lblGroupmovementmodel, gbc_lblGroupmovementmodel);
		
		txtGroupmovementmodel = new JTextField();
		txtGroupmovementmodel.setText("MapRouteMovement");
		GridBagConstraints gbc_txtGroupmovementmodel = new GridBagConstraints();
		gbc_txtGroupmovementmodel.insets = new Insets(0, 0, 5, 0);
		gbc_txtGroupmovementmodel.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtGroupmovementmodel.gridx = 2;
		gbc_txtGroupmovementmodel.gridy = 5;
		panel_txtfield.add(txtGroupmovementmodel, gbc_txtGroupmovementmodel);
		txtGroupmovementmodel.setColumns(10);
		
		JLabel lblGrouproutefile = new JLabel("Group"+CurrentinterfaceNO+".routeFile");
		GridBagConstraints gbc_lblGrouproutefile = new GridBagConstraints();
		gbc_lblGrouproutefile.anchor = GridBagConstraints.EAST;
		gbc_lblGrouproutefile.insets = new Insets(0, 0, 5, 5);
		gbc_lblGrouproutefile.gridx = 1;
		gbc_lblGrouproutefile.gridy = 6;
		panel_txtfield.add(lblGrouproutefile, gbc_lblGrouproutefile);
		
		txtGrouproutefile = new JTextField();
		txtGrouproutefile.setText("data/tram3.wkt");
		GridBagConstraints gbc_txtGrouproutefile = new GridBagConstraints();
		gbc_txtGrouproutefile.insets = new Insets(0, 0, 5, 0);
		gbc_txtGrouproutefile.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtGrouproutefile.gridx = 2;
		gbc_txtGrouproutefile.gridy = 6;
		panel_txtfield.add(txtGrouproutefile, gbc_txtGrouproutefile);
		txtGrouproutefile.setColumns(10);
		
		JLabel lblGrouproutetype = new JLabel("Group"+CurrentinterfaceNO+".routeType");
		GridBagConstraints gbc_lblGrouproutetype = new GridBagConstraints();
		gbc_lblGrouproutetype.anchor = GridBagConstraints.EAST;
		gbc_lblGrouproutetype.insets = new Insets(0, 0, 5, 5);
		gbc_lblGrouproutetype.gridx = 1;
		gbc_lblGrouproutetype.gridy = 7;
		panel_txtfield.add(lblGrouproutetype, gbc_lblGrouproutetype);
		
		txtGrouproutetype = new JTextField();
		txtGrouproutetype.setText("1");
		GridBagConstraints gbc_txtGrouproutetype = new GridBagConstraints();
		gbc_txtGrouproutetype.insets = new Insets(0, 0, 5, 0);
		gbc_txtGrouproutetype.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtGrouproutetype.gridx = 2;
		gbc_txtGrouproutetype.gridy = 7;
		panel_txtfield.add(txtGrouproutetype, gbc_txtGrouproutetype);
		txtGrouproutetype.setColumns(10);
		
		JLabel lblGroupwaittime = new JLabel("Group"+CurrentinterfaceNO+".waitTime");
		GridBagConstraints gbc_lblGroupwaittime = new GridBagConstraints();
		gbc_lblGroupwaittime.anchor = GridBagConstraints.EAST;
		gbc_lblGroupwaittime.insets = new Insets(0, 0, 5, 5);
		gbc_lblGroupwaittime.gridx = 1;
		gbc_lblGroupwaittime.gridy = 8;
		panel_txtfield.add(lblGroupwaittime, gbc_lblGroupwaittime);
		
		txtGroupwaittime = new JTextField();
		txtGroupwaittime.setText("10, 30");
		GridBagConstraints gbc_txtGroupwaittime = new GridBagConstraints();
		gbc_txtGroupwaittime.insets = new Insets(0, 0, 5, 0);
		gbc_txtGroupwaittime.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtGroupwaittime.gridx = 2;
		gbc_txtGroupwaittime.gridy = 8;
		panel_txtfield.add(txtGroupwaittime, gbc_txtGroupwaittime);
		txtGroupwaittime.setColumns(10);
		
		JLabel lblGroupnrofhosts = new JLabel("Group"+CurrentinterfaceNO+".nrofHosts");
		GridBagConstraints gbc_lblGroupnrofhosts = new GridBagConstraints();
		gbc_lblGroupnrofhosts.anchor = GridBagConstraints.EAST;
		gbc_lblGroupnrofhosts.insets = new Insets(0, 0, 0, 5);
		gbc_lblGroupnrofhosts.gridx = 1;
		gbc_lblGroupnrofhosts.gridy = 9;
		panel_txtfield.add(lblGroupnrofhosts, gbc_lblGroupnrofhosts);
		
		txtGroupnrofhosts = new JTextField();
		txtGroupnrofhosts.setText("5");
		GridBagConstraints gbc_txtGroupnrofhosts = new GridBagConstraints();
		gbc_txtGroupnrofhosts.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtGroupnrofhosts.gridx = 2;
		gbc_txtGroupnrofhosts.gridy = 9;
		panel_txtfield.add(txtGroupnrofhosts, gbc_txtGroupnrofhosts);
		txtGroupnrofhosts.setColumns(10);
		
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
				// if current group no is not after the last ,
				//if(getCurrentinterfaceNO()!= 1)setCurrentinterfaceNO(getCurrentinterfaceNO()+1);
				if(getCurrentinterfaceNO()>0){
					if(getCurrentinterfaceNO() <= Scenario_Setting_view.getNoOfGroupHosts()){
						// start using MODEL
						// set group ID
						try {						
							SpecificGroupSettings.setGroup_ID(getTxtGroupgroupid(),getCurrentinterfaceNO());
							// set OK maps 
							SpecificGroupSettings.setGroup_okMaps(getTxtGroupokmaps());
							// set Speed 
							SpecificGroupSettings.setGroup_speed(getTxtGroupspeed());
							// bufferSize
							SpecificGroupSettings.setGroup_bufferSize(getTxtGroupbuffersize());
							// set movement Model 
							SpecificGroupSettings.setGroup_movementModel(getTxtGroupmovementmodel());
							// routerFile 
							SpecificGroupSettings.setGroup_routeFile(getTxtGrouproutefile());
							// routerType
							SpecificGroupSettings.setGroup__routeType(getTxtGrouproutetype());
							// set waittime
							SpecificGroupSettings.setGroup_waitTime(getTxtGroupwaittime());
							// set no of hosts 
							SpecificGroupSettings.setGroup_nrOfHosts(getTxtGroupnrofhosts());
							
							setCurrentinterfaceNO(getCurrentinterfaceNO()+1);
							if(getCurrentinterfaceNO() < Scenario_Setting_view.getNoOfGroupHosts()){
								// open current window again and again
								groupSpecificSettings_view sp = new groupSpecificSettings_view();
								sp.setVisible(true);
							}							
							else{// else open next window
								// next Window
								messageCreationParameters_view mc = new messageCreationParameters_view();
								mc.setVisible(true);
								dispose();
							}
							// dispose current
							dispose();
							
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					dispose();
				}
			}

		});
		GridBagConstraints gbc_btnNext = new GridBagConstraints();
		gbc_btnNext.gridx = 0;
		gbc_btnNext.gridy = 3;
		contentPane.add(btnNext, gbc_btnNext);
		}
		/**
		 * @return the txtGroupgroupid
		 */
		public String getTxtGroupgroupid() {
			return txtGroupgroupid.getText();
		}
	
		/**
		 * @return the txtGroupokmaps
		 */
		public int getTxtGroupokmaps() {
			return Integer.parseInt(txtGroupokmaps.getText());
		}
	
		/**
		 * @return the txtGroupspeed
		 */
		public String getTxtGroupspeed() {
			return txtGroupspeed.getText();
		}
	
		/**
		 * @return the txtGroupbuffersize
		 */
		public String getTxtGroupbuffersize() {
			return txtGroupbuffersize.getText();
		}
	
		/**
		 * @return the txtGroupmovementmodel
		 */
		public String getTxtGroupmovementmodel() {
			return txtGroupmovementmodel.getText();
		}
	
		/**
		 * @return the txtGrouproutefile
		 */
		public String getTxtGrouproutefile() {
			return txtGrouproutefile.getText();
		}
	
		/**
		 * @return the txtGrouproutetype
		 */
		public String getTxtGrouproutetype() {
			return txtGrouproutetype.getText();
		}
	
		/**
		 * @return the txtGroupwaittime
		 */
		public String getTxtGroupwaittime() {
			return txtGroupwaittime.getText();
		}
	
		/**
		 * @return the txtGroupnrofhosts
		 */
		public int getTxtGroupnrofhosts() {
			return Integer.parseInt(txtGroupnrofhosts.getText());
		}

}
