package view;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Rectangle;
import java.awt.Font;
import java.awt.Point;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.KeyEvent;

public class AddUser extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JTextField txtUserid = null;
	private JLabel jLabel2 = null;
	private JPasswordField txtPassword = null;
	private JLabel jLabel3 = null;
	private JComboBox cbnEmployeeid = null;
	private JLabel jLabel4 = null;
	private JComboBox cbnAcclevel = null;
	private JButton btnAdd = null;
	private JButton btnSave = null;
	private JButton btnEdit = null;
	private JButton btnDelete = null;

	/**
	 * This is the default constructor
	 */
	public AddUser() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(438, 399);
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
			jLabel4.setText("Acc-Level");
			jLabel4.setSize(new Dimension(61, 30));
			jLabel4.setLocation(new Point(20, 250));
			jLabel3 = new JLabel();
			jLabel3.setText("EmployeeID");
			jLabel3.setLocation(new Point(20, 200));
			jLabel3.setSize(new Dimension(71, 30));
			jLabel2 = new JLabel();
			jLabel2.setText("Password");
			jLabel2.setLocation(new Point(20, 150));
			jLabel2.setSize(new Dimension(60, 30));
			jLabel1 = new JLabel();
			jLabel1.setText("UserID");
			jLabel1.setLocation(new Point(20, 100));
			jLabel1.setSize(new Dimension(43, 30));
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(88, 9, 200, 48));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 24));
			jLabel.setText("Add User ");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.setFont(new Font("Dialog", Font.PLAIN, 12));
			jContentPane.add(jLabel, null);
			jContentPane.add(jLabel1, null);
			jContentPane.add(getTxtUserid(), null);
			jContentPane.add(jLabel2, null);
			jContentPane.add(getTxtPassword(), null);
			jContentPane.add(jLabel3, null);
			jContentPane.add(getCbnEmployeeid(), null);
			jContentPane.add(jLabel4, null);
			jContentPane.add(getCbnAcclevel(), null);
			jContentPane.add(getBtnAdd(), null);
			jContentPane.add(getBtnSave(), null);
			jContentPane.add(getBtnEdit(), null);
			jContentPane.add(getBtnDelete(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes txtUserid	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtUserid() {
		if (txtUserid == null) {
			txtUserid = new JTextField();
			txtUserid.setSize(new Dimension(200, 30));
			txtUserid.setLocation(new Point(130, 100));
		}
		return txtUserid;
	}

	/**
	 * This method initializes txtPassword	
	 * 	
	 * @return javax.swing.JPasswordField	
	 */
	private JPasswordField getTxtPassword() {
		if (txtPassword == null) {
			txtPassword = new JPasswordField();
			txtPassword.setLocation(new Point(130, 150));
			txtPassword.setSize(new Dimension(200, 30));
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
			cbnEmployeeid.setSize(new Dimension(200, 30));
			cbnEmployeeid.setLocation(new Point(130, 200));
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
			cbnAcclevel.setSize(new Dimension(200, 30));
			cbnAcclevel.setLocation(new Point(130, 250));
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
			btnAdd.setSize(new Dimension(90, 30));
			btnAdd.setLocation(new Point(20, 300));
		}
		return btnAdd;
	}

	/**
	 * This method initializes btnSave	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnSave() {
		if (btnSave == null) {
			btnSave = new JButton();
			btnSave.setText("Save");
			btnSave.setSize(new Dimension(90, 30));
			btnSave.setLocation(new Point(120, 300));
		}
		return btnSave;
	}

	/**
	 * This method initializes btnEdit	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnEdit() {
		if (btnEdit == null) {
			btnEdit = new JButton();
			btnEdit.setText("Edit");
			btnEdit.setSize(new Dimension(90, 30));
			btnEdit.setLocation(new Point(220, 300));
		}
		return btnEdit;
	}

	/**
	 * This method initializes btnDelete	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnDelete() {
		if (btnDelete == null) {
			btnDelete = new JButton();
			btnDelete.setText("Delete");
			btnDelete.setSize(new Dimension(90, 30));
			btnDelete.setMnemonic(KeyEvent.VK_UNDEFINED);
			btnDelete.setLocation(new Point(320, 300));
		}
		return btnDelete;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
