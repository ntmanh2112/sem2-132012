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
import javax.swing.JButton;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JTextField txtUserid = null;
	private JLabel jLabel2 = null;
	private JPasswordField txtPassword = null;
	private JLabel jLabel3 = null;
	private JTextField txtAcclevel = null;
	private JButton btnLogin = null;
	private JButton btnCancel = null;

	/**
	 * This is the default constructor
	 */
	public Login() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(417, 354);
		this.setContentPane(getJContentPane());
		this.setTitle("FormLogin");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabel3 = new JLabel();
			jLabel3.setText("Acc-Level");
			jLabel3.setLocation(new Point(20, 200));
			jLabel3.setSize(new Dimension(61, 30));
			jLabel2 = new JLabel();
			jLabel2.setText("Password");
			jLabel2.setLocation(new Point(20, 150));
			jLabel2.setSize(new Dimension(62, 30));
			jLabel1 = new JLabel();
			jLabel1.setText("UserId");
			jLabel1.setLocation(new Point(20, 100));
			jLabel1.setSize(new Dimension(45, 30));
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(12, 8, 377, 60));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 24));
			jLabel.setText("Welcome to enterprise organiser");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(jLabel, null);
			jContentPane.add(jLabel1, null);
			jContentPane.add(getTxtUserid(), null);
			jContentPane.add(jLabel2, null);
			jContentPane.add(getTxtPassword(), null);
			jContentPane.add(jLabel3, null);
			jContentPane.add(getTxtAcclevel(), null);
			jContentPane.add(getBtnLogin(), null);
			jContentPane.add(getBtnCancel(), null);
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
			txtUserid.setLocation(new Point(100, 100));
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
			txtPassword.setLocation(new Point(100, 150));
			txtPassword.setSize(new Dimension(200, 30));
		}
		return txtPassword;
	}

	/**
	 * This method initializes txtAcclevel	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtAcclevel() {
		if (txtAcclevel == null) {
			txtAcclevel = new JTextField();
			txtAcclevel.setSize(new Dimension(200, 30));
			txtAcclevel.setLocation(new Point(100, 200));
		}
		return txtAcclevel;
	}

	/**
	 * This method initializes btnLogin	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnLogin() {
		if (btnLogin == null) {
			btnLogin = new JButton();
			btnLogin.setText("Login");
			btnLogin.setSize(new Dimension(90, 30));
			btnLogin.setLocation(new Point(50, 260));
		}
		return btnLogin;
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
			btnCancel.setSize(new Dimension(90, 30));
			btnCancel.setLocation(new Point(224, 260));
		}
		return btnCancel;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
