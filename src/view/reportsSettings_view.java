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

import model.ReportsSettings;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;

public class reportsSettings_view extends JFrame {

	private JPanel contentPane;
	private JTextField txtReportnrofreports;
	private JTextField txtReportwarmup;
	private JTextField txtReportreportdir;
	private static int noOfReports;

	

	/**
	 * Create the frame.
	 */
	public reportsSettings_view() {
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
		gbl_panel_headers.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_headers.rowHeights = new int[]{0, 0};
		gbl_panel_headers.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_headers.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_headers.setLayout(gbl_panel_headers);
		
		JLabel lblScenarioSettings = new JLabel("Reports Settings");
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
		gbl_panel_txtfield.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_panel_txtfield.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_txtfield.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_txtfield.setLayout(gbl_panel_txtfield);
		
		JLabel lblReportnrofreports = new JLabel("Report.nrofReports");
		GridBagConstraints gbc_lblReportnrofreports = new GridBagConstraints();
		gbc_lblReportnrofreports.insets = new Insets(0, 0, 5, 5);
		gbc_lblReportnrofreports.anchor = GridBagConstraints.EAST;
		gbc_lblReportnrofreports.gridx = 1;
		gbc_lblReportnrofreports.gridy = 1;
		panel_txtfield.add(lblReportnrofreports, gbc_lblReportnrofreports);
		
		txtReportnrofreports = new JTextField();
		txtReportnrofreports.setText("2");
		GridBagConstraints gbc_txtReportnrofreports = new GridBagConstraints();
		gbc_txtReportnrofreports.insets = new Insets(0, 0, 5, 0);
		gbc_txtReportnrofreports.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtReportnrofreports.gridx = 2;
		gbc_txtReportnrofreports.gridy = 1;
		panel_txtfield.add(txtReportnrofreports, gbc_txtReportnrofreports);
		txtReportnrofreports.setColumns(10);
		
		JLabel lblReportwarmup = new JLabel("Report.warmup");
		GridBagConstraints gbc_lblReportwarmup = new GridBagConstraints();
		gbc_lblReportwarmup.anchor = GridBagConstraints.EAST;
		gbc_lblReportwarmup.insets = new Insets(0, 0, 5, 5);
		gbc_lblReportwarmup.gridx = 1;
		gbc_lblReportwarmup.gridy = 2;
		panel_txtfield.add(lblReportwarmup, gbc_lblReportwarmup);
		
		txtReportwarmup = new JTextField();
		txtReportwarmup.setText("0");
		GridBagConstraints gbc_txtReportwarmup = new GridBagConstraints();
		gbc_txtReportwarmup.insets = new Insets(0, 0, 5, 0);
		gbc_txtReportwarmup.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtReportwarmup.gridx = 2;
		gbc_txtReportwarmup.gridy = 2;
		panel_txtfield.add(txtReportwarmup, gbc_txtReportwarmup);
		txtReportwarmup.setColumns(10);
		
		JLabel lblReportreportdir = new JLabel("Report.reportDir");
		GridBagConstraints gbc_lblReportreportdir = new GridBagConstraints();
		gbc_lblReportreportdir.anchor = GridBagConstraints.EAST;
		gbc_lblReportreportdir.insets = new Insets(0, 0, 0, 5);
		gbc_lblReportreportdir.gridx = 1;
		gbc_lblReportreportdir.gridy = 3;
		panel_txtfield.add(lblReportreportdir, gbc_lblReportreportdir);
		
		txtReportreportdir = new JTextField();
		txtReportreportdir.setText("reports/");
		GridBagConstraints gbc_txtReportreportdir = new GridBagConstraints();
		gbc_txtReportreportdir.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtReportreportdir.gridx = 2;
		gbc_txtReportreportdir.gridy = 3;
		panel_txtfield.add(txtReportreportdir, gbc_txtReportreportdir);
		txtReportreportdir.setColumns(10);
		
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
				// models operations
				try {
					
					ReportsSettings.setNrOfReports(Integer.parseInt(txtReportnrofreports.getText()));
					ReportsSettings.setWarmup(Integer.parseInt(txtReportwarmup.getText()));
					ReportsSettings.setReportDir(txtReportreportdir.getText());
				
				
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				// open new window
				reportsSettings_reports_view rp = new reportsSettings_reports_view();
				rp.setVisible(true);
				
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
	 * @return the noOfReports
	 */
	public static int getNoOfReports() {
		return noOfReports;
	}



	/**
	 * @param noOfReports the noOfReports to set
	 */
	public static void setNoOfReports(int noOfReports) {
		reportsSettings_view.noOfReports = noOfReports;
	}

}
