package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridBagLayout;

import javax.swing.JLabel;

import java.awt.GridBagConstraints;

import javax.swing.JTextField;

import model.commonGroupSettings;

import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;

public class commonGroupSettings_interfaces_view extends JDialog {

	private final JPanel contentPanel = new JPanel();
	public int interfaceNo;
	private JTextField txtGroupinterfaceinterfaceno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			commonGroupSettings_interfaces_view dialog = new commonGroupSettings_interfaces_view();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public commonGroupSettings_interfaces_view() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{0, 0, 0, 0};
		gbl_contentPanel.rowHeights = new int[]{0, 0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JLabel label = new JLabel("Group.interface"+interfaceNo+" = ");
			GridBagConstraints gbc_label = new GridBagConstraints();
			gbc_label.insets = new Insets(0, 0, 0, 5);
			gbc_label.anchor = GridBagConstraints.EAST;
			gbc_label.gridx = 1;
			gbc_label.gridy = 2;
			contentPanel.add(label, gbc_label);
		}
		{
			txtGroupinterfaceinterfaceno = new JTextField();
			txtGroupinterfaceinterfaceno.setText("btInterface");
			GridBagConstraints gbc_txtGroupinterfaceinterfaceno = new GridBagConstraints();
			gbc_txtGroupinterfaceinterfaceno.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtGroupinterfaceinterfaceno.gridx = 2;
			gbc_txtGroupinterfaceinterfaceno.gridy = 2;
			contentPanel.add(txtGroupinterfaceinterfaceno, gbc_txtGroupinterfaceinterfaceno);
			txtGroupinterfaceinterfaceno.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						try {
							commonGroupSettings.setGroup_interfaceName(txtGroupinterfaceinterfaceno.getText(),interfaceNo);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
	}

}
