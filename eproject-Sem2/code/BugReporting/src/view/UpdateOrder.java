import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Rectangle;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Point;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class UpdateOrder extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JTextField txtCustomername = null;
	private JLabel jLabel2 = null;
	private JTextField txtAddress = null;
	private JLabel jLabel3 = null;
	private JTextField txtEmail = null;
	private JLabel jLabel4 = null;
	private JTextField txtTelephone = null;
	private JLabel jLabel5 = null;
	private JTextField txtDate = null;
	private JLabel jLabel6 = null;
	private JTextField txtStatus = null;
	private JButton btnUpdate = null;
	private JButton btnCancel = null;
	private JLabel jLabel7 = null;
	private JTextField txtProduct = null;
	private JLabel jLabel8 = null;
	private JTextField txtNumber = null;
	private JLabel jLabel9 = null;
	private JTextField txtOrdercode = null;
	/**
	 * This is the default constructor
	 */
	public UpdateOrder() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(531, 578);
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
			jLabel9 = new JLabel();
			jLabel9.setFont(new Font("Dialog", Font.BOLD, 14));
			jLabel9.setSize(new Dimension(111, 30));
			jLabel9.setLocation(new Point(10, 421));
			jLabel9.setText("Ordercode");
			jLabel8 = new JLabel();
			jLabel8.setText("Number ");
			jLabel8.setLocation(new Point(10, 376));
			jLabel8.setFont(new Font("Dialog", Font.BOLD, 14));
			jLabel8.setSize(new Dimension(111, 30));
			jLabel7 = new JLabel();
			jLabel7.setFont(new Font("Dialog", Font.BOLD, 14));
			jLabel7.setSize(new Dimension(111, 30));
			jLabel7.setLocation(new Point(10, 333));
			jLabel7.setText("Product");
			jLabel6 = new JLabel();
			jLabel6.setText("Status");
			jLabel6.setSize(new Dimension(111, 30));
			jLabel6.setFont(new Font("Dialog", Font.BOLD, 14));
			jLabel6.setLocation(new Point(10, 289));
			jLabel5 = new JLabel();
			jLabel5.setFont(new Font("Dialog", Font.BOLD, 14));
			jLabel5.setSize(new Dimension(111, 30));
			jLabel5.setLocation(new Point(10, 242));
			jLabel5.setText("Date");
			jLabel4 = new JLabel();
			jLabel4.setText("Telephone");
			jLabel4.setLocation(new Point(10, 196));
			jLabel4.setFont(new Font("Dialog", Font.BOLD, 14));
			jLabel4.setSize(new Dimension(111, 30));
			jLabel3 = new JLabel();
			jLabel3.setText("Email");
			jLabel3.setLocation(new Point(10, 151));
			jLabel3.setFont(new Font("Dialog", Font.BOLD, 14));
			jLabel3.setSize(new Dimension(111, 30));
			jLabel2 = new JLabel();
			jLabel2.setText("Address");
			jLabel2.setLocation(new Point(10, 106));
			jLabel2.setFont(new Font("Dialog", Font.BOLD, 14));
			jLabel2.setSize(new Dimension(111, 30));
			jLabel1 = new JLabel();
			jLabel1.setBounds(new Rectangle(10, 63, 111, 30));
			jLabel1.setFont(new Font("Dialog", Font.BOLD, 14));
			jLabel1.setText("Customername");
			jLabel = new JLabel();
			jLabel.setFont(new Font("Dialog", Font.BOLD, 36));
			jLabel.setSize(new Dimension(245, 49));
			jLabel.setLocation(new Point(129, 5));
			jLabel.setText("Update Order");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.setFont(new Font("Dialog", Font.PLAIN, 14));
			jContentPane.add(jLabel, null);
			jContentPane.add(jLabel1, null);
			jContentPane.add(getTxtCustomername(), null);
			jContentPane.add(jLabel2, null);
			jContentPane.add(getTxtAddress(), null);
			jContentPane.add(jLabel3, null);
			jContentPane.add(getTxtEmail(), null);
			jContentPane.add(jLabel4, null);
			jContentPane.add(getTxtTelephone(), null);
			jContentPane.add(jLabel5, null);
			jContentPane.add(getTxtDate(), null);
			jContentPane.add(jLabel6, null);
			jContentPane.add(getTxtStatus(), null);
			jContentPane.add(getBtnUpdate(), null);
			jContentPane.add(getBtnCancel(), null);
			jContentPane.add(jLabel7, null);
			jContentPane.add(getTxtProduct(), null);
			jContentPane.add(jLabel8, null);
			jContentPane.add(getTxtNumber(), null);
			jContentPane.add(jLabel9, null);
			jContentPane.add(getTxtOrdercode(), null);
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
			txtCustomername.setLocation(new Point(163, 63));
			txtCustomername.setSize(new Dimension(350, 30));
		}
		return txtCustomername;
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
			txtAddress.setLocation(new Point(163, 106));
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
			txtEmail.setSize(new Dimension(350, 30));
			txtEmail.setLocation(new Point(163, 151));
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
			txtTelephone.setLocation(new Point(163, 196));
			txtTelephone.setSize(new Dimension(205, 30));
		}
		return txtTelephone;
	}

	/**
	 * This method initializes txtDate	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtDate() {
		if (txtDate == null) {
			txtDate = new JTextField();
			txtDate.setLocation(new Point(163, 242));
			txtDate.setSize(new Dimension(205, 30));
		}
		return txtDate;
	}

	/**
	 * This method initializes txtStatus	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtStatus() {
		if (txtStatus == null) {
			txtStatus = new JTextField();
			txtStatus.setSize(new Dimension(205, 30));
			txtStatus.setLocation(new Point(163, 289));
		}
		return txtStatus;
	}

	/**
	 * This method initializes btnUpdate	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnUpdate() {
		if (btnUpdate == null) {
			btnUpdate = new JButton();
			btnUpdate.setFont(new Font("Dialog", Font.BOLD, 14));
			btnUpdate.setLocation(new Point(76, 476));
			btnUpdate.setSize(new Dimension(110, 36));
			btnUpdate.setText("Update");
			ImageIcon imAdd  = new ImageIcon("image/Add-2-icon.png");
			btnUpdate.setIcon(imAdd);
		}
		return btnUpdate;
	}

	/**
	 * This method initializes btnCancel	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnCancel() {
		if (btnCancel == null) {
			btnCancel = new JButton();
			btnCancel.setSize(new Dimension(110, 36));
			btnCancel.setText("Cancel");
			btnCancel.setFont(new Font("Dialog", Font.BOLD, 14));
			btnCancel.setLocation(new Point(300, 476));
			ImageIcon imCancel = new ImageIcon("image/Cancel-2-icon.png");
			btnCancel.setIcon(imCancel);
		}
		return btnCancel;
	}

	/**
	 * This method initializes txtProduct	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtProduct() {
		if (txtProduct == null) {
			txtProduct = new JTextField();
			txtProduct.setSize(new Dimension(205, 30));
			txtProduct.setLocation(new Point(163, 333));
		}
		return txtProduct;
	}

	/**
	 * This method initializes txtNumber	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtNumber() {
		if (txtNumber == null) {
			txtNumber = new JTextField();
			txtNumber.setLocation(new Point(163, 376));
			txtNumber.setSize(new Dimension(205, 30));
		}
		return txtNumber;
	}

	/**
	 * This method initializes txtOrdercode	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtOrdercode() {
		if (txtOrdercode == null) {
			txtOrdercode = new JTextField();
			txtOrdercode.setLocation(new Point(163, 421));
			txtOrdercode.setSize(new Dimension(205, 30));
		}
		return txtOrdercode;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
