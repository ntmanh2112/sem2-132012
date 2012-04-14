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

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

import com.toedter.calendar.JDateChooser;

import Common.KeyValue;

import dao.DepartmentsDAO;
import dao.DesignationDAO;
import dao.EmployeeDAO;
import dao.Job_RotationDAO;
import dao.SectionDAO;
import dao.VacanciesDAO;

import model.DepartmentsModel;
import model.DesignationModel;
import model.Job_rotationModel;
import model.SectionModel;
import model.VacanciesModel;

public class EmployeeJobRotation extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JComboBox cbndes = null;
	private JLabel jLabel2 = null;
	private JTextField txtEmId = null;
	private JLabel jLabel3 = null;
	private JComboBox cbnDeputedto = null;
	private JLabel jLabel4 = null;
	private JTextField txtStatus = null;
	private JLabel jLabel5 = null;
	private JTextField txtRemark = null;
	private JButton btnAdd = null;
	private JButton btnDelete = null;
	Job_rotationModel model = new Job_rotationModel();  //  @jve:decl-index=0:
	/**
	 * This is the default constructor
	 */
	public EmployeeJobRotation() {
		super();
		initialize();
	}
	
	public EmployeeJobRotation(Job_rotationModel model) {
		super();
		this.model = Job_RotationDAO.getJob_RotationID(model.getEmID());
		initialize();
		txtEmId.setText(this.model.getEmID());
		ArrayList<DesignationModel> listDesignation = DesignationDAO.getAllDesignation();
		for (DesignationModel desm : listDesignation) {
			KeyValue item = new KeyValue(desm.getDesID(),desm.getDesignation());

			cbndes.addItem(item);
			if (item.getKey().equals(this.model.getPresent_Designation())) {
				cbndes.setSelectedItem(item);
			}
		}
		
		/*ArrayList<DepartmentsModel> listdep = DepartmentsDAO.getAllDepartments();
		for (DepartmentsModel desm : listdep) {
			KeyValue item = new KeyValue(desm.getDep_ID(),desm.getDep_Name());

			cbnDeputedto.addItem(item);
			if (item.getKey().equals(this.model.getDeputed_To())) {
				cbnDeputedto.setSelectedItem(item);
			}
		}*/
		ArrayList<SectionModel> listdep = SectionDAO.getAllSection();
		for (SectionModel desm : listdep) {
			KeyValue item = new KeyValue(desm.getSecID(),desm.getName());

			cbnDeputedto.addItem(item);
			if (item.getKey().equals(this.model.getDeputed_To())) {
				cbnDeputedto.setSelectedItem(item);
			}
		}
		
		txtStatus.setText(this.model.getStatus());
		txtRemark.setText(this.model.getRemarks());
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
		this.setLocation((wndSize.width-471)/2, (wndSize.height-445)/2);
		this.setSize(431, 445);
		this.setContentPane(getJContentPane());
		this.setTitle("FrmJobRotation");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabel5 = new JLabel();
			jLabel5.setText("Stratus");
			jLabel5.setLocation(new Point(50, 220));
			jLabel5.setSize(new Dimension(68, 25));
			jLabel4 = new JLabel();
			jLabel4.setText("Remarks");
			jLabel4.setLocation(new Point(50, 260));
			jLabel4.setHorizontalAlignment(SwingConstants.LEADING);
			jLabel4.setSize(new Dimension(67, 25));
			jLabel3 = new JLabel();
			jLabel3.setText("DeputedTo");
			jLabel3.setLocation(new Point(50, 180));
			jLabel3.setSize(new Dimension(62, 25));
			jLabel2 = new JLabel();
			jLabel2.setText("PresentDesign");
			jLabel2.setLocation(new Point(50, 140));
			jLabel2.setSize(new Dimension(90, 25));
			jLabel1 = new JLabel();
			jLabel1.setText("EmpName");
			jLabel1.setSize(new Dimension(61, 25));
			jLabel1.setLocation(new Point(50, 100));
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(36, 21, 356, 42));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 24));
			jLabel.setForeground(Color.red);
			jLabel.setText("Update Employee Job Rotation");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.setBackground(new Color(238, 238, 238));
			jContentPane.add(jLabel, null);
			jContentPane.add(jLabel1, null);
			jContentPane.add(getCbndes(), null);
			jContentPane.add(jLabel2, null);
			jContentPane.add(getTxtEmId(), null);
			jContentPane.add(jLabel3, null);
			jContentPane.add(getCbnDeputedto(), null);
			jContentPane.add(jLabel4, null);
			jContentPane.add(getTxtStatus(), null);
			jContentPane.add(jLabel5, null);
			jContentPane.add(getTxtRemark(), null);
			jContentPane.add(getBtnAdd(), null);
			jContentPane.add(getBtnDelete(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes cbndes	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getCbndes() {
		if (cbndes == null) {
			cbndes = new JComboBox();
			cbndes.setLocation(new Point(170, 140));
			cbndes.setSize(new Dimension(200, 25));
		}
		return cbndes;
	}

	/**
	 * This method initializes txtEmId	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtEmId() {
		if (txtEmId == null) {
			txtEmId = new JTextField();
			txtEmId.setEnabled(false);
			txtEmId.setSize(new Dimension(200, 25));
			txtEmId.setLocation(new Point(170, 100));
		}
		return txtEmId;
	}

	/**
	 * This method initializes cbnDeputedto	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getCbnDeputedto() {
		if (cbnDeputedto == null) {
			cbnDeputedto = new JComboBox();
			cbnDeputedto.setLocation(new Point(170, 180));
			cbnDeputedto.setSize(new Dimension(200, 25));
		}
		return cbnDeputedto;
	}

	/**
	 * This method initializes txtStatus	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtStatus() {
		if (txtStatus == null) {
			txtStatus = new JTextField();
			txtStatus.setLocation(new Point(170, 220));
			txtStatus.setSize(new Dimension(200, 25));
		}
		return txtStatus;
	}

	/**
	 * This method initializes txtRemark	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtRemark() {
		if (txtRemark == null) {
			txtRemark = new JTextField();
			txtRemark.setSize(new Dimension(200, 25));
			txtRemark.setLocation(new Point(170, 260));
		}
		return txtRemark;
	}

	/**
	 * This method initializes btnAdd	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnAdd() {
		if (btnAdd == null) {
			btnAdd = new JButton();
			btnAdd.setText("Update");
			btnAdd.setSize(new Dimension(112, 34));
			btnAdd.setIcon(new ImageIcon(getClass().getResource("/images/Update.png")));
			btnAdd.setLocation(new Point(56, 331));
			btnAdd.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.out.println("actionPerformed()"); // TODO Auto-generated Event stub actionPerformed()
					Job_rotationModel model = new Job_rotationModel();
					model.setEmID(txtEmId.getText().trim());
					model.setPresent_Designation(((KeyValue) cbndes.getSelectedItem())
							.getKey());
					model.setDeputed_To(((KeyValue) cbnDeputedto.getSelectedItem())
							.getKey());
					
					model.setStatus(txtStatus.getText().trim());
					model.setRemarks(txtRemark.getText().trim());
					if(!validateModel(model)){
						return;
					}
					Boolean kq = Job_RotationDAO.UpdateUsingStore(model);
					if (kq) {
						JOptionPane.showMessageDialog(null,
								"Update Success ", "Notice",
								JOptionPane.INFORMATION_MESSAGE);
						(new viewJobRotation()).setVisible(true);
						dispose();
					}else{
						JOptionPane.showMessageDialog(null,
								"Update failed", "Notice",
								JOptionPane.ERROR_MESSAGE);
						(new viewJobRotation()).setVisible(true);
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
			btnDelete.setText("cancel");
			btnDelete.setSize(new Dimension(103, 34));
			btnDelete.setIcon(new ImageIcon(getClass().getResource("/images/Delete.png")));
			btnDelete.setLocation(new Point(255, 331));
			btnDelete.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.out.println("actionPerformed()"); // TODO Auto-generated Event stub actionPerformed()
					int kg = JOptionPane.showConfirmDialog(null,
							"Are you sure you want to exit", "Notice",
							JOptionPane.OK_CANCEL_OPTION);
					if (kg == 0) {
						(new viewJobRotation()).setVisible(true);
						dispose();
					}
				}
			});
		}
		return btnDelete;
	}

	/**
	 * This method initializes txtCreation_Date	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	
private Boolean validateModel(Job_rotationModel mo) {
    	
    	if( mo.getStatus() == null || mo.getStatus().equals("")){ 
    		JOptionPane.showMessageDialog(null, "Status invalid","Notice",JOptionPane.ERROR_MESSAGE);
    		return false;
    	}
    	if( mo.getRemarks() == null || mo.getRemarks().equals("")){ 
    		JOptionPane.showMessageDialog(null, "Remarks invalid","Notice",JOptionPane.ERROR_MESSAGE);
    		return false;
    	}
    	return true;
}
}  //  @jve:decl-index=0:visual-constraint="10,10"
