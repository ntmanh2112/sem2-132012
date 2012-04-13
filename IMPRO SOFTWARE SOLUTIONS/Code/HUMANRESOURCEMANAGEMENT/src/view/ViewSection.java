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
import java.util.HashMap;
import java.util.Map;

import javax.swing.JTextField;

import model.EmployeeModel;
import model.SectionModel;
import model.Vacancy_Fill_DetailsModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import dao.EmployeeDAO;
import dao.SectionDAO;
import dao.VacancyFillingDetailsDAO;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

import util.DataUtil;

import java.awt.Color;

public class ViewSection extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JScrollPane jScrollPane = null;
	private JTable jTableViewsection = null;
	private JButton btnAdd = null;
	private JButton btnEdit = null;
	private JButton btnDelete = null;
	private JPanel jPanel = null;
	private JLabel jLabel1 = null;
	private JTextField txtSectionid = null;
	private JLabel jLabel3 = null;
	private JTextField txtSectionname = null;
	private JButton btnSearch = null;
	private String[] ColumnName ={"SecID","Name","Section_Inch","DepID"};
	private String[][] tableData;
	private JButton btnPrint = null;

	/**
	 * This is the default constructor
	 */
	public ViewSection() {
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
		this.setLocation((wndSize.width-813)/2, (wndSize.height-492)/2);
		this.setResizable(false);
		this.setSize(813, 492);
		this.setContentPane(getJContentPane());
		this.setTitle("FrmViewSection");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(320, 17, 154, 47));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 24));
			jLabel.setForeground(Color.red);
			jLabel.setText("View Section");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(jLabel, null);
			jContentPane.add(getJScrollPane(), null);
			jContentPane.add(getBtnAdd(), null);
			jContentPane.add(getBtnEdit(), null);
			jContentPane.add(getBtnDelete(), null);
			jContentPane.add(getJPanel(), null);
			jContentPane.add(getBtnPrint(), null);
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
			jScrollPane.setBounds(new Rectangle(21, 83, 759, 191));
			jScrollPane.setViewportView(getJTableViewsection());
		}
		return jScrollPane;
	}

	/**
	 * This method initializes jTableViewsection	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getJTableViewsection() {
		loadDataToTable();
		if (jTableViewsection == null) {
			jTableViewsection = new JTable(tableData,ColumnName);
		}
		return jTableViewsection;
	}
	private void loadDataToTable(){
		ArrayList<SectionModel> listSection = SectionDAO.getAllSection();
		tableData = new String[listSection.size()][4];
		int row = 0;
		for (SectionModel model:listSection){
		tableData [row][0] = model.getSecID();
		tableData [row][1] = model.getName();
		tableData [row][2] = model.getSection_Inch();
		tableData [row][3] = model.getDep_ID();
				
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
			btnAdd.setText("Add Section");
			btnAdd.setSize(new Dimension(147, 40));
			btnAdd.setIcon(new ImageIcon(getClass().getResource("/images/Create.png")));
			btnAdd.setLocation(new Point(23, 304));
			btnAdd.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.out.println("actionPerformed()"); // TODO Auto-generated Event stub actionPerformed()
					(new SectionRegistration()).setVisible(true);
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
			btnEdit.setText("Update Section");
			btnEdit.setSize(new Dimension(147, 40));
			btnEdit.setIcon(new ImageIcon(getClass().getResource("/images/Modify.png")));
			btnEdit.setLocation(new Point(245, 304));
			btnEdit.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.out.println("actionPerformed()"); // TODO Auto-generated Event stub actionPerformed()
					int row = jTableViewsection.getSelectedRow();
					if(row== -1){
						JOptionPane.showMessageDialog(null, "You not choose to edit the line","Notice",JOptionPane.ERROR_MESSAGE);
						return;
					}
					int column = 0;
					String manvduocluachon = jTableViewsection.getValueAt(row, column).toString();
					SectionModel model = new SectionModel();
					model.setSecID(manvduocluachon);
					(new UpdateSection(model)).setVisible(true);
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
			btnDelete.setText("Delete Section");
			btnDelete.setSize(new Dimension(147, 40));
			btnDelete.setIcon(new ImageIcon(getClass().getResource("/images/Delete.png")));
			btnDelete.setLocation(new Point(453, 304));
			btnDelete.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.out.println("actionPerformed()");
					// TODO Auto-generated Event stub actionPerformed()
					SectionModel mo = new SectionModel();
					int row = jTableViewsection.getSelectedRow();
					if(row== -1){
						JOptionPane.showMessageDialog(null, "You not choose to delete the line","Notice",JOptionPane.ERROR_MESSAGE);
						return;
					}
					int column = 0;
					String masectionduocluachon = jTableViewsection.getValueAt(row, column).toString();
					mo.setSecID(masectionduocluachon);
					int yn = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete","Notice",JOptionPane.OK_CANCEL_OPTION);
					if(yn == 0){
						Boolean kq = SectionDAO.deleteSection(mo);
						if(kq){
							loadDataToTable();
							jTableViewsection.setModel(new DefaultTableModel(tableData,ColumnName));
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
			jLabel3 = new JLabel();
			jLabel3.setText("SectionName");
			jLabel3.setLocation(new Point(210, 17));
			jLabel3.setSize(new Dimension(77, 25));
			jLabel1 = new JLabel();
			jLabel1.setText("SectionID");
			jLabel1.setSize(new Dimension(56, 25));
			jLabel1.setLocation(new Point(9, 17));
			jPanel = new JPanel();
			jPanel.setLayout(null);
			jPanel.setLocation(new Point(23, 361));
			jPanel.setSize(new Dimension(573, 60));
			jPanel.add(jLabel1, null);
			jPanel.add(getTxtSectionid(), null);
			jPanel.add(jLabel3, null);
			jPanel.add(getTxtSectionname(), null);
			jPanel.add(getBtnSearch(), null);
		    jPanel.setBorder(BorderFactory.createEtchedBorder());
		}
		return jPanel;
	}

	/**
	 * This method initializes txtSectionid	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtSectionid() {
		if (txtSectionid == null) {
			txtSectionid = new JTextField();
			txtSectionid.setLocation(new Point(88, 17));
			txtSectionid.setSize(new Dimension(90, 25));
		}
		return txtSectionid;
	}

	/**
	 * This method initializes txtSectionname	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtSectionname() {
		if (txtSectionname == null) {
			txtSectionname = new JTextField();
			txtSectionname.setLocation(new Point(302, 17));
			txtSectionname.setSize(new Dimension(90, 25));
		}
		return txtSectionname;
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
			btnSearch.setSize(new Dimension(117, 25));
			btnSearch.setMnemonic(KeyEvent.VK_UNDEFINED);
			btnSearch.setIcon(new ImageIcon(getClass().getResource("/images/View.png")));
			btnSearch.setLocation(new Point(423, 17));
			btnSearch.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					loadDataToTableWhenSearch();
					jTableViewsection.setModel(new DefaultTableModel(tableData, ColumnName));
				}
			});
		}
		return btnSearch;
	}
	public void loadDataToTableWhenSearch (){
		String SecID = txtSectionid.getText();
		String Name = txtSectionname.getText();
		
		ArrayList<SectionModel> listSection = SectionDAO.searchSection(SecID, Name);
		tableData = new String [listSection.size()][4];
		int row = 0;
		for(SectionModel model : listSection) {
			tableData [row][0] = model.getSecID();
			tableData [row][1] = model.getName();
			tableData [row][2] = model.getSection_Inch();
			tableData [row][3] = model.getDep_ID();
			
			
			row ++;
		}
	}

	/**
	 * This method initializes btnPrint	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnPrint() {
		if (btnPrint == null) {
			btnPrint = new JButton();
			btnPrint.setText("Print");
			btnPrint.setLocation(new Point(643, 304));
			btnPrint.setIcon(new ImageIcon(getClass().getResource("/images/Print.png")));
			btnPrint.setSize(new Dimension(136, 40));
			btnPrint.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.out.println("actionPerformed()"); // TODO Auto-generated Event stub actionPerformed()
					Map parameters = new HashMap();
					parameters.put("SecID", txtSectionid.getText().trim());
					parameters.put("Name", txtSectionname.getText().trim());
					
					
					try {
						JasperDesign jasperDesign = JRXmlLoader.load("src/report/reportSection.jrxml");
						JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
						JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, DataUtil.getConnection());
						JasperViewer.viewReport(jasperPrint,false);
					} catch (JRException a) {
						// TODO Auto-generated catch block
						a.printStackTrace();
					}
				}
			});
		}
		return btnPrint;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
