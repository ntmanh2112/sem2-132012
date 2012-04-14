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

import model.DepartmentsModel;
import model.EmployeeModel;
import model.Job_rotationModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import dao.DepartmentsDAO;
import dao.EmployeeDAO;
import dao.Job_RotationDAO;

import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

import util.DataUtil;

import Common.Constants;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.Color;

public class viewJobRotation extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JScrollPane jScrollPane = null;
	private JTable jTableViewemployee = null;
	private JButton btnAdd = null;
	private JButton btnEdit = null;
	private JButton btnDelete = null;
	private JPanel jPanel = null;
	private JLabel jLabel1 = null;
	private JTextField txtEmpid = null;
	private JLabel jLabel2 = null;
	private JTextField txtEmpname = null;
	private JLabel jLabel3 = null;
	private JTextField txtDeptid = null;
	private JButton btnSearch = null;
	private String[] ColumnName ={"EmID","Present_Designation","Deputed_To","Creation_Date","Status","Remarks"};
	private String[][] tableData;
	private JButton btnPrint = null;
	/**
	 * This is the default constructor
	 */
	public viewJobRotation() {
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
		this.setResizable(false);
		this.setLocation((wndSize.width-807)/2, (wndSize.height-461)/2);
		this.setSize(807, 461);
		this.setContentPane(getJContentPane());
		this.setTitle("FrmViewEmp");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(299, 18, 185, 47));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 24));
			jLabel.setForeground(Color.red);
			jLabel.setText("View Employee");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
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
			jScrollPane.setBounds(new Rectangle(32, 84, 739, 191));
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
		loadDataToTable();
		if (jTableViewemployee == null) {
			jTableViewemployee = new JTable(tableData, ColumnName);
		}
		return jTableViewemployee;
	}
	private void loadDataToTable(){
		ArrayList<Job_rotationModel> listrotation = Job_RotationDAO.getAllJobrotation();
		tableData = new String[listrotation.size()][6];
		int row = 0;
		for (Job_rotationModel model:listrotation){
		//tableData [row][0] = model.getID();
		tableData [row][0] = model.getEm_ID();
		//tableData [row][2] = model.getPassword();
		tableData [row][1] = model.getPresent_Designation();
		tableData [row][2] = model.getDeputed_To();
		
		tableData [row][3] = model.getCreation_Date();
		tableData [row][4] = model.getStatus();
		tableData [row][5] = model.getRemarks();
		
		
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
			btnAdd.setText("Add Employee");
			btnAdd.setSize(new Dimension(150, 35));
			btnAdd.setIcon(new ImageIcon(getClass().getResource("/images/add-2-icon.png")));
			btnAdd.setLocation(new Point(60, 295));
			btnAdd.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
					(new EmployeeRegistration()).setVisible(true);
					hide();
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
			btnEdit.setText("Update Employee");
			btnEdit.setSize(new Dimension(158, 35));
			btnEdit.setIcon(new ImageIcon(getClass().getResource("/images/Update.png")));
			btnEdit.setMnemonic(KeyEvent.VK_UNDEFINED);
			btnEdit.setLocation(new Point(233, 295));
			btnEdit.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					int row = jTableViewemployee.getSelectedRow();
					if(row== -1){
						JOptionPane.showMessageDialog(null, "You not choose to edit the line","Notice",JOptionPane.ERROR_MESSAGE);
						return;
					}
					int column = 0;
					String manvduocluachon = jTableViewemployee.getValueAt(row, column).toString();
					EmployeeModel model = new EmployeeModel();
					model.setEmID(manvduocluachon);
					(new UpdateEmployee(model)).setVisible(true);
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
			btnDelete.setText("Delete Employee");
			btnDelete.setSize(new Dimension(150, 35));
			btnDelete.setIcon(new ImageIcon(getClass().getResource("/images/Delete.png")));
			btnDelete.setMnemonic(KeyEvent.VK_UNDEFINED);
			btnDelete.setLocation(new Point(416, 295));
			btnDelete.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					System.out.println("actionPerformed()"); // TODO Auto-generated Event stub actionPerformed()
					EmployeeModel mo = new EmployeeModel();
					int row = jTableViewemployee.getSelectedRow();
					if(row== -1){
						JOptionPane.showMessageDialog(null, "You not choose to delete the line","Notice",JOptionPane.ERROR_MESSAGE);
						return;
					}
					int column = 0;
					String manvduocluachon = jTableViewemployee.getValueAt(row, column).toString();
					mo.setEmID(manvduocluachon);
					int yn = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete","Notice",JOptionPane.OK_CANCEL_OPTION);
					if(yn == 0){
						Boolean kq = EmployeeDAO.deleteEmployee(mo);
						if(kq){
							loadDataToTable();
							jTableViewemployee.setModel(new DefaultTableModel(tableData,ColumnName));
							JOptionPane.showMessageDialog(null, "Delete success","Notice",JOptionPane.INFORMATION_MESSAGE);
							
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
			jLabel3 = new JLabel();
			jLabel3.setText("DesID :");
			jLabel3.setLocation(new Point(351, 17));
			jLabel3.setSize(new Dimension(50, 25));
			jLabel2 = new JLabel();
			jLabel2.setText("Name :");
			jLabel2.setSize(new Dimension(50, 25));
			jLabel2.setLocation(new Point(179, 17));
			jLabel1 = new JLabel();
			jLabel1.setText("EmpID :");
			jLabel1.setSize(new Dimension(46, 25));
			jLabel1.setLocation(new Point(9, 17));
			jPanel = new JPanel();
			jPanel.setLayout(null);
			jPanel.setLocation(new Point(59, 347));
			jPanel.setSize(new Dimension(649, 59));
			jPanel.add(jLabel1, null);
			jPanel.add(getTxtEmpid(), null);
			jPanel.add(jLabel2, null);
			jPanel.add(getTxtEmpname(), null);
			jPanel.add(jLabel3, null);
			jPanel.add(getTxtDeptid(), null);
			jPanel.add(getBtnSearch(), null);
		    jPanel.setBorder(BorderFactory.createEtchedBorder());
		}
		return jPanel;
	}

	/**
	 * This method initializes txtEmpid	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtEmpid() {
		if (txtEmpid == null) {
			txtEmpid = new JTextField();
			txtEmpid.setLocation(new Point(70, 17));
			txtEmpid.setSize(new Dimension(90, 25));
		}
		return txtEmpid;
	}

	/**
	 * This method initializes txtEmpname	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtEmpname() {
		if (txtEmpname == null) {
			txtEmpname = new JTextField();
			txtEmpname.setLocation(new Point(241, 17));
			txtEmpname.setSize(new Dimension(90, 25));
		}
		return txtEmpname;
	}

	/**
	 * This method initializes txtDeptid	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtDeptid() {
		if (txtDeptid == null) {
			txtDeptid = new JTextField();
			txtDeptid.setLocation(new Point(415, 17));
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
			btnSearch.setSize(new Dimension(106, 25));
			btnSearch.setIcon(new ImageIcon(getClass().getResource("/images/View.gif")));
			btnSearch.setLocation(new Point(524, 17));
			btnSearch.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					loadDataToTableWhenSearch();
					jTableViewemployee.setModel(new DefaultTableModel(tableData, ColumnName));
				}
			});
		}
		return btnSearch;
	}
	public void loadDataToTableWhenSearch (){
		String EmID = txtEmpid.getText();
		String Name = txtEmpname.getText();
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

	/**
	 * This method initializes btnPrint	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnPrint() {
		if (btnPrint == null) {
			btnPrint = new JButton();
			btnPrint.setText("Print");
			btnPrint.setSize(new Dimension(150, 35));
			btnPrint.setIcon(new ImageIcon(getClass().getResource("/images/Print.png")));
			btnPrint.setLocation(new Point(590, 295));
			btnPrint.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.out.println("actionPerformed()"); // TODO Auto-generated Event stub actionPerformed()
					Map parameters = new HashMap();
					parameters.put("EmID", txtEmpid.getText().trim());
					parameters.put("Name", txtEmpname.getText().trim());
					parameters.put("Des_ID", txtDeptid.getText().trim());
					
					try {
						JasperDesign jasperDesign = JRXmlLoader.load("src/report/reportEmployee.jrxml");
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