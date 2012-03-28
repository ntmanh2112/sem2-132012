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

import javax.swing.JTextField;

import model.DepartmentsModel;
import model.EmployeeModel;
import model.Vacancy_Fill_DetailsModel;
import model.VacanciesModel;
import dao.EmployeeDAO;
import dao.VacanciesDAO;
import dao.VacancyFillingDetailsDAO;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;

public class ViewVacancies extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JScrollPane jScrollPane = null;
	private JTable jTableViewvacancies = null;
	private JButton btnAdd = null;
	private JButton btnEdit = null;
	private JButton btnDelete = null;
	private JPanel jPanel = null;
	private JLabel jLabel1 = null;
	private JTextField txtEmpid = null;
	private JLabel jLabel2 = null;
	private JTextField txtSectionid = null;
	//private JLabel jLabel3 = null;
	//private JTextField txtDeptid = null;
	private JButton btnSearch = null;
	private String[] ColumnName ={"Vacancy_ID","SecID","Designation_ID","No_Of_Vacancies","Status","Vacancy_Date","Creator","Priority"};
	private String[][] tableData;
	
	

	/**
	 * This is the default constructor
	 */
	public ViewVacancies() {
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
		this.setLocation((wndSize.width-804)/2, (wndSize.height-479)/2);
		this.setSize(804, 479);
		this.setContentPane(getJContentPane());
		this.setTitle("FrmViewVacancy");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(280, 17, 185, 47));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 24));
			jLabel.setForeground(Color.red);
			jLabel.setText("View Vacancies");
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
			jScrollPane.setBounds(new Rectangle(27, 83, 741, 191));
			jScrollPane.setViewportView(getJTableViewvacancies());
		}
		return jScrollPane;
	}

	/**
	 * This method initializes jTableViewvacancies	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getJTableViewvacancies() {
		loadDataToTable();
		if (jTableViewvacancies == null) {
			jTableViewvacancies = new JTable(tableData,ColumnName);
			
		}
		return jTableViewvacancies;
	}
	private void loadDataToTable(){
		ArrayList<VacanciesModel> listVacancies = VacanciesDAO.getAllVacancies();
		tableData = new String[listVacancies.size()][8];
		int row = 0;
		for (VacanciesModel model:listVacancies){
		tableData [row][0] = model.getVacancy_ID();
		
		tableData [row][1] = model.getSecID();
		tableData [row][2] = model.getDesignation_ID();
		tableData [row][3] = model.getNo_Of_Vacancies();
		tableData [row][4] = model.getStatus();
		tableData [row][5] = model.getVacancy_Date();
		tableData [row][6] = model.getCreator();
		tableData [row][7] = model.getPriority();
		
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
			btnAdd.setText("Add Vacancies");
			btnAdd.setSize(new Dimension(140, 40));
			btnAdd.setIcon(new ImageIcon(getClass().getResource("/images/Create.png")));
			btnAdd.setLocation(new Point(59, 301));
			btnAdd.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					(new VacanciesRegistration()).setVisible(true);
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
			btnEdit.setText("Update Vacancies");
			btnEdit.setSize(new Dimension(159, 40));
			btnEdit.setIcon(new ImageIcon(getClass().getResource("/images/Modify.png")));
			btnEdit.setLocation(new Point(255, 301));
			btnEdit.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					int row = jTableViewvacancies.getSelectedRow();
					if(row== -1){
						JOptionPane.showMessageDialog(null, "You not choose to edit the line","Notice",JOptionPane.ERROR_MESSAGE);
						return;
					}
					int column = 0;
					String manvduocluachon = jTableViewvacancies.getValueAt(row, column).toString();
					VacanciesModel model = new VacanciesModel();
					model.setVacancy_ID(manvduocluachon);
					(new UpdateVacancies(model)).setVisible(true);
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
			btnDelete.setText("Delete Vacancies");
			btnDelete.setSize(new Dimension(154, 40));
			btnDelete.setIcon(new ImageIcon(getClass().getResource("/images/Delete.png")));
			btnDelete.setLocation(new Point(467, 301));
			btnDelete.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					System.out.println("actionPerformed()"); // TODO Auto-generated Event stub actionPerformed()
					VacanciesModel mo = new VacanciesModel();
					int row = jTableViewvacancies.getSelectedRow();
					if(row== -1){
						JOptionPane.showMessageDialog(null, "You not choose to delete the line","Notice",JOptionPane.ERROR_MESSAGE);
						return;
					}
					int column = 0;
					String manvduocluachon = jTableViewvacancies.getValueAt(row, column).toString();
					mo.setVacancy_ID(manvduocluachon);
					int yn = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete","Notice",JOptionPane.OK_CANCEL_OPTION);
					if(yn == 0){
						Boolean kq = VacanciesDAO.deleteVacancies(mo);
						if(kq){
							loadDataToTable();
							jTableViewvacancies.setModel(new DefaultTableModel(tableData,ColumnName));
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
			//jLabel3 = new JLabel();
			//jLabel3.setText("DepID :");
			//jLabel3.setLocation(new Point(194, 17));
			//jLabel3.setSize(new Dimension(57, 25));
			jLabel2 = new JLabel();
			jLabel2.setText("SectionID :");
			jLabel2.setSize(new Dimension(64, 25));
			jLabel2.setLocation(new Point(371, 17));
			jLabel1 = new JLabel();
			jLabel1.setText("VacancyID :");
			jLabel1.setSize(new Dimension(68, 25));
			jLabel1.setLocation(new Point(9, 17));
			jPanel = new JPanel();
			jPanel.setLayout(null);
			jPanel.setLocation(new Point(28, 363));
			jPanel.setSize(new Dimension(737, 61));
			jPanel.add(jLabel1, null);
			jPanel.add(getTxtEmpid(), null);
			jPanel.add(jLabel2, null);
			jPanel.add(getTxtSectionid(), null);
			//jPanel.add(jLabel3, null);
			//jPanel.add(getTxtDeptid(), null);
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
			txtEmpid.setLocation(new Point(88, 17));
			txtEmpid.setSize(new Dimension(90, 25));
		}
		return txtEmpid;
	}

	/**
	 * This method initializes txtSectionid	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtSectionid() {
		if (txtSectionid == null) {
			txtSectionid = new JTextField();
			txtSectionid.setLocation(new Point(453, 17));
			txtSectionid.setSize(new Dimension(90, 25));
		}
		return txtSectionid;
	}

	/**
	 * This method initializes txtDeptid	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	

	/**
	 * This method initializes btnSearch	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnSearch() {
		if (btnSearch == null) {
			btnSearch = new JButton();
			btnSearch.setText("Search");
			btnSearch.setSize(new Dimension(117, 25));
			btnSearch.setMnemonic(KeyEvent.VK_UNDEFINED);
			btnSearch.setIcon(new ImageIcon(getClass().getResource("/images/View.png")));
			btnSearch.setLocation(new Point(581, 17));
			btnSearch.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					loadDataToTableWhenSearch();
					jTableViewvacancies.setModel(new DefaultTableModel(tableData, ColumnName));
				}
			});
		}
		return btnSearch;
	}
	public void loadDataToTableWhenSearch (){
		String Vacancy_ID = txtEmpid.getText();
		String SecID = txtSectionid.getText();
		
		ArrayList<VacanciesModel> listVacancy = VacanciesDAO.searchVacancies(Vacancy_ID, SecID);
		tableData = new String [listVacancy.size()][8];
		int row = 0;
		for(VacanciesModel model : listVacancy) {
			tableData [row][0] = model.getVacancy_ID();
			tableData [row][1] = model.getSecID();
			tableData [row][2] = model.getDesignation_ID();
			tableData [row][3] = model.getNo_Of_Vacancies();
			tableData [row][4] = model.getStatus();
			tableData [row][5] = model.getVacancy_Date();
			tableData [row][6] = model.getCreator();
			tableData [row][7] = model.getPriority();
			
			
			row ++;
		}
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
