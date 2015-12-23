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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class optimizationSettings_view extends JFrame {

	private JPanel contentPane;
	private JTextField txtOptimizationcellsizemult;
	private JTextField txtOptimizationrandomizeupdateorder;

	/**
	 * Create the frame.
	 */
	public optimizationSettings_view() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 225);
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
		
		JLabel lblScenarioSettings = new JLabel("Optimization Settings");
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
		gbl_panel_txtfield.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panel_txtfield.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_txtfield.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_txtfield.setLayout(gbl_panel_txtfield);
		
		JLabel lblOptimizationcellsizemult = new JLabel("Optimization.cellSizeMult");
		GridBagConstraints gbc_lblOptimizationcellsizemult = new GridBagConstraints();
		gbc_lblOptimizationcellsizemult.insets = new Insets(0, 0, 5, 5);
		gbc_lblOptimizationcellsizemult.anchor = GridBagConstraints.EAST;
		gbc_lblOptimizationcellsizemult.gridx = 1;
		gbc_lblOptimizationcellsizemult.gridy = 1;
		panel_txtfield.add(lblOptimizationcellsizemult, gbc_lblOptimizationcellsizemult);
		
		txtOptimizationcellsizemult = new JTextField();
		txtOptimizationcellsizemult.setText("5");
		GridBagConstraints gbc_txtOptimizationcellsizemult = new GridBagConstraints();
		gbc_txtOptimizationcellsizemult.insets = new Insets(0, 0, 5, 0);
		gbc_txtOptimizationcellsizemult.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtOptimizationcellsizemult.gridx = 2;
		gbc_txtOptimizationcellsizemult.gridy = 1;
		panel_txtfield.add(txtOptimizationcellsizemult, gbc_txtOptimizationcellsizemult);
		txtOptimizationcellsizemult.setColumns(10);
		
		JLabel lblOptimizationrandomizeupdateorder = new JLabel("Optimization.randomizeUpdateOrder");
		GridBagConstraints gbc_lblOptimizationrandomizeupdateorder = new GridBagConstraints();
		gbc_lblOptimizationrandomizeupdateorder.anchor = GridBagConstraints.EAST;
		gbc_lblOptimizationrandomizeupdateorder.insets = new Insets(0, 0, 0, 5);
		gbc_lblOptimizationrandomizeupdateorder.gridx = 1;
		gbc_lblOptimizationrandomizeupdateorder.gridy = 2;
		panel_txtfield.add(lblOptimizationrandomizeupdateorder, gbc_lblOptimizationrandomizeupdateorder);
		
		txtOptimizationrandomizeupdateorder = new JTextField();
		txtOptimizationrandomizeupdateorder.setText("true");
		GridBagConstraints gbc_txtOptimizationrandomizeupdateorder = new GridBagConstraints();
		gbc_txtOptimizationrandomizeupdateorder.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtOptimizationrandomizeupdateorder.gridx = 2;
		gbc_txtOptimizationrandomizeupdateorder.gridy = 2;
		panel_txtfield.add(txtOptimizationrandomizeupdateorder, gbc_txtOptimizationrandomizeupdateorder);
		txtOptimizationrandomizeupdateorder.setColumns(10);
		
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
			}
		});
		GridBagConstraints gbc_btnNext = new GridBagConstraints();
		gbc_btnNext.gridx = 0;
		gbc_btnNext.gridy = 3;
		contentPane.add(btnNext, gbc_btnNext);
		}

}
