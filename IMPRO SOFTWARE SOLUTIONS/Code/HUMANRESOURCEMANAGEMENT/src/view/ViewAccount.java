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

import model.AccountModel;
import model.DepartmentsModel;
import model.EmployeeModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import dao.AccountDAO;
import dao.DepartmentsDAO;
import dao.EmployeeDAO;

import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

import util.DataUtil;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.Color;

public class ViewAccount extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JScrollPane jScrollPane = null;
	private JTable jTableViewAccount = null;
	private JButton btnEdit = null;
	private JPanel jPanel = null;
	private JLabel jLabel1 = null;
	private JTextField txtEmpid = null;
	private JButton btnSearch = null;
	private String[] ColumnName ={"EmID","Name","Layer","Position"};
	private String[][] tableData;
	private JLabel jLabel2 = null;
	private JTextField txtDesignation = null;
	private JLabel jLabel3 = null;
	private JTextField txtname = null;
	private JButton btnPrint = null;
	/**
	 * This is the default constructor
	 */
	public ViewAccount() {
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
		this.setLocation((wndSize.width-807)/2, (wndSize.height-461)/2);
		this.setSize(807, 413);
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
			jLabel.setBounds(new Rectangle(299, 18, 185, 47));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 24));
			jLabel.setForeground(Color.red);
			jLabel.setText("View Account");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(jLabel, null);
			jContentPane.add(getJScrollPane(), null);
			//jContentPane.add(getBtnEdit(), null);
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
			jScrollPane.setBounds(new Rectangle(32, 84, 739, 191));
			jScrollPane.setViewportView(getJTableViewAccount());
		}
		return jScrollPane;
	}

	/**
	 * This method initializes jTableViewemployee	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getJTableViewAccount() {
		loadDataToTable();
		if (jTableViewAccount == null) {
			jTableViewAccount = new JTable(tableData, ColumnName);
		}
		return jTableViewAccount;
	}
	private void loadDataToTable(){
		ArrayList<AccountModel> listAccount = AccountDAO.getAllAccount();
		tableData = new String[listAccount.size()][4];
		int row = 0;
		for (AccountModel model:listAccount){
		//tableData [row][0] = model.getUserID();
		tableData [row][0] = model.getEmID();
		tableData [row][1] = model.getName();
		tableData [row][2] = model.getLayer();
		tableData [row][3] = model.getDesignation();
		
		
		
		row++;
		}
		}

	/**
	 * This method initializes btnEdit	
	 * 	
	 * @return javax.swing.JButton	
	 */
	/*private JButton getBtnEdit() {
		if (btnEdit == null) {
			btnEdit = new JButton();
			btnEdit.setText("Update Account");
			btnEdit.setSize(new Dimension(158, 35));
			btnEdit.setIcon(new ImageIcon(getClass().getResource("/images/Update.png")));
			btnEdit.setMnemonic(KeyEvent.VK_UNDEFINED);
			btnEdit.setLocation(new Point(233, 295));
			btnEdit.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					int row = jTableViewAccount.getSelectedRow();
					if(row== -1){
						JOptionPane.showMessageDialog(null, "You not choose to edit the line","Notice",JOptionPane.ERROR_MESSAGE);
						return;
					}
					int column = 0;
					String manvduocluachon = jTableViewAccount.getValueAt(row, column).toString();
					//JOptionPane.showMessageDialog(null, manvduocluachon);
					AccountModel model = new AccountModel();
					model.setEmID(manvduocluachon);
					(new UpdateAccount(model)).setVisible(true);
					dispose();
				}
			});
		}
		return btnEdit;
	}*/

	/**
	 * This method initializes jPanel	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel() {
		if (jPanel == null) {
			jLabel3 = new JLabel();
			jLabel3.setText("Name :");
			jLabel3.setLocation(new Point(173, 17));
			jLabel3.setSize(new Dimension(45, 25));
			jLabel2 = new JLabel();
			jLabel2.setText("Designation :");
			jLabel2.setLocation(new Point(385, 17));
			jLabel2.setSize(new Dimension(76, 25));
			jLabel1 = new JLabel();
			jLabel1.setText("EmpID :");
			jLabel1.setSize(new Dimension(46, 25));
			jLabel1.setLocation(new Point(9, 17));
			jPanel = new JPanel();
			jPanel.setLayout(null);
			jPanel.setLocation(new Point(33, 280));
			jPanel.setSize(new Dimension(740, 93));
			jPanel.add(jLabel1, null);
			jPanel.add(getTxtEmpid(), null);
			jPanel.add(getBtnSearch(), null);
		    jPanel.setBorder(BorderFactory.createEtchedBorder());
		    jPanel.add(jLabel2, null);
		    jPanel.add(getTxtDesignation(), null);
		    jPanel.add(jLabel3, null);
		    jPanel.add(getTxtname(), null);
		    jPanel.add(getBtnPrint(), null);
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
			txtEmpid.setLocation(new Point(70, 17));
			txtEmpid.setSize(new Dimension(90, 25));
		}
		return txtEmpid;
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
			btnSearch.setSize(new Dimension(106, 34));
			btnSearch.setIcon(new ImageIcon(getClass().getResource("/images/View.gif")));
			btnSearch.setLocation(new Point(614, 7));
			btnSearch.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					loadDataToTableWhenSearch();
					jTableViewAccount.setModel(new DefaultTableModel(tableData, ColumnName));
				}
			});
		}
		return btnSearch;
	}
	public void loadDataToTableWhenSearch (){
		String EmID = txtEmpid.getText();
		String Name = txtname.getText();
		String Designation = txtDesignation.getText();
		ArrayList<AccountModel> listAccount = AccountDAO.searchAccount(EmID, Name, Designation);
		tableData = new String [listAccount.size()][4];
		int row = 0;
		for(AccountModel model : listAccount) {
			tableData [row][0] = model.getEmID();
			tableData [row][1] = model.getName();
			//tableData [row][2] = model.getPassword();
			tableData [row][2] = model.getLayer();	
			tableData [row][3] = model.getDesignation();
			
			row ++;
		}
	}

	/**
	 * This method initializes txtDesignation	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtDesignation() {
		if (txtDesignation == null) {
			txtDesignation = new JTextField();
			txtDesignation.setSize(new Dimension(121, 25));
			txtDesignation.setLocation(new Point(477, 17));
		}
		return txtDesignation;
	}

	/**
	 * This method initializes txtname	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtname() {
		if (txtname == null) {
			txtname = new JTextField();
			txtname.setLocation(new Point(232, 17));
			txtname.setSize(new Dimension(130, 25));
		}
		return txtname;
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
			btnPrint.setSize(new Dimension(106, 34));
			btnPrint.setIcon(new ImageIcon(getClass().getResource("/images/Print.png")));
			btnPrint.setLocation(new Point(614, 50));
			btnPrint.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.out.println("actionPerformed()"); // TODO Auto-generated Event stub actionPerformed()
					Map parameters = new HashMap();
					parameters.put("EmID", txtEmpid.getText().trim());
					parameters.put("name", txtname.getText().trim());
					parameters.put("Deignation", txtDesignation.getText().trim());
					
					try {
						JasperDesign jasperDesign = JRXmlLoader.load("src/report/reprortsearch.jrxml");
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
