package view;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Rectangle;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JTabbedPane;
import java.awt.GridBagLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.Point;

public class Employee extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JTabbedPane jtbEmployee = null;
	private JPanel jpnEmployee = null;
	private JScrollPane jScrollPane = null;
	private JTable jTableViewemployee = null;
	private JPanel jpnViewinformation = null;
	private JScrollPane jScrollPane1 = null;
	private JTable jTableViewinformation = null;
	private JPanel jpnSearchEmployee = null;
	private JScrollPane jScrollPane2 = null;
	private JTable jTableSearchemployee = null;
	private JButton btnExit = null;

	/**
	 * This is the default constructor
	 */
	public Employee() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setContentPane(getJContentPane());
		this.setTitle("FrmEmp");
		this.setSize(new Dimension(1280, 605));
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(586, 18, 114, 44));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 24));
			jLabel.setText("Employee");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(jLabel, null);
			jContentPane.add(getJtbEmployee(), null);
			jContentPane.add(getBtnExit(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jtbEmployee	
	 * 	
	 * @return javax.swing.JTabbedPane	
	 */
	private JTabbedPane getJtbEmployee() {
		if (jtbEmployee == null) {
			jtbEmployee = new JTabbedPane();
			jtbEmployee.setBounds(new Rectangle(10, 98, 1230, 400));
			jtbEmployee.addTab("View Employee", null, getJpnEmployee(), null);
			jtbEmployee.addTab("View Information", null, getJpnViewinformation(), null);
			jtbEmployee.addTab("Search Employee", null, getJpnSearchEmployee(), null);
		}
		return jtbEmployee;
	}

	/**
	 * This method initializes jpnEmployee	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJpnEmployee() {
		if (jpnEmployee == null) {
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			gridBagConstraints.fill = GridBagConstraints.BOTH;
			gridBagConstraints.gridy = 0;
			gridBagConstraints.weightx = 1.0;
			gridBagConstraints.weighty = 1.0;
			gridBagConstraints.gridx = 0;
			jpnEmployee = new JPanel();
			jpnEmployee.setLayout(new GridBagLayout());
			jpnEmployee.add(getJScrollPane(), gridBagConstraints);
		}
		return jpnEmployee;
	}

	/**
	 * This method initializes jScrollPane	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane() {
		if (jScrollPane == null) {
			jScrollPane = new JScrollPane();
			jScrollPane.setViewportView(getJTableViewemployee());
		}
		return jScrollPane;
	}

	/**
	 * This method initializes jTableViewemployee	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getJTableViewemployee() {
		if (jTableViewemployee == null) {
			jTableViewemployee = new JTable();
		}
		return jTableViewemployee;
	}

	/**
	 * This method initializes jpnViewinformation	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJpnViewinformation() {
		if (jpnViewinformation == null) {
			GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
			gridBagConstraints1.fill = GridBagConstraints.BOTH;
			gridBagConstraints1.gridy = 0;
			gridBagConstraints1.weightx = 1.0;
			gridBagConstraints1.weighty = 1.0;
			gridBagConstraints1.gridx = 0;
			jpnViewinformation = new JPanel();
			jpnViewinformation.setLayout(new GridBagLayout());
			jpnViewinformation.add(getJScrollPane1(), gridBagConstraints1);
		}
		return jpnViewinformation;
	}

	/**
	 * This method initializes jScrollPane1	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane1() {
		if (jScrollPane1 == null) {
			jScrollPane1 = new JScrollPane();
			jScrollPane1.setViewportView(getJTableViewinformation());
		}
		return jScrollPane1;
	}

	/**
	 * This method initializes jTableViewinformation	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getJTableViewinformation() {
		if (jTableViewinformation == null) {
			jTableViewinformation = new JTable();
		}
		return jTableViewinformation;
	}

	/**
	 * This method initializes jpnSearchEmployee	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJpnSearchEmployee() {
		if (jpnSearchEmployee == null) {
			GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
			gridBagConstraints2.fill = GridBagConstraints.BOTH;
			gridBagConstraints2.gridy = 0;
			gridBagConstraints2.weightx = 1.0;
			gridBagConstraints2.weighty = 1.0;
			gridBagConstraints2.gridx = 0;
			jpnSearchEmployee = new JPanel();
			jpnSearchEmployee.setLayout(new GridBagLayout());
			jpnSearchEmployee.add(getJScrollPane2(), gridBagConstraints2);
		}
		return jpnSearchEmployee;
	}

	/**
	 * This method initializes jScrollPane2	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane2() {
		if (jScrollPane2 == null) {
			jScrollPane2 = new JScrollPane();
			jScrollPane2.setViewportView(getJTableSearchemployee());
		}
		return jScrollPane2;
	}

	/**
	 * This method initializes jTableSearchemployee	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getJTableSearchemployee() {
		if (jTableSearchemployee == null) {
			jTableSearchemployee = new JTable();
		}
		return jTableSearchemployee;
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
			btnExit.setLocation(new Point(591, 513));
		}
		return btnExit;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
