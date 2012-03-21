package view;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Rectangle;
import java.awt.Font;
import java.awt.Point;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;

public class DepartmentRegistration extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JTextField txtDeptno = null;
	private JLabel jLabel2 = null;
	private JTextField txtDeptname = null;
	private JLabel jLabel3 = null;
	private JTextField txtDepthead = null;
	private JLabel jLabel4 = null;
	private JTextField txtLocation = null;
	private JButton btnAdd = null;
	private JButton btnSave = null;
	private JButton btnEdit = null;
	private JButton btnDelete = null;
	private JButton btnFirst = null;
	private JButton btnPrevious = null;
	private JButton btnNext = null;
	private JButton btnLast = null;

	/**
	 * This is the default constructor
	 */
	public DepartmentRegistration() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(490, 403);
		this.setContentPane(getJContentPane());
		this.setTitle("FormDept");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabel4 = new JLabel();
			jLabel4.setText("Location");
			jLabel4.setSize(new Dimension(52, 30));
			jLabel4.setLocation(new Point(20, 250));
			jLabel3 = new JLabel();
			jLabel3.setText("DeptHead");
			jLabel3.setLocation(new Point(20, 200));
			jLabel3.setSize(new Dimension(61, 30));
			jLabel2 = new JLabel();
			jLabel2.setText("DeptName");
			jLabel2.setLocation(new Point(20, 150));
			jLabel2.setSize(new Dimension(62, 30));
			jLabel1 = new JLabel();
			jLabel1.setText("DeptNo");
			jLabel1.setLocation(new Point(20, 100));
			jLabel1.setSize(new Dimension(48, 30));
			jLabel = new JLabel();
			jLabel.setFont(new Font("Dialog", Font.BOLD, 24));
			jLabel.setSize(new Dimension(286, 42));
			jLabel.setLocation(new Point(98, 11));
			jLabel.setForeground(new Color(255, 51, 51));
			jLabel.setText("Department Registration");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.setBackground(Color.white);
			jContentPane.add(jLabel, null);
			jContentPane.add(jLabel1, null);
			jContentPane.add(getTxtDeptno(), null);
			jContentPane.add(jLabel2, null);
			jContentPane.add(getTxtDeptname(), null);
			jContentPane.add(jLabel3, null);
			jContentPane.add(getTxtDepthead(), null);
			jContentPane.add(jLabel4, null);
			jContentPane.add(getTxtLocation(), null);
			jContentPane.add(getBtnAdd(), null);
			jContentPane.add(getBtnSave(), null);
			jContentPane.add(getBtnEdit(), null);
			jContentPane.add(getBtnDelete(), null);
			jContentPane.add(getBtnFirst(), null);
			jContentPane.add(getBtnPrevious(), null);
			jContentPane.add(getBtnNext(), null);
			jContentPane.add(getBtnLast(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes txtDeptno	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtDeptno() {
		if (txtDeptno == null) {
			txtDeptno = new JTextField();
			txtDeptno.setLocation(new Point(100, 100));
			txtDeptno.setSize(new Dimension(200, 30));
		}
		return txtDeptno;
	}

	/**
	 * This method initializes txtDeptname	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtDeptname() {
		if (txtDeptname == null) {
			txtDeptname = new JTextField();
			txtDeptname.setLocation(new Point(100, 150));
			txtDeptname.setSize(new Dimension(200, 30));
		}
		return txtDeptname;
	}

	/**
	 * This method initializes txtDepthead	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtDepthead() {
		if (txtDepthead == null) {
			txtDepthead = new JTextField();
			txtDepthead.setLocation(new Point(100, 200));
			txtDepthead.setSize(new Dimension(200, 30));
		}
		return txtDepthead;
	}

	/**
	 * This method initializes txtLocation	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtLocation() {
		if (txtLocation == null) {
			txtLocation = new JTextField();
			txtLocation.setSize(new Dimension(200, 30));
			txtLocation.setLocation(new Point(100, 250));
		}
		return txtLocation;
	}

	/**
	 * This method initializes btnAdd	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnAdd() {
		if (btnAdd == null) {
			btnAdd = new JButton();
			btnAdd.setLocation(new Point(350, 100));
			btnAdd.setText("Add");
			btnAdd.setIcon(new ImageIcon(getClass().getResource("/images/Create.png")));
			btnAdd.setSize(new Dimension(90, 30));
		}
		return btnAdd;
	}

	/**
	 * This method initializes btnSave	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnSave() {
		if (btnSave == null) {
			btnSave = new JButton();
			btnSave.setText("Save");
			btnSave.setLocation(new Point(350, 150));
			btnSave.setIcon(new ImageIcon(getClass().getResource("/images/Save.png")));
			btnSave.setSize(new Dimension(90, 30));
		}
		return btnSave;
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
			btnEdit.setLocation(new Point(350, 200));
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
			btnDelete.setLocation(new Point(350, 250));
			btnDelete.setIcon(new ImageIcon(getClass().getResource("/images/Delete.png")));
			btnDelete.setSize(new Dimension(90, 30));
		}
		return btnDelete;
	}

	/**
	 * This method initializes btnFirst	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnFirst() {
		if (btnFirst == null) {
			btnFirst = new JButton();
			btnFirst.setText("<<");
			btnFirst.setSize(new Dimension(90, 30));
			
			btnFirst.setLocation(new Point(30, 300));
		}
		return btnFirst;
	}

	/**
	 * This method initializes btnPrevious	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnPrevious() {
		if (btnPrevious == null) {
			btnPrevious = new JButton();
			btnPrevious.setText("<");
			btnPrevious.setSize(new Dimension(90, 30));
			
			btnPrevious.setLocation(new Point(138, 300));
		}
		return btnPrevious;
	}

	/**
	 * This method initializes btnNext	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnNext() {
		if (btnNext == null) {
			btnNext = new JButton();
			btnNext.setText(">");
			btnNext.setSize(new Dimension(90, 30));
			btnNext.setLocation(new Point(243, 300));
		}
		return btnNext;
	}

	/**
	 * This method initializes btnLast	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnLast() {
		if (btnLast == null) {
			btnLast = new JButton();
			btnLast.setText(">>");
			btnLast.setSize(new Dimension(90, 30));
			
			btnLast.setLocation(new Point(350, 300));
		}
		return btnLast;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
