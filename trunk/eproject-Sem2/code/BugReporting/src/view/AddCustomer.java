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
import javax.swing.JButton;

public class AddCustomer extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JTextField txtName = null;
	private JLabel jLabel2 = null;
	private JTextField txtAddress = null;
	private JLabel jLabel3 = null;
	private JTextField txtEmail = null;
	private JLabel jLabel4 = null;
	private JTextField txtTelephone = null;
	private JLabel jLabel5 = null;
	private JTextField txtProduct = null;
	private JButton btnAdd = null;
	private JButton btnCancel = null;

	/**
	 * This is the default constructor
	 */
	public AddCustomer() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(530, 430);
		this.setContentPane(getJContentPane());
		this.setTitle("JFrame");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabel5 = new JLabel();
			jLabel5.setFont(new Font("Dialog", Font.BOLD, 14));
			jLabel5.setLocation(new Point(10, 273));
			jLabel5.setSize(new Dimension(111, 30));
			jLabel5.setText("Product");
			jLabel4 = new JLabel();
			jLabel4.setFont(new Font("Dialog", Font.BOLD, 14));
			jLabel4.setLocation(new Point(10, 226));
			jLabel4.setSize(new Dimension(111, 30));
			jLabel4.setText("Telephone");
			jLabel3 = new JLabel();
			jLabel3.setFont(new Font("Dialog", Font.BOLD, 14));
			jLabel3.setLocation(new Point(10, 181));
			jLabel3.setSize(new Dimension(111, 30));
			jLabel3.setText("Email");
			jLabel2 = new JLabel();
			jLabel2.setFont(new Font("Dialog", Font.BOLD, 14));
			jLabel2.setSize(new Dimension(111, 30));
			jLabel2.setLocation(new Point(10, 136));
			jLabel2.setText("Address");
			jLabel1 = new JLabel();
			jLabel1.setFont(new Font("Dialog", Font.BOLD, 14));
			jLabel1.setSize(new Dimension(111, 30));
			jLabel1.setLocation(new Point(10, 88));
			jLabel1.setText("Name");
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(147, 12, 255, 53));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 36));
			jLabel.setText("Add Customer");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(jLabel, null);
			jContentPane.add(jLabel1, null);
			jContentPane.add(getTxtName(), null);
			jContentPane.add(jLabel2, null);
			jContentPane.add(getTxtAddress(), null);
			jContentPane.add(jLabel3, null);
			jContentPane.add(getTxtEmail(), null);
			jContentPane.add(jLabel4, null);
			jContentPane.add(getTxtTelephone(), null);
			jContentPane.add(jLabel5, null);
			jContentPane.add(getTxtProduct(), null);
			jContentPane.add(getBtnAdd(), null);
			jContentPane.add(getBtnCancel(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes txtName	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtName() {
		if (txtName == null) {
			txtName = new JTextField();
			txtName.setLocation(new Point(145, 88));
			txtName.setSize(new Dimension(350, 30));
		}
		return txtName;
	}

	/**
	 * This method initializes txtAddress	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtAddress() {
		if (txtAddress == null) {
			txtAddress = new JTextField();
			txtAddress.setLocation(new Point(145, 136));
			txtAddress.setSize(new Dimension(350, 30));
		}
		return txtAddress;
	}

	/**
	 * This method initializes txtEmail	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtEmail() {
		if (txtEmail == null) {
			txtEmail = new JTextField();
			txtEmail.setLocation(new Point(145, 181));
			txtEmail.setSize(new Dimension(350, 30));
		}
		return txtEmail;
	}

	/**
	 * This method initializes txtTelephone	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtTelephone() {
		if (txtTelephone == null) {
			txtTelephone = new JTextField();
			txtTelephone.setSize(new Dimension(350, 30));
			txtTelephone.setLocation(new Point(145, 226));
		}
		return txtTelephone;
	}

	/**
	 * This method initializes txtProduct	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtProduct() {
		if (txtProduct == null) {
			txtProduct = new JTextField();
			txtProduct.setSize(new Dimension(350, 30));
			txtProduct.setLocation(new Point(145, 273));
		}
		return txtProduct;
	}

	/**
	 * This method initializes btnAdd	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnAdd() {
		if (btnAdd == null) {
			btnAdd = new JButton();
			btnAdd.setFont(new Font("Dialog", Font.BOLD, 14));
			btnAdd.setLocation(new Point(101, 322));
			btnAdd.setSize(new Dimension(110, 36));
			btnAdd.setText("Add");
		}
		return btnAdd;
	}

	/**
	 * This method initializes btnCancel	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnCancel() {
		if (btnCancel == null) {
			btnCancel = new JButton();
			btnCancel.setText("Cancel");
			btnCancel.setSize(new Dimension(110, 36));
			btnCancel.setFont(new Font("Dialog", Font.BOLD, 14));
			btnCancel.setLocation(new Point(303, 322));
		}
		return btnCancel;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
