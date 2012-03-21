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

public class UpdateDepartment extends JFrame {

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
	private JButton btnOk = null;
	private JButton btnCancel = null;
	/**
	 * This is the default constructor
	 */
	public UpdateDepartment() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(344, 403);
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
			jLabel.setBounds(new Rectangle(50, 16, 286, 42));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 24));
			jLabel.setText("Update Department");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(jLabel, null);
			jContentPane.add(jLabel1, null);
			jContentPane.add(getTxtDeptno(), null);
			jContentPane.add(jLabel2, null);
			jContentPane.add(getTxtDeptname(), null);
			jContentPane.add(jLabel3, null);
			jContentPane.add(getTxtDepthead(), null);
			jContentPane.add(jLabel4, null);
			jContentPane.add(getTxtLocation(), null);
			jContentPane.add(getBtnOk(), null);
			jContentPane.add(getBtnCancel(), null);
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
	 * This method initializes btnOk	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnOk() {
		if (btnOk == null) {
			btnOk = new JButton();
			btnOk.setText("OK");
			btnOk.setSize(new Dimension(90, 30));
			btnOk.setLocation(new Point(52, 300));
		}
		return btnOk;
	}

	/**
	 * This method initializes btnCancel	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnCancel() {
		if (btnCancel == null) {
			btnCancel = new JButton();
			btnCancel.setText("Cancel");
			btnCancel.setSize(new Dimension(90, 30));
			btnCancel.setLocation(new Point(181, 300));
		}
		return btnCancel;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
