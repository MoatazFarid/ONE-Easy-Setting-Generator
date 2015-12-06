package view;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.GridBagLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import net.miginfocom.swing.MigLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class interfaces_unUsed extends JFrame {

	private final JPanel contentPanel = new JPanel();
	public static String NoOfinterfaces;
	public String[] interfaces;
	public String[] interfaceTypes = { "btInterface"," bla bla bla" };


	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		try {
//			interfaces dialog = new interfaces();
//			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			dialog.setVisible(true);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	/**
	 * Create the dialog.
	 */
	public interfaces_unUsed(int NoOfinterfaces) {
		// array contain the array of interfaces
		interfaces = new String[NoOfinterfaces+1];
		
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 11, 414, 206);
			contentPanel.add(scrollPane);
			{
				JPanel panel = new JPanel();
				scrollPane.setViewportView(panel);
				panel.setLayout(new GridLayout(NoOfinterfaces, 1, 0, 0));
				{
					for(int i=1 ; i<= NoOfinterfaces ; i++){
						createInterface(i,panel);					
					}
					
				}
			}
		}

		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	
	public void createInterface(int i , JPanel panel){
		// i is the variable which determine the no of Interface
		JPanel panel_interface = new JPanel();
		panel.add(panel_interface);
		{
			JLabel lblInterfaceType = new JLabel("Interface"+i+" type");
			panel_interface.add(lblInterfaceType);
		}
		JComboBox comboBox_interfaceType = new JComboBox(interfaceTypes);
		panel_interface.add(comboBox_interfaceType);
		interfaces[i] = comboBox_interfaceType.getSelectedItem().toString();
	}

}
