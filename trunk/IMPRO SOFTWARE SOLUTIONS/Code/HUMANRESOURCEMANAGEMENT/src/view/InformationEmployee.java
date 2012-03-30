package view;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Rectangle;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.Point;
import java.awt.GridBagLayout;
import javax.swing.JTextField;

public class InformationEmployee extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JScrollPane jScrollPane = null;
	private JTable jTableInformation = null;
	private JButton btnUpdate = null;
	private JButton btnExit = null;
	private JPanel jPanel = null;
	private JLabel jLabel1 = null;
	private JTextField txtEmid = null;
	private JLabel jLabel2 = null;
	private JTextField txtName = null;
	private JLabel jLabel3 = null;
	private JTextField txtDeptid = null;
	private JButton btnSearch = null;

	/**
	 * This is the default constructor
	 */
	public InformationEmployee() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(646, 432);
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
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(247, 16, 137, 48));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 24));
			jLabel.setText("Information");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(jLabel, null);
			jContentPane.add(getJScrollPane(), null);
			jContentPane.add(getBtnUpdate(), null);
			jContentPane.add(getBtnExit(), null);
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
			jScrollPane.setBounds(new Rectangle(10, 83, 619, 161));
			jScrollPane.setViewportView(getJTableInformation());
		}
		return jScrollPane;
	}

	/**
	 * This method initializes jTableInformation	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getJTableInformation() {
		if (jTableInformation == null) {
			jTableInformation = new JTable();
		}
		return jTableInformation;
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
			btnUpdate.setLocation(new Point(180, 265));
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
			btnExit.setLocation(new Point(383, 265));
		}
		return btnExit;
	}

	/**
	 * This method initializes jPanel	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel() {
		if (jPanel == null) {
			jLabel3 = new JLabel();
			jLabel3.setText("DeptID");
			jLabel3.setLocation(new Point(347, 23));
			jLabel3.setSize(new Dimension(38, 30));
			jLabel2 = new JLabel();
			jLabel2.setText("Name");
			jLabel2.setSize(new Dimension(36, 30));
			jLabel2.setLocation(new Point(184, 23));
			jLabel1 = new JLabel();
			jLabel1.setText("EmID");
			jLabel1.setSize(new Dimension(33, 30));
			jLabel1.setLocation(new Point(6, 23));
			jPanel = new JPanel();
			jPanel.setLayout(null);
			jPanel.setBounds(new Rectangle(9, 310, 619, 76));
			jPanel.add(jLabel1, null);
			jPanel.add(getTxtEmid(), null);
			jPanel.add(jLabel2, null);
			jPanel.add(getTxtName(), null);
			jPanel.add(jLabel3, null);
			jPanel.add(getTxtDeptid(), null);
			jPanel.add(getBtnSearch(), null);
		}
		return jPanel;
	}

	/**
	 * This method initializes txtEmid	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtEmid() {
		if (txtEmid == null) {
			txtEmid = new JTextField();
			txtEmid.setLocation(new Point(45, 23));
			txtEmid.setSize(new Dimension(134, 30));
		}
		return txtEmid;
	}

	/**
	 * This method initializes txtName	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtName() {
		if (txtName == null) {
			txtName = new JTextField();
			txtName.setSize(new Dimension(118, 30));
			txtName.setLocation(new Point(225, 23));
		}
		return txtName;
	}

	/**
	 * This method initializes txtDeptid	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtDeptid() {
		if (txtDeptid == null) {
			txtDeptid = new JTextField();
			txtDeptid.setLocation(new Point(389, 23));
			txtDeptid.setSize(new Dimension(118, 30));
		}
		return txtDeptid;
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
			btnSearch.setSize(new Dimension(90, 30));
			btnSearch.setLocation(new Point(516, 23));
		}
		return btnSearch;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
