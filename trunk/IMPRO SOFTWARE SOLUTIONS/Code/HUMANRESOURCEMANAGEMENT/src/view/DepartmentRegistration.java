package view;

import java.awt.BorderLayout;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Rectangle;
import java.awt.Font;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

import dao.DepartmentsDAO;
import dao.EmployeeDAO;

import model.DepartmentsModel;
import model.EmployeeModel;

public class DepartmentRegistration extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JTextField txtDeptno = null;
	private JLabel jLabel2 = null;
	private JTextField txtDeptname = null;
	private JLabel jLabel3 = null;
	private JTextField txtDepthead = null;
	private JLabel jLabel4 = null;
	private JTextField txtLocation = null;
	private JButton btnAdd = null;
	private JButton btnSave = null;
	private JButton btnEdit = null;
	private JButton btnDelete = null;
	private JButton btnFirst = null;
	private JButton btnPrevious = null;
	private JButton btnNext = null;
	private JButton btnLast = null;
	private JLabel jLabel5 = null;
	private JLabel jLabel6 = null;
	private JTextField txtupno = null;
	private JTextField txtdnno = null;

	/**
	 * This is the default constructor
	 */
	public DepartmentRegistration() {
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
		this.setLocation((wndSize.width-361)/2, (wndSize.height-464)/2);
		this.setSize(361, 464);
		this.setContentPane(getJContentPane());
		this.setTitle("FormDept");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabel6 = new JLabel();
			jLabel6.setText("Dn_Dep_No :");
			jLabel6.setLocation(new Point(20, 300));
			jLabel6.setSize(new Dimension(77, 25));
			jLabel5 = new JLabel();
			jLabel5.setText("Up_Dep_No :");
			jLabel5.setLocation(new Point(20, 260));
			jLabel5.setSize(new Dimension(72, 25));
			jLabel4 = new JLabel();
			jLabel4.setText("Location :");
			jLabel4.setSize(new Dimension(59, 25));
			jLabel4.setLocation(new Point(20, 220));
			jLabel3 = new JLabel();
			jLabel3.setText("DeptHead :");
			jLabel3.setLocation(new Point(20, 180));
			jLabel3.setSize(new Dimension(61, 25));
			jLabel2 = new JLabel();
			jLabel2.setText("DeptName :");
			jLabel2.setLocation(new Point(20, 140));
			jLabel2.setSize(new Dimension(69, 25));
			jLabel1 = new JLabel();
			jLabel1.setText("DepID :");
			jLabel1.setLocation(new Point(20, 100));
			jLabel1.setSize(new Dimension(48, 25));
			jLabel = new JLabel();
			jLabel.setFont(new Font("Dialog", Font.BOLD, 24));
			jLabel.setSize(new Dimension(200, 42));
			jLabel.setLocation(new Point(77, 25));
			jLabel.setForeground(new Color(255, 51, 51));
			jLabel.setText("Add Department ");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.setBackground(new Color(238, 238, 238));
			jContentPane.add(jLabel, null);
			jContentPane.add(jLabel1, null);
			jContentPane.add(getTxtDeptno(), null);
			jContentPane.add(jLabel2, null);
			jContentPane.add(getTxtDeptname(), null);
			jContentPane.add(jLabel3, null);
			jContentPane.add(getTxtDepthead(), null);
			jContentPane.add(jLabel4, null);
			jContentPane.add(getTxtLocation(), null);
			jContentPane.add(getBtnAdd(), null);
			jContentPane.add(getBtnDelete(), null);
			jContentPane.add(jLabel5, null);
			jContentPane.add(jLabel6, null);
			jContentPane.add(getTxtupno(), null);
			jContentPane.add(getTxtdnno(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes txtDeptno	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtDeptno() {
		if (txtDeptno == null) {
			txtDeptno = new JTextField();
			txtDeptno.setLocation(new Point(100, 100));
			txtDeptno.setSize(new Dimension(200, 25));
		}
		return txtDeptno;
	}

	/**
	 * This method initializes txtDeptname	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtDeptname() {
		if (txtDeptname == null) {
			txtDeptname = new JTextField();
			txtDeptname.setLocation(new Point(100, 140));
			txtDeptname.setSize(new Dimension(200, 25));
		}
		return txtDeptname;
	}

	/**
	 * This method initializes txtDepthead	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtDepthead() {
		if (txtDepthead == null) {
			txtDepthead = new JTextField();
			txtDepthead.setLocation(new Point(100, 180));
			txtDepthead.setSize(new Dimension(200, 25));
		}
		return txtDepthead;
	}

	/**
	 * This method initializes txtLocation	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtLocation() {
		if (txtLocation == null) {
			txtLocation = new JTextField();
			txtLocation.setSize(new Dimension(200, 25));
			txtLocation.setLocation(new Point(100, 220));
		}
		return txtLocation;
	}

	/**
	 * This method initializes btnAdd	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnAdd() {
		if (btnAdd == null) {
			btnAdd = new JButton();
			btnAdd.setLocation(new Point(44, 355));
			btnAdd.setText("Add");
			btnAdd.setIcon(new ImageIcon(getClass().getResource("/images/Create.png")));
			btnAdd.setSize(new Dimension(100, 35));
			btnAdd.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					DepartmentsModel model = new DepartmentsModel();
					model.setDep_ID(txtDeptno.getText().trim());
					model.setDep_Name(txtDeptname.getText().trim());
					model.setDep_Head(txtDepthead.getText().trim());
					model.setLocation(txtLocation.getText().trim());
					model.setUp_Dep_No(txtupno.getText().trim());
					model.setDn_Dep_No(txtdnno.getText().trim());
					if(!validateModel(model)) {
						
						return;
					}
					Boolean kq = DepartmentsDAO.insertDepartments(model);
					if (kq) {
						JOptionPane.showMessageDialog(null,
								"Add successful department", "Notice",
								JOptionPane.INFORMATION_MESSAGE);
						(new ViewDepartment()).setVisible(true);
						dispose();
					}
				}
			});
		}
		return btnAdd;
	}

	/**
	 * This method initializes btnSave	
	 * 	
	 * @return javax.swing.JButton	
	 */
	

	/**
	 * This method initializes btnEdit	
	 * 	
	 * @return javax.swing.JButton	
	 */
	

	/**
	 * This method initializes btnDelete	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnDelete() {
		if (btnDelete == null) {
			btnDelete = new JButton();
			btnDelete.setText("Cancel");
			btnDelete.setLocation(new Point(194, 355));
			btnDelete.setIcon(new ImageIcon(getClass().getResource("/images/Delete.png")));
			btnDelete.setSize(new Dimension(100, 35));
			btnDelete.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					int kg = JOptionPane.showConfirmDialog(null,
							"Are you sure you want to exit", "Notice",
							JOptionPane.OK_CANCEL_OPTION);
					if (kg == 0) {
						(new ViewDepartment()).setVisible(true);
						dispose();
					}
				}
			});
		}
		return btnDelete;
	}

	/**
	 * This method initializes txtupno	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtupno() {
		if (txtupno == null) {
			txtupno = new JTextField();
			txtupno.setSize(new Dimension(200, 25));
			txtupno.setLocation(new Point(100, 260));
		}
		return txtupno;
	}

	/**
	 * This method initializes txtdnno	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtdnno() {
		if (txtdnno == null) {
			txtdnno = new JTextField();
			txtdnno.setSize(new Dimension(200, 26));
			txtdnno.setLocation(new Point(100, 300));
		}
		return txtdnno;
	}

	/**
	 * This method initializes btnFirst	
	 * 	
	 * @return javax.swing.JButton	
	 */
	

	/**
	 * This method initializes btnPrevious	
	 * 	
	 * @return javax.swing.JButton	
	 */
	

	/**
	 * This method initializes btnNext	
	 * 	
	 * @return javax.swing.JButton	
	 */
	

	/**
	 * This method initializes btnLast	
	 * 	
	 * @return javax.swing.JButton	
	 */
private Boolean validateModel(DepartmentsModel mo) {
    	
    	if( mo.getDep_ID() == null || mo.getDep_ID().equals("")){ 
    		JOptionPane.showMessageDialog(null, " DEP_ID invalid","Notice",JOptionPane.ERROR_MESSAGE);
    		return false;
    	}
    	if( mo.getDep_Name() == null || mo.getDep_Name().equals("")){ 
    		JOptionPane.showMessageDialog(null, "DEP_NAME invalid","Notice",JOptionPane.ERROR_MESSAGE);
    		return false;
    	}
    	if( mo.getDep_Head()== null || mo.getDep_Head().equals("")){
    		JOptionPane.showMessageDialog(null, "DEP_HEAD invalid","Notice",JOptionPane.ERROR_MESSAGE);
    		return false;
    	}
    	if( mo.getLocation()== null || mo.getLocation().equals("")){
    		JOptionPane.showMessageDialog(null, "LOCATION invalid","Notice",JOptionPane.ERROR_MESSAGE);
    		return false;
    	}
    	if( mo.getUp_Dep_No()== null || mo.getUp_Dep_No().equals("")){
    		JOptionPane.showMessageDialog(null, "UP_DEP_NO invalid","Notice",JOptionPane.ERROR_MESSAGE);
    		return false;
    	}
    	if( mo.getDn_Dep_No()== null || mo.getDn_Dep_No().equals("")){
    		JOptionPane.showMessageDialog(null, "DN_DEP_NO invalid","Notice",JOptionPane.ERROR_MESSAGE);
    		return false;
    	}
    	
		return true;
    	
    }

}  //  @jve:decl-index=0:visual-constraint="10,10"
