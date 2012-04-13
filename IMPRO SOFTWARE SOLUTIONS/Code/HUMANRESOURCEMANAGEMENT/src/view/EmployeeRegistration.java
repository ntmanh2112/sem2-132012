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

import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
import javax.swing.JPasswordField;
import javax.swing.text.MaskFormatter;

public class EmployeeRegistration extends JFrame {

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
	public EmployeeRegistration() {
		super();
		initialize();
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
			if (item.getKey().equals(model.getDes_ID())) {
				cbnDesID.setSelectedItem(item);
			}
		}
		
		
			
				
				
		
	}
	/*public EmployeeRegistration(EmployeeModel mo) {
		super();
		this.model = EmployeeDAO.getEmployeeByID(mo.getEmID());
		initialize();
		txtEmpid.setText(model.getEmID());
		txtEmpname.setText(model.getName());
		cbnDeptno.
	}*/

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
			jLabel3.setSize(new Dimension(64, 25));
			jLabel10 = new JLabel();
			jLabel10.setText("Password :");
			jLabel10.setLocation(new Point(20, 180));
			jLabel10.setSize(new Dimension(69, 25));
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
			jLabel.setBounds(new Rectangle(185, 13, 277, 37));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 24));
			jLabel.setForeground(Color.red);
			jLabel.setText("Employee Registration");
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
	
			txtEmpname = new JTextField();
			txtEmpname.setLocation(new Point(100, 140));
			txtEmpname.setSize(new Dimension(200, 25));
			
			
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
			btnOk.setText("Add");
			btnOk.setSize(new Dimension(105, 34));
			btnOk.setIcon(new ImageIcon(getClass().getResource("/images/add-2-icon.png")));
			btnOk.setLocation(new Point(177, 312));
			btnOk.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
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
				//validateEmail(txtEmail.getText());
					model.setPassword(txtpassword.getText().trim());
					if(!validateModel(model)) {
						
						return;
					}
					
						Boolean kq = EmployeeDAO.insertUsingStore(model);
						if (kq) {
							JOptionPane.showMessageDialog(null,
									"Add successful ", "Notice",
									JOptionPane.INFORMATION_MESSAGE);
							(new ViewEmployee()).setVisible(true);
							dispose();
						}else {
							JOptionPane.showMessageDialog(null,
									"Add failed ", "Notice",
									JOptionPane.ERROR_MESSAGE);
							(new ViewEmployee()).setVisible(true);
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
    	
    	if( mo.getEmID() == null || mo.getEmID().equals("")){ 
    		JOptionPane.showMessageDialog(null, "EmID invalid","Notice",JOptionPane.ERROR_MESSAGE);
    		return false;
    	}
    	if (EmployeeDAO.getEmployeeByID(mo.getEmID()) != null) {
    		JOptionPane.showMessageDialog(null, "EmID Already exists","Notice",JOptionPane.ERROR_MESSAGE);
    		return false;
    		}
    	
    		
    	if( mo.getName() == null || mo.getName().equals("")){ 
    		JOptionPane.showMessageDialog(null, "EmName invalid","Notice",JOptionPane.ERROR_MESSAGE);
    		return false;
    	}
    	if(!validateEmName(mo.getName())){
    		return false;
    	}
    	   
    
    	if( mo.getPassword()== null || mo.getPassword().equals("")){
    		JOptionPane.showMessageDialog(null, "Password invalid","Notice",JOptionPane.ERROR_MESSAGE);
    		return false;
    	}
    	
    	if( mo.getAddress()== null || mo.getAddress().equals("")){
    		JOptionPane.showMessageDialog(null, "Address invalid","Notice",JOptionPane.ERROR_MESSAGE);
    		return false;
    	}
    	
    	if( mo.getPhone()== null || mo.getPhone().equals("")){
    		JOptionPane.showMessageDialog(null, "Phone invalid","Notice",JOptionPane.ERROR_MESSAGE);
    		return false;
    	}
    	if(!validatePhone(mo.getPhone())){
    		
    		return false;
    	}
    	
    	if( mo.getFax()== null || mo.getFax().equals("")){
    		JOptionPane.showMessageDialog(null, "Fax invalid","Notice",JOptionPane.ERROR_MESSAGE);
    		return false;
    	}
    	if(!validateFax(mo.getFax())){
    		return false;
    	}
    	
    	
    	if( mo.getEmail()== null || mo.getEmail().equals("")){
    		JOptionPane.showMessageDialog(null, "Email invalid","Notice",JOptionPane.ERROR_MESSAGE);
    		return false;
    	}
    	if(!validateEmail(mo.getEmail())){
    		return false;
    	}
    	
		return true;
    	
    }
public boolean  validateEmName(String input){
	//boolean kq = true;
	String regex = "[A-Za-z]";
	Pattern pat = Pattern.compile(regex);
	Matcher mat = pat.matcher(input);
	if(mat.find()){
		
		return true;
	}
	JOptionPane.showMessageDialog(null, "Names not numbers","Notice",JOptionPane.ERROR_MESSAGE);
	return false;
	}


public boolean  validatePhone(String input){
	//boolean kq = true;
	String regex = "[0-9*]{9,11}";
	Pattern pat = Pattern.compile(regex);
	Matcher mat = pat.matcher(input);
	if(mat.find()){
		return true;
	}else{
	JOptionPane.showMessageDialog(null, "Is the phone number","Notice",JOptionPane.ERROR_MESSAGE);
	//return false;
	}
	JOptionPane.showMessageDialog(null, "Telephone number must be 9 to 11","Notice",JOptionPane.ERROR_MESSAGE);
	return false;
	}
public boolean  validateFax(String input){
	//boolean kq = true;
	String regex = "[0-9*]{9,11}";
	Pattern pat = Pattern.compile(regex);
	Matcher mat = pat.matcher(input);
	if(mat.find()){
		
		return true;
	}
	JOptionPane.showMessageDialog(null, "Is the Fax number","Notice",JOptionPane.ERROR_MESSAGE);
	return false;
	}
public boolean  validateEmail(String input){
	//boolean kq = true;
	String regex = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	Pattern pat = Pattern.compile(regex);
	Matcher mat = pat.matcher(input);
	if(mat.find()){
		
		return true;
	}
	JOptionPane.showMessageDialog(null, "Email not invalid","Notice",JOptionPane.ERROR_MESSAGE);
	return false;
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
