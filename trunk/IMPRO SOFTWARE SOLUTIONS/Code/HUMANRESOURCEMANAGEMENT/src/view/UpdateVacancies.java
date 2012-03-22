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
import java.awt.Color;
import javax.swing.ImageIcon;

public class UpdateVacancies extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JTextField txtVacancyid = null;
	private JLabel jLabel2 = null;
	private JComboBox cbnDeptno = null;
	private JLabel jLabel3 = null;
	private JComboBox cbnSectionid = null;
	private JLabel jLabel4 = null;
	private JComboBox cbnDesignid = null;
	private JLabel jLabel5 = null;
	private JTextField txtNoofvavancies = null;
	private JLabel jLabel6 = null;
	private JTextField txtStatus = null;
	private JLabel jLabel7 = null;
	private JTextField txtVacancydate = null;
	private JLabel jLabel8 = null;
	private JTextField txtPriority = null;
	private JButton btnOk = null;
	private JButton btnCancel = null;
	/**
	 * This is the default constructor
	 */
	public UpdateVacancies() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(680, 423);
		this.setContentPane(getJContentPane());
		this.setTitle("FrmUpdateVacancy");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabel8 = new JLabel();
			jLabel8.setText("Priority :");
			jLabel8.setLocation(new Point(330, 220));
			jLabel8.setSize(new Dimension(49, 25));
			jLabel7 = new JLabel();
			jLabel7.setText("Vacancy-Date :");
			jLabel7.setLocation(new Point(330, 180));
			jLabel7.setSize(new Dimension(87, 25));
			jLabel6 = new JLabel();
			jLabel6.setText("Status :");
			jLabel6.setLocation(new Point(330, 140));
			jLabel6.setSize(new Dimension(47, 25));
			jLabel5 = new JLabel();
			jLabel5.setText("No of Vacancies :");
			jLabel5.setLocation(new Point(330, 100));
			jLabel5.setSize(new Dimension(101, 25));
			jLabel4 = new JLabel();
			jLabel4.setText("DesignID :");
			jLabel4.setLocation(new Point(20, 220));
			jLabel4.setSize(new Dimension(63, 25));
			jLabel3 = new JLabel();
			jLabel3.setText("SectionID :");
			jLabel3.setLocation(new Point(20, 180));
			jLabel3.setSize(new Dimension(61, 25));
			jLabel2 = new JLabel();
			jLabel2.setText("DeptNo :");
			jLabel2.setLocation(new Point(20, 140));
			jLabel2.setSize(new Dimension(47, 25));
			jLabel1 = new JLabel();
			jLabel1.setText("VacancyID :");
			jLabel1.setSize(new Dimension(70, 25));
			jLabel1.setLocation(new Point(20, 100));
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(230, 10, 217, 40));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 24));
			jLabel.setForeground(Color.red);
			jLabel.setText("Update Vacancies");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(jLabel, null);
			jContentPane.add(jLabel1, null);
			jContentPane.add(getTxtVacancyid(), null);
			jContentPane.add(jLabel2, null);
			jContentPane.add(getCbnDeptno(), null);
			jContentPane.add(jLabel3, null);
			jContentPane.add(getCbnSectionid(), null);
			jContentPane.add(jLabel4, null);
			jContentPane.add(getCbnDesignid(), null);
			jContentPane.add(jLabel5, null);
			jContentPane.add(getTxtNoofvavancies(), null);
			jContentPane.add(jLabel6, null);
			jContentPane.add(getTxtStatus(), null);
			jContentPane.add(jLabel7, null);
			jContentPane.add(getTxtVacancydate(), null);
			jContentPane.add(jLabel8, null);
			jContentPane.add(getTxtPriority(), null);
			jContentPane.add(getBtnOk(), null);
			jContentPane.add(getBtnCancel(), null);
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
			txtVacancyid.setLocation(new Point(100, 100));
			txtVacancyid.setSize(new Dimension(200, 25));
		}
		return txtVacancyid;
	}

	/**
	 * This method initializes cbnDeptno	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getCbnDeptno() {
		if (cbnDeptno == null) {
			cbnDeptno = new JComboBox();
			cbnDeptno.setSize(new Dimension(200, 25));
			cbnDeptno.setLocation(new Point(100, 140));
		}
		return cbnDeptno;
	}

	/**
	 * This method initializes cbnSectionid	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getCbnSectionid() {
		if (cbnSectionid == null) {
			cbnSectionid = new JComboBox();
			cbnSectionid.setLocation(new Point(100, 180));
			cbnSectionid.setSize(new Dimension(200, 25));
		}
		return cbnSectionid;
	}

	/**
	 * This method initializes cbnDesignid	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getCbnDesignid() {
		if (cbnDesignid == null) {
			cbnDesignid = new JComboBox();
			cbnDesignid.setSize(new Dimension(200, 25));
			cbnDesignid.setLocation(new Point(100, 220));
		}
		return cbnDesignid;
	}

	/**
	 * This method initializes txtNoofvavancies	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtNoofvavancies() {
		if (txtNoofvavancies == null) {
			txtNoofvavancies = new JTextField();
			txtNoofvavancies.setLocation(new Point(450, 100));
			txtNoofvavancies.setSize(new Dimension(200, 25));
		}
		return txtNoofvavancies;
	}

	/**
	 * This method initializes txtStatus	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtStatus() {
		if (txtStatus == null) {
			txtStatus = new JTextField();
			txtStatus.setLocation(new Point(450, 140));
			txtStatus.setSize(new Dimension(200, 25));
		}
		return txtStatus;
	}

	/**
	 * This method initializes txtVacancydate	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtVacancydate() {
		if (txtVacancydate == null) {
			txtVacancydate = new JTextField();
			txtVacancydate.setLocation(new Point(450, 180));
			txtVacancydate.setSize(new Dimension(200, 25));
		}
		return txtVacancydate;
	}

	/**
	 * This method initializes txtPriority	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtPriority() {
		if (txtPriority == null) {
			txtPriority = new JTextField();
			txtPriority.setSize(new Dimension(200, 25));
			txtPriority.setLocation(new Point(450, 220));
		}
		return txtPriority;
	}

	/**
	 * This method initializes btnOk	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnOk() {
		if (btnOk == null) {
			btnOk = new JButton();
			btnOk.setText("Update");
			btnOk.setSize(new Dimension(96, 34));
			btnOk.setIcon(new ImageIcon(getClass().getResource("/images/Update.png")));
			btnOk.setLocation(new Point(181, 300));
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
			btnCancel.setSize(new Dimension(98, 34));
			btnCancel.setIcon(new ImageIcon(getClass().getResource("/images/Button-Close-icon.png")));
			btnCancel.setLocation(new Point(391, 301));
		}
		return btnCancel;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
