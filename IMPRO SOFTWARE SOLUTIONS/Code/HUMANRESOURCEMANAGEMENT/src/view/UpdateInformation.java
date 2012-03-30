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

public class UpdateInformation extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JTextField txtName = null;
	private JLabel jLabel2 = null;
	private JTextField txtAddress = null;
	private JLabel jLabel3 = null;
	private JTextField txtPhone = null;
	private JLabel jLabel4 = null;
	private JTextField txtEmail = null;
	private JButton btnUpdate = null;
	private JButton btnExit = null;

	/**
	 * This is the default constructor
	 */
	public UpdateInformation() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(383, 358);
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
			jLabel4 = new JLabel();
			jLabel4.setText("Email");
			jLabel4.setSize(new Dimension(32, 30));
			jLabel4.setLocation(new Point(15, 220));
			jLabel3 = new JLabel();
			jLabel3.setText("Phone");
			jLabel3.setLocation(new Point(15, 170));
			jLabel3.setSize(new Dimension(38, 30));
			jLabel2 = new JLabel();
			jLabel2.setText("Address");
			jLabel2.setLocation(new Point(15, 120));
			jLabel2.setSize(new Dimension(48, 30));
			jLabel1 = new JLabel();
			jLabel1.setText("Name");
			jLabel1.setSize(new Dimension(36, 30));
			jLabel1.setLocation(new Point(15, 70));
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(76, 9, 226, 41));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 24));
			jLabel.setText("Update Information");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(jLabel, null);
			jContentPane.add(jLabel1, null);
			jContentPane.add(getTxtName(), null);
			jContentPane.add(jLabel2, null);
			jContentPane.add(getTxtAddress(), null);
			jContentPane.add(jLabel3, null);
			jContentPane.add(getTxtPhone(), null);
			jContentPane.add(jLabel4, null);
			jContentPane.add(getTxtEmail(), null);
			jContentPane.add(getBtnUpdate(), null);
			jContentPane.add(getBtnExit(), null);
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
			txtName.setLocation(new Point(100, 70));
			txtName.setSize(new Dimension(200, 30));
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
			txtAddress.setLocation(new Point(100, 120));
			txtAddress.setSize(new Dimension(200, 30));
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
			txtPhone.setSize(new Dimension(200, 30));
			txtPhone.setLocation(new Point(100, 170));
		}
		return txtPhone;
	}

	/**
	 * This method initializes txtEmail	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtEmail() {
		if (txtEmail == null) {
			txtEmail = new JTextField();
			txtEmail.setLocation(new Point(100, 220));
			txtEmail.setSize(new Dimension(200, 30));
		}
		return txtEmail;
	}

	/**
	 * This method initializes btnUpdate	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnUpdate() {
		if (btnUpdate == null) {
			btnUpdate = new JButton();
			btnUpdate.setText("Update");
			btnUpdate.setSize(new Dimension(90, 30));
			btnUpdate.setLocation(new Point(60, 272));
		}
		return btnUpdate;
	}

	/**
	 * This method initializes btnExit	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnExit() {
		if (btnExit == null) {
			btnExit = new JButton();
			btnExit.setText("Exit");
			btnExit.setSize(new Dimension(90, 30));
			btnExit.setLocation(new Point(203, 272));
		}
		return btnExit;
	}

}  //  @jve:decl-index=0:visual-constraint="6,7"
