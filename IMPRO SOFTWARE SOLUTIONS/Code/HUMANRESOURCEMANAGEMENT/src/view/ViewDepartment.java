package view;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Rectangle;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.Point;
import java.awt.GridBagLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JTextField;

import dao.DepartmentsDAO;
import dao.EmployeeDAO;

import model.DepartmentsModel;
import model.EmployeeModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

import util.DataUtil;

import Common.Constants;

import java.awt.Color;

public class ViewDepartment extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JScrollPane jScrollPane = null;
	private JTable jTableViewdepartment = null;
	private JButton btnAdd = null;
	private JButton btnEdit = null;
	private JButton btnDelete = null;
	private JPanel jPanel = null;
	private JLabel jLabel1 = null;
	private JTextField txtDeptid = null;
	private JLabel jLabel2 = null;
	private JTextField txtDeptname = null;
	private JButton btnSearch = null;
	private String[] ColumnName ={"ID","Name","Dep_Head","Location","Up_Dep_No","Dn_Dep_No"};
	private String[][] tableData;
	private JButton btnPrint = null;
	/**
	 * This is the default constructor
	 */
	public ViewDepartment() {
		super();
		initialize();
		//this.setVisible(true);
		if (Constants.userLogin.getDesignationID().equals("D201")) {
			btnAdd.setEnabled(false);
			btnEdit.setEnabled(false);
			btnDelete.setEnabled(false);
		}
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		Toolkit theKit = this.getToolkit();   
		Dimension wndSize = theKit.getScreenSize();
		this.setResizable(false);
		this.setLocation((wndSize.width-803)/2, (wndSize.height-516)/2);
		this.setSize(803, 516);
		this.setContentPane(getJContentPane());
		this.setTitle("FrmViewDept");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(282, 18, 202, 47));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 24));
			jLabel.setForeground(Color.red);
			jLabel.setText("View Department");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.setBackground(new Color(238, 238, 238));
			jContentPane.add(jLabel, null);
			jContentPane.add(getJScrollPane(), null);
			jContentPane.add(getBtnAdd(), null);
			jContentPane.add(getBtnEdit(), null);
			jContentPane.add(getBtnDelete(), null);
			jContentPane.add(getJPanel(), null);
			jContentPane.add(getBtnPrint(), null);
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
			jScrollPane.setViewportView(getJTableViewdepartment());
		}
		return jScrollPane;
	}

	/**
	 * This method initializes jTableViewdepartment	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getJTableViewdepartment() {
		loadDataToTable();
		if (jTableViewdepartment == null) {
			jTableViewdepartment = new JTable(tableData, ColumnName);
		}
		return jTableViewdepartment;
	}
	private void loadDataToTable(){
		ArrayList<DepartmentsModel> listDepartments = DepartmentsDAO.getAllDepartments();
		tableData = new String[listDepartments.size()][6];
		int row = 0;
		for (DepartmentsModel model:listDepartments){
		tableData [row][0] = model.getDep_ID();
		tableData [row][1] = model.getDep_Name();
		tableData [row][2] = model.getDep_Head();
		tableData [row][3] = model.getLocation();
		tableData [row][4] = model.getUp_Dep_No();
		tableData [row][5] = model.getDn_Dep_No();
		row++;
		}
		}

	/**
	 * This method initializes btnAdd	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnAdd() {
		if (btnAdd == null) {
			btnAdd = new JButton();
			btnAdd.setText("Add Department");
			btnAdd.setSize(new Dimension(153, 40));
			btnAdd.setIcon(new ImageIcon(getClass().getResource("/images/Create.png")));
			btnAdd.setLocation(new Point(29, 293));
			btnAdd.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					(new DepartmentRegistration()).setVisible(true);
					dispose();
				}
			});
		}
		return btnAdd;
	}

	/**
	 * This method initializes btnEdit	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnEdit() {
		if (btnEdit == null) {
			btnEdit = new JButton();
			btnEdit.setText("Update Department");
			btnEdit.setSize(new Dimension(170, 40));
			btnEdit.setIcon(new ImageIcon(getClass().getResource("/images/Update.png")));
			btnEdit.setLocation(new Point(213, 292));
			btnEdit.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					int row = jTableViewdepartment.getSelectedRow();
					if(row== -1){
						JOptionPane.showMessageDialog(null, "You not choose to edit the line","Notice",JOptionPane.ERROR_MESSAGE);
						return;
					}
					int column = 0;
					String manvduocluachon = jTableViewdepartment.getValueAt(row, column).toString();
					DepartmentsModel model = new DepartmentsModel();
					model.setDep_ID(manvduocluachon);
					(new UpdateDepartment(model)).setVisible(true);
					dispose();
				}
			});
		}
		return btnEdit;
	}

	/**
	 * This method initializes btnDelete	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnDelete() {
		if (btnDelete == null) {
			btnDelete = new JButton();
			btnDelete.setText("Delete Department");
			btnDelete.setSize(new Dimension(166, 40));
			btnDelete.setIcon(new ImageIcon(getClass().getResource("/images/Delete.png")));
			btnDelete.setMnemonic(KeyEvent.VK_UNDEFINED);
			btnDelete.setLocation(new Point(419, 293));
			btnDelete.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					System.out.println("actionPerformed()"); // TODO Auto-generated Event stub actionPerformed()
					DepartmentsModel mo = new DepartmentsModel();
					int row = jTableViewdepartment.getSelectedRow();
					if(row== -1){
						JOptionPane.showMessageDialog(null, "You not choose to delete the line","Notice",JOptionPane.ERROR_MESSAGE);
						return;
					}
					int column = 0;
					String manvduocluachon = jTableViewdepartment.getValueAt(row, column).toString();
					mo.setDep_ID(manvduocluachon);
					int yn = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete","Notice",JOptionPane.OK_CANCEL_OPTION);
					if(yn == 0){
						Boolean kq = DepartmentsDAO.deleteDepartments(mo);
						if(kq){
							loadDataToTable();
							jTableViewdepartment.setModel(new DefaultTableModel(tableData,ColumnName));
							JOptionPane.showMessageDialog(null, "Delete Success","Notice",JOptionPane.INFORMATION_MESSAGE);
							
						}else {
							JOptionPane.showMessageDialog(null, "Delete failed","Notice",JOptionPane.WARNING_MESSAGE);
					
						}
					}
				}
			});
		}
		return btnDelete;
	}

	/**
	 * This method initializes jPanel	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel() {
		if (jPanel == null) {
			jLabel2 = new JLabel();
			jLabel2.setText("DeptName :");
			jLabel2.setSize(new Dimension(70, 25));
			jLabel2.setLocation(new Point(177, 17));
			jLabel1 = new JLabel();
			jLabel1.setText("DeptID :");
			jLabel1.setSize(new Dimension(47, 25));
			jLabel1.setLocation(new Point(9, 17));
			jPanel = new JPanel();
			jPanel.setLayout(null);
			jPanel.setLocation(new Point(53, 357));
			jPanel.setSize(new Dimension(526, 58));
			jPanel.add(jLabel1, null);
			jPanel.add(getTxtDeptid(), null);
			jPanel.add(jLabel2, null);
			jPanel.add(getTxtDeptname(), null);
			jPanel.add(getBtnSearch(), null);
		    jPanel.setBorder(BorderFactory.createEtchedBorder());
		}
		return jPanel;
	}

	/**
	 * This method initializes txtDeptid	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtDeptid() {
		if (txtDeptid == null) {
			txtDeptid = new JTextField();
			txtDeptid.setLocation(new Point(68, 17));
			txtDeptid.setSize(new Dimension(90, 25));
		}
		return txtDeptid;
	}

	/**
	 * This method initializes txtDeptname	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtDeptname() {
		if (txtDeptname == null) {
			txtDeptname = new JTextField();
			txtDeptname.setLocation(new Point(253, 17));
			txtDeptname.setSize(new Dimension(90, 25));
		}
		return txtDeptname;
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
			btnSearch.setLocation(new Point(394, 16));
			btnSearch.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					loadDataToTableWhenSearch();
					jTableViewdepartment.setModel(new DefaultTableModel(tableData, ColumnName));
				}
			});
		}
		return btnSearch;
	}
	public void loadDataToTableWhenSearch (){
		String Dep_ID = txtDeptid.getText();
		String Dep_Name = txtDeptname.getText();
		
		
		
		ArrayList<DepartmentsModel> listDepartment = DepartmentsDAO.searchDepartments(Dep_ID, Dep_Name);
		tableData = new String [listDepartment.size()][6];
		int row = 0;
		for(DepartmentsModel model : listDepartment) {
			tableData [row][0] = model.getDep_ID();
			tableData [row][1] = model.getDep_Name();
			tableData [row][2] = model.getDep_Head();
			tableData [row][3] = model.getLocation();
			tableData [row][4] = model.getUp_Dep_No();
			tableData [row][5] = model.getDn_Dep_No();
			
			
			row ++;
		}
	}

	/**
	 * This method initializes btnPrint	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnPrint() {
		if (btnPrint == null) {
			btnPrint = new JButton();
			btnPrint.setText("Print");
			btnPrint.setSize(new Dimension(143, 40));
			btnPrint.setIcon(new ImageIcon(getClass().getResource("/images/Print.png")));
			btnPrint.setLocation(new Point(616, 293));
			btnPrint.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.out.println("actionPerformed()"); // TODO Auto-generated Event stub actionPerformed()
					Map parameters = new HashMap();
					parameters.put("Dep_ID", txtDeptid.getText().trim());
					parameters.put("Dep_Name", txtDeptname.getText().trim());
					
					
					try {
						JasperDesign jasperDesign = JRXmlLoader.load("src/report/reportDepartment.jrxml");
						JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
						JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, DataUtil.getConnection());
						JasperViewer.viewReport(jasperPrint,false);
					} catch (JRException a) {
						// TODO Auto-generated catch block
						a.printStackTrace();
					}
				}
			});
		}
		return btnPrint;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
