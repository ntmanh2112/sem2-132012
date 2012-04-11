package view;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Rectangle;
import java.awt.Font;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.ImageIcon;

import Common.Constants;
import Common.KeyValue;
import dao.DepartmentsDAO;
import dao.DesignationDAO;
import dao.EmployeeDAO;
import dao.SectionDAO;

import model.DepartmentsModel;
import model.DesignationModel;
import model.EmployeeModel;
import model.SectionModel;
import javax.swing.JPasswordField;

import com.steadystate.css.ParseException;

public class UpdateEmployee extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JTextField txtEmpid = null;
	private JLabel jLabel2 = null;
	private JTextField txtEmpname = null;
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
	private JComboBox cbnDesID = null;
	EmployeeModel model = new EmployeeModel();  //  @jve:decl-index=0:
	private JLabel jLabel10 = null;
	private JPasswordField txtpassword = null;
	private JLabel jLabel3 = null;
	private JComboBox cbnSecID = null;
	/**
	 * This is the default constructor
	 */
	public UpdateEmployee() {
		super();
		initialize();
		//this.txtpassword.setEnabled(false);
		/*if (Constants.userLogin.getEmID().equals("EmID")) {
			try {
				txtpassword.setEnabled(true);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
	}
		
	public UpdateEmployee(EmployeeModel model) {
		super();
		this.model = EmployeeDAO.getEmployeeByID(model.getEmID());
		initialize();
		
		if (!model.getEmID().equals(Constants.userLogin.getEmID())) {
			txtpassword.setEnabled(false);
		}
		
		
		txtEmpid.setText(this.model.getEmID());
		txtEmpname.setText(this.model.getName());
		ArrayList<SectionModel> listSection = SectionDAO.getAllSection();
		for (SectionModel desm : listSection) {
			KeyValue item = new KeyValue(desm.getSecID(),desm.getName());

			cbnSecID.addItem(item);
			if (item.getKey().equals(model.getSecID())) {
				cbnSecID.setSelectedItem(item);
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
		
		
		txtAddress.setText(this.model.getAddress());
		txtPhone.setText(this.model.getPhone());
		txtFax.setText(this.model.getFax());
		txtEmail.setText(this.model.getEmail());
		txtpassword.setText(this.model.getPassword());
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
		this.setLocation((wndSize.width-660)/2, (wndSize.height-417)/2);
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
			jLabel3 = new JLabel();
			jLabel3.setText("SecID :");
			jLabel3.setLocation(new Point(20, 220));
			jLabel3.setSize(new Dimension(63, 25));
			jLabel10 = new JLabel();
			jLabel10.setText("Password");
			jLabel10.setLocation(new Point(20, 180));
			jLabel10.setSize(new Dimension(71, 25));
			jLabel8 = new JLabel();
			jLabel8.setText("Email :");
			jLabel8.setLocation(new Point(345, 220));
			jLabel8.setSize(new Dimension(38, 25));
			jLabel7 = new JLabel();
			jLabel7.setText("Fax :");
			jLabel7.setLocation(new Point(345, 180));
			jLabel7.setSize(new Dimension(30, 25));
			jLabel6 = new JLabel();
			jLabel6.setText("Phone :");
			jLabel6.setSize(new Dimension(52, 25));
			jLabel6.setLocation(new Point(345, 140));
			jLabel5 = new JLabel();
			jLabel5.setText("Address");
			jLabel5.setSize(new Dimension(55, 25));
			jLabel5.setLocation(new Point(345, 100));
			jLabel4 = new JLabel();
			jLabel4.setText("DesignID :");
			jLabel4.setLocation(new Point(20, 260));
			jLabel4.setSize(new Dimension(56, 25));
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
			jContentPane.add(getCbnDesID(), null);
			jContentPane.add(jLabel10, null);
			jContentPane.add(getTxtpassword(), null);
			jContentPane.add(jLabel3, null);
			jContentPane.add(getCbnSecID(), null);
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
			btnOk.setLocation(new Point(177, 312));
			btnOk.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					EmployeeModel model = new EmployeeModel();
					model.setEmID(txtEmpid.getText().trim());
					model.setName(txtEmpname.getText().trim());
					model.setSecID(((KeyValue) cbnSecID.getSelectedItem())
							.getKey());
					
					model.setDes_ID(((KeyValue) cbnDesID.getSelectedItem())
							.getKey());
				
					model.setAddress(txtAddress.getText().trim());
					model.setPhone(txtPhone.getText().trim());
					model.setFax(txtFax.getText().trim());
					model.setEmail(txtEmail.getText().trim());
					model.setPassword(txtpassword.getText().trim());
					if(!validateModel(model)) {
						
						return;
					}
					Boolean kq = EmployeeDAO.UpdateUsingStore(model);
					if (kq) {
						JOptionPane.showMessageDialog(null,
								"Update success",
								"Notice",
								JOptionPane.INFORMATION_MESSAGE);
						(new ViewEmployee()).setVisible(true);
						dispose();

					}

					
				}
			});
			btnOk.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.out.println("actionPerformed()"); 
					// TODO Auto-generated Event stub actionPerformed()
					validateEmail(txtEmail.getText());
				}
			});
			btnOk.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.out.println("actionPerformed()");
					// TODO Auto-generated Event stub actionPerformed()
					validatePhone(txtPhone.getText());
				}
			});
			btnOk.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.out.println("actionPerformed()"); 
					// TODO Auto-generated Event stub actionPerformed()
					validateFax(txtFax.getText());
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
							"Are you sure you want to exit", "Notice",
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
	 * This method initializes cbnDesID	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getCbnDesID() {
		if (cbnDesID == null) {
			cbnDesID = new JComboBox();
			cbnDesID.setSize(new Dimension(200, 23));
			cbnDesID.setLocation(new Point(100, 260));
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
		JOptionPane.showMessageDialog(null, "Address invalid","Notice",JOptionPane.ERROR_MESSAGE);
		return false;
	}
	if( mo.getPhone()== null || mo.getPhone().equals("")){
		JOptionPane.showMessageDialog(null, "phone invalid","Notice",JOptionPane.ERROR_MESSAGE);
		return false;
	}
	if( mo.getFax()== null || mo.getFax().equals("")){
		JOptionPane.showMessageDialog(null, "Fax invalid","Notice",JOptionPane.ERROR_MESSAGE);
		return false;
	}
	if( mo.getEmail()== null || mo.getEmail().equals("")){
		JOptionPane.showMessageDialog(null, "Email invalid","Notice",JOptionPane.ERROR_MESSAGE);
		return false;
	}
	
	return true;
	
}
public boolean  validateEmail(String input){
	boolean kq = true;
	String regex = "[a-zA-Z0-9]@";
	Pattern pat = Pattern.compile(regex);
	Matcher mat = pat.matcher(input);
	if(mat.find()){
		
		return true;
	}
	JOptionPane.showMessageDialog(null, "Email invalid");
	return kq;
	}
public boolean  validatePhone(String input){
	boolean kq = true;
	String regex = "[0-9]";
	Pattern pat = Pattern.compile(regex);
	Matcher mat = pat.matcher(input);
	if(mat.find()){
		
		return true;
	}
	JOptionPane.showMessageDialog(null, " Phone Invalid");
	return kq;
	}
public boolean  validateFax(String input){
	boolean kq = true;
	String regex = "[0-9]";
	Pattern pat = Pattern.compile(regex);
	Matcher mat = pat.matcher(input);
	if(mat.find()){
		
		return true;
	}
	JOptionPane.showMessageDialog(null, " Fax Invalid");
	return kq;
	}

/**
 * This method initializes txtpassword	
 * 	
 * @return javax.swing.JPasswordField	
 */
private JPasswordField getTxtpassword() {
	if (txtpassword == null) {
		txtpassword = new JPasswordField();
		txtpassword.setSize(new Dimension(200, 25));
		txtpassword.setLocation(new Point(100, 180));
	}
	return txtpassword;
}

/**
 * This method initializes cbnSecID	
 * 	
 * @return javax.swing.JComboBox	
 */
private JComboBox getCbnSecID() {
	if (cbnSecID == null) {
		cbnSecID = new JComboBox();
		cbnSecID.setSize(new Dimension(200, 25));
		cbnSecID.setLocation(new Point(100, 220));
	}
	return cbnSecID;
}
}  //  @jve:decl-index=0:visual-constraint="10,10"
