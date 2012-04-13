package view;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Rectangle;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.Point;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.Color;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.BorderFactory;
import javax.swing.border.EtchedBorder;
import javax.swing.table.DefaultTableModel;

import Common.Constants;

import model.DesignationModel;
import model.EmployeeModel;
import dao.DesignationDAO;
import dao.EmployeeDAO;

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
	private String[] ColumnName ={"EmID","Name","SecID","Des_ID","Address","Phone","Fax","Email"};
	private String[][] tableData;

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
		Toolkit theKit = this.getToolkit();   
		Dimension wndSize = theKit.getScreenSize();
		this.setLocation((wndSize.width-846)/2, (wndSize.height-455)/2);
		//Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		this.setResizable(false);
		this.setSize(846, 455);
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
			jLabel.setBounds(new Rectangle(280, 15, 264, 48));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 24));
			jLabel.setForeground(Color.red);
			jLabel.setText("Employee Information ");
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
			jScrollPane.setBounds(new Rectangle(10, 83, 818, 161));
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
		loadDataToTable();
		if (jTableInformation == null) {
			jTableInformation = new JTable(tableData,ColumnName);
		}
		return jTableInformation;
	}
	private void loadDataToTable(){
		ArrayList<EmployeeModel> listemployee = EmployeeDAO.getAllEmployee();
		tableData = new String[listemployee.size()][8];
		int row = 0;
		for (EmployeeModel model:listemployee){
			tableData [row][0] = model.getEmID();
			tableData [row][1] = model.getName();
			//tableData [row][2] = model.getPassword();
			tableData [row][2] = model.getSecID();
			tableData [row][3] = model.getDes_ID();
			tableData [row][4] = model.getAddress();
			tableData [row][5] = model.getPhone();
			tableData [row][6] = model.getFax();
			tableData [row][7] = model.getEmail();
		
		row++;
		}
		}

	/**
	 * This method initializes btnUpdate	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnUpdate() {
		if (btnUpdate == null) {
			btnUpdate = new JButton();
			btnUpdate.setText("Edit");
			btnUpdate.setSize(new Dimension(111, 44));
			btnUpdate.setIcon(new ImageIcon(getClass().getResource("/images/Edit Profile.png")));
			btnUpdate.setLocation(new Point(185, 331));
			btnUpdate.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.out.println("actionPerformed()"); // TODO Auto-generated Event stub actionPerformed()
					int row = jTableInformation.getSelectedRow();
					if(row== -1){
						JOptionPane.showMessageDialog(null, "You not choose to edit the line","Notice",JOptionPane.ERROR_MESSAGE);
						return;
					}
					
					int column = 0;
					String manvduocluachon = jTableInformation.getValueAt(row, column).toString();
					EmployeeModel model = new EmployeeModel();
					model.setEmID(manvduocluachon);
					//(new UpdateInformation(model)).setVisible(true);
					//dispose();
					if (!model.getEmID().equals(Constants.userLogin.getEmID())) {
						//txtpassword.setEnabled(false);
						JOptionPane.showMessageDialog(null, "You can not edit other information","Notice",JOptionPane.ERROR_MESSAGE);
						//(new InformationEmployee()).setVisible(true);
						//dispose();
					}else{
						(new UpdateInformation(model)).setVisible(true);
						dispose();
					}
				}
				
			});
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
			btnExit.setSize(new Dimension(98, 43));
			btnExit.setIcon(new ImageIcon(getClass().getResource("/images/Exit.png")));
			btnExit.setLocation(new Point(517, 331));
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
			jLabel3.setText("DesID :");
			jLabel3.setLocation(new Point(419, 14));
			jLabel3.setSize(new Dimension(48, 25));
			jLabel2 = new JLabel();
			jLabel2.setText("Name :");
			jLabel2.setSize(new Dimension(49, 25));
			jLabel2.setLocation(new Point(222, 14));
			jLabel1 = new JLabel();
			jLabel1.setText("EmID :");
			jLabel1.setSize(new Dimension(42, 25));
			jLabel1.setLocation(new Point(6, 14));
			jPanel = new JPanel();
			jPanel.setLayout(null);
			jPanel.setBounds(new Rectangle(11, 254, 812, 55));
			jPanel.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
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
			txtEmid.setLocation(new Point(79, 14));
			txtEmid.setSize(new Dimension(90, 25));
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
			txtName.setSize(new Dimension(90, 25));
			txtName.setLocation(new Point(296, 13));
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
			txtDeptid.setLocation(new Point(480, 15));
			txtDeptid.setSize(new Dimension(90, 25));
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
			btnSearch.setSize(new Dimension(96, 25));
			btnSearch.setIcon(new ImageIcon(getClass().getResource("/images/View.gif")));
			btnSearch.setLocation(new Point(610, 14));
			btnSearch.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.out.println("actionPerformed()"); // TODO Auto-generated Event stub actionPerformed()
					loadDataToTableWhenSearch();
					jTableInformation.setModel(new DefaultTableModel(tableData, ColumnName));
				}
			});
		}
		return btnSearch;
	}
	public void loadDataToTableWhenSearch (){
		String EmID = txtEmid.getText();
		String Name = txtName.getText();
		String DesID = txtDeptid.getText();
		ArrayList<EmployeeModel> listEmployee = EmployeeDAO.searchEmployee(EmID, Name, DesID);
		tableData = new String [listEmployee.size()][8];
		int row = 0;
		for(EmployeeModel model : listEmployee) {
			tableData [row][0] = model.getEmID();
			tableData [row][1] = model.getName();
			tableData [row][2] = model.getSecID();
			tableData [row][3] = model.getDes_ID();
			
			tableData [row][4] = model.getAddress();
			tableData [row][5] = model.getPhone();
			tableData [row][6] = model.getFax();
			tableData [row][7] = model.getEmail();
			
			row ++;
		}
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
