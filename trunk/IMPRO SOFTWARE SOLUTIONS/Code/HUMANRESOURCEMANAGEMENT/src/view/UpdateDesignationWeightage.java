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

public class UpdateDesignationWeightage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JComboBox cbnDesignationid = null;
	private JLabel jLabel2 = null;
	private JComboBox cbnDeptno = null;
	private JLabel jLabel3 = null;
	private JTextField txtWeightage = null;
	private JButton btnOk = null;
	private JButton btnCancel = null;
	/**
	 * This is the default constructor
	 */
	public UpdateDesignationWeightage() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(458, 363);
		this.setContentPane(getJContentPane());
		this.setTitle("FrmUpdateDesignWeightage");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabel3 = new JLabel();
			jLabel3.setText("Weightage");
			jLabel3.setSize(new Dimension(66, 30));
			jLabel3.setLocation(new Point(20, 200));
			jLabel2 = new JLabel();
			jLabel2.setText("DeptNo");
			jLabel2.setLocation(new Point(20, 150));
			jLabel2.setSize(new Dimension(43, 30));
			jLabel1 = new JLabel();
			jLabel1.setText("DesignationID");
			jLabel1.setLocation(new Point(20, 100));
			jLabel1.setSize(new Dimension(81, 30));
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(35, 15, 362, 49));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 24));
			jLabel.setText("Update Designation Weightage");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(jLabel, null);
			jContentPane.add(jLabel1, null);
			jContentPane.add(getCbnDesignationid(), null);
			jContentPane.add(jLabel2, null);
			jContentPane.add(getCbnDeptno(), null);
			jContentPane.add(jLabel3, null);
			jContentPane.add(getTxtWeightage(), null);
			jContentPane.add(getBtnOk(), null);
			jContentPane.add(getBtnCancel(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes cbnDesignationid	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getCbnDesignationid() {
		if (cbnDesignationid == null) {
			cbnDesignationid = new JComboBox();
			cbnDesignationid.setLocation(new Point(130, 100));
			cbnDesignationid.setSize(new Dimension(200, 30));
		}
		return cbnDesignationid;
	}

	/**
	 * This method initializes cbnDeptno	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getCbnDeptno() {
		if (cbnDeptno == null) {
			cbnDeptno = new JComboBox();
			cbnDeptno.setSize(new Dimension(200, 30));
			cbnDeptno.setLocation(new Point(130, 150));
		}
		return cbnDeptno;
	}

	/**
	 * This method initializes txtWeightage	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtWeightage() {
		if (txtWeightage == null) {
			txtWeightage = new JTextField();
			txtWeightage.setLocation(new Point(130, 200));
			txtWeightage.setSize(new Dimension(200, 30));
		}
		return txtWeightage;
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
			btnOk.setLocation(new Point(130, 260));
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
			btnCancel.setLocation(new Point(230, 260));
		}
		return btnCancel;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
