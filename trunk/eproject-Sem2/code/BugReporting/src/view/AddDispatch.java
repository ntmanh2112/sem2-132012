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

public class AddDispatch extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JTextField txtCustomername = null;
	private JLabel jLabel2 = null;
	private JTextField txtEmail = null;
	private JLabel jLabel3 = null;
	private JTextField txtTelephone = null;
	private JLabel jLabel4 = null;
	private JTextField txtAddress = null;
	private JLabel jLabel5 = null;
	private JTextField txtProduct = null;
	private JLabel jLabel6 = null;
	private JTextField txtOrdercode = null;
	private JLabel jLabel7 = null;
	private JTextField txtNumberofproduct = null;
	private JButton btnAdd = null;
	private JButton btnCancel = null;

	/**
	 * This is the default constructor
	 */
	public AddDispatch() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(553, 510);
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
			jLabel7 = new JLabel();
			jLabel7.setFont(new Font("Dialog", Font.BOLD, 14));
			jLabel7.setSize(new Dimension(136, 30));
			jLabel7.setLocation(new Point(10, 361));
			jLabel7.setText("Number of product");
			jLabel6 = new JLabel();
			jLabel6.setFont(new Font("Dialog", Font.BOLD, 14));
			jLabel6.setSize(new Dimension(111, 30));
			jLabel6.setLocation(new Point(10, 316));
			jLabel6.setText("Ordercode");
			jLabel5 = new JLabel();
			jLabel5.setText("Product");
			jLabel5.setLocation(new Point(10, 271));
			jLabel5.setFont(new Font("Dialog", Font.BOLD, 14));
			jLabel5.setSize(new Dimension(111, 30));
			jLabel4 = new JLabel();
			jLabel4.setFont(new Font("Dialog", Font.BOLD, 14));
			jLabel4.setSize(new Dimension(111, 30));
			jLabel4.setLocation(new Point(10, 226));
			jLabel4.setText("Address");
			jLabel3 = new JLabel();
			jLabel3.setFont(new Font("Dialog", Font.BOLD, 14));
			jLabel3.setSize(new Dimension(111, 30));
			jLabel3.setLocation(new Point(10, 180));
			jLabel3.setText("Telephone");
			jLabel2 = new JLabel();
			jLabel2.setFont(new Font("Dialog", Font.BOLD, 14));
			jLabel2.setSize(new Dimension(111, 30));
			jLabel2.setLocation(new Point(10, 135));
			jLabel2.setText("Email");
			jLabel1 = new JLabel();
			jLabel1.setFont(new Font("Dialog", Font.BOLD, 14));
			jLabel1.setSize(new Dimension(111, 30));
			jLabel1.setLocation(new Point(10, 90));
			jLabel1.setText("Customername");
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(166, 16, 237, 63));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 36));
			jLabel.setText("Add Dispatch");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.setFont(new Font("Dialog", Font.PLAIN, 14));
			jContentPane.add(jLabel, null);
			jContentPane.add(jLabel1, null);
			jContentPane.add(getTxtCustomername(), null);
			jContentPane.add(jLabel2, null);
			jContentPane.add(getTxtEmail(), null);
			jContentPane.add(jLabel3, null);
			jContentPane.add(getTxtTelephone(), null);
			jContentPane.add(jLabel4, null);
			jContentPane.add(getTxtAddress(), null);
			jContentPane.add(jLabel5, null);
			jContentPane.add(getTxtProduct(), null);
			jContentPane.add(jLabel6, null);
			jContentPane.add(getTxtOrdercode(), null);
			jContentPane.add(jLabel7, null);
			jContentPane.add(getTxtNumberofproduct(), null);
			jContentPane.add(getBtnAdd(), null);
			jContentPane.add(getBtnCancel(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes txtCustomername	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtCustomername() {
		if (txtCustomername == null) {
			txtCustomername = new JTextField();
			txtCustomername.setLocation(new Point(152, 90));
			txtCustomername.setSize(new Dimension(350, 30));
		}
		return txtCustomername;
	}

	/**
	 * This method initializes txtEmail	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtEmail() {
		if (txtEmail == null) {
			txtEmail = new JTextField();
			txtEmail.setLocation(new Point(152, 135));
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
			txtTelephone.setLocation(new Point(152, 180));
			txtTelephone.setSize(new Dimension(350, 30));
		}
		return txtTelephone;
	}

	/**
	 * This method initializes txtAddress	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtAddress() {
		if (txtAddress == null) {
			txtAddress = new JTextField();
			txtAddress.setSize(new Dimension(350, 30));
			txtAddress.setLocation(new Point(152, 226));
		}
		return txtAddress;
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
			txtProduct.setLocation(new Point(152, 271));
		}
		return txtProduct;
	}

	/**
	 * This method initializes txtOrdercode	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtOrdercode() {
		if (txtOrdercode == null) {
			txtOrdercode = new JTextField();
			txtOrdercode.setSize(new Dimension(350, 30));
			txtOrdercode.setLocation(new Point(152, 316));
		}
		return txtOrdercode;
	}

	/**
	 * This method initializes txtNumberofproduct	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtNumberofproduct() {
		if (txtNumberofproduct == null) {
			txtNumberofproduct = new JTextField();
			txtNumberofproduct.setLocation(new Point(197, 361));
			txtNumberofproduct.setSize(new Dimension(305, 30));
		}
		return txtNumberofproduct;
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
			btnAdd.setLocation(new Point(76, 418));
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
			btnCancel.setFont(new Font("Dialog", Font.BOLD, 14));
			btnCancel.setLocation(new Point(284, 418));
			btnCancel.setSize(new Dimension(110, 36));
			btnCancel.setText("Cancel");
		}
		return btnCancel;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
