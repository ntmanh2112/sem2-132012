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

import model.DepartmentsModel;
import model.DesignLayerModel;
import model.EmployeeModel;
import model.Vacancy_Fill_DetailsModel;
import dao.DepartmentsDAO;
import dao.DesignLayerDAO;
import dao.EmployeeDAO;
import dao.VacancyFillingDetailsDAO;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ViewDesignationLayer extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JScrollPane jScrollPane = null;
	private JTable jTableViewdesignationlayer = null;
	private JButton btnAdd = null;
	private JButton btnEdit = null;
	private JButton btnDelete = null;
	private JPanel jPanel = null;
	private JLabel jLabel1 = null;
	private JTextField txtDesignationid = null;
	private JLabel jLabel3 = null;
	private JTextField txtLayer = null;
	private JButton btnSearch = null;
	private String[] ColumnName ={"ID","Layer","Weightage"};
	private String[][] tableData;
	private JButton btnPrint = null;
	/**
	 * This is the default constructor
	 */
	public ViewDesignationLayer() {
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
		this.setLocation((wndSize.width-773)/2, (wndSize.height-516)/2);
		this.setSize(773, 516);
		this.setContentPane(getJContentPane());
		this.setTitle("FrmViewDesignLayer");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(259, 17, 243, 47));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 24));
			jLabel.setForeground(Color.red);
			jLabel.setText("View DesignaLayer");
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
			jScrollPane.setBounds(new Rectangle(27, 83, 697, 191));
			jScrollPane.setViewportView(getJTableViewdesignationlayer());
		}
		return jScrollPane;
	}

	/**
	 * This method initializes jTableViewdesignationlayer	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getJTableViewdesignationlayer() {
		loadDataToTable();
		if (jTableViewdesignationlayer == null) {
			jTableViewdesignationlayer = new JTable(tableData, ColumnName);
			
		}
		return jTableViewdesignationlayer;
	}
	private void loadDataToTable(){
		ArrayList<DesignLayerModel> listDesigLayer = DesignLayerDAO.getAllDesignLayer();
		tableData = new String[listDesigLayer.size()][7];
		int row = 0;
		for (DesignLayerModel model:listDesigLayer){
		tableData [row][0] = model.getLayer_ID();
		tableData [row][1] = model.getLayer();
		tableData [row][2] = model.getWeightage();
		
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
			btnAdd.setSize(new Dimension(90, 30));
			btnAdd.setIcon(new ImageIcon(getClass().getResource("/images/Create.png")));
			btnAdd.setLocation(new Point(113, 391));
			btnAdd.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.out.println("actionPerformed()"); // TODO Auto-generated Event stub actionPerformed()
					(new DesignationLayerRegistration()).setVisible(true);
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
			btnEdit.setText("Edit");
			btnEdit.setSize(new Dimension(90, 30));
			btnEdit.setIcon(new ImageIcon(getClass().getResource("/images/Modify.png")));
			btnEdit.setLocation(new Point(263, 390));
			btnEdit.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.out.println("actionPerformed()"); // TODO Auto-generated Event stub actionPerformed()
					int row = jTableViewdesignationlayer.getSelectedRow();
					if(row== -1){
						JOptionPane.showMessageDialog(null, "You not choose to edit the line","Notice",JOptionPane.ERROR_MESSAGE);
						return;
					}
					int column = 0;
					String manvduocluachon = jTableViewdesignationlayer.getValueAt(row, column).toString();
					DesignLayerModel model = new DesignLayerModel();
					model.setLayer_ID(manvduocluachon);
					//JOptionPane.showMessageDialog(null,manvduocluachon);
					(new UpdateLayer(model)).setVisible(true);
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
			btnDelete.setText("Delete");
			btnDelete.setSize(new Dimension(90, 30));
			btnDelete.setIcon(new ImageIcon(getClass().getResource("/images/Delete.png")));
			btnDelete.setLocation(new Point(410, 391));
			btnDelete.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					//System.out.println("actionPerformed()"); // TODO Auto-generated Event stub actionPerformed()
					System.out.println("actionPerformed()"); // TODO Auto-generated Event stub actionPerformed()
					DesignLayerModel mo = new DesignLayerModel();
					int row = jTableViewdesignationlayer.getSelectedRow();
					if(row== -1){
						JOptionPane.showMessageDialog(null, "You not choose to delete the line","Notice",JOptionPane.ERROR_MESSAGE);
						return;
					}
					int column = 0;
					String manvduocluachon = jTableViewdesignationlayer.getValueAt(row, column).toString();
					mo.setLayer_ID(manvduocluachon);
					int yn = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete","Notice",JOptionPane.OK_CANCEL_OPTION);
					if(yn == 0){
						Boolean kq = DesignLayerDAO.deleteDesignLayer(mo);
						if(kq){
							loadDataToTable();
							jTableViewdesignationlayer.setModel(new DefaultTableModel(tableData,ColumnName));
							JOptionPane.showMessageDialog(null, "Delete Success","Notice",JOptionPane.INFORMATION_MESSAGE);
							
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
			jLabel3.setText("Layer :");
			jLabel3.setLocation(new Point(196, 17));
			jLabel3.setSize(new Dimension(44, 25));
			jLabel1 = new JLabel();
			jLabel1.setText("Layer_ID :");
			jLabel1.setSize(new Dimension(67, 25));
			jLabel1.setLocation(new Point(9, 17));
			jPanel = new JPanel();
			jPanel.setLayout(null);
			jPanel.setLocation(new Point(28, 291));
			jPanel.setSize(new Dimension(542, 60));
			jPanel.add(jLabel1, null);
			jPanel.add(getTxtDesignationid(), null);
			jPanel.add(jLabel3, null);
			jPanel.add(getTxtLayer(), null);
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
			txtDesignationid.setLocation(new Point(87, 17));
			txtDesignationid.setSize(new Dimension(90, 25));
		}
		return txtDesignationid;
	}

	/**
	 * This method initializes txtLayer	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtLayer() {
		if (txtLayer == null) {
			txtLayer = new JTextField();
			txtLayer.setLocation(new Point(253, 17));
			txtLayer.setSize(new Dimension(90, 25));
		}
		return txtLayer;
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
			btnSearch.setIcon(new ImageIcon(getClass().getResource("/images/View.png")));
			btnSearch.setLocation(new Point(387, 16));
			btnSearch.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.out.println("actionPerformed()"); // TODO Auto-generated Event stub actionPerformed()
					loadDataToTableWhenSearch();
					jTableViewdesignationlayer.setModel(new DefaultTableModel(tableData, ColumnName));
				}
			});
		}
		return btnSearch;
	}
	public void loadDataToTableWhenSearch (){
		String Layer_ID = txtDesignationid.getText();
		String Layer = txtLayer.getText();
		
		ArrayList<DesignLayerModel> listlayer = DesignLayerDAO.searchDesignLayer(Layer_ID, Layer);
		tableData = new String [listlayer.size()][3];
		int row = 0;
		for(DesignLayerModel model : listlayer) {
			tableData [row][0] = model.getLayer_ID();
			tableData [row][1] = model.getLayer();
			tableData [row][2] = model.getWeightage();	
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
			btnPrint.setSize(new Dimension(94, 30));
			btnPrint.setLocation(new Point(555, 391));
			btnPrint.setText("Print");
			btnPrint.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.out.println("actionPerformed()"); // TODO Auto-generated Event stub actionPerformed()
					Map parameters = new HashMap();
					parameters.put("Layer_ID", txtDesignationid.getText().trim());
					parameters.put("Layer", txtLayer.getText().trim());
					//parameters.put("Weightage", txtWeightage.getText().trim());
					
					try {
						JasperDesign jasperDesign = JRXmlLoader.load("src/report/reportDesignlayer.jrxml");
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
