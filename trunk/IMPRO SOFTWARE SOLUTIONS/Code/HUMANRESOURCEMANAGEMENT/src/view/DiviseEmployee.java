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
	private JButton btn2 = null;
	private JButton btn3 = null;
	private JButton btn4 = null;
	private JButton btnPrint = null;
	SectionModel model = new SectionModel();  //  @jve:decl-index=0:
	private JLabel jLabel4 = null;
	private JComboBox cbnVacancy = null;

	/**
	 * This is the default constructor
	 */
	public DiviseEmployee() {
		super();
		initialize();
		ArrayList<SectionModel> listSection = SectionDAO.getListSectionForDivision();
		for (SectionModel section : listSection) {
			KeyValue item = new KeyValue(section.getSecID(), section.getName());

			cbnSectionname.addItem(item);
		}
		/*ArrayList<VacanciesModel> listvacancy = VacanciesDAO.getAllVacancies();
		for (VacanciesModel vacncy : listvacancy) {
			KeyValue item = new KeyValue(vacncy.getVacancy_ID(), vacncy.getInterpretation());

			cbnVacancy.addItem(item);
		}*/
	}
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
			jLabel4.setLocation(new Point(137, 110));
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
			jLabel1.setLocation(new Point(137, 72));
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(291, 13, 228, 36));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 24));
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
			jContentPane.add(getBtn2(), null);
			jContentPane.add(getBtn3(), null);
			jContentPane.add(getBtn4(), null);
			jContentPane.add(getBtnPrint(), null);
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
		ArrayList<DivisionModel> listDivision = DivisionDAO.getListDivisionBySecID(SecID);
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
		cbnVacancy.removeAllItems();
		for (DivisionModel division : listDivision) {
			KeyValue item = new KeyValue(division.getId(),division.getInterpretation_Vacancy());
			cbnVacancy.addItem(item);
		}
		
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
			cbnSectionname.setLocation(new Point(276, 72));
			cbnSectionname.setSize(new Dimension(200, 25));
			cbnSectionname.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.out.println("actionPerformed()"); // TODO Auto-generated Event stub actionPerformed()
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
			btn1.setLocation(new Point(347, 204));
			btn1.setText(">");
			btn1.setSize(new Dimension(90, 30));
			btn1.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					// TODO Auto-generated Event stub actionPerformed()
					int row = getJListEmployeenotinvolved().getSelectedIndex();
					if(row== -1){
						JOptionPane.showMessageDialog(null, "Please choose one employee you want to divise","Notice",JOptionPane.ERROR_MESSAGE);
						return;
					}
					String divisionID = ((KeyValue)cbnVacancy.getSelectedItem()).getKey();
					String emid = getJListEmployeenotinvolved().getSelectedValue().toString().split("---")[1];
					String secid = ((KeyValue)cbnSectionname.getSelectedItem()).getKey();
					JOptionPane.showMessageDialog(null, "Tiến hành phân công đề án :" + secid + " Cho nhân viên : "+ emid);
					//System.out.println(emid+"-"+secid+"-"+divisionID);
					DivisionDAO.updateEmployeeToSection(emid, secid, divisionID);
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
	 * This method initializes btn2	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtn2() {
		if (btn2 == null) {
			btn2 = new JButton();
			btn2.setLocation(new Point(345, 253));
			btn2.setText(">>");
			btn2.setSize(new Dimension(90, 30));
			btn2.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.out.println("actionPerformed()"); // TODO Auto-generated Event stub actionPerformed()
					int size =  (getJListEmployeenotinvolved().getModel()).getSize();
					if(size == 0) {
						JOptionPane.showMessageDialog(null, "Nothing to divise");
						return ;
					}
					for (int i = 0; i< size; i++) {
						String emid = (getJListEmployeenotinvolved().getModel()).getElementAt(i).toString().split("-")[0];
						String secid = ((KeyValue)cbnSectionname.getSelectedItem()).getKey();
						
						DivisionModel mo = new DivisionModel();
						mo.setVacancy_ID("");
						
						mo.setSecID(secid);
						
						DivisionDAO.insertDivision(mo);
						
					}
				
				loadData();
				JOptionPane.showMessageDialog(null, "Devise all successfull");
			}
			});
		}
		return btn2;
	}

	/**
	 * This method initializes btn3	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtn3() {
		if (btn3 == null) {
			btn3 = new JButton();
			btn3.setLocation(new Point(346, 318));
			btn3.setText("<");
			btn3.setSize(new Dimension(90, 30));
			btn3.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					int row = getJListEmployeeinvolved().getSelectedIndex();
					if(row== -1){
						JOptionPane.showMessageDialog(null, "Please choose one employee to delete","Notice",JOptionPane.ERROR_MESSAGE);
						return;
					}
					String emid = getJListEmployeeinvolved().getSelectedValue().toString().split("-")[0];
					String secid = ((KeyValue)cbnSectionname.getSelectedItem()).getKey();
					
					DivisionModel model = new DivisionModel();
					model.setVacancy_ID("");
					
					model.setSecID(secid);
					
					Boolean kq = DivisionDAO.deleteDivision(model);
					loadData();
					if (kq) {
						JOptionPane.showMessageDialog(null, "Delete :" + emid + " from section : "+ secid + "successful");
					}
				}
			});
		}
		return btn3;
	}

	/**
	 * This method initializes btn4	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtn4() {
		if (btn4 == null) {
			btn4 = new JButton();
			btn4.setLocation(new Point(347, 364));
			btn4.setText("<<");
			btn4.setSize(new Dimension(90, 30));
			btn4.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.out.println("actionPerformed()"); // TODO Auto-generated Event stub actionPerformed()
					int size = (getJListEmployeeinvolved().getModel()).getSize();
					if(size == 0) {
						JOptionPane.showMessageDialog(null, "Không có gì để xóa");
						return ;
					}
					for (int i = 0; i< size; i++) {
						String emid = (getJListEmployeeinvolved().getModel()).getElementAt(i).toString().split("-")[0];
						String secid = ((KeyValue)cbnSectionname.getSelectedItem()).getKey();
						
						DivisionModel mo = new DivisionModel();
						mo.setVacancy_ID("");
						
						mo.setSecID(secid);
						
						DivisionDAO.deleteDivision(mo);
						
					}
					loadData();
					JOptionPane.showMessageDialog(null, "Delete all successfull");
				}
			});
		}
		return btn4;
	}

	/**
	 * This method initializes btnPrint	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnPrint() {
		if (btnPrint == null) {
			btnPrint = new JButton();
			btnPrint.setBounds(new Rectangle(332, 426, 121, 38));
			btnPrint.setText("Print");
		}
		return btnPrint;
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
			cbnVacancy.setLocation(new Point(276, 110));
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
