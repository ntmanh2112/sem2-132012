package view;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JLabel;

import java.awt.Component;
import java.awt.Rectangle;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.Point;
import java.awt.GridBagLayout;
import java.util.ArrayList;

import javax.swing.JTextField;

import dao.DepartmentsDAO;
import dao.EmployeeDAO;

import model.DepartmentsModel;
import model.EmployeeModel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;

public class ViewAccount extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JScrollPane jScrollPane = null;
	private JTable jTableViewaccount = null;
	private JButton btnAddaccount = null;
	private JButton btnUpdateaccount = null;
	private JButton btnDeleteaccount = null;
	private JPanel jPanel = null;
	private JLabel jLabel1 = null;
	private JTextField txtUsername = null;
	private JLabel jLabel3 = null;
	private JTextField txtEmployeeid = null;
	private JButton btnSearch = null;
	
	/**
	 * This is the default constructor
	 */
	public ViewAccount() {
		super();
		initialize();
		this.setVisible(true);
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(803, 516);
		this.setContentPane(getJContentPane());
		this.setTitle("FrmViewAcc");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(282, 18, 160, 47));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 24));
			jLabel.setForeground(Color.red);
			jLabel.setText("View Account");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.setBackground(new Color(238, 238, 238));
			jContentPane.add(jLabel, null);
			jContentPane.add(getJScrollPane(), null);
			jContentPane.add(getBtnAddaccount(), null);
			jContentPane.add(getBtnUpdateaccount(), null);
			jContentPane.add(getBtnDeleteaccount(), null);
			jContentPane.add(getJPanel(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jScrollPane	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane() {
		if (jScrollPane == null) {
			jScrollPane = new JScrollPane();
			jScrollPane.setBounds(new Rectangle(28, 79, 736, 191));
			jScrollPane.setViewportView(getJTableViewaccount());
		}
		return jScrollPane;
	}

	private Component getJTableViewaccount() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * This method initializes jTableViewaccount	
	 * 	
	 * @return javax.swing.JTable	
	 */
	
	

	/**
	 * This method initializes btnAddaccount	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnAddaccount() {
		if (btnAddaccount == null) {
			btnAddaccount = new JButton();
			btnAddaccount.setText("Add Account");
			btnAddaccount.setSize(new Dimension(153, 40));
			btnAddaccount.setIcon(new ImageIcon(getClass().getResource("/images/Create.png")));
			btnAddaccount.setLocation(new Point(60, 293));
			
		}
		return btnAddaccount;
	}

	/**
	 * This method initializes btnUpdateaccount	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnUpdateaccount() {
		if (btnUpdateaccount == null) {
			btnUpdateaccount = new JButton();
			btnUpdateaccount.setText("Update Account");
			btnUpdateaccount.setSize(new Dimension(170, 40));
			btnUpdateaccount.setIcon(new ImageIcon(getClass().getResource("/images/Update.png")));
			btnUpdateaccount.setLocation(new Point(271, 293));
			
		}
		return btnUpdateaccount;
	}

	/**
	 * This method initializes btnDeleteaccount	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnDeleteaccount() {
		if (btnDeleteaccount == null) {
			btnDeleteaccount = new JButton();
			btnDeleteaccount.setText("Delete Account");
			btnDeleteaccount.setSize(new Dimension(166, 40));
			btnDeleteaccount.setIcon(new ImageIcon(getClass().getResource("/images/Delete.png")));
			btnDeleteaccount.setMnemonic(KeyEvent.VK_UNDEFINED);
			btnDeleteaccount.setLocation(new Point(484, 293));
			
		}
		return btnDeleteaccount;
	}

	/**
	 * This method initializes jPanel	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel() {
		if (jPanel == null) {
			jLabel3 = new JLabel();
			jLabel3.setText("EmployeeID");
			jLabel3.setLocation(new Point(333, 17));
			jLabel3.setSize(new Dimension(70, 25));
			jLabel1 = new JLabel();
			jLabel1.setText("Username");
			jLabel1.setSize(new Dimension(59, 25));
			jLabel1.setLocation(new Point(9, 17));
			jPanel = new JPanel();
			jPanel.setLayout(null);
			jPanel.setLocation(new Point(53, 357));
			jPanel.setSize(new Dimension(688, 58));
			jPanel.add(jLabel1, null);
			jPanel.add(getTxtUsername(), null);
			jPanel.add(jLabel3, null);
			jPanel.add(getTxtEmployeeid(), null);
			jPanel.add(getBtnSearch(), null);
		    jPanel.setBorder(BorderFactory.createEtchedBorder());
		}
		return jPanel;
	}

	/**
	 * This method initializes txtUsername	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtUsername() {
		if (txtUsername == null) {
			txtUsername = new JTextField();
			txtUsername.setLocation(new Point(93, 17));
			txtUsername.setSize(new Dimension(210, 25));
		}
		return txtUsername;
	}

	/**
	 * This method initializes txtEmployeeid	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtEmployeeid() {
		if (txtEmployeeid == null) {
			txtEmployeeid = new JTextField();
			txtEmployeeid.setLocation(new Point(414, 17));
			txtEmployeeid.setSize(new Dimension(114, 25));
		}
		return txtEmployeeid;
	}

	/**
	 * This method initializes btnSearch	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnSearch() {
		if (btnSearch == null) {
			btnSearch = new JButton();
			btnSearch.setText("Search");
			btnSearch.setSize(new Dimension(95, 25));
			btnSearch.setMnemonic(KeyEvent.VK_UNDEFINED);
			btnSearch.setIcon(new ImageIcon(getClass().getResource("/images/Zoom.png")));
			btnSearch.setLocation(new Point(554, 17));
		
				
		}	
				
		return btnSearch;
	}
	}
	


