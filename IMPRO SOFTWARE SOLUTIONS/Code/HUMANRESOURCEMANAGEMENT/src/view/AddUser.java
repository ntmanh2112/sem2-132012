package view;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Rectangle;
import java.awt.Font;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

import model.AccountModel;
import model.DepartmentsModel;
import model.DesignLayerModel;
import model.DesignationModel;
import model.EmployeeModel;
import Common.KeyValue;
import dao.AccountDAO;
import dao.DepartmentsDAO;
import dao.DesignLayerDAO;
import dao.DesignationDAO;
import dao.EmployeeDAO;

import java.awt.Color;
import java.util.ArrayList;

public class AddUser extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JLabel jLabel2 = null;
	private JPasswordField txtPassword = null;
	private JLabel jLabel3 = null;
	private JComboBox cbnEmployeeid = null;
	private JLabel jLabel4 = null;
	private JComboBox cbnAcclevel = null;
	private JButton btnAdd = null;
	private JButton btnDelete = null;
	AccountModel model = new AccountModel();  //  @jve:decl-index=0:

	/**
	 * This is the default constructor
	 */
	public AddUser() {
		super();
		initialize();
		ArrayList<EmployeeModel> listEmployee = EmployeeDAO.getAllEmployee();
		for (EmployeeModel em : listEmployee) {
			KeyValue item = new KeyValue(em.getEmID(),em.getName());

			cbnEmployeeid.addItem(item);
			if (item.getKey().equals(model.getEmID())) {
				cbnEmployeeid.setSelectedItem(item);
			}
		}
		
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		Toolkit theKit = this.getToolkit();   
		Dimension wndSize = theKit.getScreenSize();
		this.setResizable(false);
		this.setLocation((wndSize.width-438)/2, (wndSize.height-333)/2);
		this.setSize(438, 333);
		this.setContentPane(getJContentPane());
		this.setTitle("FrmUserCreation");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabel4 = new JLabel();
			jLabel4.setText("Acc-Level :");
			jLabel4.setSize(new Dimension(71, 25));
			jLabel4.setLocation(new Point(20, 170));
			jLabel3 = new JLabel();
			jLabel3.setText("EmID :");
			jLabel3.setLocation(new Point(20, 90));
			jLabel3.setSize(new Dimension(71, 25));
			jLabel2 = new JLabel();
			jLabel2.setText("Password :");
			jLabel2.setLocation(new Point(20, 130));
			jLabel2.setSize(new Dimension(68, 25));
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(88, 9, 225, 48));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 24));
			jLabel.setForeground(Color.red);
			jLabel.setText("Add UserAccount ");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.setFont(new Font("Dialog", Font.PLAIN, 12));
			jContentPane.add(jLabel, null);
			jContentPane.add(jLabel2, null);
			jContentPane.add(getTxtPassword(), null);
			jContentPane.add(jLabel3, null);
			jContentPane.add(getCbnEmployeeid(), null);
			jContentPane.add(jLabel4, null);
			jContentPane.add(getCbnAcclevel(), null);
			jContentPane.add(getBtnAdd(), null);
			jContentPane.add(getBtnDelete(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes txtPassword	
	 * 	
	 * @return javax.swing.JPasswordField	
	 */
	private JPasswordField getTxtPassword() {
		if (txtPassword == null) {
			txtPassword = new JPasswordField();
			txtPassword.setLocation(new Point(130, 130));
			txtPassword.setSize(new Dimension(200, 25));
		}
		return txtPassword;
	}

	/**
	 * This method initializes cbnEmployeeid	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getCbnEmployeeid() {
		if (cbnEmployeeid == null) {
			cbnEmployeeid = new JComboBox();
			cbnEmployeeid.setSize(new Dimension(200, 25));
			cbnEmployeeid.setLocation(new Point(130, 90));
		}
		return cbnEmployeeid;
	}

	/**
	 * This method initializes cbnAcclevel	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getCbnAcclevel() {
		if (cbnAcclevel == null) {
			cbnAcclevel = new JComboBox();
			cbnAcclevel.setSize(new Dimension(200, 25));
			cbnAcclevel.setLocation(new Point(130, 170));
		}
		return cbnAcclevel;
	}

	/**
	 * This method initializes btnAdd	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnAdd() {
		if (btnAdd == null) {
			btnAdd = new JButton();
			btnAdd.setText("Add");
			btnAdd.setSize(new Dimension(103, 40));
			btnAdd.setIcon(new ImageIcon(getClass().getResource("/images/add-2-icon.png")));
			btnAdd.setLocation(new Point(74, 227));
			btnAdd.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					AccountModel model = new AccountModel();
					
					model.setEmID(((KeyValue) cbnEmployeeid.getSelectedItem())
							.getKey());
					model.setPassword(txtPassword.getText().trim());
					
					if(!validateModel(model)) {
						
						return;
					}
					Boolean kq = AccountDAO.insertAccount(model);
					if (kq) {
						JOptionPane.showMessageDialog(null,
								"Add successful Account", "Notice",
								JOptionPane.INFORMATION_MESSAGE);
						(new ViewEmployee()).setVisible(true);
						dispose();
					}else {
						JOptionPane.showMessageDialog(null,
								"Add failure Account", "Notice",
								JOptionPane.ERROR_MESSAGE);
						(new ViewAccount()).setVisible(true);
						dispose();
					}
				}
			});
		}
		return btnAdd;
	}

	/**
	 * This method initializes btnDelete	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnDelete() {
		if (btnDelete == null) {
			btnDelete = new JButton();
			btnDelete.setText("Cancel");
			btnDelete.setSize(new Dimension(101, 40));
			btnDelete.setMnemonic(KeyEvent.VK_UNDEFINED);
			btnDelete.setIcon(new ImageIcon(getClass().getResource("/images/Delete.png")));
			btnDelete.setLocation(new Point(252, 227));
			btnDelete.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					int kg = JOptionPane.showConfirmDialog(null,
							"Are you sure you want to exit", "Notice",
							JOptionPane.OK_CANCEL_OPTION);
					if (kg == 0) {
						(new ViewAccount()).setVisible(true);
						dispose();
					}
				}
			});
		}
		return btnDelete;
	}
private Boolean validateModel(AccountModel mo) {
    	
    	if( mo.getPassword() == null || mo.getPassword().equals("")){ 
    		JOptionPane.showMessageDialog(null, "Password invalid","Notice",JOptionPane.ERROR_MESSAGE);
    		return false;
    	}
    	
    	return true;
    	
}

}  //  @jve:decl-index=0:visual-constraint="10,10"
