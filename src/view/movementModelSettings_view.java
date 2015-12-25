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

import model.MovementModelSettings;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;

public class movementModelSettings_view extends JFrame {

	private JPanel contentPane;
	private JTextField txtMovementmodelrngseed;
	private JTextField txtMovementmodelworldsize;
	private JTextField txtMovementmodelwarmup;
	private JTextField txtMapbasedmovementnrofmapfiles;
	
	private static int NoOfMaps;

	
	/**
	 * Create the frame.
	 */
	public movementModelSettings_view() {
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
		
		JLabel lblScenarioSettings = new JLabel("Movement Model Settings");
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
		gbl_panel_txtfield.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel_txtfield.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_txtfield.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_txtfield.setLayout(gbl_panel_txtfield);
		
		JLabel lblMovementmodelrngseed = new JLabel("MovementModel.rngSeed");
		GridBagConstraints gbc_lblMovementmodelrngseed = new GridBagConstraints();
		gbc_lblMovementmodelrngseed.insets = new Insets(0, 0, 5, 5);
		gbc_lblMovementmodelrngseed.anchor = GridBagConstraints.EAST;
		gbc_lblMovementmodelrngseed.gridx = 1;
		gbc_lblMovementmodelrngseed.gridy = 1;
		panel_txtfield.add(lblMovementmodelrngseed, gbc_lblMovementmodelrngseed);
		
		txtMovementmodelrngseed = new JTextField();
		txtMovementmodelrngseed.setText("1");
		GridBagConstraints gbc_txtMovementmodelrngseed = new GridBagConstraints();
		gbc_txtMovementmodelrngseed.insets = new Insets(0, 0, 5, 0);
		gbc_txtMovementmodelrngseed.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtMovementmodelrngseed.gridx = 2;
		gbc_txtMovementmodelrngseed.gridy = 1;
		panel_txtfield.add(txtMovementmodelrngseed, gbc_txtMovementmodelrngseed);
		txtMovementmodelrngseed.setColumns(10);
		
		JLabel lblMovementmodelworldsize = new JLabel("MovementModel.worldSize");
		GridBagConstraints gbc_lblMovementmodelworldsize = new GridBagConstraints();
		gbc_lblMovementmodelworldsize.anchor = GridBagConstraints.EAST;
		gbc_lblMovementmodelworldsize.insets = new Insets(0, 0, 5, 5);
		gbc_lblMovementmodelworldsize.gridx = 1;
		gbc_lblMovementmodelworldsize.gridy = 2;
		panel_txtfield.add(lblMovementmodelworldsize, gbc_lblMovementmodelworldsize);
		
		txtMovementmodelworldsize = new JTextField();
		txtMovementmodelworldsize.setText("4500, 3400");
		GridBagConstraints gbc_txtMovementmodelworldsize = new GridBagConstraints();
		gbc_txtMovementmodelworldsize.insets = new Insets(0, 0, 5, 0);
		gbc_txtMovementmodelworldsize.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtMovementmodelworldsize.gridx = 2;
		gbc_txtMovementmodelworldsize.gridy = 2;
		panel_txtfield.add(txtMovementmodelworldsize, gbc_txtMovementmodelworldsize);
		txtMovementmodelworldsize.setColumns(10);
		
		JLabel lblMovementmodelwarmup = new JLabel("MovementModel.warmup");
		GridBagConstraints gbc_lblMovementmodelwarmup = new GridBagConstraints();
		gbc_lblMovementmodelwarmup.anchor = GridBagConstraints.EAST;
		gbc_lblMovementmodelwarmup.insets = new Insets(0, 0, 5, 5);
		gbc_lblMovementmodelwarmup.gridx = 1;
		gbc_lblMovementmodelwarmup.gridy = 3;
		panel_txtfield.add(lblMovementmodelwarmup, gbc_lblMovementmodelwarmup);
		
		txtMovementmodelwarmup = new JTextField();
		txtMovementmodelwarmup.setText("1000");
		GridBagConstraints gbc_txtMovementmodelwarmup = new GridBagConstraints();
		gbc_txtMovementmodelwarmup.insets = new Insets(0, 0, 5, 0);
		gbc_txtMovementmodelwarmup.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtMovementmodelwarmup.gridx = 2;
		gbc_txtMovementmodelwarmup.gridy = 3;
		panel_txtfield.add(txtMovementmodelwarmup, gbc_txtMovementmodelwarmup);
		txtMovementmodelwarmup.setColumns(10);
		
		JLabel lblMapbasedmovementnrofmapfiles = new JLabel("MapBasedMovement.nrofMapFiles");
		GridBagConstraints gbc_lblMapbasedmovementnrofmapfiles = new GridBagConstraints();
		gbc_lblMapbasedmovementnrofmapfiles.anchor = GridBagConstraints.EAST;
		gbc_lblMapbasedmovementnrofmapfiles.insets = new Insets(0, 0, 0, 5);
		gbc_lblMapbasedmovementnrofmapfiles.gridx = 1;
		gbc_lblMapbasedmovementnrofmapfiles.gridy = 4;
		panel_txtfield.add(lblMapbasedmovementnrofmapfiles, gbc_lblMapbasedmovementnrofmapfiles);
		
		txtMapbasedmovementnrofmapfiles = new JTextField();
		txtMapbasedmovementnrofmapfiles.setText("4");
		GridBagConstraints gbc_txtMapbasedmovementnrofmapfiles = new GridBagConstraints();
		gbc_txtMapbasedmovementnrofmapfiles.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtMapbasedmovementnrofmapfiles.gridx = 2;
		gbc_txtMapbasedmovementnrofmapfiles.gridy = 4;
		panel_txtfield.add(txtMapbasedmovementnrofmapfiles, gbc_txtMapbasedmovementnrofmapfiles);
		txtMapbasedmovementnrofmapfiles.setColumns(10);
		
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
				// set no of maps 
				setNoOfMaps(Integer.parseInt(txtMapbasedmovementnrofmapfiles.getText()));
				
				// model operations
				try {
					
					MovementModelSettings.setRngSeed(Integer.parseInt(txtMovementmodelrngseed.getText()));
					MovementModelSettings.setWorldSize(txtMovementmodelworldsize.getText());
					MovementModelSettings.setWormup(Integer.parseInt(txtMovementmodelwarmup.getText()));
					MovementModelSettings.setNrOfMapSize(Integer.parseInt(txtMapbasedmovementnrofmapfiles.getText()));
					
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//opening next frame
				movementModelSettings_MapFiles_view mv = new movementModelSettings_MapFiles_view();
				mv.setVisible(true);
				// dispose
				dispose();
				
			}
		});
		GridBagConstraints gbc_btnNext = new GridBagConstraints();
		gbc_btnNext.gridx = 0;
		gbc_btnNext.gridy = 3;
		contentPane.add(btnNext, gbc_btnNext);
		}


	/**
	 * @return the noOfMaps
	 */
	public static int getNoOfMaps() {
		return NoOfMaps;
	}


	/**
	 * @param noOfMaps the noOfMaps to set
	 */
	public static void setNoOfMaps(int noOfMaps) {
		NoOfMaps = noOfMaps;
	}

}
