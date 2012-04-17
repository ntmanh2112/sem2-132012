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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import Common.KeyValue;

import dao.DivisionDAO;
import dao.SectionDAO;
import dao.VacanciesDAO;

import model.DivisionModel;
import model.EmployeeModel;
import model.SectionModel;
import model.VacanciesModel;
import java.awt.Color;
import javax.swing.ImageIcon;

public class DiviseEmployee extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JComboBox cbnSectionname = null;
	private JLabel jLabel2 = null;
	private JList jListEmployeenotinvolved = null;
	private JList jListEmployeeinvolved = null;
	private JLabel jLabel3 = null;
	private JButton btn1 = null;
	SectionModel model = new SectionModel();  //  @jve:decl-index=0:
	private JLabel jLabel4 = null;
	private JComboBox cbnVacancy = null;

	/**
	 * This is the default constructor
	 */
	public DiviseEmployee() {
		super();
		initialize();
		ArrayList<SectionModel> listSection = SectionDAO.getListSection();
		for (SectionModel section : listSection) {
			KeyValue item = new KeyValue(section.getSecID(), section.getName());

			cbnSectionname.addItem(item);
			if (item.getKey().equals(model.getSecID())) {
				cbnSectionname.setSelectedItem(item);
			}
		}
		
		ArrayList<VacanciesModel> listvacancy = VacanciesDAO.getAllVacancies();
		for (VacanciesModel vacncy : listvacancy) {
			KeyValue item = new KeyValue(vacncy.getVacancy_ID(), vacncy.getInterpretation());
			
			cbnVacancy.addItem(item);
			if (item.getKey().equals(model.getSecID())) {
				cbnVacancy.setSelectedItem(item);
			}
			//cbnVacancy.removeAllItems();
		}
		}
		//cbnVacancy.removeAllItems();
		/*for (DivisionModel division : listDivision) {
			KeyValue item = new KeyValue(division.getId(),division.getInterpretation_Vacancy());
			cbnVacancy.addItem(item);
		}*/
	
	public DiviseEmployee(EmployeeModel mo) {
		super();
		initialize();;
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
		this.setLocation((wndSize.width-804)/2, (wndSize.height-489)/2);
		this.setSize(804, 516);
		this.setContentPane(getJContentPane());
		this.setTitle("JFrame");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabel4 = new JLabel();
			jLabel4.setText("Vacancy_ID");
			jLabel4.setLocation(new Point(226, 109));
			jLabel4.setSize(new Dimension(82, 25));
			jLabel3 = new JLabel();
			jLabel3.setText("Employee Involved");
			jLabel3.setSize(new Dimension(109, 30));
			jLabel3.setLocation(new Point(559, 158));
			jLabel2 = new JLabel();
			jLabel2.setText("Employee Not Involved");
			jLabel2.setSize(new Dimension(130, 30));
			jLabel2.setLocation(new Point(92, 157));
			jLabel1 = new JLabel();
			jLabel1.setText("SectionName");
			jLabel1.setSize(new Dimension(76, 25));
			jLabel1.setLocation(new Point(224, 72));
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(291, 13, 228, 36));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 24));
			jLabel.setForeground(Color.red);
			jLabel.setText("Division Employee");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(jLabel, null);
			jContentPane.add(jLabel1, null);
			jContentPane.add(getCbnSectionname(), null);
			jContentPane.add(jLabel2, null);
			jContentPane.add(getJListEmployeenotinvolved(), null);
			jContentPane.add(getJListEmployeeinvolved(), null);
			jContentPane.add(jLabel3, null);
			jContentPane.add(getBtn1(), null);
			jContentPane.add(jLabel4, null);
			jContentPane.add(getCbnVacancy(), null);
		}
		return jContentPane;
	}
	private void loadData() {
		String SecID = ((KeyValue)cbnSectionname.getSelectedItem()).getKey();
		//String Vacancy_ID = ((KeyValue)cbnVacancy.getSelectedItem()).getKey();
		
		ArrayList<EmployeeModel> listRightDivision = DivisionDAO.searchemployeeindivision(SecID);
		ArrayList<EmployeeModel> listLeftDivision = DivisionDAO.searchemployeenotindivision(SecID);
		//ArrayList<DivisionModel> listDivision = DivisionDAO.getListDivisionBySecID(SecID);
		DefaultListModel contentList = new DefaultListModel();
		for (EmployeeModel mo : listRightDivision) {
			contentList.addElement(mo.getName() + "---" + mo.getEmID());
		}
		getJListEmployeeinvolved().setModel(contentList);
		
		contentList = new DefaultListModel();
		for (EmployeeModel mo : listLeftDivision) {
			contentList.addElement(mo.getName() + "---" + mo.getEmID());
		}
		getJListEmployeenotinvolved().setModel(contentList);
		/*cbnVacancy.removeAllItems();
		for (DivisionModel division : listDivision) {
			KeyValue item = new KeyValue(division.getId(),division.getInterpretation_Vacancy());
			cbnVacancy.addItem(item);
		}*/
		
		/*ArrayList<EmployeeModel> listLeftDivision = DivisionDAO.searchemloyeenotindivision(SecID);
		
		DefaultListModel content = new DefaultListModel();
		for (EmployeeModel mo : listLeftDivision) {
			content.addElement(mo.getName());
		}
		getJListEmployeenotinvolved().setModel(content);*/
	}

	/**
	 * This method initializes cbnProjectname	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getCbnSectionname() {
		if (cbnSectionname == null) {
			cbnSectionname = new JComboBox();
			cbnSectionname.setLocation(new Point(368, 72));
			cbnSectionname.setSize(new Dimension(200, 25));
			cbnSectionname.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					
					
					//KeyValue val = (KeyValue) cbnSectionname.getSelectedItem();
					//String Vacancy_ID = ((KeyValue)cbnVacancy.getSelectedItem()).getKey();
					//String SecID = ((KeyValue)cbnSectionname.getSelectedItem()).getKey();
					//VacanciesDAO.getSectionByID(SecID);
					//ArrayList<VacanciesModel> listDivision = VacanciesDAO.getSectionByID(SecID);
					loadData();
				}
			});
			
		}
		return cbnSectionname;
	}

	/**
	 * This method initializes jListEmployeenotinvolved	
	 * 	
	 * @return javax.swing.JList	
	 */
	private JList getJListEmployeenotinvolved() {
		//loadData();
		if (jListEmployeenotinvolved == null) {
			jListEmployeenotinvolved = new JList();
			jListEmployeenotinvolved.setBounds(new Rectangle(11, 200, 318, 241));
			jListEmployeenotinvolved.setBorder(BorderFactory.createEtchedBorder());
		
		}
		return jListEmployeenotinvolved;
	}

	/**
	 * This method initializes jListEmployeeinvolved	
	 * 	
	 * @return javax.swing.JList	
	 */
	private JList getJListEmployeeinvolved() {
		//loadData();
		if (jListEmployeeinvolved == null) {
			jListEmployeeinvolved = new JList();
			jListEmployeeinvolved.setSize(new Dimension(318, 241));
			jListEmployeeinvolved.setLocation(new Point(455, 200));
			jListEmployeeinvolved.setBorder(BorderFactory.createEtchedBorder());
		}
		return jListEmployeeinvolved;
	}

	/**
	 * This method initializes btn1	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtn1() {
		if (btn1 == null) {
			btn1 = new JButton();
			btn1.setLocation(new Point(346, 306));
			btn1.setText("");
			btn1.setIcon(new ImageIcon(getClass().getResource("/images/Forward.png")));
			btn1.setSize(new Dimension(90, 30));
			btn1.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					// TODO Auto-generated Event stub actionPerformed()
					int row = getJListEmployeenotinvolved().getSelectedIndex();
					if(row== -1){
						JOptionPane.showMessageDialog(null, "Please choose one employee you want to divise","Notice",JOptionPane.ERROR_MESSAGE);
						return;
					}
					//String divisionID = ((KeyValue)cbnVacancy.getSelectedItem()).getKey();
					String Vacancy_ID = ((KeyValue)cbnVacancy.getSelectedItem()).getKey();
					String emid = getJListEmployeenotinvolved().getSelectedValue().toString().split("---")[1];
					String secid = ((KeyValue)cbnSectionname.getSelectedItem()).getKey();
					JOptionPane.showMessageDialog(null, "Perform assigned : " + secid + " Employees : "+ emid);
					//System.out.println(emid+"-"+secid+"-"+divisionID);
					DivisionDAO.updateEmployeeToSection(emid, secid, Vacancy_ID);
					loadData();
					/*DivisionModel model = new DivisionModel();
					model.setVacancy_ID(VacancyID);
					
					model.setSecID(secid);
					Boolean kq = DivisionDAO.insertDivision(model);
					
					if (kq) {
						JOptionPane.showMessageDialog(null, "Devise " + secid + " for employee : "+ emid + "successful");
					}
						*/
					
				}
			});
		}
		return btn1;
	}

	/**
	 * This method initializes cbnVacancy	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getCbnVacancy() {
		if (cbnVacancy == null) {
			cbnVacancy = new JComboBox();
			cbnVacancy.setSize(new Dimension(200, 25));
			cbnVacancy.setLocation(new Point(369, 110));
			cbnVacancy.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					loadData();
				}
			});
		}
		return cbnVacancy;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
