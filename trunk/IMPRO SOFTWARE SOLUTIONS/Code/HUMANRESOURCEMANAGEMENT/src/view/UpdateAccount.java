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

public class UpdateAccount extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JLabel jLabel2 = null;
	private JPasswordField txtPassword = null;
	private JLabel jLabel3 = null;
	private JLabel jLabel4 = null;
	private JComboBox cbnAcclevel = null;
	private JButton btnAdd = null;
	private JButton btnDelete = null;
	AccountModel model = new AccountModel();  //  @jve:decl-index=0:
	private JTextField txtEmID = null;
	private JLabel jLabel1 = null;
	private JTextField txtDesignation = null;
	private JLabel jLabel5 = null;
	private JTextField txtname = null;

	/**
	 * This is the default constructor
	 */
	public UpdateAccount() {
		super();
		initialize();		
	}
	public UpdateAccount(AccountModel mo){
		super();
		this.model = AccountDAO.getAccountByID(mo.getEmID());
		initialize();
		
		txtEmID.setText(this.model.getEmID());
		txtPassword.setText(model.getPassword());
		txtname.setText(model.getName());
		
		ArrayList<DesignationModel> listdesig =  DesignationDAO.getAllDesignation();
		for (DesignationModel dm : listdesig) {
			KeyValue item = new KeyValue(dm.getDesignation(),dm.getLayer_ID());

			cbnAcclevel.addItem(item);
			if (item.getKey().equals(model.getLayer())) {
				cbnAcclevel.setSelectedItem(item);
			}
		}
		txtDesignation.setText(model.getDesignation());
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
		this.setSize(438, 364);
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
			jLabel5 = new JLabel();
			jLabel5.setBounds(new Rectangle(23, 168, 71, 30));
			jLabel5.setText("Name :");
			jLabel1 = new JLabel();
			jLabel1.setBounds(new Rectangle(18, 246, 84, 28));
			jLabel1.setText("Designation :");
			jLabel4 = new JLabel();
			jLabel4.setText("Level :");
			jLabel4.setSize(new Dimension(71, 25));
			jLabel4.setLocation(new Point(19, 205));
			jLabel3 = new JLabel();
			jLabel3.setText("EmID :");
			jLabel3.setLocation(new Point(20, 90));
			jLabel3.setSize(new Dimension(71, 25));
			jLabel2 = new JLabel();
			jLabel2.setText("Password :");
			jLabel2.setLocation(new Point(20, 130));
			jLabel2.setSize(new Dimension(68, 25));
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(82, 9, 251, 48));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 24));
			jLabel.setForeground(Color.red);
			jLabel.setText("Update UserAccount ");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.setFont(new Font("Dialog", Font.PLAIN, 12));
			jContentPane.add(jLabel, null);
			jContentPane.add(jLabel2, null);
			jContentPane.add(getTxtPassword(), null);
			jContentPane.add(jLabel3, null);
			jContentPane.add(jLabel4, null);
			jContentPane.add(getCbnAcclevel(), null);
			jContentPane.add(getBtnAdd(), null);
			jContentPane.add(getBtnDelete(), null);
			jContentPane.add(getTxtEmID(), null);
			jContentPane.add(jLabel1, null);
			jContentPane.add(getTxtDesignation(), null);
			jContentPane.add(jLabel5, null);
			jContentPane.add(getTxtname(), null);
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
	 * This method initializes cbnAcclevel	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getCbnAcclevel() {
		if (cbnAcclevel == null) {
			cbnAcclevel = new JComboBox();
			cbnAcclevel.setSize(new Dimension(200, 25));
			cbnAcclevel.setLocation(new Point(135, 210));
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
			btnAdd.setLocation(new Point(78, 287));
			btnAdd.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					AccountModel model = new AccountModel();
					//model.setUserID(userID);
					model.setEmID(txtEmID.getText().trim());
					model.setPassword(txtPassword.getText().trim());
					model.setName(txtname.getText().trim());
					model.setLayer(((KeyValue) cbnAcclevel.getSelectedItem())
							.getKey());
					model.setDesignation(txtDesignation.getText().trim());
					if(!validateModel(model)) {
						
						return;
					}
					Boolean kq = AccountDAO.UpdateUsingStore(model);
					if (kq) {
						JOptionPane.showMessageDialog(null,
								"Update successful Account", "Notice",
								JOptionPane.INFORMATION_MESSAGE);
						(new ViewAccount()).setVisible(true);
						dispose();
					}else {
						JOptionPane.showMessageDialog(null,
								"Update failure Account", "Notice",
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
			btnDelete.setLocation(new Point(255, 284));
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
/**
 * This method initializes txtEmID	
 * 	
 * @return javax.swing.JTextField	
 */
private JTextField getTxtEmID() {
	if (txtEmID == null) {
		txtEmID = new JTextField();
		txtEmID.setSize(new Dimension(200, 25));
		txtEmID.setLocation(new Point(130, 90));
	}
	return txtEmID;
}
/**
 * This method initializes txtDesignation	
 * 	
 * @return javax.swing.JTextField	
 */
private JTextField getTxtDesignation() {
	if (txtDesignation == null) {
		txtDesignation = new JTextField();
		txtDesignation.setBounds(new Rectangle(132, 245, 201, 29));
	}
	return txtDesignation;
}
/**
 * This method initializes txtname	
 * 	
 * @return javax.swing.JTextField	
 */
private JTextField getTxtname() {
	if (txtname == null) {
		txtname = new JTextField();
		txtname.setBounds(new Rectangle(132, 165, 199, 29));
	}
	return txtname;
}

}  //  @jve:decl-index=0:visual-constraint="10,10"
