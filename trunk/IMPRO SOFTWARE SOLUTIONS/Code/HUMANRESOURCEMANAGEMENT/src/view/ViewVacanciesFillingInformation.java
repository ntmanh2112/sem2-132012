package view;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Rectangle;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.Point;
import java.awt.GridBagLayout;
import java.util.ArrayList;

import javax.swing.JTextField;

import model.EmployeeModel;
import model.Vacancy_Fill_DetailsModel;
import dao.EmployeeDAO;
import dao.VacancyFillingDetailsDAO;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

public class ViewVacanciesFillingInformation extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JScrollPane jScrollPane = null;
	private JTable jTableViewvacanciesfillinginformation = null;
	private JButton btnAdd = null;
	private JButton btnEdit = null;
	private JButton btnDelete = null;
	private JPanel jPanel = null;
	private JLabel jLabel1 = null;
	private JTextField txtEmpid = null;
	private JLabel jLabel2 = null;
	private JTextField txtFilldate = null;
	private JLabel jLabel3 = null;
	private JTextField txtVacancyid = null;
	private JButton btnSearch = null;
	private String[] ColumnName ={"Vacancy_ID","EmID","Filled_Date","Intake_Details","Status","Creator"};
	private String[][] tableData;

	/**
	 * This is the default constructor
	 */
	public ViewVacanciesFillingInformation() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(741, 473);
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
			jLabel.setBounds(new Rectangle(135, 18, 333, 47));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 24));
			jLabel.setForeground(Color.red);
			jLabel.setText("View Vacancy Filling Details");
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
			jScrollPane.setBounds(new Rectangle(27, 83, 679, 191));
			jScrollPane.setViewportView(getJTableViewvacanciesfillinginformation());
		}
		return jScrollPane;
	}

	/**
	 * This method initializes jTableViewvacanciesfillinginformation	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getJTableViewvacanciesfillinginformation() {
		loadDataToTable();
		if (jTableViewvacanciesfillinginformation == null) {
			jTableViewvacanciesfillinginformation = new JTable(tableData,ColumnName);
		}
		return jTableViewvacanciesfillinginformation;
	}
	private void loadDataToTable(){
		ArrayList<Vacancy_Fill_DetailsModel> listVacancyFillDetails = VacancyFillingDetailsDAO.getAllVacancyFillDetails();
		tableData = new String[listVacancyFillDetails.size()][6];
		int row = 0;
		for (Vacancy_Fill_DetailsModel model:listVacancyFillDetails){
		//tableData [row][0] = model.getID();
		tableData [row][0] = model.getVacancy_ID();
		tableData [row][1] = model.getEmID();
		tableData [row][2] = model.getFilled_Date();
		tableData [row][3] = model.getIntake_Details();
		tableData [row][4] = model.getStatus();
		tableData [row][5] = model.getCreator();
		
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
			btnAdd.setText("Add");
			btnAdd.setSize(new Dimension(90, 40));
			btnAdd.setIcon(new ImageIcon(getClass().getResource("/images/Create.png")));
			btnAdd.setLocation(new Point(42, 295));
			btnAdd.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					(new VacanciesFillingInformation()).setVisible(true);
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
			btnEdit.setText("Update");
			btnEdit.setSize(new Dimension(100, 40));
			btnEdit.setIcon(new ImageIcon(getClass().getResource("/images/Update.png")));
			btnEdit.setLocation(new Point(198, 295));
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
			btnDelete.setText("Delete");
			btnDelete.setSize(new Dimension(90, 40));
			btnDelete.setIcon(new ImageIcon(getClass().getResource("/images/Delete.png")));
			btnDelete.setLocation(new Point(367, 295));
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
			jLabel3.setText("VacancyID :");
			jLabel3.setLocation(new Point(196, 17));
			jLabel3.setSize(new Dimension(69, 25));
			jLabel2 = new JLabel();
			jLabel2.setText("Filldate :");
			jLabel2.setSize(new Dimension(53, 25));
			jLabel2.setLocation(new Point(397, 17));
			jLabel1 = new JLabel();
			jLabel1.setText("EmpID :");
			jLabel1.setSize(new Dimension(53, 25));
			jLabel1.setLocation(new Point(9, 17));
			jPanel = new JPanel();
			jPanel.setLayout(null);
			jPanel.setLocation(new Point(31, 354));
			jPanel.setSize(new Dimension(678, 59));
			jPanel.setName("");
			jPanel.setToolTipText("");
			jPanel.add(jLabel1, null);
			jPanel.add(getTxtEmpid(), null);
			jPanel.add(jLabel2, null);
			jPanel.add(getTxtFilldate(), null);
			jPanel.add(jLabel3, null);
			jPanel.add(getTxtVacancyid(), null);
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
			txtEmpid.setLocation(new Point(72, 17));
			txtEmpid.setSize(new Dimension(90, 25));
		}
		return txtEmpid;
	}

	/**
	 * This method initializes txtFilldate	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtFilldate() {
		if (txtFilldate == null) {
			txtFilldate = new JTextField();
			txtFilldate.setLocation(new Point(462, 17));
			txtFilldate.setSize(new Dimension(90, 25));
		}
		return txtFilldate;
	}

	/**
	 * This method initializes txtVacancyid	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtVacancyid() {
		if (txtVacancyid == null) {
			txtVacancyid = new JTextField();
			txtVacancyid.setLocation(new Point(277, 17));
			txtVacancyid.setSize(new Dimension(90, 25));
		}
		return txtVacancyid;
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
			btnSearch.setSize(new Dimension(100, 25));
			btnSearch.setIcon(new ImageIcon(getClass().getResource("/images/View.png")));
			btnSearch.setLocation(new Point(568, 17));
		}
		return btnSearch;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
