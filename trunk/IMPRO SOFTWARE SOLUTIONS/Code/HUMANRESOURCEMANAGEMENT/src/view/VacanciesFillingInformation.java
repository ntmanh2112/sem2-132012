package view;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Rectangle;
import java.awt.Font;
import java.awt.Point;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class VacanciesFillingInformation extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JTextField txtVacancyid = null;
	private JLabel jLabel2 = null;
	private JTextField txtEmployeeid = null;
	private JLabel jLabel3 = null;
	private JTextField txtFilldate = null;
	private JLabel jLabel4 = null;
	private JTextArea jtaIntakedetails = null;
	private JButton btnAdd = null;
	private JButton btnSave = null;
	private JButton btnEdit = null;
	private JButton btnDelete = null;

	/**
	 * This is the default constructor
	 */
	public VacanciesFillingInformation() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(436, 408);
		this.setContentPane(getJContentPane());
		this.setTitle("FrmVacancyFill");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabel4 = new JLabel();
			jLabel4.setText("IntakeDetails");
			jLabel4.setLocation(new Point(20, 250));
			jLabel4.setSize(new Dimension(77, 30));
			jLabel3 = new JLabel();
			jLabel3.setText("Filldate");
			jLabel3.setLocation(new Point(20, 200));
			jLabel3.setSize(new Dimension(45, 30));
			jLabel2 = new JLabel();
			jLabel2.setText("EmployeeID");
			jLabel2.setLocation(new Point(20, 150));
			jLabel2.setSize(new Dimension(69, 30));
			jLabel1 = new JLabel();
			jLabel1.setText("VacancyID");
			jLabel1.setLocation(new Point(20, 100));
			jLabel1.setSize(new Dimension(62, 30));
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(46, 17, 338, 41));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 24));
			jLabel.setText("Vacancies Filling Information");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(jLabel, null);
			jContentPane.add(jLabel1, null);
			jContentPane.add(getTxtVacancyid(), null);
			jContentPane.add(jLabel2, null);
			jContentPane.add(getTxtEmployeeid(), null);
			jContentPane.add(jLabel3, null);
			jContentPane.add(getTxtFilldate(), null);
			jContentPane.add(jLabel4, null);
			jContentPane.add(getJtaIntakedetails(), null);
			jContentPane.add(getBtnAdd(), null);
			jContentPane.add(getBtnSave(), null);
			jContentPane.add(getBtnEdit(), null);
			jContentPane.add(getBtnDelete(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes txtVacancyid	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtVacancyid() {
		if (txtVacancyid == null) {
			txtVacancyid = new JTextField();
			txtVacancyid.setLocation(new Point(130, 100));
			txtVacancyid.setSize(new Dimension(250, 30));
		}
		return txtVacancyid;
	}

	/**
	 * This method initializes txtEmployeeid	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtEmployeeid() {
		if (txtEmployeeid == null) {
			txtEmployeeid = new JTextField();
			txtEmployeeid.setSize(new Dimension(250, 30));
			txtEmployeeid.setLocation(new Point(130, 150));
		}
		return txtEmployeeid;
	}

	/**
	 * This method initializes txtFilldate	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtFilldate() {
		if (txtFilldate == null) {
			txtFilldate = new JTextField();
			txtFilldate.setLocation(new Point(130, 200));
			txtFilldate.setSize(new Dimension(250, 30));
		}
		return txtFilldate;
	}

	/**
	 * This method initializes jtaIntakedetails	
	 * 	
	 * @return javax.swing.JTextArea	
	 */
	private JTextArea getJtaIntakedetails() {
		if (jtaIntakedetails == null) {
			jtaIntakedetails = new JTextArea();
			jtaIntakedetails.setSize(new Dimension(250, 55));
			jtaIntakedetails.setLocation(new Point(130, 250));
			jtaIntakedetails.setBorder(BorderFactory.createEtchedBorder());
		}
		return jtaIntakedetails;
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
			btnAdd.setLocation(new Point(20, 320));
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
			btnSave.setLocation(new Point(120, 320));
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
			btnEdit.setLocation(new Point(220, 320));
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
			btnDelete.setLocation(new Point(320, 320));
		}
		return btnDelete;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
