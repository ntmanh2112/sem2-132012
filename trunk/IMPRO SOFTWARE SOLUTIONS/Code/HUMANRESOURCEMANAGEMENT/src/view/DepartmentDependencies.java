package view;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Rectangle;
import java.awt.Font;
import java.awt.Point;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.GridBagLayout;
import javax.swing.JToggleButton;

public class DepartmentDependencies extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JComboBox cbnDeptno = null;
	private JLabel jLabel2 = null;
	private JTextField txtUpperdept = null;
	private JLabel jLabel3 = null;
	private JTextField txtLowerdept = null;
	private JButton btnAdd = null;
	
	private JButton btnEdit = null;
	private JButton btnDelete = null;
	/**
	 * This is the default constructor
	 */
	public DepartmentDependencies() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(458, 357);
		this.setContentPane(getJContentPane());
		this.setTitle("FrmInterDep");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabel3 = new JLabel();
			jLabel3.setText("LowerDept :");
			jLabel3.setLocation(new Point(46, 180));
			jLabel3.setSize(new Dimension(70, 25));
			jLabel2 = new JLabel();
			jLabel2.setText("UpperDept :");
			jLabel2.setLocation(new Point(45, 140));
			jLabel2.setSize(new Dimension(70, 25));
			jLabel1 = new JLabel();
			jLabel1.setText("DeptNo :");
			jLabel1.setLocation(new Point(45, 100));
			jLabel1.setSize(new Dimension(56, 25));
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(63, 16, 305, 49));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 24));
			jLabel.setForeground(new Color(255, 0, 23));
			jLabel.setText("Department Dependencies");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.setBackground(new Color(238, 238, 238));
			jContentPane.add(jLabel, null);
			jContentPane.add(jLabel1, null);
			jContentPane.add(getCbnDeptno(), null);
			jContentPane.add(jLabel2, null);
			jContentPane.add(getTxtUpperdept(), null);
			jContentPane.add(jLabel3, null);
			jContentPane.add(getTxtLowerdept(), null);
			jContentPane.add(getBtnAdd(), null);
			
			jContentPane.add(getBtnEdit(), null);
			jContentPane.add(getBtnDelete(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes cbnDeptno	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getCbnDeptno() {
		if (cbnDeptno == null) {
			cbnDeptno = new JComboBox();
			cbnDeptno.setSize(new Dimension(200, 25));
			cbnDeptno.setLocation(new Point(160, 100));
		}
		return cbnDeptno;
	}

	/**
	 * This method initializes txtUpperdept	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtUpperdept() {
		if (txtUpperdept == null) {
			txtUpperdept = new JTextField();
			txtUpperdept.setSize(new Dimension(200, 25));
			txtUpperdept.setLocation(new Point(159, 140));
		}
		return txtUpperdept;
	}

	/**
	 * This method initializes txtLowerdept	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtLowerdept() {
		if (txtLowerdept == null) {
			txtLowerdept = new JTextField();
			txtLowerdept.setSize(new Dimension(200, 25));
			txtLowerdept.setLocation(new Point(158, 180));
		}
		return txtLowerdept;
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
			btnAdd.setLocation(new Point(30, 260));
		}
		return btnAdd;
	}

	/**
	 * This method initializes btnSave	
	 * 	
	 * @return javax.swing.JButton	
	 */
	

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
			btnEdit.setLocation(new Point(177, 260));
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
			btnDelete.setLocation(new Point(324, 260));
		}
		return btnDelete;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
