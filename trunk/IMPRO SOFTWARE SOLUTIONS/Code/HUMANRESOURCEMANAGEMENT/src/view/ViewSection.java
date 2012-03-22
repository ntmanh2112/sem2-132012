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

import model.SectionModel;
import model.Vacancy_Fill_DetailsModel;
import dao.SectionDAO;
import dao.VacancyFillingDetailsDAO;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
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
	private JLabel jLabel2 = null;
	private JTextField txtDeptid = null;
	private JLabel jLabel3 = null;
	private JTextField txtSectionname = null;
	private JButton btnSearch = null;
	private String[] ColumnName ={"SecID","Name","Section_Inch","Dep_ID"};
	private String[][] tableData;

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
		this.setSize(634, 516);
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
			jLabel.setBounds(new Rectangle(222, 18, 154, 47));
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
			jScrollPane.setBounds(new Rectangle(27, 83, 567, 191));
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
			btnAdd.setText("Add");
			btnAdd.setSize(new Dimension(90, 30));
			btnAdd.setIcon(new ImageIcon(getClass().getResource("/images/Create.png")));
			btnAdd.setLocation(new Point(90, 420));
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
			btnEdit.setLocation(new Point(263, 420));
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
			btnDelete.setLocation(new Point(442, 420));
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
			jLabel3.setLocation(new Point(266, 17));
			jLabel3.setSize(new Dimension(77, 25));
			jLabel2 = new JLabel();
			jLabel2.setText("DeptID");
			jLabel2.setSize(new Dimension(41, 25));
			jLabel2.setLocation(new Point(9, 59));
			jLabel1 = new JLabel();
			jLabel1.setText("SectionID");
			jLabel1.setSize(new Dimension(56, 25));
			jLabel1.setLocation(new Point(9, 17));
			jPanel = new JPanel();
			jPanel.setLayout(null);
			jPanel.setLocation(new Point(28, 291));
			jPanel.setSize(new Dimension(564, 104));
			jPanel.add(jLabel1, null);
			jPanel.add(getTxtSectionid(), null);
			jPanel.add(jLabel2, null);
			jPanel.add(getTxtDeptid(), null);
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
			txtSectionid.setSize(new Dimension(160, 25));
		}
		return txtSectionid;
	}

	/**
	 * This method initializes txtDeptid	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtDeptid() {
		if (txtDeptid == null) {
			txtDeptid = new JTextField();
			txtDeptid.setLocation(new Point(88, 59));
			txtDeptid.setSize(new Dimension(160, 25));
		}
		return txtDeptid;
	}

	/**
	 * This method initializes txtSectionname	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtSectionname() {
		if (txtSectionname == null) {
			txtSectionname = new JTextField();
			txtSectionname.setLocation(new Point(353, 17));
			txtSectionname.setSize(new Dimension(160, 25));
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
			btnSearch.setLocation(new Point(373, 59));
		}
		return btnSearch;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
