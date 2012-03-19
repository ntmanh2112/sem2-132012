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

public class SectionRegistration extends JFrame {

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
	private JButton btnAdd = null;
	private JButton btnEdit = null;
	private JButton btnDelete = null;
	private JButton btnSave = null;

	/**
	 * This is the default constructor
	 */
	public SectionRegistration() {
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
		this.setTitle("JFrame");
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
			jLabel.setBounds(new Rectangle(130, 13, 244, 41));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 24));
			jLabel.setText("Section Registration");
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
			jContentPane.add(getBtnAdd(), null);
			jContentPane.add(getBtnEdit(), null);
			jContentPane.add(getBtnDelete(), null);
			jContentPane.add(getBtnSave(), null);
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
	 * This method initializes btnAdd	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnAdd() {
		if (btnAdd == null) {
			btnAdd = new JButton();
			btnAdd.setText("Add");
			btnAdd.setSize(new Dimension(90, 30));
			btnAdd.setLocation(new Point(50, 310));
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
			btnEdit.setLocation(new Point(350, 310));
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
			btnDelete.setLocation(new Point(250, 310));
		}
		return btnDelete;
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
			btnSave.setSize(new Dimension(90, 30));
			btnSave.setLocation(new Point(150, 310));
		}
		return btnSave;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
