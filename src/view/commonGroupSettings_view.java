package view;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import model.commonGroupSettings;

public class commonGroupSettings_view extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6523542608729675883L;
	private JPanel contentPane;
	
	private JTextField txtGroupMovementModel;
	private JTextField txtGroupRouter;
	private JTextField txtGroupbuffersize;
	private JTextField txtGroupwaittime;
	private JTextField txtGroupnrofinterfaces;
	private JTextField txtGroupspeed;
	private JTextField txtGroupmsgttl;
	private JTextField txtGroupnrofhosts;
	
	// interface Counter
	// used for opening interfaces jFrames
	private static int interfaceCount = 0;
	
	// TotalNoOfInterfacesPerGroup 
	public static int TotalNoOfInterfacesPerGroup;

	boolean opened = false;
	/**
	 * Create the frame.
	 */
	public commonGroupSettings_view() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 401);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0};
		gbl_contentPane.rowHeights = new int[]{58, 7, 2, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, Double.MIN_VALUE};
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
		
		JLabel lbl_HEADER = new JLabel("Common Group Settings");
		lbl_HEADER.setFont(new Font("Tahoma", Font.BOLD, 18));
		GridBagConstraints gbc_lbl_HEADER = new GridBagConstraints();
		gbc_lbl_HEADER.insets = new Insets(0, 0, 0, 5);
		gbc_lbl_HEADER.gridx = 6;
		gbc_lbl_HEADER.gridy = 0;
		panel_headers.add(lbl_HEADER, gbc_lbl_HEADER);
		
		JPanel panel_txtfield = new JPanel();
		GridBagConstraints gbc_panel_txtfield = new GridBagConstraints();
		gbc_panel_txtfield.insets = new Insets(0, 0, 5, 0);
		gbc_panel_txtfield.fill = GridBagConstraints.BOTH;
		gbc_panel_txtfield.gridx = 0;
		gbc_panel_txtfield.gridy = 1;
		contentPane.add(panel_txtfield, gbc_panel_txtfield);
		GridBagLayout gbl_panel_txtfield = new GridBagLayout();
		gbl_panel_txtfield.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_panel_txtfield.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_txtfield.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_txtfield.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_txtfield.setLayout(gbl_panel_txtfield);
		
		JLabel lblCommongroup = new JLabel("Group.movementModel =");
		GridBagConstraints gbc_lblCommongroup = new GridBagConstraints();
		gbc_lblCommongroup.insets = new Insets(0, 0, 5, 5);
		gbc_lblCommongroup.gridx = 1;
		gbc_lblCommongroup.gridy = 1;
		panel_txtfield.add(lblCommongroup, gbc_lblCommongroup);
		
		txtGroupMovementModel = new JTextField();
		txtGroupMovementModel.setText("ShortestPathMapBasedMovement");
		GridBagConstraints gbc_txtGroupMovementModel = new GridBagConstraints();
		gbc_txtGroupMovementModel.insets = new Insets(0, 0, 5, 0);
		gbc_txtGroupMovementModel.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtGroupMovementModel.gridx = 3;
		gbc_txtGroupMovementModel.gridy = 1;
		panel_txtfield.add(txtGroupMovementModel, gbc_txtGroupMovementModel);
		txtGroupMovementModel.setColumns(10);
		
		JLabel lblGrouprouter = new JLabel("Group.router = ");
		GridBagConstraints gbc_lblGrouprouter = new GridBagConstraints();
		gbc_lblGrouprouter.insets = new Insets(0, 0, 5, 5);
		gbc_lblGrouprouter.gridx = 1;
		gbc_lblGrouprouter.gridy = 2;
		panel_txtfield.add(lblGrouprouter, gbc_lblGrouprouter);
		
		txtGroupRouter = new JTextField();
		txtGroupRouter.setText("SprayAndWaitRouterHopLimitedVersion");
		GridBagConstraints gbc_txtGroupRouter = new GridBagConstraints();
		gbc_txtGroupRouter.insets = new Insets(0, 0, 5, 0);
		gbc_txtGroupRouter.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtGroupRouter.gridx = 3;
		gbc_txtGroupRouter.gridy = 2;
		panel_txtfield.add(txtGroupRouter, gbc_txtGroupRouter);
		txtGroupRouter.setColumns(10);
		
		JLabel lblGroupbuffersize = new JLabel("Group.bufferSize =");
		GridBagConstraints gbc_lblGroupbuffersize = new GridBagConstraints();
		gbc_lblGroupbuffersize.insets = new Insets(0, 0, 5, 5);
		gbc_lblGroupbuffersize.gridx = 1;
		gbc_lblGroupbuffersize.gridy = 3;
		panel_txtfield.add(lblGroupbuffersize, gbc_lblGroupbuffersize);
		
		txtGroupbuffersize = new JTextField();
		txtGroupbuffersize.setText("5M");
		GridBagConstraints gbc_txtGroupbuffersize = new GridBagConstraints();
		gbc_txtGroupbuffersize.insets = new Insets(0, 0, 5, 0);
		gbc_txtGroupbuffersize.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtGroupbuffersize.gridx = 3;
		gbc_txtGroupbuffersize.gridy = 3;
		panel_txtfield.add(txtGroupbuffersize, gbc_txtGroupbuffersize);
		txtGroupbuffersize.setColumns(10);
		
		JLabel lblGroupwaittime = new JLabel("Group.waitTime =");
		GridBagConstraints gbc_lblGroupwaittime = new GridBagConstraints();
		gbc_lblGroupwaittime.insets = new Insets(0, 0, 5, 5);
		gbc_lblGroupwaittime.gridx = 1;
		gbc_lblGroupwaittime.gridy = 4;
		panel_txtfield.add(lblGroupwaittime, gbc_lblGroupwaittime);
		
		txtGroupwaittime = new JTextField();
		txtGroupwaittime.setText("0, 120");
		GridBagConstraints gbc_txtGroupwaittime = new GridBagConstraints();
		gbc_txtGroupwaittime.insets = new Insets(0, 0, 5, 0);
		gbc_txtGroupwaittime.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtGroupwaittime.gridx = 3;
		gbc_txtGroupwaittime.gridy = 4;
		panel_txtfield.add(txtGroupwaittime, gbc_txtGroupwaittime);
		txtGroupwaittime.setColumns(10);
		
		JLabel lblGroupnrofinterfaces = new JLabel("Group.nrofInterfaces =");
		GridBagConstraints gbc_lblGroupnrofinterfaces = new GridBagConstraints();
		gbc_lblGroupnrofinterfaces.insets = new Insets(0, 0, 5, 5);
		gbc_lblGroupnrofinterfaces.gridx = 1;
		gbc_lblGroupnrofinterfaces.gridy = 5;
		panel_txtfield.add(lblGroupnrofinterfaces, gbc_lblGroupnrofinterfaces);
		
		txtGroupnrofinterfaces = new JTextField();
		txtGroupnrofinterfaces.setText("1");
		GridBagConstraints gbc_txtGroupnrofinterfaces = new GridBagConstraints();
		gbc_txtGroupnrofinterfaces.insets = new Insets(0, 0, 5, 0);
		gbc_txtGroupnrofinterfaces.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtGroupnrofinterfaces.gridx = 3;
		gbc_txtGroupnrofinterfaces.gridy = 5;
		panel_txtfield.add(txtGroupnrofinterfaces, gbc_txtGroupnrofinterfaces);
		txtGroupnrofinterfaces.setColumns(10);
		
		JLabel lblGroupspeed = new JLabel("Group.speed =");
		GridBagConstraints gbc_lblGroupspeed = new GridBagConstraints();
		gbc_lblGroupspeed.insets = new Insets(0, 0, 5, 5);
		gbc_lblGroupspeed.gridx = 1;
		gbc_lblGroupspeed.gridy = 6;
		panel_txtfield.add(lblGroupspeed, gbc_lblGroupspeed);
		
		txtGroupspeed = new JTextField();
		txtGroupspeed.setText("0.5 , 1.5");
		GridBagConstraints gbc_txtGroupspeed = new GridBagConstraints();
		gbc_txtGroupspeed.insets = new Insets(0, 0, 5, 0);
		gbc_txtGroupspeed.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtGroupspeed.gridx = 3;
		gbc_txtGroupspeed.gridy = 6;
		panel_txtfield.add(txtGroupspeed, gbc_txtGroupspeed);
		txtGroupspeed.setColumns(10);
		
		JLabel lblGroupmsgttl = new JLabel("Group.msgTtl =");
		GridBagConstraints gbc_lblGroupmsgttl = new GridBagConstraints();
		gbc_lblGroupmsgttl.insets = new Insets(0, 0, 5, 5);
		gbc_lblGroupmsgttl.gridx = 1;
		gbc_lblGroupmsgttl.gridy = 7;
		panel_txtfield.add(lblGroupmsgttl, gbc_lblGroupmsgttl);
		
		txtGroupmsgttl = new JTextField();
		txtGroupmsgttl.setText("300");
		GridBagConstraints gbc_txtGroupmsgttl = new GridBagConstraints();
		gbc_txtGroupmsgttl.insets = new Insets(0, 0, 5, 0);
		gbc_txtGroupmsgttl.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtGroupmsgttl.gridx = 3;
		gbc_txtGroupmsgttl.gridy = 7;
		panel_txtfield.add(txtGroupmsgttl, gbc_txtGroupmsgttl);
		txtGroupmsgttl.setColumns(10);
		
		JLabel lblGroupnrofhosts = new JLabel("Group.nrofHosts =");
		GridBagConstraints gbc_lblGroupnrofhosts = new GridBagConstraints();
		gbc_lblGroupnrofhosts.insets = new Insets(0, 0, 0, 5);
		gbc_lblGroupnrofhosts.gridx = 1;
		gbc_lblGroupnrofhosts.gridy = 8;
		panel_txtfield.add(lblGroupnrofhosts, gbc_lblGroupnrofhosts);
		
		txtGroupnrofhosts = new JTextField();
		txtGroupnrofhosts.setText("40");
		GridBagConstraints gbc_txtGroupnrofhosts = new GridBagConstraints();
		gbc_txtGroupnrofhosts.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtGroupnrofhosts.gridx = 3;
		gbc_txtGroupnrofhosts.gridy = 8;
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
				
				if(!opened)
					{// dealing with common group setting
					//commonGroupSettings
					try {
						if (opened = true){
							//set movement model 
							commonGroupSettings.setGroup_movementModel(getTxtGroupMovementModel());
							
							// set router type
							commonGroupSettings.setGroup_router(getTxtGroupRouter());
							
							// set buffer size 
							commonGroupSettings.setGroup_bufferSize(getTxtGroupbuffersize());
		
							// set wait time 
							commonGroupSettings.setGroup_waitTime(getTxtGroupwaittime());
							
							TotalNoOfInterfacesPerGroup = getTxtGroupnrofinterfaces();
							
							commonGroupSettings.setGroup_noOfInterfaces(TotalNoOfInterfacesPerGroup);
							
						}
						// start the interfaces frames 

						if(getInterfaceCount() != TotalNoOfInterfacesPerGroup)						
						{
							commonGroup_interfaces_view in = new commonGroup_interfaces_view();
							in.interfaceNo = getInterfaceCount();
							in.setVisible(true);
							in.setAlwaysOnTop (true);
							opened = false;
						}else{
							// finish the interfaces
							setVisible(true);
							//set group speed 
							commonGroupSettings.setGroup_speed(getTxtGroupspeed());
							
							//set msg ttl 
							commonGroupSettings.setGroup_msgTtl(getTxtGroupmsgttl());
							
							//set group no of hosts 
							commonGroupSettings.setGroup_nrOfHosts(getTxtGroupnrofhosts());
							
//							if(getInterfaceCount() == TotalNoOfInterfacesPerGroup){
//								// open next window
//									
							// dispose current window 
							setVisible(false); //you can't see me!
							dispose(); //Destroy the JFrame object
		
							
						}
		
						
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
			}
		});
		GridBagConstraints gbc_btnNext = new GridBagConstraints();
		gbc_btnNext.gridx = 0;
		gbc_btnNext.gridy = 3;
		contentPane.add(btnNext, gbc_btnNext);

	}

	/**
	 * @return the txtGroupMovementModel
	 */
	public String getTxtGroupMovementModel() {
		return txtGroupMovementModel.getText();
	}

	/**
	 * @return the txtGroupRouter
	 */
	public String getTxtGroupRouter() {
		return txtGroupRouter.getText();
	}

	/**
	 * @return the txtGroupbuffersize
	 */
	public String getTxtGroupbuffersize() {
		return txtGroupbuffersize.getText();
	}

	/**
	 * @return the txtGroupwaittime
	 */
	public String getTxtGroupwaittime() {
		return txtGroupwaittime.getText();
	}

	/**
	 * @return the txtGroupnrofinterfaces
	 */
	public int getTxtGroupnrofinterfaces() {
		return Integer.parseInt(txtGroupnrofinterfaces.getText());
	}

	/**
	 * @return the txtGroupspeed
	 */
	public String getTxtGroupspeed() {
		return txtGroupspeed.getText();
	}

	/**
	 * @return the txtGroupmsgttl
	 */
	public int getTxtGroupmsgttl() {
		return Integer.parseInt(txtGroupmsgttl.getText());
	}

	/**
	 * @return the txtGroupnrofhosts
	 */
	public int getTxtGroupnrofhosts() {
		return Integer.parseInt(txtGroupnrofhosts.getText());
	}

	public static int getInterfaceCount() {
		return interfaceCount;
	}

	public static void setInterfaceCount(int interfaceCount1) {
		interfaceCount = interfaceCount1;
	}

}
