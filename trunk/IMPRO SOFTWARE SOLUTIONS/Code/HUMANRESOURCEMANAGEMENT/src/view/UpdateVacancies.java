package view;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Rectangle;
import java.awt.Font;
import java.awt.Point;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.WindowConstants;
import javax.swing.JOptionPane;
import java.awt.GridBagLayout;
import javax.swing.JMenuItem;
import javax.swing.BorderFactory;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import Common.KeyValue;

import dao.DepartmentsDAO;
import dao.DesignationDAO;
import dao.SectionDAO;
import dao.VacanciesDAO;

import model.DepartmentsModel;
import model.DesignationModel;
import model.SectionModel;
import model.VacanciesModel;

public class UpdateVacancies extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JTextField txtVacancyid = null;
	private JLabel jLabel2 = null;
	private JLabel jLabel3 = null;
	private JLabel jLabel4 = null;
	private JLabel jLabel5 = null;
	private JTextField txtNoofvavancies = null;
	private JLabel jLabel6 = null;
	private JTextField txtStatus = null;
	private JLabel jLabel7 = null;
	private JTextField txtVacancydate = null;
	private JLabel jLabel8 = null;
	private JTextField txtPriority = null;
	private JButton btnAdd = null;
	private JButton btnSave = null;
	private JLabel jLabel9 = null;
	private JTextField txtCreator = null;
	VacanciesModel model = new VacanciesModel();  //  @jve:decl-index=0:
	private JComboBox cbnDepID = null;
	private JComboBox cbnSecID = null;
	private JComboBox cbnDesID = null;
	/**
	 * This is the default constructor
	 */
	public UpdateVacancies() {
		super();
		initialize();
		
	}
	public UpdateVacancies(VacanciesModel mo) {
		super();
		this.model = VacanciesDAO.getVacanciesByID(mo.getVacancy_ID());
		initialize();
		txtVacancyid.setText(model.getVacancy_ID());
		//txtDepID.setText(model.getDep_ID());
		//txtSecID.setText(model.getSecID());
		//txtDesID.setText(model.getDesignation_ID());
		ArrayList<DepartmentsModel> listDepartment = DepartmentsDAO.getAllDepartments();
		for (DepartmentsModel dm : listDepartment) {
			KeyValue item = new KeyValue(dm.getDep_ID(),dm.getDep_Name());

			cbnDepID.addItem(item);
			if (item.getKey().equals(model.getDep_ID())) {
				cbnDepID.setSelectedItem(item);
			}
		}
		ArrayList<SectionModel> listSec = SectionDAO.getAllSection();
		for (SectionModel sem : listSec) {
			KeyValue item = new KeyValue(sem.getSecID(),sem.getName());

			cbnSecID.addItem(item);
			if (item.getKey().equals(model.getSecID())) {
				cbnSecID.setSelectedItem(item);
			}
		}
		ArrayList<DesignationModel> listDesignation = DesignationDAO.getAllDesignation();
		for (DesignationModel desm : listDesignation) {
			KeyValue item = new KeyValue(desm.getDesID(),desm.getDesignation());

			cbnDesID.addItem(item);
			if (item.getKey().equals(model.getDesignation_ID())) {
				cbnDesID.setSelectedItem(item);
			}
		}
		
		
		txtNoofvavancies.setText(model.getNo_Of_Vacancies());
		txtStatus.setText(model.getStatus());
		txtVacancydate.setText(model.getVacancy_Date());
		txtCreator.setText(model.getCreator());
		txtPriority.setText(model.getPriority());
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(687, 423);
		this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
		this.setContentPane(getJContentPane());
		this.setTitle("JFrame");
		this.setVisible(false);
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabel9 = new JLabel();
			jLabel9.setText("Creator :");
			jLabel9.setLocation(new Point(361, 150));
			jLabel9.setSize(new Dimension(64, 25));
			jLabel8 = new JLabel();
			jLabel8.setText("Priority :");
			jLabel8.setLocation(new Point(362, 190));
			jLabel8.setSize(new Dimension(49, 25));
			jLabel7 = new JLabel();
			jLabel7.setText("VacancyDate :");
			jLabel7.setLocation(new Point(361, 110));
			jLabel7.setSize(new Dimension(85, 25));
			jLabel6 = new JLabel();
			jLabel6.setText("Status :");
			jLabel6.setLocation(new Point(361, 70));
			jLabel6.setSize(new Dimension(47, 25));
			jLabel5 = new JLabel();
			jLabel5.setText("No of Vacancies :");
			jLabel5.setLocation(new Point(20, 230));
			jLabel5.setSize(new Dimension(100, 30));
			jLabel4 = new JLabel();
			jLabel4.setText("Des_ID :");
			jLabel4.setLocation(new Point(20, 190));
			jLabel4.setSize(new Dimension(54, 25));
			jLabel3 = new JLabel();
			jLabel3.setText("Sec_ID :");
			jLabel3.setLocation(new Point(20, 150));
			jLabel3.setSize(new Dimension(61, 25));
			jLabel2 = new JLabel();
			jLabel2.setText("DepID :");
			jLabel2.setLocation(new Point(20, 110));
			jLabel2.setSize(new Dimension(47, 25));
			jLabel1 = new JLabel();
			jLabel1.setText("VacancyID :");
			jLabel1.setSize(new Dimension(74, 25));
			jLabel1.setLocation(new Point(20, 70));
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(225, 13, 232, 40));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 24));
			jLabel.setForeground(Color.red);
			jLabel.setText("Update Vacancies ");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
			jContentPane.add(jLabel, null);
			jContentPane.add(jLabel1, null);
			jContentPane.add(getTxtVacancyid(), null);
			jContentPane.add(jLabel2, null);
			jContentPane.add(jLabel3, null);
			jContentPane.add(jLabel4, null);
			jContentPane.add(jLabel5, null);
			jContentPane.add(getTxtNoofvavancies(), null);
			jContentPane.add(jLabel6, null);
			jContentPane.add(getTxtStatus(), null);
			jContentPane.add(jLabel7, null);
			jContentPane.add(getTxtVacancydate(), null);
			jContentPane.add(jLabel8, null);
			jContentPane.add(getTxtPriority(), null);
			jContentPane.add(getBtnAdd(), null);
			jContentPane.add(getBtnSave(), null);
			jContentPane.add(jLabel9, null);
			jContentPane.add(getTxtCreator(), null);
			jContentPane.add(getCbnDepID(), null);
			jContentPane.add(getCbnSecID(), null);
			jContentPane.add(getCbnDesID(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes txtVacancyid	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtVacancyid() {
		if (txtVacancyid == null) {
			txtVacancyid = new JTextField();
			txtVacancyid.setLocation(new Point(125, 70));
			txtVacancyid.setSize(new Dimension(200, 25));
		}
		return txtVacancyid;
	}

	/**
	 * This method initializes txtNoofvavancies	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtNoofvavancies() {
		if (txtNoofvavancies == null) {
			txtNoofvavancies = new JTextField();
			txtNoofvavancies.setLocation(new Point(125, 230));
			txtNoofvavancies.setSize(new Dimension(200, 30));
		}
		return txtNoofvavancies;
	}

	/**
	 * This method initializes txtStatus	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtStatus() {
		if (txtStatus == null) {
			txtStatus = new JTextField();
			txtStatus.setLocation(new Point(450, 70));
			txtStatus.setSize(new Dimension(200, 25));
		}
		return txtStatus;
	}

	/**
	 * This method initializes txtVacancydate	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtVacancydate() {
		if (txtVacancydate == null) {
			txtVacancydate = new JTextField();
			txtVacancydate.setLocation(new Point(450, 110));
			txtVacancydate.setSize(new Dimension(200, 25));
		}
		return txtVacancydate;
	}

	/**
	 * This method initializes txtPriority	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtPriority() {
		if (txtPriority == null) {
			txtPriority = new JTextField();
			txtPriority.setSize(new Dimension(200, 25));
			txtPriority.setLocation(new Point(450, 190));
		}
		return txtPriority;
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
			btnAdd.setSize(new Dimension(110, 35));
			btnAdd.setIcon(new ImageIcon(getClass().getResource("/images/Update.png")));
			btnAdd.setLocation(new Point(164, 299));
			btnAdd.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					VacanciesModel model = new VacanciesModel();
					model.setVacancy_ID(txtVacancyid.getText().trim());
					/*model.setDep_ID(txtDepID.getText().trim());
					model.setSecID(txtSecID.getText().trim());
					model.setDesignation_ID(txtDesID.getText().trim());*/
					model.setDep_ID(((KeyValue) cbnDepID.getSelectedItem())
							.getKey());
					model.setSecID(((KeyValue) cbnSecID.getSelectedItem())
							.getKey());
					model.setDesignation_ID(((KeyValue) cbnDesID.getSelectedItem())
							.getKey());
					
					model.setNo_Of_Vacancies(txtNoofvavancies.getText().trim());
					model.setStatus(txtStatus.getText().trim());
					model.setVacancy_Date(txtVacancydate.getText().trim());
					model.setCreator(txtCreator.getText().trim());
					model.setPriority(txtPriority.getText().trim());
					if(!validateModel(model)) {
						return;
					}
					Boolean kq = VacanciesDAO.updateVacancies(model);
					if (kq) {
						JOptionPane.showMessageDialog(null,
								"Update Success ", "Thông Báo",
								JOptionPane.INFORMATION_MESSAGE);
						(new ViewVacancies()).setVisible(true);
						dispose();
					}else{
						JOptionPane.showMessageDialog(null,
								"Update Viên Thất bại", "Thông Báo",
								JOptionPane.INFORMATION_MESSAGE);
						(new ViewVacancies()).setVisible(true);
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
	private JButton getBtnSave() {
		if (btnSave == null) {
			btnSave = new JButton();
			btnSave.setText("Cancel");
			btnSave.setSize(new Dimension(110, 35));
			btnSave.setMnemonic(KeyEvent.VK_UNDEFINED);
			btnSave.setIcon(new ImageIcon(getClass().getResource("/images/Delete.png")));
			btnSave.setLocation(new Point(411, 299));
			btnSave.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					int kg = JOptionPane.showConfirmDialog(null,
							"Ban co chac muon thoat", "Thong Bao",
							JOptionPane.OK_CANCEL_OPTION);
					if (kg == 0) {
						(new ViewVacancies()).setVisible(true);
						dispose();
					}
				}
			});
		}
		return btnSave;
	}

	/**
	 * This method initializes txtCreator	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtCreator() {
		if (txtCreator == null) {
			txtCreator = new JTextField();
			txtCreator.setSize(new Dimension(200, 25));
			txtCreator.setLocation(new Point(450, 150));
		}
		return txtCreator;
	}
private Boolean validateModel(VacanciesModel mo) {
    	
    	if( mo.getVacancy_ID() == null || mo.getVacancy_ID().equals("")){ 
    		JOptionPane.showMessageDialog(null, "Vacancy_ID Không Hợp lệ","Thông Báo",JOptionPane.ERROR_MESSAGE);
    		return false;
    	}
    	if( mo.getNo_Of_Vacancies() == null || mo.getNo_Of_Vacancies().equals("")){ 
    		JOptionPane.showMessageDialog(null, "No_Of_Vacancies Không Hợp lệ","Thông Báo",JOptionPane.ERROR_MESSAGE);
    		return false;
    	}
    	if( mo.getStatus()== null || mo.getStatus().equals("")){
    		JOptionPane.showMessageDialog(null, "Status Không Hợp lệ","Thông Báo",JOptionPane.ERROR_MESSAGE);
    		return false;
    	}
    	if( mo.getVacancy_Date() == null || mo.getVacancy_Date().equals("")){ 
    		JOptionPane.showMessageDialog(null, "Vacancy_Date Không Hợp lệ","Thông Báo",JOptionPane.ERROR_MESSAGE);
    		return false;
    	}
    	
    	if( mo.getCreator() == null || mo.getCreator().equals("")){
    		JOptionPane.showMessageDialog(null, "Creator Không Hợp lệ","Thông Báo",JOptionPane.ERROR_MESSAGE);
    		return false;
    	}
    	
    	if( mo.getPriority() == null || mo.getPriority().equals("")){ 
    		JOptionPane.showMessageDialog(null, "Priority Không Được Để Trống Và Không Được có chữ","Thông Báo",JOptionPane.ERROR_MESSAGE);
    		return false;
    		
    	}
    	
		return true;
    	
    }
/**
 * This method initializes cbnDepID	
 * 	
 * @return javax.swing.JComboBox	
 */
private JComboBox getCbnDepID() {
	if (cbnDepID == null) {
		cbnDepID = new JComboBox();
		cbnDepID.setBounds(new Rectangle(128, 112, 193, 26));
	}
	return cbnDepID;
}
/**
 * This method initializes cbnSecID	
 * 	
 * @return javax.swing.JComboBox	
 */
private JComboBox getCbnSecID() {
	if (cbnSecID == null) {
		cbnSecID = new JComboBox();
		cbnSecID.setBounds(new Rectangle(130, 151, 188, 25));
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
		cbnDesID.setBounds(new Rectangle(130, 188, 187, 31));
	}
	return cbnDesID;
}

}  //  @jve:decl-index=0:visual-constraint="10,10"
