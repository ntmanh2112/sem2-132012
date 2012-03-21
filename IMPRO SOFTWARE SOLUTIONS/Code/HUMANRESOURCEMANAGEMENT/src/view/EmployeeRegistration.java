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
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class EmployeeRegistration extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JTextField txtEmpid = null;
	private JLabel jLabel2 = null;
	private JTextField txtEmpname = null;
	private JLabel jLabel3 = null;
	private JComboBox cbnDeptno = null;
	private JLabel jLabel4 = null;
	private JTextField txtDesignid = null;
	private JLabel jLabel5 = null;
	private JTextField txtAddress = null;
	private JLabel jLabel6 = null;
	private JTextField txtPhone = null;
	private JLabel jLabel7 = null;
	private JTextField txtFax = null;
	private JLabel jLabel8 = null;
	private JTextField txtEmail = null;
	private JButton btnAdd = null;
	private JButton btnSave = null;
	private JButton btnEdit = null;
	private JButton btnDelete = null;

	/**
	 * This is the default constructor
	 */
	public EmployeeRegistration() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(660, 432);
		this.setContentPane(getJContentPane());
		this.setTitle("FrmEmployee");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabel8 = new JLabel();
			jLabel8.setText("Email");
			jLabel8.setLocation(new Point(350, 220));
			jLabel8.setDisplayedMnemonic(KeyEvent.VK_UNDEFINED);
			jLabel8.setSize(new Dimension(38, 25));
			jLabel7 = new JLabel();
			jLabel7.setText("Fax");
			jLabel7.setLocation(new Point(350, 180));
			jLabel7.setSize(new Dimension(30, 25));
			jLabel6 = new JLabel();
			jLabel6.setText("Phone");
			jLabel6.setSize(new Dimension(38, 25));
			jLabel6.setLocation(new Point(350, 140));
			jLabel5 = new JLabel();
			jLabel5.setText("Address");
			jLabel5.setSize(new Dimension(55, 25));
			jLabel5.setLocation(new Point(350, 100));
			jLabel4 = new JLabel();
			jLabel4.setText("DesignId");
			jLabel4.setLocation(new Point(20, 220));
			jLabel4.setSize(new Dimension(56, 25));
			jLabel3 = new JLabel();
			jLabel3.setText("DeptNo");
			jLabel3.setSize(new Dimension(50, 25));
			jLabel3.setLocation(new Point(20, 180));
			jLabel2 = new JLabel();
			jLabel2.setText("EmpName");
			jLabel2.setLocation(new Point(20, 140));
			jLabel2.setSize(new Dimension(65, 25));
			jLabel1 = new JLabel();
			jLabel1.setText("EmpId");
			jLabel1.setLocation(new Point(20, 100));
			jLabel1.setSize(new Dimension(48, 25));
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(183, 12, 262, 37));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 24));
			jLabel.setForeground(Color.red);
			jLabel.setText("Employee Registration");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.setBackground(Color.white);
			jContentPane.add(jLabel, null);
			jContentPane.add(jLabel1, null);
			jContentPane.add(getTxtEmpid(), null);
			jContentPane.add(jLabel2, null);
			jContentPane.add(getTxtEmpname(), null);
			jContentPane.add(jLabel3, null);
			jContentPane.add(getCbnDeptno(), null);
			jContentPane.add(jLabel4, null);
			jContentPane.add(getTxtDesignid(), null);
			jContentPane.add(jLabel5, null);
			jContentPane.add(getTxtAddress(), null);
			jContentPane.add(jLabel6, null);
			jContentPane.add(getTxtPhone(), null);
			jContentPane.add(jLabel7, null);
			jContentPane.add(getTxtFax(), null);
			jContentPane.add(jLabel8, null);
			jContentPane.add(getTxtEmail(), null);
			
			jContentPane.add(getBtnSave(), null);
			jContentPane.add(getBtnEdit(), null);
			
		}
		return jContentPane;
	}

	/**
	 * This method initializes txtEmpid	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtEmpid() {
		if (txtEmpid == null) {
			txtEmpid = new JTextField();
			txtEmpid.setLocation(new Point(100, 100));
			txtEmpid.setSize(new Dimension(200, 25));
		}
		return txtEmpid;
	}

	/**
	 * This method initializes txtEmpname	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtEmpname() {
		if (txtEmpname == null) {
			txtEmpname = new JTextField();
			txtEmpname.setLocation(new Point(100, 140));
			txtEmpname.setSize(new Dimension(200, 25));
		}
		return txtEmpname;
	}

	/**
	 * This method initializes cbnDeptno	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getCbnDeptno() {
		if (cbnDeptno == null) {
			cbnDeptno = new JComboBox();
			cbnDeptno.setLocation(new Point(100, 180));
			cbnDeptno.setSize(new Dimension(200, 25));
		}
		return cbnDeptno;
	}

	/**
	 * This method initializes txtDesignid	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtDesignid() {
		if (txtDesignid == null) {
			txtDesignid = new JTextField();
			txtDesignid.setSize(new Dimension(200, 25));
			txtDesignid.setLocation(new Point(100, 220));
		}
		return txtDesignid;
	}

	/**
	 * This method initializes txtAddress	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtAddress() {
		if (txtAddress == null) {
			txtAddress = new JTextField();
			txtAddress.setLocation(new Point(430, 100));
			txtAddress.setSize(new Dimension(200, 25));
		}
		return txtAddress;
	}

	/**
	 * This method initializes txtPhone	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtPhone() {
		if (txtPhone == null) {
			txtPhone = new JTextField();
			txtPhone.setLocation(new Point(430, 140));
			txtPhone.setSize(new Dimension(200, 25));
		}
		return txtPhone;
	}

	/**
	 * This method initializes txtFax	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtFax() {
		if (txtFax == null) {
			txtFax = new JTextField();
			txtFax.setLocation(new Point(430, 180));
			txtFax.setSize(new Dimension(200, 25));
		}
		return txtFax;
	}

	/**
	 * This method initializes txtEmail	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtEmail() {
		if (txtEmail == null) {
			txtEmail = new JTextField();
			txtEmail.setSize(new Dimension(200, 25));
			txtEmail.setLocation(new Point(430, 220));
		}
		return txtEmail;
	}

	/**
	 * This method initializes btnAdd	
	 * 	
	 * @return javax.swing.JButton	
	 */
	

	/**
	 * This method initializes btnSave	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnSave() {
		if (btnSave == null) {
			btnSave = new JButton();
			btnSave.setText("OK");
			btnSave.setSize(new Dimension(90, 30));
			btnSave.setIcon(new ImageIcon(getClass().getResource("/images/Apply.png")));
			btnSave.setLocation(new Point(200, 300));
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
			btnEdit.setText("Cancel");
			btnEdit.setSize(new Dimension(101, 30));
			btnEdit.setIcon(new ImageIcon(getClass().getResource("/images/Erase.png")));
			btnEdit.setLocation(new Point(340, 300));
		}
		return btnEdit;
	}

	/**
	 * This method initializes btnDelete	
	 * 	
	 * @return javax.swing.JButton	
	 */
	

}  //  @jve:decl-index=0:visual-constraint="10,10"
