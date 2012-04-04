package view;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JTabbedPane;
import java.awt.Rectangle;
import java.awt.GridBagLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

import model.EmployeeModel;
import dao.EmployeeDAO;

import java.awt.Point;
import java.util.ArrayList;

public class Admin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JTabbedPane jpnViewemployee = null;
	private JPanel jpnAdmin = null;
	private JScrollPane jScrollPane = null;
	private JTable jTableViewemployee = null;
	private JPanel jpnViewlayer = null;
	private JScrollPane jScrollPane1 = null;
	private JTable jTableViewlayer = null;
	private JPanel jpnViewdepartment = null;
	private JScrollPane jScrollPane2 = null;
	private JTable jTableViewdepartment = null;
	private JPanel jpnViewsection = null;
	private JScrollPane jScrollPane3 = null;
	private JTable jTableViewsection = null;
	private JPanel jpnViewaccount = null;
	private JScrollPane jScrollPane4 = null;
	private JTable jTableViewaccount = null;
	private JLabel jLabel = null;
	private JButton btnExit = null;
	private String[] ColumnName ={"ID","Name","Dep_ID","Des_ID","Sec_ID","Address","Phone","Fax","Email"};
	private String[][] tableData;

	/**
	 * This is the default constructor
	 */
	public Admin() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(876, 564);
		this.setContentPane(getJContentPane());
		this.setTitle("FrmAdmin");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(246, 19, 235, 45));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 24));
			jLabel.setText("Admin Management");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.setFont(new Font("Dialog", Font.PLAIN, 12));
			jContentPane.add(getJpnViewemployee(), null);
			jContentPane.add(jLabel, null);
			jContentPane.add(getBtnExit(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jpnViewemployee	
	 * 	
	 * @return javax.swing.JTabbedPane	
	 */
	private JTabbedPane getJpnViewemployee() {
		if (jpnViewemployee == null) {
			jpnViewemployee = new JTabbedPane();
			jpnViewemployee.setBounds(new Rectangle(17, 122, 825, 242));
			jpnViewemployee.addTab("Employee List", null, getJpnAdmin(), null);
			jpnViewemployee.addTab("Layer List", null, getJpnViewlayer(), null);
			jpnViewemployee.addTab("Department List", null, getJpnViewdepartment(), null);
			jpnViewemployee.addTab("Section List", null, getJpnViewsection(), null);
			jpnViewemployee.addTab("View Account", null, getJpnViewaccount(), null);
		}
		return jpnViewemployee;
	}

	/**
	 * This method initializes jpnAdmin	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJpnAdmin() {
		if (jpnAdmin == null) {
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			gridBagConstraints.fill = GridBagConstraints.BOTH;
			gridBagConstraints.gridy = 0;
			gridBagConstraints.weightx = 1.0;
			gridBagConstraints.weighty = 1.0;
			gridBagConstraints.gridx = 0;
			jpnAdmin = new JPanel();
			jpnAdmin.setLayout(new GridBagLayout());
			jpnAdmin.add(getJScrollPane(), gridBagConstraints);
		}
		return jpnAdmin;
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
		//loadDataToTable();
		if (jTableViewemployee == null) {
			jTableViewemployee = new JTable();
		}
		return jTableViewemployee;
	}
	private void loadDataToTable(){
		ArrayList<EmployeeModel> listEmployee = EmployeeDAO.getAllEmployee();
		tableData = new String[listEmployee.size()][8];
		int row = 0;
		for (EmployeeModel model:listEmployee){
		tableData [row][0] = model.getEmID();
		tableData [row][1] = model.getName();
		tableData [row][2] = model.getDep_ID();
		tableData [row][3] = model.getDes_ID();
		
		tableData [row][4] = model.getAddress();
		tableData [row][5] = model.getPhone();
		tableData [row][6] = model.getFax();
		tableData [row][7] = model.getEmail();
		row++;
		}
		}

	/**
	 * This method initializes jpnViewlayer	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJpnViewlayer() {
		if (jpnViewlayer == null) {
			GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
			gridBagConstraints1.fill = GridBagConstraints.BOTH;
			gridBagConstraints1.gridy = 0;
			gridBagConstraints1.weightx = 1.0;
			gridBagConstraints1.weighty = 1.0;
			gridBagConstraints1.gridx = 0;
			jpnViewlayer = new JPanel();
			jpnViewlayer.setLayout(new GridBagLayout());
			jpnViewlayer.add(getJScrollPane1(), gridBagConstraints1);
		}
		return jpnViewlayer;
	}

	/**
	 * This method initializes jScrollPane1	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane1() {
		if (jScrollPane1 == null) {
			jScrollPane1 = new JScrollPane();
			jScrollPane1.setViewportView(getJTableViewlayer());
		}
		return jScrollPane1;
	}

	/**
	 * This method initializes jTableViewlayer	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getJTableViewlayer() {
		if (jTableViewlayer == null) {
			jTableViewlayer = new JTable();
		}
		return jTableViewlayer;
	}

	/**
	 * This method initializes jpnViewdepartment	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJpnViewdepartment() {
		if (jpnViewdepartment == null) {
			GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
			gridBagConstraints2.fill = GridBagConstraints.BOTH;
			gridBagConstraints2.gridy = 0;
			gridBagConstraints2.weightx = 1.0;
			gridBagConstraints2.weighty = 1.0;
			gridBagConstraints2.gridx = 0;
			jpnViewdepartment = new JPanel();
			jpnViewdepartment.setLayout(new GridBagLayout());
			jpnViewdepartment.add(getJScrollPane2(), gridBagConstraints2);
		}
		return jpnViewdepartment;
	}

	/**
	 * This method initializes jScrollPane2	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane2() {
		if (jScrollPane2 == null) {
			jScrollPane2 = new JScrollPane();
			jScrollPane2.setViewportView(getJTableViewdepartment());
		}
		return jScrollPane2;
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
	 * This method initializes jpnViewsection	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJpnViewsection() {
		if (jpnViewsection == null) {
			GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
			gridBagConstraints3.fill = GridBagConstraints.BOTH;
			gridBagConstraints3.gridy = 0;
			gridBagConstraints3.weightx = 1.0;
			gridBagConstraints3.weighty = 1.0;
			gridBagConstraints3.gridx = 0;
			jpnViewsection = new JPanel();
			jpnViewsection.setLayout(new GridBagLayout());
			jpnViewsection.add(getJScrollPane3(), gridBagConstraints3);
		}
		return jpnViewsection;
	}

	/**
	 * This method initializes jScrollPane3	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane3() {
		if (jScrollPane3 == null) {
			jScrollPane3 = new JScrollPane();
			jScrollPane3.setViewportView(getJTableViewsection());
		}
		return jScrollPane3;
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
	 * This method initializes jpnViewaccount	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJpnViewaccount() {
		if (jpnViewaccount == null) {
			GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
			gridBagConstraints4.fill = GridBagConstraints.BOTH;
			gridBagConstraints4.gridy = 0;
			gridBagConstraints4.weightx = 1.0;
			gridBagConstraints4.weighty = 1.0;
			gridBagConstraints4.gridx = 0;
			jpnViewaccount = new JPanel();
			jpnViewaccount.setLayout(new GridBagLayout());
			jpnViewaccount.add(getJScrollPane4(), gridBagConstraints4);
		}
		return jpnViewaccount;
	}

	/**
	 * This method initializes jScrollPane4	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane4() {
		if (jScrollPane4 == null) {
			jScrollPane4 = new JScrollPane();
			jScrollPane4.setViewportView(getJTableViewaccount());
		}
		return jScrollPane4;
	}

	/**
	 * This method initializes jTableViewaccount	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getJTableViewaccount() {
		if (jTableViewaccount == null) {
			jTableViewaccount = new JTable();
		}
		return jTableViewaccount;
	}

	/**
	 * This method initializes btnExit	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnExit() {
		if (btnExit == null) {
			btnExit = new JButton();
			btnExit.setLocation(new Point(363, 485));
			btnExit.setText("Exit");
			btnExit.setSize(new Dimension(90, 30));
		}
		return btnExit;
	}

}  //  @jve:decl-index=0:visual-constraint="4,10"
