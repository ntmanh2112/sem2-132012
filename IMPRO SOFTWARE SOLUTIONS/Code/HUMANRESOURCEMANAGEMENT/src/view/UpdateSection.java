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
import javax.swing.JComboBox;
import javax.swing.JButton;

public class UpdateSection extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JTextField txtSectionid = null;
	private JLabel jLabel2 = null;
	private JTextField txtSectionname = null;
	private JLabel jLabel3 = null;
	private JTextField txtSecincharge = null;
	private JLabel jLabel4 = null;
	private JComboBox cbnDeptno = null;
	private JButton btnCancel = null;
	private JButton btnOk = null;

	/**
	 * This is the default constructor
	 */
	public UpdateSection() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(485, 414);
		this.setContentPane(getJContentPane());
		this.setTitle("FrmUpdateSection");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabel4 = new JLabel();
			jLabel4.setText("DeptNo");
			jLabel4.setLocation(new Point(20, 250));
			jLabel4.setSize(new Dimension(46, 30));
			jLabel3 = new JLabel();
			jLabel3.setText("Sec-incharge");
			jLabel3.setLocation(new Point(20, 200));
			jLabel3.setSize(new Dimension(78, 30));
			jLabel2 = new JLabel();
			jLabel2.setText("SectionName");
			jLabel2.setLocation(new Point(20, 150));
			jLabel2.setSize(new Dimension(80, 30));
			jLabel1 = new JLabel();
			jLabel1.setText("SectionID");
			jLabel1.setLocation(new Point(20, 100));
			jLabel1.setSize(new Dimension(57, 29));
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(151, 13, 179, 41));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 24));
			jLabel.setText("Update Section");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(jLabel, null);
			jContentPane.add(jLabel1, null);
			jContentPane.add(getTxtSectionid(), null);
			jContentPane.add(jLabel2, null);
			jContentPane.add(getTxtSectionname(), null);
			jContentPane.add(jLabel3, null);
			jContentPane.add(getTxtSecincharge(), null);
			jContentPane.add(jLabel4, null);
			jContentPane.add(getCbnDeptno(), null);
			jContentPane.add(getBtnCancel(), null);
			jContentPane.add(getBtnOk(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes txtSectionid	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtSectionid() {
		if (txtSectionid == null) {
			txtSectionid = new JTextField();
			txtSectionid.setSize(new Dimension(200, 30));
			txtSectionid.setLocation(new Point(150, 100));
		}
		return txtSectionid;
	}

	/**
	 * This method initializes txtSectionname	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtSectionname() {
		if (txtSectionname == null) {
			txtSectionname = new JTextField();
			txtSectionname.setLocation(new Point(150, 150));
			txtSectionname.setSize(new Dimension(200, 30));
		}
		return txtSectionname;
	}

	/**
	 * This method initializes txtSecincharge	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtSecincharge() {
		if (txtSecincharge == null) {
			txtSecincharge = new JTextField();
			txtSecincharge.setLocation(new Point(150, 200));
			txtSecincharge.setSize(new Dimension(200, 30));
		}
		return txtSecincharge;
	}

	/**
	 * This method initializes cbnDeptno	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getCbnDeptno() {
		if (cbnDeptno == null) {
			cbnDeptno = new JComboBox();
			cbnDeptno.setLocation(new Point(150, 250));
			cbnDeptno.setSize(new Dimension(200, 30));
		}
		return cbnDeptno;
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
			btnCancel.setLocation(new Point(250, 310));
		}
		return btnCancel;
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
			btnOk.setLocation(new Point(150, 310));
		}
		return btnOk;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
