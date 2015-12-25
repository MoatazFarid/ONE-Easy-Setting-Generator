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

import model.GUISettings;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;

public class guiSettings_view extends JFrame {

	private JPanel contentPane;
	private JTextField txtGuiunderlayimagefilename;
	private JTextField txtGuiunderlayimageoffset;
	private JTextField txtGuiunderlayimagescale;
	private JTextField txtGuiunderlayimagerotate;
	private JTextField txtGuieventlogpanelnrofevents;


	/**
	 * Create the frame.
	 */
	public guiSettings_view() {
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
		
		JLabel lblScenarioSettings = new JLabel("GUI Settings");
		lblScenarioSettings.setFont(new Font("Tahoma", Font.BOLD, 18));
		GridBagConstraints gbc_lblScenarioSettings = new GridBagConstraints();
		gbc_lblScenarioSettings.insets = new Insets(0, 0, 0, 5);
		gbc_lblScenarioSettings.gridx = 7;
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
		
		JLabel lblGuiunderlayimagefilename = new JLabel("GUI.UnderlayImage.fileName");
		GridBagConstraints gbc_lblGuiunderlayimagefilename = new GridBagConstraints();
		gbc_lblGuiunderlayimagefilename.insets = new Insets(0, 0, 5, 5);
		gbc_lblGuiunderlayimagefilename.anchor = GridBagConstraints.EAST;
		gbc_lblGuiunderlayimagefilename.gridx = 1;
		gbc_lblGuiunderlayimagefilename.gridy = 1;
		panel_txtfield.add(lblGuiunderlayimagefilename, gbc_lblGuiunderlayimagefilename);
		
		txtGuiunderlayimagefilename = new JTextField();
		txtGuiunderlayimagefilename.setText("data/helsinki_underlay.png");
		GridBagConstraints gbc_txtGuiunderlayimagefilename = new GridBagConstraints();
		gbc_txtGuiunderlayimagefilename.insets = new Insets(0, 0, 5, 0);
		gbc_txtGuiunderlayimagefilename.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtGuiunderlayimagefilename.gridx = 2;
		gbc_txtGuiunderlayimagefilename.gridy = 1;
		panel_txtfield.add(txtGuiunderlayimagefilename, gbc_txtGuiunderlayimagefilename);
		txtGuiunderlayimagefilename.setColumns(10);
		
		JLabel lblGuiunderlayimageoffset = new JLabel("GUI.UnderlayImage.offset");
		GridBagConstraints gbc_lblGuiunderlayimageoffset = new GridBagConstraints();
		gbc_lblGuiunderlayimageoffset.anchor = GridBagConstraints.EAST;
		gbc_lblGuiunderlayimageoffset.insets = new Insets(0, 0, 5, 5);
		gbc_lblGuiunderlayimageoffset.gridx = 1;
		gbc_lblGuiunderlayimageoffset.gridy = 2;
		panel_txtfield.add(lblGuiunderlayimageoffset, gbc_lblGuiunderlayimageoffset);
		
		txtGuiunderlayimageoffset = new JTextField();
		txtGuiunderlayimageoffset.setText("64, 20");
		GridBagConstraints gbc_txtGuiunderlayimageoffset = new GridBagConstraints();
		gbc_txtGuiunderlayimageoffset.insets = new Insets(0, 0, 5, 0);
		gbc_txtGuiunderlayimageoffset.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtGuiunderlayimageoffset.gridx = 2;
		gbc_txtGuiunderlayimageoffset.gridy = 2;
		panel_txtfield.add(txtGuiunderlayimageoffset, gbc_txtGuiunderlayimageoffset);
		txtGuiunderlayimageoffset.setColumns(10);
		
		JLabel lblGuiunderlayimagescale = new JLabel("GUI.UnderlayImage.scale");
		GridBagConstraints gbc_lblGuiunderlayimagescale = new GridBagConstraints();
		gbc_lblGuiunderlayimagescale.anchor = GridBagConstraints.EAST;
		gbc_lblGuiunderlayimagescale.insets = new Insets(0, 0, 5, 5);
		gbc_lblGuiunderlayimagescale.gridx = 1;
		gbc_lblGuiunderlayimagescale.gridy = 3;
		panel_txtfield.add(lblGuiunderlayimagescale, gbc_lblGuiunderlayimagescale);
		
		txtGuiunderlayimagescale = new JTextField();
		txtGuiunderlayimagescale.setText("4.75");
		GridBagConstraints gbc_txtGuiunderlayimagescale = new GridBagConstraints();
		gbc_txtGuiunderlayimagescale.insets = new Insets(0, 0, 5, 0);
		gbc_txtGuiunderlayimagescale.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtGuiunderlayimagescale.gridx = 2;
		gbc_txtGuiunderlayimagescale.gridy = 3;
		panel_txtfield.add(txtGuiunderlayimagescale, gbc_txtGuiunderlayimagescale);
		txtGuiunderlayimagescale.setColumns(10);
		
		JLabel lblGuiunderlayimagerotate = new JLabel("GUI.UnderlayImage.rotate");
		GridBagConstraints gbc_lblGuiunderlayimagerotate = new GridBagConstraints();
		gbc_lblGuiunderlayimagerotate.anchor = GridBagConstraints.EAST;
		gbc_lblGuiunderlayimagerotate.insets = new Insets(0, 0, 5, 5);
		gbc_lblGuiunderlayimagerotate.gridx = 1;
		gbc_lblGuiunderlayimagerotate.gridy = 4;
		panel_txtfield.add(lblGuiunderlayimagerotate, gbc_lblGuiunderlayimagerotate);
		
		txtGuiunderlayimagerotate = new JTextField();
		txtGuiunderlayimagerotate.setText("-0.015");
		GridBagConstraints gbc_txtGuiunderlayimagerotate = new GridBagConstraints();
		gbc_txtGuiunderlayimagerotate.insets = new Insets(0, 0, 5, 0);
		gbc_txtGuiunderlayimagerotate.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtGuiunderlayimagerotate.gridx = 2;
		gbc_txtGuiunderlayimagerotate.gridy = 4;
		panel_txtfield.add(txtGuiunderlayimagerotate, gbc_txtGuiunderlayimagerotate);
		txtGuiunderlayimagerotate.setColumns(10);
		
		JLabel lblGuieventlogpanelnrofevents = new JLabel("GUI.EventLogPanel.nrofEvents");
		GridBagConstraints gbc_lblGuieventlogpanelnrofevents = new GridBagConstraints();
		gbc_lblGuieventlogpanelnrofevents.anchor = GridBagConstraints.EAST;
		gbc_lblGuieventlogpanelnrofevents.insets = new Insets(0, 0, 0, 5);
		gbc_lblGuieventlogpanelnrofevents.gridx = 1;
		gbc_lblGuieventlogpanelnrofevents.gridy = 5;
		panel_txtfield.add(lblGuieventlogpanelnrofevents, gbc_lblGuieventlogpanelnrofevents);
		
		txtGuieventlogpanelnrofevents = new JTextField();
		txtGuieventlogpanelnrofevents.setText("100");
		GridBagConstraints gbc_txtGuieventlogpanelnrofevents = new GridBagConstraints();
		gbc_txtGuieventlogpanelnrofevents.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtGuieventlogpanelnrofevents.gridx = 2;
		gbc_txtGuieventlogpanelnrofevents.gridy = 5;
		panel_txtfield.add(txtGuieventlogpanelnrofevents, gbc_txtGuieventlogpanelnrofevents);
		txtGuieventlogpanelnrofevents.setColumns(10);
		
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
				
				//model operation
					try {
						GUISettings.setUnderlayImagelink(txtGuiunderlayimagefilename.getText());
						GUISettings.setUnderlayImageOffset(txtGuiunderlayimageoffset.getText());
						GUISettings.setUnderlayImageState(txtGuiunderlayimagescale.getText());
						GUISettings.setUnderlayImageRotate(txtGuiunderlayimagerotate.getText());
						GUISettings.setEventLogPanelNoOfEvents(txtGuieventlogpanelnrofevents.getText());
						
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				// next windows
					// Congratulations you have finally finished 
				// dispose
				dispose();
			}
		});
		GridBagConstraints gbc_btnNext = new GridBagConstraints();
		gbc_btnNext.gridx = 0;
		gbc_btnNext.gridy = 3;
		contentPane.add(btnNext, gbc_btnNext);
		}

}
