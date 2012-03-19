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

public class EmployeeJobRotation extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JComboBox cbnEmpname = null;
	private JLabel jLabel2 = null;
	private JTextField txtPresentdesign = null;
	private JLabel jLabel3 = null;
	private JComboBox cbnDeputedto = null;
	private JLabel jLabel4 = null;
	private JTextField txtStatus = null;
	private JLabel jLabel5 = null;
	private JTextField txtRemark = null;
	private JButton btnAdd = null;
	private JButton btnSave = null;
	private JButton btnEdit = null;
	private JButton btnDelete = null;

	/**
	 * This is the default constructor
	 */
	public EmployeeJobRotation() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(438, 445);
		this.setContentPane(getJContentPane());
		this.setTitle("FrmJobRotation");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabel5 = new JLabel();
			jLabel5.setText("Remark");
			jLabel5.setLocation(new Point(20, 300));
			jLabel5.setSize(new Dimension(49, 30));
			jLabel4 = new JLabel();
			jLabel4.setText("Status");
			jLabel4.setLocation(new Point(20, 250));
			jLabel4.setSize(new Dimension(38, 30));
			jLabel3 = new JLabel();
			jLabel3.setText("DeputedTo");
			jLabel3.setLocation(new Point(20, 200));
			jLabel3.setSize(new Dimension(62, 30));
			jLabel2 = new JLabel();
			jLabel2.setText("PresentDesign");
			jLabel2.setLocation(new Point(20, 150));
			jLabel2.setSize(new Dimension(90, 30));
			jLabel1 = new JLabel();
			jLabel1.setText("EmpName");
			jLabel1.setSize(new Dimension(61, 30));
			jLabel1.setLocation(new Point(20, 100));
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(69, 21, 274, 42));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 24));
			jLabel.setText("Employee Job Rotation");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(jLabel, null);
			jContentPane.add(jLabel1, null);
			jContentPane.add(getCbnEmpname(), null);
			jContentPane.add(jLabel2, null);
			jContentPane.add(getTxtPresentdesign(), null);
			jContentPane.add(jLabel3, null);
			jContentPane.add(getCbnDeputedto(), null);
			jContentPane.add(jLabel4, null);
			jContentPane.add(getTxtStatus(), null);
			jContentPane.add(jLabel5, null);
			jContentPane.add(getTxtRemark(), null);
			jContentPane.add(getBtnAdd(), null);
			jContentPane.add(getBtnSave(), null);
			jContentPane.add(getBtnEdit(), null);
			jContentPane.add(getBtnDelete(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes cbnEmpname	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getCbnEmpname() {
		if (cbnEmpname == null) {
			cbnEmpname = new JComboBox();
			cbnEmpname.setLocation(new Point(130, 100));
			cbnEmpname.setSize(new Dimension(200, 30));
		}
		return cbnEmpname;
	}

	/**
	 * This method initializes txtPresentdesign	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtPresentdesign() {
		if (txtPresentdesign == null) {
			txtPresentdesign = new JTextField();
			txtPresentdesign.setSize(new Dimension(200, 30));
			txtPresentdesign.setLocation(new Point(130, 150));
		}
		return txtPresentdesign;
	}

	/**
	 * This method initializes cbnDeputedto	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getCbnDeputedto() {
		if (cbnDeputedto == null) {
			cbnDeputedto = new JComboBox();
			cbnDeputedto.setLocation(new Point(130, 200));
			cbnDeputedto.setSize(new Dimension(200, 30));
		}
		return cbnDeputedto;
	}

	/**
	 * This method initializes txtStatus	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtStatus() {
		if (txtStatus == null) {
			txtStatus = new JTextField();
			txtStatus.setLocation(new Point(130, 250));
			txtStatus.setSize(new Dimension(200, 30));
		}
		return txtStatus;
	}

	/**
	 * This method initializes txtRemark	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtRemark() {
		if (txtRemark == null) {
			txtRemark = new JTextField();
			txtRemark.setSize(new Dimension(200, 30));
			txtRemark.setLocation(new Point(130, 300));
		}
		return txtRemark;
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
			btnAdd.setLocation(new Point(30, 360));
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
			btnSave.setSize(new Dimension(90, 30));
			btnSave.setLocation(new Point(130, 360));
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
			btnEdit.setLocation(new Point(230, 360));
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
			btnDelete.setLocation(new Point(330, 360));
		}
		return btnDelete;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
