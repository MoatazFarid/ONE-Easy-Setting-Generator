package view;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import model.InterfaceSpecficSettings;

public class interfaceSpecificSettings_view extends JFrame {

	private JPanel contentPane;

	private JTextField txtbtInterfaceType;
	private JTextField txtbtInterfaceTransmitSpeed;
	private JTextField txtBtinterfacetransmitrange;
	private JTextField txtHighspeedinterfacetype;
	private JTextField txtHighspeedinterfacetransmitspeed;
	private JTextField txtHighspeedinterfacetransmitrange;

	/**
	 * Launch the application.
	 *//*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					interfaceSpecificSettings_view frame = new interfaceSpecificSettings_view(title);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
*/
	/**
	 * Create the frame.
	 */
	public interfaceSpecificSettings_view(String sn) {
		
		// scenario settings 
		String ScenarioName = sn;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 398);
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
		
		JLabel lblInterfaceSpecificSettings = new JLabel("Interface-specific Settings");
		lblInterfaceSpecificSettings.setFont(new Font("Tahoma", Font.BOLD, 18));
		GridBagConstraints gbc_lblInterfaceSpecificSettings = new GridBagConstraints();
		gbc_lblInterfaceSpecificSettings.insets = new Insets(0, 0, 0, 5);
		gbc_lblInterfaceSpecificSettings.gridx = 6;
		gbc_lblInterfaceSpecificSettings.gridy = 0;
		panel_headers.add(lblInterfaceSpecificSettings, gbc_lblInterfaceSpecificSettings);
		
		JPanel panel_txtfield = new JPanel();
		GridBagConstraints gbc_panel_txtfield = new GridBagConstraints();
		gbc_panel_txtfield.insets = new Insets(0, 0, 5, 0);
		gbc_panel_txtfield.fill = GridBagConstraints.BOTH;
		gbc_panel_txtfield.gridx = 0;
		gbc_panel_txtfield.gridy = 1;
		contentPane.add(panel_txtfield, gbc_panel_txtfield);
		GridBagLayout gbl_panel_txtfield = new GridBagLayout();
		gbl_panel_txtfield.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel_txtfield.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_txtfield.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_txtfield.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_txtfield.setLayout(gbl_panel_txtfield);
		
		JLabel lblBltinterSetting = new JLabel("Bluetooth Interface Settings");
		lblBltinterSetting.setFont(new Font("Tahoma", Font.BOLD, 16));
		GridBagConstraints gbc_lblBltinterSetting = new GridBagConstraints();
		gbc_lblBltinterSetting.insets = new Insets(0, 0, 5, 5);
		gbc_lblBltinterSetting.gridx = 0;
		gbc_lblBltinterSetting.gridy = 0;
		panel_txtfield.add(lblBltinterSetting, gbc_lblBltinterSetting);
		
		JLabel lblBtinterfacetype = new JLabel("btInterface.type");
		GridBagConstraints gbc_lblBtinterfacetype = new GridBagConstraints();
		gbc_lblBtinterfacetype.insets = new Insets(0, 0, 5, 5);
		gbc_lblBtinterfacetype.gridx = 0;
		gbc_lblBtinterfacetype.gridy = 1;
		panel_txtfield.add(lblBtinterfacetype, gbc_lblBtinterfacetype);
		
		txtbtInterfaceType = new JTextField();
		txtbtInterfaceType.setText("SimpleBroadcastInterface");
		GridBagConstraints gbc_txtbtInterfaceType = new GridBagConstraints();
		gbc_txtbtInterfaceType.insets = new Insets(0, 0, 5, 0);
		gbc_txtbtInterfaceType.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtbtInterfaceType.gridx = 2;
		gbc_txtbtInterfaceType.gridy = 1;
		panel_txtfield.add(txtbtInterfaceType, gbc_txtbtInterfaceType);
		txtbtInterfaceType.setColumns(10);
		
		JLabel lblBtinterfacetransmitspeed = new JLabel("btInterface.transmitSpeed");
		GridBagConstraints gbc_lblBtinterfacetransmitspeed = new GridBagConstraints();
		gbc_lblBtinterfacetransmitspeed.insets = new Insets(0, 0, 5, 5);
		gbc_lblBtinterfacetransmitspeed.gridx = 0;
		gbc_lblBtinterfacetransmitspeed.gridy = 2;
		panel_txtfield.add(lblBtinterfacetransmitspeed, gbc_lblBtinterfacetransmitspeed);
		
		txtbtInterfaceTransmitSpeed = new JTextField();
		txtbtInterfaceTransmitSpeed.setText("250k");
		GridBagConstraints gbc_txtbtInterfaceTransmitSpeed = new GridBagConstraints();
		gbc_txtbtInterfaceTransmitSpeed.insets = new Insets(0, 0, 5, 0);
		gbc_txtbtInterfaceTransmitSpeed.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtbtInterfaceTransmitSpeed.gridx = 2;
		gbc_txtbtInterfaceTransmitSpeed.gridy = 2;
		panel_txtfield.add(txtbtInterfaceTransmitSpeed, gbc_txtbtInterfaceTransmitSpeed);
		txtbtInterfaceTransmitSpeed.setColumns(10);
		
		JLabel lblBtinterfacetransmitrange = new JLabel("btInterface.transmitRange");
		GridBagConstraints gbc_lblBtinterfacetransmitrange = new GridBagConstraints();
		gbc_lblBtinterfacetransmitrange.insets = new Insets(0, 0, 5, 5);
		gbc_lblBtinterfacetransmitrange.gridx = 0;
		gbc_lblBtinterfacetransmitrange.gridy = 3;
		panel_txtfield.add(lblBtinterfacetransmitrange, gbc_lblBtinterfacetransmitrange);
		
		txtBtinterfacetransmitrange = new JTextField();
		txtBtinterfacetransmitrange.setText("10");
		GridBagConstraints gbc_txtBtinterfacetransmitrange = new GridBagConstraints();
		gbc_txtBtinterfacetransmitrange.insets = new Insets(0, 0, 5, 0);
		gbc_txtBtinterfacetransmitrange.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtBtinterfacetransmitrange.gridx = 2;
		gbc_txtBtinterfacetransmitrange.gridy = 3;
		panel_txtfield.add(txtBtinterfacetransmitrange, gbc_txtBtinterfacetransmitrange);
		txtBtinterfacetransmitrange.setColumns(10);
		
		JLabel lblHighspeedinterfaceSettings = new JLabel("HighspeedInterface Settings");
		lblHighspeedinterfaceSettings.setFont(new Font("Tahoma", Font.BOLD, 16));
		GridBagConstraints gbc_lblHighspeedinterfaceSettings = new GridBagConstraints();
		gbc_lblHighspeedinterfaceSettings.insets = new Insets(0, 0, 5, 5);
		gbc_lblHighspeedinterfaceSettings.gridx = 0;
		gbc_lblHighspeedinterfaceSettings.gridy = 4;
		panel_txtfield.add(lblHighspeedinterfaceSettings, gbc_lblHighspeedinterfaceSettings);
		
		JLabel lblHighspeedinterfacetype = new JLabel("highspeedInterface.type");
		GridBagConstraints gbc_lblHighspeedinterfacetype = new GridBagConstraints();
		gbc_lblHighspeedinterfacetype.insets = new Insets(0, 0, 5, 5);
		gbc_lblHighspeedinterfacetype.gridx = 0;
		gbc_lblHighspeedinterfacetype.gridy = 5;
		panel_txtfield.add(lblHighspeedinterfacetype, gbc_lblHighspeedinterfacetype);
		
		txtHighspeedinterfacetype = new JTextField();
		txtHighspeedinterfacetype.setText("SimpleBroadcastInterface");
		GridBagConstraints gbc_txtHighspeedinterfacetype = new GridBagConstraints();
		gbc_txtHighspeedinterfacetype.insets = new Insets(0, 0, 5, 0);
		gbc_txtHighspeedinterfacetype.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtHighspeedinterfacetype.gridx = 2;
		gbc_txtHighspeedinterfacetype.gridy = 5;
		panel_txtfield.add(txtHighspeedinterfacetype, gbc_txtHighspeedinterfacetype);
		txtHighspeedinterfacetype.setColumns(10);
		
		JLabel lblHighspeedinterfacetransmitspeed = new JLabel("highspeedInterface.transmitSpeed");
		GridBagConstraints gbc_lblHighspeedinterfacetransmitspeed = new GridBagConstraints();
		gbc_lblHighspeedinterfacetransmitspeed.insets = new Insets(0, 0, 5, 5);
		gbc_lblHighspeedinterfacetransmitspeed.gridx = 0;
		gbc_lblHighspeedinterfacetransmitspeed.gridy = 6;
		panel_txtfield.add(lblHighspeedinterfacetransmitspeed, gbc_lblHighspeedinterfacetransmitspeed);
		
		txtHighspeedinterfacetransmitspeed = new JTextField();
		txtHighspeedinterfacetransmitspeed.setText("10M");
		GridBagConstraints gbc_txtHighspeedinterfacetransmitspeed = new GridBagConstraints();
		gbc_txtHighspeedinterfacetransmitspeed.insets = new Insets(0, 0, 5, 0);
		gbc_txtHighspeedinterfacetransmitspeed.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtHighspeedinterfacetransmitspeed.gridx = 2;
		gbc_txtHighspeedinterfacetransmitspeed.gridy = 6;
		panel_txtfield.add(txtHighspeedinterfacetransmitspeed, gbc_txtHighspeedinterfacetransmitspeed);
		txtHighspeedinterfacetransmitspeed.setColumns(10);
		
		JLabel lblHighspeedinterfacetransmitrange = new JLabel("highspeedInterface.transmitRange");
		GridBagConstraints gbc_lblHighspeedinterfacetransmitrange = new GridBagConstraints();
		gbc_lblHighspeedinterfacetransmitrange.insets = new Insets(0, 0, 0, 5);
		gbc_lblHighspeedinterfacetransmitrange.gridx = 0;
		gbc_lblHighspeedinterfacetransmitrange.gridy = 7;
		panel_txtfield.add(lblHighspeedinterfacetransmitrange, gbc_lblHighspeedinterfacetransmitrange);
		
		txtHighspeedinterfacetransmitrange = new JTextField();
		txtHighspeedinterfacetransmitrange.setText("1000");
		GridBagConstraints gbc_txtHighspeedinterfacetransmitrange = new GridBagConstraints();
		gbc_txtHighspeedinterfacetransmitrange.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtHighspeedinterfacetransmitrange.gridx = 2;
		gbc_txtHighspeedinterfacetransmitrange.gridy = 7;
		panel_txtfield.add(txtHighspeedinterfacetransmitrange, gbc_txtHighspeedinterfacetransmitrange);
		txtHighspeedinterfacetransmitrange.setColumns(10);
		
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
					
					// Bluetooth interface type  
					InterfaceSpecficSettings.setBtInterface_type(getTxtbtInterfaceType());
					
					// Bluetooth interface speed  
					InterfaceSpecficSettings.setBtInterface_transmitSpeed(getTxtbtInterfaceTransmitSpeed());
					
					// Bluetooth interface range  
					InterfaceSpecficSettings.setBtInterface_transmitRange(getTxtBtinterfacetransmitrange());
					
					// Highspeed Interface type  
					InterfaceSpecficSettings.setHighspeedInterface_type(getTxtHighspeedinterfacetype());

					// Highspeed Interface range  
					InterfaceSpecficSettings.setHighspeedInterface_transmitRange(getTxtHighspeedinterfacetransmitrange());
					
					// Highspeed Interface speed  
					InterfaceSpecficSettings.setHighspeedInterface_transmitSpeed(getTxtHighspeedinterfacetransmitspeed());
					
					// open next window
					
					// dispose current window 
					setVisible(false); //you can't see me!
					dispose(); //Destroy the JFrame object

					
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
	/**
	 * @return the txtbtInterfaceType
	 */
	public String getTxtbtInterfaceType() {
		return txtbtInterfaceType.getText();
	}

	/**
	 * @param txtbtInterfaceType the txtbtInterfaceType to set
	 */
	public void setTxtbtInterfaceType(JTextField txtbtInterfaceType) {
		this.txtbtInterfaceType = txtbtInterfaceType;
	}

	/**
	 * @return the txtbtInterfaceTransmitSpeed
	 */
	public String getTxtbtInterfaceTransmitSpeed() {
		return txtbtInterfaceTransmitSpeed.getText();
	}

	/**
	 * @param txtbtInterfaceTransmitSpeed the txtbtInterfaceTransmitSpeed to set
	 */
	public void setTxtbtInterfaceTransmitSpeed(
			JTextField txtbtInterfaceTransmitSpeed) {
		this.txtbtInterfaceTransmitSpeed = txtbtInterfaceTransmitSpeed;
	}

	/**
	 * @return the txtBtinterfacetransmitrange
	 */
	public int getTxtBtinterfacetransmitrange() {
		return Integer.parseInt(txtBtinterfacetransmitrange.getText());
	}

	/**
	 * @param txtBtinterfacetransmitrange the txtBtinterfacetransmitrange to set
	 */
	public void setTxtBtinterfacetransmitrange(
			JTextField txtBtinterfacetransmitrange) {
		this.txtBtinterfacetransmitrange = txtBtinterfacetransmitrange;
	}

	/**
	 * @return the txtHighspeedinterfacetype
	 */
	public String getTxtHighspeedinterfacetype() {
		return txtHighspeedinterfacetype.getText();
	}

	/**
	 * @param txtHighspeedinterfacetype the txtHighspeedinterfacetype to set
	 */
	public void setTxtHighspeedinterfacetype(JTextField txtHighspeedinterfacetype) {
		this.txtHighspeedinterfacetype = txtHighspeedinterfacetype;
	}

	/**
	 * @return the txtHighspeedinterfacetransmitspeed
	 */
	public String getTxtHighspeedinterfacetransmitspeed() {
		return txtHighspeedinterfacetransmitspeed.getText();
	}

	/**
	 * @param txtHighspeedinterfacetransmitspeed the txtHighspeedinterfacetransmitspeed to set
	 */
	public void setTxtHighspeedinterfacetransmitspeed(
			JTextField txtHighspeedinterfacetransmitspeed) {
		this.txtHighspeedinterfacetransmitspeed = txtHighspeedinterfacetransmitspeed;
	}

	/**
	 * @return the txtHighspeedinterfacetransmitrange
	 */
	public int getTxtHighspeedinterfacetransmitrange() {
		return Integer.parseInt(txtHighspeedinterfacetransmitrange.getText());
	}

	/**
	 * @param txtHighspeedinterfacetransmitrange the txtHighspeedinterfacetransmitrange to set
	 */
	public void setTxtHighspeedinterfacetransmitrange(
			JTextField txtHighspeedinterfacetransmitrange) {
		this.txtHighspeedinterfacetransmitrange = txtHighspeedinterfacetransmitrange;
	}

}
