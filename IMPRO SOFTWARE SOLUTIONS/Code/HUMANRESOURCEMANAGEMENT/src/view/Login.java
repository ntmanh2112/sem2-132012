package view;

import java.awt.BorderLayout;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Rectangle;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JTextField;
import java.awt.Point;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;

import dao.AccountDAO;

import model.AccountModel;
import javax.swing.WindowConstants;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JTextField txtUserid = null;
	private JLabel jLabel2 = null;
	private JPasswordField txtPassword = null;
	//private JLabel jLabel3 = null;
	//private JTextField txtAcclevel = null;
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
		//this.setUndecorated(true); 
		Toolkit theKit = this.getToolkit();   
		Dimension wndSize = theKit.getScreenSize();
		this.setLocation((wndSize.width-476)/2, (wndSize.height-360)/2);
		//this.setBounds(wndSize.width / 4, wndSize.height / 4, // Position  
		//wndSize.width / 2, wndSize.height / 2);*/
		this.setResizable(false);
		//this.setLocation(h);
		this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
		//this.setLocation(new Point(0, 0));
		this.setSize(476, 360);
		this.setContentPane(getJContentPane());
		this.setTitle("Login");
		this.setVisible(true);
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			//jLabel3 = new JLabel();
			
			/*jLabel3.setLocation(new Point(73, 200));
			jLabel3.setForeground(Color.yellow);
			jLabel3.setFont(new Font("Dialog", Font.BOLD, 14));
			jLabel3.setSize(new Dimension(76, 30));*/
			jLabel2 = new JLabel();
			jLabel2.setText("Password");
			jLabel2.setLocation(new Point(54, 150));
			jLabel2.setForeground(Color.yellow);
			jLabel2.setFont(new Font("Dialog", Font.BOLD, 14));
			jLabel2.setIcon(new ImageIcon(getClass().getResource("/images/Key.png")));
			jLabel2.setSize(new Dimension(95, 25));
			jLabel1 = new JLabel();
			jLabel1.setText("Em_ID");
			jLabel1.setLocation(new Point(54, 99));
			jLabel1.setForeground(Color.yellow);
			jLabel1.setFont(new Font("Dialog", Font.BOLD, 14));
			jLabel1.setIcon(new ImageIcon(getClass().getResource("/images/People.png")));
			jLabel1.setSize(new Dimension(77, 25));
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(29, 8, 407, 60));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 24));
			jLabel.setForeground(Color.yellow);
			jLabel.setText("Welcome To Enterprise Organiser");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.setBackground(new Color(0, 136, 255));
			jContentPane.add(jLabel, null);
			jContentPane.add(jLabel1, null);
			jContentPane.add(getTxtUserid(), null);
			jContentPane.add(jLabel2, null);
			jContentPane.add(getTxtPassword(), null);
			//jContentPane.add(jLabel3, null);
			
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
			txtUserid.setSize(new Dimension(200, 25));
			txtUserid.setLocation(new Point(179, 99));
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
			txtPassword.setLocation(new Point(179, 150));
			txtPassword.setSize(new Dimension(200, 25));
		}
		return txtPassword;
	}

	/**
	 * This method initializes txtAcclevel	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	
	/**
	 * This method initializes btnLogin	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnLogin() {
		if (btnLogin == null) {
			btnLogin = new JButton();
			btnLogin.setText("Login");
			btnLogin.setSize(new Dimension(101, 30));
			btnLogin.setForeground(Color.yellow);
			btnLogin.setBackground(new Color(0, 109, 255));
			btnLogin.setIcon(new ImageIcon(getClass().getResource("/images/Yes.png")));
			btnLogin.setLocation(new Point(90, 230));
			btnLogin.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					String EmID = txtUserid.getText();
					
					String Password = txtPassword.getText();
					AccountModel model = AccountDAO.getAccountNEW(EmID, Password);
					if (model == null) {
						JOptionPane.showMessageDialog(null, "Dang Nhap That Bai");
					}else {
						
						(new MainForm()).setVisible(true);
						hide();
					}
				}
			});
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
			btnCancel.setSize(new Dimension(114, 30));
			btnCancel.setForeground(Color.yellow);
			btnCancel.setBackground(new Color(0, 109, 255));
			btnCancel.setIcon(new ImageIcon(getClass().getResource("/images/Erase.png")));
			btnCancel.setLocation(new Point(260, 230));
			btnCancel.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					int kg = JOptionPane.showConfirmDialog(null, "Ban co chac muon thoat","Thong Bao",JOptionPane.OK_CANCEL_OPTION);
					if (kg==0) {
						System.exit(1);
					}
					
				}
			});
		}
		return btnCancel;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
