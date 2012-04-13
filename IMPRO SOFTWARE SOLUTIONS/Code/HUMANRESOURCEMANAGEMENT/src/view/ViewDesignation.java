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
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import util.DataUtil;

import model.DesignationModel;
import model.EmployeeModel;
import model.SectionModel;
import dao.DesignationDAO;
import dao.EmployeeDAO;
import dao.SectionDAO;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ViewDesignation extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JScrollPane jScrollPane = null;
	private JTable jTableViewdesignation = null;
	private JButton btnAdd = null;
	private JButton btnEdit = null;
	private JButton btnDelete = null;
	private JPanel jPanel = null;
	private JLabel jLabel1 = null;
	private JTextField txtDesignationid = null;
	private JLabel jLabel2 = null;
	private JTextField txtDesignationname = null;
	private JButton btnSearch = null;
	private String[] ColumnName ={"DesID","Layer_ID","Designation"};
	private String[][] tableData;
	private JButton btnPrint = null;
	/**
	 * This is the default constructor
	 */
	public ViewDesignation() {
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
		this.setLocation((wndSize.width-701)/2, (wndSize.height-466)/2);
		this.setSize(701, 466);
		this.setContentPane(getJContentPane());
		this.setTitle("FrmViewDesign");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(229, 18, 202, 47));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 24));
			jLabel.setForeground(Color.red);
			jLabel.setText("View Designation");
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
			jScrollPane.setBounds(new Rectangle(27, 83, 635, 191));
			jScrollPane.setViewportView(getJTableViewdesignation());
		}
		return jScrollPane;
	}

	/**
	 * This method initializes jTableViewdesignation	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getJTableViewdesignation() {
		loadDataToTable();
		if (jTableViewdesignation == null) {
			jTableViewdesignation = new JTable(tableData,ColumnName);
		}
		return jTableViewdesignation;
	}
	private void loadDataToTable(){
		ArrayList<DesignationModel> listDesignation = DesignationDAO.getAllDesignation();
		tableData = new String[listDesignation.size()][9];
		int row = 0;
		for (DesignationModel model:listDesignation){
		tableData [row][0] = model.getDesID();
		tableData [row][1] = model.getLayer_ID();
		tableData [row][2] = model.getDesignation();
		
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
			btnAdd.setText("Add Designation");
			btnAdd.setSize(new Dimension(153, 40));
			btnAdd.setIcon(new ImageIcon(getClass().getResource("/images/add-2-icon.png")));
			btnAdd.setFont(new Font("Dialog", Font.BOLD, 12));
			btnAdd.setHorizontalTextPosition(SwingConstants.TRAILING);
			btnAdd.setHorizontalAlignment(SwingConstants.TRAILING);
			btnAdd.setLocation(new Point(28, 300));
			btnAdd.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					(new DesignationRegistration()).setVisible(true);
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
			btnEdit.setText("Update Designation");
			btnEdit.setSize(new Dimension(169, 40));
			btnEdit.setIcon(new ImageIcon(getClass().getResource("/images/Update.png")));
			btnEdit.setLocation(new Point(196, 300));
			btnEdit.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					int row = jTableViewdesignation.getSelectedRow();
					if(row== -1){
						JOptionPane.showMessageDialog(null, "You not choose to edit the line","Notice",JOptionPane.ERROR_MESSAGE);
						return;
					}
					int column = 0;
					String manvduocluachon = jTableViewdesignation.getValueAt(row, column).toString();
					DesignationModel model = new DesignationModel();
					model.setDesID(manvduocluachon);
					(new UpdateDesignation(model)).setVisible(true);
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
			btnDelete.setText("Delete Designation");
			btnDelete.setSize(new Dimension(165, 40));
			btnDelete.setIcon(new ImageIcon(getClass().getResource("/images/Delete.png")));
			btnDelete.setMnemonic(KeyEvent.VK_UNDEFINED);
			btnDelete.setLocation(new Point(378, 300));
			btnDelete.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					System.out.println("actionPerformed()"); // TODO Auto-generated Event stub actionPerformed()
					DesignationModel mo = new DesignationModel();
					int row = jTableViewdesignation.getSelectedRow();
					if(row== -1){
						JOptionPane.showMessageDialog(null, "You not choose to delete the line","Notice",JOptionPane.ERROR_MESSAGE);
						return;
					}
					int column = 0;
					String manvduocluachon = jTableViewdesignation.getValueAt(row, column).toString();
					mo.setDesID(manvduocluachon);
					int yn = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete","Notice",JOptionPane.OK_CANCEL_OPTION);
					if(yn == 0){
						Boolean kq = DesignationDAO.deleteDesignation(mo);
						if(kq){
							loadDataToTable();
							jTableViewdesignation.setModel(new DefaultTableModel(tableData,ColumnName));
							JOptionPane.showMessageDialog(null, "Delete success","Notice",JOptionPane.INFORMATION_MESSAGE);
							
						}else {
							JOptionPane.showMessageDialog(null, "Delete Failed","Notice",JOptionPane.WARNING_MESSAGE);
					
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
			jLabel2 = new JLabel();
			jLabel2.setText("DesignationName :");
			jLabel2.setSize(new Dimension(112, 25));
			jLabel2.setLocation(new Point(227, 17));
			jLabel1 = new JLabel();
			jLabel1.setText("DesignationID :");
			jLabel1.setSize(new Dimension(88, 25));
			jLabel1.setLocation(new Point(9, 17));
			jPanel = new JPanel();
			jPanel.setLayout(null);
			jPanel.setLocation(new Point(29, 358));
			jPanel.setSize(new Dimension(634, 58));
			jPanel.add(jLabel1, null);
			jPanel.add(getTxtDesignationid(), null);
			jPanel.add(jLabel2, null);
			jPanel.add(getTxtDesignationname(), null);
			jPanel.add(getBtnSearch(), null);
		    jPanel.setBorder(BorderFactory.createEtchedBorder());
		}
		return jPanel;
	}

	/**
	 * This method initializes txtDesignationid	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtDesignationid() {
		if (txtDesignationid == null) {
			txtDesignationid = new JTextField();
			txtDesignationid.setLocation(new Point(108, 17));
			txtDesignationid.setSize(new Dimension(90, 25));
		}
		return txtDesignationid;
	}

	/**
	 * This method initializes txtDesignationname	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtDesignationname() {
		if (txtDesignationname == null) {
			txtDesignationname = new JTextField();
			txtDesignationname.setLocation(new Point(354, 17));
			txtDesignationname.setSize(new Dimension(90, 25));
		}
		return txtDesignationname;
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
			btnSearch.setLocation(new Point(484, 17));
			btnSearch.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					loadDataToTableWhenSearch();
					jTableViewdesignation.setModel(new DefaultTableModel(tableData, ColumnName));
				}
			});
		}
		return btnSearch;
	}
	public void loadDataToTableWhenSearch (){
		String DesID = txtDesignationid.getText();
		String Designation = txtDesignationname.getText();
		
		ArrayList<DesignationModel> listDesignation = DesignationDAO.searchDesignation(DesID, Designation);
		tableData = new String [listDesignation.size()][3];
		int row = 0;
		for(DesignationModel model : listDesignation) {
			tableData [row][0] = model.getDesID();
			tableData [row][1] = model.getLayer_ID();
			tableData [row][2] = model.getDesignation();
			
			
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
			btnPrint.setIcon(new ImageIcon(getClass().getResource("/images/Print.png")));
			btnPrint.setLocation(new Point(569, 300));
			btnPrint.setSize(new Dimension(103, 40));
			btnPrint.setText("Print");
			btnPrint.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.out.println("actionPerformed()"); // TODO Auto-generated Event stub actionPerformed()
					Map parameters = new HashMap();
					parameters.put("DesID", txtDesignationid.getText().trim());
					parameters.put("Designation", txtDesignationname.getText().trim());
					
					
					try {
						JasperDesign jasperDesign = JRXmlLoader.load("src/report/reportDesignation.jrxml");
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
