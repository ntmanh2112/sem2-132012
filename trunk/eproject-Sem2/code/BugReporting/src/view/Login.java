package view;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JTextField;
import java.awt.Rectangle;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Point;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JTextField txtUsername = null;
	private JLabel jLabel2 = null;
	private JPasswordField txtPassword = null;
	private JButton btnOK = null;
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
		this.setSize(356, 287);
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
			jLabel2 = new JLabel();
			jLabel2.setFont(new Font("Dialog", Font.BOLD, 14));
			jLabel2.setSize(new Dimension(72, 35));
			jLabel2.setLocation(new Point(24, 118));
			jLabel2.setText("Password");
			jLabel1 = new JLabel();
			jLabel1.setBounds(new Rectangle(24, 72, 72, 35));
			jLabel1.setFont(new Font("Dialog", Font.BOLD, 14));
			jLabel1.setText("Username");
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(123, 12, 103, 47));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 36));
			jLabel.setText("Login");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(jLabel, null);
			jContentPane.add(jLabel1, null);
			jContentPane.add(getTxtUsername(), null);
			jContentPane.add(jLabel2, null);
			jContentPane.add(getTxtPassword(), null);
			jContentPane.add(getBtnOK(), null);
			jContentPane.add(getBtnCancel(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes txtUsername	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtUsername() {
		if (txtUsername == null) {
			txtUsername = new JTextField();
			txtUsername.setSize(new Dimension(172, 35));
			txtUsername.setLocation(new Point(135, 72));
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
			txtPassword.setLocation(new Point(135, 118));
			txtPassword.setSize(new Dimension(172, 35));
		}
		return txtPassword;
	}

	/**
	 * This method initializes btnOK	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnOK() {
		if (btnOK == null) {
			btnOK = new JButton();
			
			btnOK.setBounds(new Rectangle(47, 179, 85, 36));
			btnOK.setFont(new Font("Dialog", Font.BOLD, 14));
			btnOK.setText("OK");
			ImageIcon imOK = new ImageIcon("image/button-ok-icon.png");
			btnOK.setIcon(imOK);
		}
		return btnOK;
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
			btnCancel.setSize(new Dimension(110, 36));
			btnCancel.setLocation(new Point(198, 179));
			btnCancel.setText("Cancel");
			ImageIcon imCancel = new ImageIcon("image/button-cancel-icon.png");
			btnCancel.setIcon(imCancel);
		}
		return btnCancel;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
