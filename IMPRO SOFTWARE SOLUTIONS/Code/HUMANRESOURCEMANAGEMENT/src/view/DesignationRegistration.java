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
import javax.swing.ImageIcon;
import java.awt.Color;

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
			jLabel2.setText("Designation Name");
			jLabel2.setSize(new Dimension(107, 25));
			jLabel2.setLocation(new Point(40, 140));
			jLabel1 = new JLabel();
			jLabel1.setText("DesignationID");
			jLabel1.setLocation(new Point(40, 100));
			jLabel1.setSize(new Dimension(80, 25));
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(97, 14, 286, 50));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 24));
			jLabel.setBackground(Color.white);
			jLabel.setForeground(Color.red);
			jLabel.setText("Designation Registration");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.setBackground(Color.white);
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
			txtDesignationid.setSize(new Dimension(200, 25));
			txtDesignationid.setLocation(new Point(180, 100));
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
			txtDesignationname.setLocation(new Point(180, 140));
			txtDesignationname.setSize(new Dimension(200, 25));
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
			btnAdd.setIcon(new ImageIcon(getClass().getResource("/images/Create.png")));
			btnAdd.setLocation(new Point(40, 210));
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
			btnEdit.setIcon(new ImageIcon(getClass().getResource("/images/Modify.png")));
			btnEdit.setLocation(new Point(140, 210));
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
			btnSave.setIcon(new ImageIcon(getClass().getResource("/images/Save.png")));
			btnSave.setLocation(new Point(240, 210));
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
			btnDelete.setIcon(new ImageIcon(getClass().getResource("/images/Delete.png")));
			btnDelete.setLocation(new Point(340, 210));
		}
		return btnDelete;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
