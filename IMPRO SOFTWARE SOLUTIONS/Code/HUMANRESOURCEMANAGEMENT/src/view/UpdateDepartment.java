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
		this.setSize(422, 403);
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
			jLabel4.setSize(new Dimension(52, 25));
			jLabel4.setLocation(new Point(50, 220));
			jLabel3 = new JLabel();
			jLabel3.setText("DeptHead");
			jLabel3.setLocation(new Point(50, 180));
			jLabel3.setSize(new Dimension(61, 25));
			jLabel2 = new JLabel();
			jLabel2.setText("DeptName");
			jLabel2.setLocation(new Point(50, 140));
			jLabel2.setSize(new Dimension(62, 25));
			jLabel1 = new JLabel();
			jLabel1.setText("DeptNo");
			jLabel1.setLocation(new Point(50, 100));
			jLabel1.setSize(new Dimension(48, 25));
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(76, 16, 240, 42));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 24));
			jLabel.setForeground(Color.red);
			jLabel.setText("Update Department");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.setBackground(new Color(238, 238, 238));
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
			txtDeptno.setLocation(new Point(150, 100));
			txtDeptno.setSize(new Dimension(200, 25));
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
			txtDeptname.setLocation(new Point(150, 140));
			txtDeptname.setSize(new Dimension(200, 25));
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
			txtDepthead.setLocation(new Point(150, 180));
			txtDepthead.setSize(new Dimension(200, 25));
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
			txtLocation.setSize(new Dimension(200, 25));
			txtLocation.setLocation(new Point(150, 220));
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
			btnOk.setSize(new Dimension(90, 34));
			btnOk.setIcon(new ImageIcon(getClass().getResource("/images/Apply.png")));
			btnOk.setLocation(new Point(90, 300));
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
			btnCancel.setSize(new Dimension(96, 34));
			btnCancel.setIcon(new ImageIcon(getClass().getResource("/images/Erase.png")));
			btnCancel.setLocation(new Point(226, 299));
		}
		return btnCancel;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
