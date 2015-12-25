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

import model.MessageCreationParameters;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;

public class messageCreationParameters_view extends JFrame {

	private JPanel contentPane;
	private JTextField txtEventsclass;
	private JTextField txtEventsinterval;
	private JTextField txtEventssize;
	private JTextField txtEventshosts;
	private JTextField txtEventsprefix;

	// no of current event (to deal with current opened window) 
	private static int CurrenteventNO = 1 ;
	
	// dealing with model
	MessageCreationParameters mcp = new MessageCreationParameters();
	
	/**
	 * Create the frame.
	 */
	public messageCreationParameters_view() {
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
		
		JLabel lblScenarioSettings = new JLabel("Message Creation Parameters (EVENT "+getCurrenteventNO()+")");
		lblScenarioSettings.setFont(new Font("Tahoma", Font.BOLD, 18));
		GridBagConstraints gbc_lblScenarioSettings = new GridBagConstraints();
		gbc_lblScenarioSettings.insets = new Insets(0, 0, 0, 5);
		gbc_lblScenarioSettings.gridx = 5;
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
		gbl_panel_txtfield.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panel_txtfield.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_txtfield.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_txtfield.setLayout(gbl_panel_txtfield);
		
		JLabel lblEventsclass = new JLabel("Events"+getCurrenteventNO()+".class");
		GridBagConstraints gbc_lblEventsclass = new GridBagConstraints();
		gbc_lblEventsclass.insets = new Insets(0, 0, 5, 5);
		gbc_lblEventsclass.anchor = GridBagConstraints.EAST;
		gbc_lblEventsclass.gridx = 1;
		gbc_lblEventsclass.gridy = 1;
		panel_txtfield.add(lblEventsclass, gbc_lblEventsclass);
		
		txtEventsclass = new JTextField();
		txtEventsclass.setText("MessageEventGenerator");
		GridBagConstraints gbc_txtEventsclass = new GridBagConstraints();
		gbc_txtEventsclass.insets = new Insets(0, 0, 5, 0);
		gbc_txtEventsclass.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEventsclass.gridx = 2;
		gbc_txtEventsclass.gridy = 1;
		panel_txtfield.add(txtEventsclass, gbc_txtEventsclass);
		txtEventsclass.setColumns(10);
		
		JLabel lblEventsinterval = new JLabel("Events"+getCurrenteventNO()+".interval");
		GridBagConstraints gbc_lblEventsinterval = new GridBagConstraints();
		gbc_lblEventsinterval.anchor = GridBagConstraints.EAST;
		gbc_lblEventsinterval.insets = new Insets(0, 0, 5, 5);
		gbc_lblEventsinterval.gridx = 1;
		gbc_lblEventsinterval.gridy = 2;
		panel_txtfield.add(lblEventsinterval, gbc_lblEventsinterval);
		
		txtEventsinterval = new JTextField();
		txtEventsinterval.setText("25,35");
		GridBagConstraints gbc_txtEventsinterval = new GridBagConstraints();
		gbc_txtEventsinterval.insets = new Insets(0, 0, 5, 0);
		gbc_txtEventsinterval.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEventsinterval.gridx = 2;
		gbc_txtEventsinterval.gridy = 2;
		panel_txtfield.add(txtEventsinterval, gbc_txtEventsinterval);
		txtEventsinterval.setColumns(10);
		
		JLabel lblEventssize = new JLabel("Events"+getCurrenteventNO()+".size");
		GridBagConstraints gbc_lblEventssize = new GridBagConstraints();
		gbc_lblEventssize.anchor = GridBagConstraints.EAST;
		gbc_lblEventssize.insets = new Insets(0, 0, 5, 5);
		gbc_lblEventssize.gridx = 1;
		gbc_lblEventssize.gridy = 3;
		panel_txtfield.add(lblEventssize, gbc_lblEventssize);
		
		txtEventssize = new JTextField();
		txtEventssize.setText("500k,1M");
		GridBagConstraints gbc_txtEventssize = new GridBagConstraints();
		gbc_txtEventssize.insets = new Insets(0, 0, 5, 0);
		gbc_txtEventssize.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEventssize.gridx = 2;
		gbc_txtEventssize.gridy = 3;
		panel_txtfield.add(txtEventssize, gbc_txtEventssize);
		txtEventssize.setColumns(10);
		
		JLabel lblEventshosts = new JLabel("Events"+getCurrenteventNO()+".hosts");
		GridBagConstraints gbc_lblEventshosts = new GridBagConstraints();
		gbc_lblEventshosts.anchor = GridBagConstraints.EAST;
		gbc_lblEventshosts.insets = new Insets(0, 0, 5, 5);
		gbc_lblEventshosts.gridx = 1;
		gbc_lblEventshosts.gridy = 4;
		panel_txtfield.add(lblEventshosts, gbc_lblEventshosts);
		
		txtEventshosts = new JTextField();
		txtEventshosts.setText("0,126");
		GridBagConstraints gbc_txtEventshosts = new GridBagConstraints();
		gbc_txtEventshosts.insets = new Insets(0, 0, 5, 0);
		gbc_txtEventshosts.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEventshosts.gridx = 2;
		gbc_txtEventshosts.gridy = 4;
		panel_txtfield.add(txtEventshosts, gbc_txtEventshosts);
		txtEventshosts.setColumns(10);
		
		JLabel lblEventsprefix = new JLabel("Events"+getCurrenteventNO()+".prefix");
		GridBagConstraints gbc_lblEventsprefix = new GridBagConstraints();
		gbc_lblEventsprefix.anchor = GridBagConstraints.EAST;
		gbc_lblEventsprefix.insets = new Insets(0, 0, 0, 5);
		gbc_lblEventsprefix.gridx = 1;
		gbc_lblEventsprefix.gridy = 5;
		panel_txtfield.add(lblEventsprefix, gbc_lblEventsprefix);
		
		txtEventsprefix = new JTextField();
		txtEventsprefix.setText("M");
		GridBagConstraints gbc_txtEventsprefix = new GridBagConstraints();
		gbc_txtEventsprefix.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEventsprefix.gridx = 2;
		gbc_txtEventsprefix.gridy = 5;
		panel_txtfield.add(txtEventsprefix, gbc_txtEventsprefix);
		txtEventsprefix.setColumns(10);
		
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

				if(getCurrenteventNO()>0){
					if(getCurrenteventNO() <= Scenario_Setting_view.getTxtNoOfEvent()){
						// start using MODEL	
							// filling MODEL 
							try {
								MessageCreationParameters.setCurrentEventNo(getCurrenteventNO());
								MessageCreationParameters.setEventClass(txtEventsclass.getText());
								MessageCreationParameters.setEventInterval(txtEventsinterval.getText());
								MessageCreationParameters.setEventHost(txtEventshosts.getText());
								MessageCreationParameters.setEventSize(txtEventssize.getText());
								MessageCreationParameters.setEventPrefix(txtEventsprefix.getText());

								// increase Counter 
								setCurrenteventNO(getCurrenteventNO()+1);
//								MessageCreationParameters.setCurrentEventNo(getCurrenteventNO()+1);

							// filling MODEL END 
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							// open current window again and again
							if(getCurrenteventNO() <= Scenario_Setting_view.getTxtNoOfEvent())
							{
								messageCreationParameters_view sp = new messageCreationParameters_view();
								sp.setVisible(true);
							}else{
								movementModelSettings_view mc = new movementModelSettings_view();
								mc.setVisible(true);
								dispose();
							}							
					}
					//dispose current
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
	 * @return the currenteventNO
	 */
	public static int getCurrenteventNO() {
		return CurrenteventNO;
	}
	/**
	 * @param currenteventNO the currenteventNO to set
	 */
	public static void setCurrenteventNO(int currenteventNO) {
		CurrenteventNO = currenteventNO;
	}

}
