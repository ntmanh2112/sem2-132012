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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import com.toedter.calendar.JDateChooser;
import javax.swing.ImageIcon;

import model.DepartmentsModel;
import model.DesignationModel;
import model.SectionModel;
import model.VacanciesModel;
import Common.KeyValue;
import dao.DepartmentsDAO;
import dao.DesignationDAO;
import dao.SectionDAO;
import dao.VacanciesDAO;

public class UpdateVacancies extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JTextField txtVacancyid = null;
	private JLabel jLabel3 = null;
	private JComboBox cbnSectionid = null;
	private JLabel jLabel4 = null;
	private JComboBox cbnDesignid = null;
	private JLabel jLabel5 = null;
	private JTextField txtNoofvavancies = null;
	private JLabel jLabel6 = null;
	private JTextField txtStatus = null;
	private JLabel jLabel7 = null;
	//private JTextField txtVacancydate = null;
	private JLabel jLabel8 = null;
	private JTextField txtPriority = null;
	private JButton btnAdd = null;
	private JButton btnSave = null;
	private JLabel jLabel9 = null;
	private JTextField txtCreator = null;
	private JDateChooser txtVacancydate = null;
	VacanciesModel model = new VacanciesModel();  //  @jve:decl-index=0:
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
		
		ArrayList<SectionModel> listSec = SectionDAO.getAllSection();
		for (SectionModel sem : listSec) {
			KeyValue item = new KeyValue(sem.getSecID(),sem.getName());

			cbnSectionid.addItem(item);
			if (item.getKey().equals(model.getSecID())) {
				cbnSectionid.setSelectedItem(item);
			}
		}
		ArrayList<DesignationModel> listDesignation = DesignationDAO.getAllDesignation();
		for (DesignationModel desm : listDesignation) {
			KeyValue item = new KeyValue(desm.getDesID(),desm.getDesignation());

			cbnDesignid.addItem(item);
			if (item.getKey().equals(model.getDesignation_ID())) {
				cbnDesignid.setSelectedItem(item);
			}
		}
		
		
		txtNoofvavancies.setText(model.getNo_Of_Vacancies());
		txtStatus.setText(model.getStatus());
		//txtVacancydate.setText(model.getVacancy_Date());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			txtVacancydate
					.setDate(sdf.parse(model.getVacancy_Date().substring(0, 10)));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		txtCreator.setText(model.getCreator());
		txtPriority.setText(model.getPriority());
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(687, 359);
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
			jLabel5.setLocation(new Point(20, 190));
			jLabel5.setSize(new Dimension(100, 30));
			jLabel4 = new JLabel();
			jLabel4.setText("Des_ID :");
			jLabel4.setLocation(new Point(20, 150));
			jLabel4.setSize(new Dimension(54, 25));
			jLabel3 = new JLabel();
			jLabel3.setText("Sec_ID :");
			jLabel3.setLocation(new Point(20, 110));
			jLabel3.setSize(new Dimension(61, 25));
			jLabel1 = new JLabel();
			jLabel1.setText("VacancyID :");
			jLabel1.setSize(new Dimension(74, 25));
			jLabel1.setLocation(new Point(28, 70));
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(218, 13, 211, 40));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 24));
			jLabel.setForeground(Color.red);
			jLabel.setText("Update Vacancies ");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
			jContentPane.add(jLabel, null);
			jContentPane.add(jLabel1, null);
			jContentPane.add(getTxtVacancyid(), null);
			jContentPane.add(jLabel3, null);
			jContentPane.add(getCbnSectionid(), null);
			jContentPane.add(jLabel4, null);
			jContentPane.add(getCbnDesignid(), null);
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
			jContentPane.add(txtVacancydate, null);
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
			txtVacancyid.setEnabled(false);
			txtVacancyid.setLocation(new Point(125, 70));
			txtVacancyid.setSize(new Dimension(200, 25));
		}
		return txtVacancyid;
	}

	/**
	 * This method initializes cbnSectionid	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getCbnSectionid() {
		if (cbnSectionid == null) {
			cbnSectionid = new JComboBox();
			cbnSectionid.setLocation(new Point(125, 110));
			cbnSectionid.setSize(new Dimension(200, 25));
		}
		return cbnSectionid;
	}

	/**
	 * This method initializes cbnDesignid	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getCbnDesignid() {
		if (cbnDesignid == null) {
			cbnDesignid = new JComboBox();
			cbnDesignid.setSize(new Dimension(200, 25));
			cbnDesignid.setLocation(new Point(125, 150));
		}
		return cbnDesignid;
	}

	/**
	 * This method initializes txtNoofvavancies	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtNoofvavancies() {
		if (txtNoofvavancies == null) {
			txtNoofvavancies = new JTextField();
			txtNoofvavancies.setLocation(new Point(125, 190));
			txtNoofvavancies.setSize(new Dimension(200, 25));
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
	private JDateChooser getTxtVacancydate() {
		if (txtVacancydate == null) {
			txtVacancydate = new JDateChooser();
			txtVacancydate.setDateFormatString("MM/dd/yyyy");
			txtVacancydate.setLocation(new Point(450, 110));
			txtVacancydate.setSize(new Dimension(200, 25));
			

			txtVacancydate.getDateEditor().setEnabled(false);
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
			btnAdd.setSize(new Dimension(104, 35));
			btnAdd.setIcon(new ImageIcon(getClass().getResource("/images/add-2-icon.png")));
			btnAdd.setLocation(new Point(164, 256));
			btnAdd.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					VacanciesModel model = new VacanciesModel();
					model.setVacancy_ID(txtVacancyid.getText().trim());
					/*model.setDep_ID(txtDepID.getText().trim());
					model.setSecID(txtSecID.getText().trim());
					model.setDesignation_ID(txtDesID.getText().trim());*/
					
					model.setSecID(((KeyValue) cbnSectionid.getSelectedItem())
							.getKey());
					model.setDesignation_ID(((KeyValue) cbnDesignid.getSelectedItem())
							.getKey());
					
					model.setNo_Of_Vacancies(txtNoofvavancies.getText().trim());
					model.setStatus(txtStatus.getText().trim());
					SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
					model.setVacancy_Date(sdf.format(txtVacancydate.getDate()).trim());
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
								"Update Viên Th?t b?i", "Thông Báo",
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
			btnSave.setSize(new Dimension(111, 35));
			btnSave.setMnemonic(KeyEvent.VK_UNDEFINED);
			btnSave.setIcon(new ImageIcon(getClass().getResource("/images/Delete.png")));
			btnSave.setLocation(new Point(407, 256));
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

}  //  @jve:decl-index=0:visual-constraint="10,10"
