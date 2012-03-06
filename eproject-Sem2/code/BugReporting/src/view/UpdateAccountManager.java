package view;



import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Rectangle;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Point;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class UpdateAccountManager extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JTextField txtName = null;
	private JLabel jLabel2 = null;
	private JTextField txtUsername = null;
	private JLabel jLabel3 = null;
	private JPasswordField txtPassword = null;
	private JLabel jLabel4 = null;
	private JComboBox cbnRole = null;
	private JLabel jLabel5 = null;
	private JTextField txtDate = null;
	private JButton btnUpdate = null;
	private JButton btnExit = null;

	/**
	 * This is the default constructor
	 */
	public UpdateAccountManager() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(512, 440);
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
			jLabel5.setText("Date");
			jLabel5.setLocation(new Point(10, 281));
			jLabel5.setFont(new Font("Dialog", Font.BOLD, 14));
			jLabel5.setSize(new Dimension(113, 34));
			jLabel4 = new JLabel();
			jLabel4.setFont(new Font("Dialog", Font.BOLD, 14));
			jLabel4.setLocation(new Point(10, 231));
			jLabel4.setSize(new Dimension(113, 34));
			jLabel4.setText("Role");
			jLabel3 = new JLabel();
			jLabel3.setFont(new Font("Dialog", Font.BOLD, 14));
			jLabel3.setLocation(new Point(10, 183));
			jLabel3.setSize(new Dimension(113, 34));
			jLabel3.setText("Password");
			jLabel2 = new JLabel();
			jLabel2.setFont(new Font("Dialog", Font.BOLD, 14));
			jLabel2.setSize(new Dimension(113, 34));
			jLabel2.setLocation(new Point(10, 136));
			jLabel2.setText("Username");
			jLabel1 = new JLabel();
			jLabel1.setText("Name");
			jLabel1.setLocation(new Point(10, 91));
			jLabel1.setFont(new Font("Dialog", Font.BOLD, 14));
			jLabel1.setSize(new Dimension(111, 30));
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(22, 11, 432, 68));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 36));
			jLabel.setText("Update Account Manager");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(jLabel, null);
			jContentPane.add(jLabel1, null);
			jContentPane.add(getTxtName(), null);
			jContentPane.add(jLabel2, null);
			jContentPane.add(getTxtUsername(), null);
			jContentPane.add(jLabel3, null);
			jContentPane.add(getTxtPassword(), null);
			jContentPane.add(jLabel4, null);
			jContentPane.add(getCbnRole(), null);
			jContentPane.add(jLabel5, null);
			jContentPane.add(getTxtDate(), null);
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
			txtName.setLocation(new Point(193, 91));
			txtName.setSize(new Dimension(269, 30));
		}
		return txtName;
	}

	/**
	 * This method initializes txtUsername	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtUsername() {
		if (txtUsername == null) {
			txtUsername = new JTextField();
			txtUsername.setSize(new Dimension(269, 30));
			txtUsername.setLocation(new Point(193, 136));
		}
		return txtUsername;
	}

	/**
	 * This method initializes txtPassword	
	 * 	
	 * @return javax.swing.JPasswordField	
	 */
	private JPasswordField getTxtPassword() {
		if (txtPassword == null) {
			txtPassword = new JPasswordField();
			txtPassword.setSize(new Dimension(269, 30));
			txtPassword.setLocation(new Point(193, 183));
		}
		return txtPassword;
	}

	/**
	 * This method initializes cbnRole	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getCbnRole() {
		if (cbnRole == null) {
			cbnRole = new JComboBox();
			cbnRole.setSize(new Dimension(269, 30));
			cbnRole.setLocation(new Point(193, 231));
		}
		return cbnRole;
	}

	/**
	 * This method initializes txtDate	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtDate() {
		if (txtDate == null) {
			txtDate = new JTextField();
			txtDate.setLocation(new Point(193, 280));
			txtDate.setSize(new Dimension(269, 30));
		}
		return txtDate;
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
			btnUpdate.setLocation(new Point(70, 342));
			btnUpdate.setSize(new Dimension(110, 36));
			btnUpdate.setText("Update");
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
			btnExit.setFont(new Font("Dialog", Font.BOLD, 14));
			btnExit.setLocation(new Point(270, 342));
			btnExit.setSize(new Dimension(110, 36));
			btnExit.setText("Exit");
		}
		return btnExit;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
