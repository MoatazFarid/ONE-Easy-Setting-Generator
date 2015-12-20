package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridBagLayout;

import javax.swing.JLabel;

import java.awt.GridBagConstraints;

import javax.swing.JTextField;

import java.awt.Insets;

import javax.swing.JButton;

import model.commonGroupSettings;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;

public class commonGroup_interfaces_view extends JFrame {

	private JPanel contentPane;
	private JTextField txtInterfacetype;
	public static int interfaceNo;


	/**
	 * Create the frame.
	 */
	public commonGroup_interfaces_view() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 352, 241);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblInterfaces = new JLabel("Interfaces");
		lblInterfaces.setFont(new Font("Tahoma", Font.PLAIN, 29));
		GridBagConstraints gbc_lblInterfaces = new GridBagConstraints();
		gbc_lblInterfaces.insets = new Insets(0, 0, 5, 5);
		gbc_lblInterfaces.gridx = 2;
		gbc_lblInterfaces.gridy = 1;
		panel.add(lblInterfaces, gbc_lblInterfaces);
		
		JLabel lblInterfacetype = new JLabel("Group.interface"+ (interfaceNo+1) +" = ");
		GridBagConstraints gbc_lblInterfacetype = new GridBagConstraints();
		gbc_lblInterfacetype.insets = new Insets(0, 0, 5, 5);
		gbc_lblInterfacetype.gridx = 1;
		gbc_lblInterfacetype.gridy = 3;
		panel.add(lblInterfacetype, gbc_lblInterfacetype);
		
		txtInterfacetype = new JTextField();
		txtInterfacetype.setText("btInterface");
		GridBagConstraints gbc_txtInterfacetype = new GridBagConstraints();
		gbc_txtInterfacetype.insets = new Insets(0, 0, 5, 5);
		gbc_txtInterfacetype.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtInterfacetype.gridx = 2;
		gbc_txtInterfacetype.gridy = 3;
		panel.add(txtInterfacetype, gbc_txtInterfacetype);
		txtInterfacetype.setColumns(10);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// set interface no and name 
				try {
					commonGroupSettings.setGroup_interfaceName(txtInterfacetype.getText(),interfaceNo+1);
					commonGroupSettings_view.setInterfaceCount(commonGroupSettings_view.getInterfaceCount()+1);

					//new window
					if(interfaceNo != commonGroupSettings_view.TotalNoOfInterfacesPerGroup){
						commonGroup_interfaces_view GS = new commonGroup_interfaces_view();
						GS.setVisible(true);
					}
					
					// dispose current window
					commonGroupSettings_view.setInterfaceCount(0);
					setVisible(false); //you can't see me!
					dispose(); //Destroy the JFrame object
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		GridBagConstraints gbc_btnNext = new GridBagConstraints();
		gbc_btnNext.insets = new Insets(0, 0, 0, 5);
		gbc_btnNext.gridx = 2;
		gbc_btnNext.gridy = 5;
		panel.add(btnNext, gbc_btnNext);
	}

}
