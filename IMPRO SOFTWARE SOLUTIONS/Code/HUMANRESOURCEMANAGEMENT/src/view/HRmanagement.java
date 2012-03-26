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

public class HRmanagement extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JTabbedPane jtbHRmanagement = null;
	private JPanel jpnViewemployee = null;
	private JScrollPane jScrollPane = null;
	private JTable jTableViewemployee = null;
	private JPanel jpnProcessvacancy = null;
	private JScrollPane jScrollPane1 = null;
	private JTable jTableProcessvacancy = null;
	private JPanel jpnViewsection = null;
	private JScrollPane jScrollPane2 = null;
	private JTable jTableViewsection = null;
	private JPanel jpnViewdepartment = null;
	private JScrollPane jScrollPane3 = null;
	private JTable jTableViewdepartment = null;
	private JPanel jpnRotateemployee = null;
	private JScrollPane jScrollPane4 = null;
	private JTable jTableRotateemployee = null;
	private JPanel jpnViewreport = null;
	private JButton btnExit = null;
	/**
	 * This is the default constructor
	 */
	public HRmanagement() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		
		this.setSize(new Dimension(1280, 614));
		this.setContentPane(getJContentPane());
		this.setTitle("FrmHRM");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(536, 23, 196, 53));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 24));
			jLabel.setText("HR Management");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(jLabel, null);
			jContentPane.add(getJtbHRmanagement(), null);
			jContentPane.add(getBtnExit(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jtbHRmanagement	
	 * 	
	 * @return javax.swing.JTabbedPane	
	 */
	private JTabbedPane getJtbHRmanagement() {
		if (jtbHRmanagement == null) {
			jtbHRmanagement = new JTabbedPane();
			jtbHRmanagement.setBounds(new Rectangle(15, 112, 1230,400));
			jtbHRmanagement.addTab("View Employee", null, getJpnViewemployee(), null);
			jtbHRmanagement.addTab("Process Vacancy", null, getJpnProcessvacancy(), null);
			jtbHRmanagement.addTab("View Section", null, getJpnViewsection(), null);
			jtbHRmanagement.addTab("View Department", null, getJpnViewdepartment(), null);
			jtbHRmanagement.addTab("Rotate Employee", null, getJpnRotateemployee(), null);
			jtbHRmanagement.addTab("View Report", null, getJpnViewreport(), null);
		}
		return jtbHRmanagement;
	}

	/**
	 * This method initializes jpnViewemployee	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJpnViewemployee() {
		if (jpnViewemployee == null) {
			GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
			gridBagConstraints1.fill = GridBagConstraints.BOTH;
			gridBagConstraints1.gridy = 0;
			gridBagConstraints1.weightx = 1.0;
			gridBagConstraints1.weighty = 1.0;
			gridBagConstraints1.gridx = 0;
			jpnViewemployee = new JPanel();
			jpnViewemployee.setLayout(new GridBagLayout());
			jpnViewemployee.add(getJScrollPane(), gridBagConstraints1);
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
	 * This method initializes jpnProcessvacancy	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJpnProcessvacancy() {
		if (jpnProcessvacancy == null) {
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			gridBagConstraints.fill = GridBagConstraints.BOTH;
			gridBagConstraints.gridy = 0;
			gridBagConstraints.weightx = 1.0;
			gridBagConstraints.weighty = 1.0;
			gridBagConstraints.gridx = 0;
			jpnProcessvacancy = new JPanel();
			jpnProcessvacancy.setLayout(new GridBagLayout());
			jpnProcessvacancy.add(getJScrollPane1(), gridBagConstraints);
		}
		return jpnProcessvacancy;
	}

	/**
	 * This method initializes jScrollPane1	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane1() {
		if (jScrollPane1 == null) {
			jScrollPane1 = new JScrollPane();
			jScrollPane1.setViewportView(getJTableProcessvacancy());
		}
		return jScrollPane1;
	}

	/**
	 * This method initializes jTableProcessvacancy	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getJTableProcessvacancy() {
		if (jTableProcessvacancy == null) {
			jTableProcessvacancy = new JTable();
		}
		return jTableProcessvacancy;
	}

	/**
	 * This method initializes jpnViewsection	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJpnViewsection() {
		if (jpnViewsection == null) {
			GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
			gridBagConstraints2.fill = GridBagConstraints.BOTH;
			gridBagConstraints2.gridy = 0;
			gridBagConstraints2.weightx = 1.0;
			gridBagConstraints2.weighty = 1.0;
			gridBagConstraints2.gridx = 0;
			jpnViewsection = new JPanel();
			jpnViewsection.setLayout(new GridBagLayout());
			jpnViewsection.add(getJScrollPane2(), gridBagConstraints2);
		}
		return jpnViewsection;
	}

	/**
	 * This method initializes jScrollPane2	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane2() {
		if (jScrollPane2 == null) {
			jScrollPane2 = new JScrollPane();
			jScrollPane2.setViewportView(getJTableViewsection());
		}
		return jScrollPane2;
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
	 * This method initializes jpnViewdepartment	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJpnViewdepartment() {
		if (jpnViewdepartment == null) {
			GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
			gridBagConstraints3.fill = GridBagConstraints.BOTH;
			gridBagConstraints3.gridy = 0;
			gridBagConstraints3.weightx = 1.0;
			gridBagConstraints3.weighty = 1.0;
			gridBagConstraints3.gridx = 0;
			jpnViewdepartment = new JPanel();
			jpnViewdepartment.setLayout(new GridBagLayout());
			jpnViewdepartment.add(getJScrollPane3(), gridBagConstraints3);
		}
		return jpnViewdepartment;
	}

	/**
	 * This method initializes jScrollPane3	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane3() {
		if (jScrollPane3 == null) {
			jScrollPane3 = new JScrollPane();
			jScrollPane3.setViewportView(getJTableViewdepartment());
		}
		return jScrollPane3;
	}

	/**
	 * This method initializes jTableViewdepartment	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getJTableViewdepartment() {
		if (jTableViewdepartment == null) {
			jTableViewdepartment = new JTable();
		}
		return jTableViewdepartment;
	}

	/**
	 * This method initializes jpnRotateemployee	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJpnRotateemployee() {
		if (jpnRotateemployee == null) {
			GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
			gridBagConstraints4.fill = GridBagConstraints.BOTH;
			gridBagConstraints4.gridy = 0;
			gridBagConstraints4.weightx = 1.0;
			gridBagConstraints4.weighty = 1.0;
			gridBagConstraints4.gridx = 0;
			jpnRotateemployee = new JPanel();
			jpnRotateemployee.setLayout(new GridBagLayout());
			jpnRotateemployee.add(getJScrollPane4(), gridBagConstraints4);
		}
		return jpnRotateemployee;
	}

	/**
	 * This method initializes jScrollPane4	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane4() {
		if (jScrollPane4 == null) {
			jScrollPane4 = new JScrollPane();
			jScrollPane4.setViewportView(getJTableRotateemployee());
		}
		return jScrollPane4;
	}

	/**
	 * This method initializes jTableRotateemployee	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getJTableRotateemployee() {
		if (jTableRotateemployee == null) {
			jTableRotateemployee = new JTable();
		}
		return jTableRotateemployee;
	}

	/**
	 * This method initializes jpnViewreport	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJpnViewreport() {
		if (jpnViewreport == null) {
			jpnViewreport = new JPanel();
			jpnViewreport.setLayout(new GridBagLayout());
		}
		return jpnViewreport;
	}

	/**
	 * This method initializes btnExit	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnExit() {
		if (btnExit == null) {
			btnExit = new JButton();
			btnExit.setLocation(new Point(615, 526));
			btnExit.setText("Exit");
			btnExit.setSize(new Dimension(90, 30));
		}
		return btnExit;
	}

}  //  @jve:decl-index=0:visual-constraint="13,16"
