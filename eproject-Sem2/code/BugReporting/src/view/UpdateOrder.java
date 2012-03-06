package view;

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
		this.setSize(540, 430);
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
			jLabel.setSize(new Dimension(233, 49));
			jLabel.setLocation(new Point(123, 8));
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
			txtTelephone.setLocation(new Point(163, 197));
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
			txtDate.setLocation(new Point(163, 241));
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
			txtStatus.setLocation(new Point(163, 287));
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
			btnUpdate.setLocation(new Point(76, 333));
			btnUpdate.setSize(new Dimension(110, 36));
			btnUpdate.setText("Update");
			
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
			btnCancel.setLocation(new Point(300, 333));
			
		}
		return btnCancel;
	}

}  //  @jve:decl-index=0:visual-constraint="30,48"
