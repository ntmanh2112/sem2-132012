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

public class Department extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JTabbedPane jtbDepartment = null;
	private JPanel jpnViewemployee = null;
	private JScrollPane jScrollPane = null;
	private JTable jTableViewemployee = null;
	private JPanel jpnViewsection = null;
	private JScrollPane jScrollPane1 = null;
	private JTable jTableViewsection = null;
	private JPanel jpnViewreport = null;
	private JScrollPane jScrollPane2 = null;
	private JTable jTableViewreport = null;
	private JPanel jpnManagevacancy = null;
	private JScrollPane jScrollPane3 = null;
	private JTable jTableManagevacancy = null;
	private JButton btnExit = null;

	/**
	 * This is the default constructor
	 */
	public Department() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(new Dimension(1280, 646));
		this.setContentPane(getJContentPane());
		this.setTitle("FrmDep");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(539, 14, 138, 41));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 24));
			jLabel.setText("Department");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(jLabel, null);
			jContentPane.add(getJtbDepartment(), null);
			jContentPane.add(getBtnExit(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jtbDepartment	
	 * 	
	 * @return javax.swing.JTabbedPane	
	 */
	private JTabbedPane getJtbDepartment() {
		if (jtbDepartment == null) {
			jtbDepartment = new JTabbedPane();
			jtbDepartment.setBounds(new Rectangle(10, 111, 1230, 400));
			jtbDepartment.addTab("View Employee", null, getJpnViewemployee(), null);
			jtbDepartment.addTab("View Section", null, getJpnViewsection(), null);
			jtbDepartment.addTab("View Report", null, getJpnViewreport(), null);
			jtbDepartment.addTab("Manage Vacancy", null, getJpnManagevacancy(), null);
		}
		return jtbDepartment;
	}

	/**
	 * This method initializes jpnViewemployee	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJpnViewemployee() {
		if (jpnViewemployee == null) {
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			gridBagConstraints.fill = GridBagConstraints.BOTH;
			gridBagConstraints.gridy = 0;
			gridBagConstraints.weightx = 1.0;
			gridBagConstraints.weighty = 1.0;
			gridBagConstraints.gridx = 0;
			jpnViewemployee = new JPanel();
			jpnViewemployee.setLayout(new GridBagLayout());
			jpnViewemployee.add(getJScrollPane(), gridBagConstraints);
		}
		return jpnViewemployee;
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
	 * This method initializes jpnViewsection	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJpnViewsection() {
		if (jpnViewsection == null) {
			GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
			gridBagConstraints1.fill = GridBagConstraints.BOTH;
			gridBagConstraints1.gridy = 0;
			gridBagConstraints1.weightx = 1.0;
			gridBagConstraints1.weighty = 1.0;
			gridBagConstraints1.gridx = 0;
			jpnViewsection = new JPanel();
			jpnViewsection.setLayout(new GridBagLayout());
			jpnViewsection.add(getJScrollPane1(), gridBagConstraints1);
		}
		return jpnViewsection;
	}

	/**
	 * This method initializes jScrollPane1	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane1() {
		if (jScrollPane1 == null) {
			jScrollPane1 = new JScrollPane();
			jScrollPane1.setViewportView(getJTableViewsection());
		}
		return jScrollPane1;
	}

	/**
	 * This method initializes jTableViewsection	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getJTableViewsection() {
		if (jTableViewsection == null) {
			jTableViewsection = new JTable();
		}
		return jTableViewsection;
	}

	/**
	 * This method initializes jpnViewreport	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJpnViewreport() {
		if (jpnViewreport == null) {
			GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
			gridBagConstraints2.fill = GridBagConstraints.BOTH;
			gridBagConstraints2.gridy = 0;
			gridBagConstraints2.weightx = 1.0;
			gridBagConstraints2.weighty = 1.0;
			gridBagConstraints2.gridx = 0;
			jpnViewreport = new JPanel();
			jpnViewreport.setLayout(new GridBagLayout());
			jpnViewreport.add(getJScrollPane2(), gridBagConstraints2);
		}
		return jpnViewreport;
	}

	/**
	 * This method initializes jScrollPane2	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane2() {
		if (jScrollPane2 == null) {
			jScrollPane2 = new JScrollPane();
			jScrollPane2.setViewportView(getJTableViewreport());
		}
		return jScrollPane2;
	}

	/**
	 * This method initializes jTableViewreport	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getJTableViewreport() {
		if (jTableViewreport == null) {
			jTableViewreport = new JTable();
		}
		return jTableViewreport;
	}

	/**
	 * This method initializes jpnManagevacancy	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJpnManagevacancy() {
		if (jpnManagevacancy == null) {
			GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
			gridBagConstraints3.fill = GridBagConstraints.BOTH;
			gridBagConstraints3.gridy = 0;
			gridBagConstraints3.weightx = 1.0;
			gridBagConstraints3.weighty = 1.0;
			gridBagConstraints3.gridx = 0;
			jpnManagevacancy = new JPanel();
			jpnManagevacancy.setLayout(new GridBagLayout());
			jpnManagevacancy.add(getJScrollPane3(), gridBagConstraints3);
		}
		return jpnManagevacancy;
	}

	/**
	 * This method initializes jScrollPane3	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane3() {
		if (jScrollPane3 == null) {
			jScrollPane3 = new JScrollPane();
			jScrollPane3.setViewportView(getJTableManagevacancy());
		}
		return jScrollPane3;
	}

	/**
	 * This method initializes jTableManagevacancy	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getJTableManagevacancy() {
		if (jTableManagevacancy == null) {
			jTableManagevacancy = new JTable();
		}
		return jTableManagevacancy;
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
			btnExit.setLocation(new Point(578, 551));
		}
		return btnExit;
	}

}  //  @jve:decl-index=0:visual-constraint="-2,10"
