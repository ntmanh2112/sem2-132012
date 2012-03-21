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
import javax.swing.JTextField;

public class ViewDepartmentDependencies extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JScrollPane jScrollPane = null;
	private JTable jTableViewdepartmentdependencies = null;
	private JButton btnAdd = null;
	private JButton btnEdit = null;
	private JButton btnDelete = null;
	private JPanel jPanel = null;
	private JLabel jLabel1 = null;
	private JTextField txtDeptid = null;
	private JLabel jLabel2 = null;
	private JTextField txtLowerdept = null;
	private JLabel jLabel3 = null;
	private JTextField txtUpperdept = null;
	private JButton btnSearch = null;

	/**
	 * This is the default constructor
	 */
	public ViewDepartmentDependencies() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(650, 516);
		this.setContentPane(getJContentPane());
		this.setTitle("FrmViewDeptDep");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(116, 18, 370, 47));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 24));
			jLabel.setText("View Department Dependencies");
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
			jScrollPane.setViewportView(getJTableViewdepartmentdependencies());
		}
		return jScrollPane;
	}

	/**
	 * This method initializes jTableViewdepartmentdependencies	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getJTableViewdepartmentdependencies() {
		if (jTableViewdepartmentdependencies == null) {
			jTableViewdepartmentdependencies = new JTable();
		}
		return jTableViewdepartmentdependencies;
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
			btnEdit.setLocation(new Point(270, 420));
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
			btnDelete.setLocation(new Point(450, 420));
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
			jLabel3.setText("UpperDept");
			jLabel3.setLocation(new Point(278, 17));
			jLabel3.setSize(new Dimension(60, 30));
			jLabel2 = new JLabel();
			jLabel2.setText("LowerDept");
			jLabel2.setSize(new Dimension(64, 30));
			jLabel2.setLocation(new Point(9, 69));
			jLabel1 = new JLabel();
			jLabel1.setText("DeptID");
			jLabel1.setSize(new Dimension(40, 30));
			jLabel1.setLocation(new Point(9, 17));
			jPanel = new JPanel();
			jPanel.setLayout(null);
			jPanel.setLocation(new Point(28, 291));
			jPanel.setSize(new Dimension(564, 116));
			jPanel.add(jLabel1, null);
			jPanel.add(getTxtDeptid(), null);
			jPanel.add(jLabel2, null);
			jPanel.add(getTxtLowerdept(), null);
			jPanel.add(jLabel3, null);
			jPanel.add(getTxtUpperdept(), null);
			jPanel.add(getBtnSearch(), null);
		    jPanel.setBorder(BorderFactory.createEtchedBorder());
		}
		return jPanel;
	}

	/**
	 * This method initializes txtDeptid	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtDeptid() {
		if (txtDeptid == null) {
			txtDeptid = new JTextField();
			txtDeptid.setLocation(new Point(88, 17));
			txtDeptid.setSize(new Dimension(160, 30));
		}
		return txtDeptid;
	}

	/**
	 * This method initializes txtLowerdept	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtLowerdept() {
		if (txtLowerdept == null) {
			txtLowerdept = new JTextField();
			txtLowerdept.setLocation(new Point(88, 69));
			txtLowerdept.setSize(new Dimension(160, 30));
		}
		return txtLowerdept;
	}

	/**
	 * This method initializes txtUpperdept	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtUpperdept() {
		if (txtUpperdept == null) {
			txtUpperdept = new JTextField();
			txtUpperdept.setLocation(new Point(353, 17));
			txtUpperdept.setSize(new Dimension(160, 30));
		}
		return txtUpperdept;
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
			btnSearch.setSize(new Dimension(117, 30));
			btnSearch.setLocation(new Point(353, 69));
		}
		return btnSearch;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
