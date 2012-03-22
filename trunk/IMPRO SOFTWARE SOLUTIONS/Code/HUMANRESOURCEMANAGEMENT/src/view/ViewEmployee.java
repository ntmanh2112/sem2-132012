package view;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JLabel;
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

import model.DepartmentsModel;
import model.EmployeeModel;
import dao.DepartmentsDAO;
import dao.EmployeeDAO;
import javax.swing.ImageIcon;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.Color;

public class ViewEmployee extends JFrame {

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
	private String[] ColumnName ={"ID","Name","Dep_ID","Des_ID","Sec_ID","Address","Phone","Fax","Email"};
	private String[][] tableData;
	/**
	 * This is the default constructor
	 */
	public ViewEmployee() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
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
		ArrayList<EmployeeModel> listEmployee = EmployeeDAO.getAllEmployee();
		tableData = new String[listEmployee.size()][9];
		int row = 0;
		for (EmployeeModel model:listEmployee){
		tableData [row][0] = model.getEmID();
		tableData [row][1] = model.getName();
		tableData [row][2] = model.getDep_ID();
		tableData [row][3] = model.getDes_ID();
		tableData [row][4] = model.getSecID();
		tableData [row][5] = model.getAddress();
		tableData [row][6] = model.getPhone();
		tableData [row][7] = model.getFax();
		tableData [row][8] = model.getEmail();
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
						JOptionPane.showMessageDialog(null, "Ban chua chon dong muon Edit","thong bao",JOptionPane.ERROR_MESSAGE);
						return;
					}
					int column = 1;
					String manvduocluachon = jTableViewemployee.getValueAt(row, column).toString();
					EmployeeModel model = new EmployeeModel();
					model.setEmID(manvduocluachon);
					(new UpdateEmployee()).setVisible(true);
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
			jLabel3.setText("DeptID :");
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
		}
		return btnSearch;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
