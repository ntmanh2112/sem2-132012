package view;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Rectangle;
import java.awt.Font;
import java.awt.Point;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import Common.KeyValue;
import dao.DepartmentsDAO;
import dao.DesignationDAO;
import dao.EmployeeDAO;
import dao.SectionDAO;

import model.DepartmentsModel;
import model.DesignationModel;
import model.EmployeeModel;
import model.SectionModel;

public class UpdateEmployee extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JTextField txtEmpid = null;
	private JLabel jLabel2 = null;
	private JTextField txtEmpname = null;
	private JLabel jLabel3 = null;
	private JComboBox cbnDeptno = null;
	private JLabel jLabel4 = null;
	private JLabel jLabel5 = null;
	private JTextField txtAddress = null;
	private JLabel jLabel6 = null;
	private JTextField txtPhone = null;
	private JLabel jLabel7 = null;
	private JTextField txtFax = null;
	private JLabel jLabel8 = null;
	private JTextField txtEmail = null;
	private JButton btnOk = null;
	private JButton btnCancel = null;
	private JLabel jLabel9 = null;
	private JComboBox cbnSecID = null;
	private JComboBox cbnDesID = null;
	EmployeeModel model = new EmployeeModel();  //  @jve:decl-index=0:
	/**
	 * This is the default constructor
	 */
	public UpdateEmployee() {
		super();
		
		initialize();
	}
		
	public UpdateEmployee(EmployeeModel model) {
		super();
		this.model = EmployeeDAO.getEmployeeByID(model.getEmID());
		initialize();
		txtEmpid.setText(this.model.getEmID());
		txtEmpname.setText(this.model.getName());
		
		ArrayList<DepartmentsModel> listDepartment = DepartmentsDAO.getAllDepartments();
		for (DepartmentsModel dm : listDepartment) {
			KeyValue item = new KeyValue(dm.getDep_ID(),dm.getDep_Name());

			cbnDeptno.addItem(item);
			if (item.getKey().equals(this.model.getDep_ID())) {
				cbnDeptno.setSelectedItem(item);
			}
		}
		ArrayList<DesignationModel> listDesignation = DesignationDAO.getAllDesignation();
		for (DesignationModel desm : listDesignation) {
			KeyValue item = new KeyValue(desm.getDesID(),desm.getDesignation());

			cbnDesID.addItem(item);
			if (item.getKey().equals(this.model.getDes_ID())) {
				cbnDesID.setSelectedItem(item);
			}
		}
		
		ArrayList<SectionModel> listSec = SectionDAO.getAllSection();
		for (SectionModel sem : listSec) {
			KeyValue item = new KeyValue(sem.getSecID(),sem.getName());

			cbnSecID.addItem(item);
			if (item.getKey().equals(this.model.getSecID())) {
				cbnSecID.setSelectedItem(item);
			}
		}
		txtAddress.setText(this.model.getAddress());
		txtPhone.setText(this.model.getPhone());
		txtFax.setText(this.model.getFax());
		txtEmail.setText(this.model.getEmail());
		
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(660, 417);
		this.setContentPane(getJContentPane());
		this.setTitle("FrmUpdateEmployee");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabel9 = new JLabel();
			jLabel9.setText("SecID");
			jLabel9.setSize(new Dimension(58, 25));
			jLabel9.setLocation(new Point(20, 257));
			jLabel8 = new JLabel();
			jLabel8.setText("Email :");
			jLabel8.setLocation(new Point(350, 220));
			jLabel8.setSize(new Dimension(38, 25));
			jLabel7 = new JLabel();
			jLabel7.setText("Fax :");
			jLabel7.setLocation(new Point(350, 180));
			jLabel7.setSize(new Dimension(30, 25));
			jLabel6 = new JLabel();
			jLabel6.setText("Phone :");
			jLabel6.setSize(new Dimension(52, 25));
			jLabel6.setLocation(new Point(350, 140));
			jLabel5 = new JLabel();
			jLabel5.setText("Address");
			jLabel5.setSize(new Dimension(55, 25));
			jLabel5.setLocation(new Point(350, 100));
			jLabel4 = new JLabel();
			jLabel4.setText("DesignID :");
			jLabel4.setLocation(new Point(20, 220));
			jLabel4.setSize(new Dimension(56, 25));
			jLabel3 = new JLabel();
			jLabel3.setText("DepID :");
			jLabel3.setSize(new Dimension(50, 25));
			jLabel3.setLocation(new Point(20, 180));
			jLabel2 = new JLabel();
			jLabel2.setText("EmpName :");
			jLabel2.setLocation(new Point(20, 140));
			jLabel2.setSize(new Dimension(65, 25));
			jLabel1 = new JLabel();
			jLabel1.setText("EmpID :");
			jLabel1.setLocation(new Point(20, 100));
			jLabel1.setSize(new Dimension(48, 25));
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(202, 13, 207, 37));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 24));
			jLabel.setForeground(Color.red);
			jLabel.setText("Update Employee");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(jLabel, null);
			jContentPane.add(jLabel1, null);
			jContentPane.add(getTxtEmpid(), null);
			jContentPane.add(jLabel2, null);
			jContentPane.add(getTxtEmpname(), null);
			jContentPane.add(jLabel3, null);
			jContentPane.add(getCbnDeptno(), null);
			jContentPane.add(jLabel4, null);
			jContentPane.add(jLabel5, null);
			jContentPane.add(getTxtAddress(), null);
			jContentPane.add(jLabel6, null);
			jContentPane.add(getTxtPhone(), null);
			jContentPane.add(jLabel7, null);
			jContentPane.add(getTxtFax(), null);
			jContentPane.add(jLabel8, null);
			jContentPane.add(getTxtEmail(), null);
			jContentPane.add(getBtnOk(), null);
			jContentPane.add(getBtnCancel(), null);
			jContentPane.add(jLabel9, null);
			jContentPane.add(getCbnSecID(), null);
			jContentPane.add(getCbnDesID(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes txtEmpid	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtEmpid() {
		if (txtEmpid == null) {
			txtEmpid = new JTextField();
			txtEmpid.setEnabled(false);
			txtEmpid.setLocation(new Point(100, 100));
			txtEmpid.setSize(new Dimension(200, 25));
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
			txtEmpname.setEnabled(false);
			txtEmpname.setLocation(new Point(100, 140));
			txtEmpname.setSize(new Dimension(200, 25));
		}
		return txtEmpname;
	}

	/**
	 * This method initializes cbnDeptno	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getCbnDeptno() {
		if (cbnDeptno == null) {
			cbnDeptno = new JComboBox();
			cbnDeptno.setLocation(new Point(100, 180));
			cbnDeptno.setSize(new Dimension(200, 25));
		}
		return cbnDeptno;
	}

	/**
	 * This method initializes txtDesignid	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	

	/**
	 * This method initializes txtAddress	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtAddress() {
		if (txtAddress == null) {
			txtAddress = new JTextField();
			txtAddress.setLocation(new Point(430, 100));
			txtAddress.setSize(new Dimension(200, 25));
		}
		return txtAddress;
	}

	/**
	 * This method initializes txtPhone	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtPhone() {
		if (txtPhone == null) {
			txtPhone = new JTextField();
			txtPhone.setLocation(new Point(430, 140));
			txtPhone.setSize(new Dimension(200, 25));
		}
		return txtPhone;
	}

	/**
	 * This method initializes txtFax	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtFax() {
		if (txtFax == null) {
			txtFax = new JTextField();
			txtFax.setLocation(new Point(430, 180));
			txtFax.setSize(new Dimension(200, 25));
		}
		return txtFax;
	}

	/**
	 * This method initializes txtEmail	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtEmail() {
		if (txtEmail == null) {
			txtEmail = new JTextField();
			txtEmail.setSize(new Dimension(200, 25));
			txtEmail.setLocation(new Point(430, 220));
		}
		return txtEmail;
	}

	/**
	 * This method initializes btnOk	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnOk() {
		if (btnOk == null) {
			btnOk = new JButton();
			btnOk.setText("Update");
			btnOk.setSize(new Dimension(105, 34));
			btnOk.setIcon(new ImageIcon(getClass().getResource("/images/Update.png")));
			btnOk.setLocation(new Point(209, 312));
			btnOk.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					EmployeeModel model = new EmployeeModel();
					model.setEmID(txtEmpid.getText().trim());
					model.setName(txtEmpname.getText().trim());
					model.setDep_ID(((KeyValue) cbnDeptno.getSelectedItem())
							.getKey());
					model.setDes_ID(((KeyValue) cbnDesID.getSelectedItem())
							.getKey());
					model.setSecID(((KeyValue) cbnSecID.getSelectedItem())
							.getKey());
					model.setAddress(txtAddress.getText().trim());
					model.setPhone(txtPhone.getText().trim());
					model.setFax(txtFax.getText().trim());
					model.setEmail(txtEmail.getText().trim());
					if(!validateModel(model)) {
						
						return;
					}
					Boolean kq = EmployeeDAO.updateEmployee(model);
					if (kq) {
						JOptionPane.showMessageDialog(null,
								"Cap Nhat  Thành Công",
								"Thông Báo",
								JOptionPane.INFORMATION_MESSAGE);
						(new ViewEmployee()).setVisible(true);
						dispose();

					}else{
						JOptionPane.showMessageDialog(null,
								"Update Viên Th?t b?i", "Thông Báo",
								JOptionPane.INFORMATION_MESSAGE);
						(new ViewVacancies()).setVisible(true);
						dispose();
					}

					
				}
			});
		}
		return btnOk;
	}

	/**
	 * This method initializes btnCancel	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnCancel() {
		if (btnCancel == null) {
			btnCancel = new JButton();
			btnCancel.setText("Cancel");
			btnCancel.setSize(new Dimension(98, 34));
			btnCancel.setIcon(new ImageIcon(getClass().getResource("/images/Button-Close-icon.png")));
			btnCancel.setLocation(new Point(364, 312));
			btnCancel.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					int kg = JOptionPane.showConfirmDialog(null,
							"Ban co chac muon thoat", "Thong Bao",
							JOptionPane.OK_CANCEL_OPTION);
					if (kg == 0) {
						(new ViewEmployee()).setVisible(true);
						dispose();
					}
				}
			});
		}
		return btnCancel;
	}

	/**
	 * This method initializes cbnSecID	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getCbnSecID() {
		if (cbnSecID == null) {
			cbnSecID = new JComboBox();
			cbnSecID.setSize(new Dimension(200, 24));
			cbnSecID.setLocation(new Point(100, 260));
		}
		return cbnSecID;
	}

	/**
	 * This method initializes cbnDesID	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getCbnDesID() {
		if (cbnDesID == null) {
			cbnDesID = new JComboBox();
			cbnDesID.setSize(new Dimension(200, 23));
			cbnDesID.setLocation(new Point(100, 220));
		}
		return cbnDesID;
	}

private Boolean validateModel(EmployeeModel mo) {
	
	/*if( mo.getEmID() == null || mo.getEmID().equals("")){ 
		JOptionPane.showMessageDialog(null, "Mã NV Không Hợp lệ","Thông Báo",JOptionPane.ERROR_MESSAGE);
		return false;
	}
	if( mo.getName() == null || mo.getName().equals("")){ 
		JOptionPane.showMessageDialog(null, "Tên Không Hợp lệ","Thông Báo",JOptionPane.ERROR_MESSAGE);
		return false;
	}*/
	if( mo.getAddress()== null || mo.getAddress().equals("")){
		JOptionPane.showMessageDialog(null, "Address không hợp lệ","Thông Báo",JOptionPane.ERROR_MESSAGE);
		return false;
	}
	if( mo.getPhone()== null || mo.getPhone().equals("")){
		JOptionPane.showMessageDialog(null, "phone không hợp lệ","Thông Báo",JOptionPane.ERROR_MESSAGE);
		return false;
	}
	if( mo.getFax()== null || mo.getFax().equals("")){
		JOptionPane.showMessageDialog(null, "Fax không hợp lệ","Thông Báo",JOptionPane.ERROR_MESSAGE);
		return false;
	}
	if( mo.getEmail()== null || mo.getEmail().equals("")){
		JOptionPane.showMessageDialog(null, "Email không hợp lệ","Thông Báo",JOptionPane.ERROR_MESSAGE);
		return false;
	}
	
	return true;
	
}
}  //  @jve:decl-index=0:visual-constraint="10,10"
