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
import java.awt.event.KeyEvent;

public class DesignationRegistration extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JTextField txtDesignationid = null;
	private JLabel jLabel2 = null;
	private JTextField txtDesignationname = null;
	private JButton btnAdd = null;
	private JButton btnEdit = null;
	private JButton btnSave = null;
	private JButton btnDelete = null;

	/**
	 * This is the default constructor
	 */
	public DesignationRegistration() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(477, 330);
		this.setContentPane(getJContentPane());
		this.setTitle("FrmDesign");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabel2 = new JLabel();
			jLabel2.setBounds(new Rectangle(20, 150, 107, 32));
			jLabel2.setText("Designation Name");
			jLabel1 = new JLabel();
			jLabel1.setText("DesignationID");
			jLabel1.setLocation(new Point(20, 100));
			jLabel1.setSize(new Dimension(80, 30));
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(97, 14, 286, 50));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 24));
			jLabel.setText("Designation Registration");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(jLabel, null);
			jContentPane.add(jLabel1, null);
			jContentPane.add(getTxtDesignationid(), null);
			jContentPane.add(jLabel2, null);
			jContentPane.add(getTxtDesignationname(), null);
			jContentPane.add(getBtnAdd(), null);
			jContentPane.add(getBtnEdit(), null);
			jContentPane.add(getBtnSave(), null);
			jContentPane.add(getBtnDelete(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes txtDesignationid	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtDesignationid() {
		if (txtDesignationid == null) {
			txtDesignationid = new JTextField();
			txtDesignationid.setSize(new Dimension(200, 30));
			txtDesignationid.setLocation(new Point(150, 100));
		}
		return txtDesignationid;
	}

	/**
	 * This method initializes txtDesignationname	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtDesignationname() {
		if (txtDesignationname == null) {
			txtDesignationname = new JTextField();
			txtDesignationname.setLocation(new Point(150, 150));
			txtDesignationname.setSize(new Dimension(200, 30));
		}
		return txtDesignationname;
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
			btnAdd.setLocation(new Point(40, 230));
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
			btnEdit.setMnemonic(KeyEvent.VK_UNDEFINED);
			btnEdit.setLocation(new Point(140, 230));
		}
		return btnEdit;
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
			btnSave.setLocation(new Point(240, 230));
		}
		return btnSave;
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
			btnDelete.setLocation(new Point(340, 230));
		}
		return btnDelete;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
