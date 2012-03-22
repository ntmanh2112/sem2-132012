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
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

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
		this.setSize(471, 445);
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
			jLabel5.setLocation(new Point(50, 260));
			jLabel5.setSize(new Dimension(68, 25));
			jLabel4 = new JLabel();
			jLabel4.setText("Status");
			jLabel4.setLocation(new Point(50, 220));
			jLabel4.setHorizontalAlignment(SwingConstants.LEADING);
			jLabel4.setSize(new Dimension(67, 25));
			jLabel3 = new JLabel();
			jLabel3.setText("DeputedTo");
			jLabel3.setLocation(new Point(50, 180));
			jLabel3.setSize(new Dimension(62, 25));
			jLabel2 = new JLabel();
			jLabel2.setText("PresentDesign");
			jLabel2.setLocation(new Point(50, 140));
			jLabel2.setSize(new Dimension(90, 25));
			jLabel1 = new JLabel();
			jLabel1.setText("EmpName");
			jLabel1.setSize(new Dimension(61, 25));
			jLabel1.setLocation(new Point(50, 100));
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(88, 21, 287, 42));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 24));
			jLabel.setForeground(Color.red);
			jLabel.setText("Employee Job Rotation");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.setBackground(new Color(238, 238, 238));
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
			cbnEmpname.setLocation(new Point(170, 100));
			cbnEmpname.setSize(new Dimension(200, 25));
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
			txtPresentdesign.setSize(new Dimension(200, 25));
			txtPresentdesign.setLocation(new Point(170, 140));
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
			cbnDeputedto.setLocation(new Point(170, 180));
			cbnDeputedto.setSize(new Dimension(200, 25));
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
			txtStatus.setLocation(new Point(170, 220));
			txtStatus.setSize(new Dimension(200, 25));
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
			txtRemark.setSize(new Dimension(200, 25));
			txtRemark.setLocation(new Point(170, 260));
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
			btnAdd.setSize(new Dimension(90, 34));
			btnAdd.setIcon(new ImageIcon(getClass().getResource("/images/Create.png")));
			btnAdd.setLocation(new Point(99, 331));
		}
		return btnAdd;
	}

	/**
	 * This method initializes btnSave	
	 * 	
	 * @return javax.swing.JButton	
	 */
	

	/**
	 * This method initializes btnEdit	
	 * 	
	 * @return javax.swing.JButton	
	 */
	

	/**
	 * This method initializes btnDelete	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnDelete() {
		if (btnDelete == null) {
			btnDelete = new JButton();
			btnDelete.setText("Delete");
			btnDelete.setSize(new Dimension(90, 34));
			btnDelete.setIcon(new ImageIcon(getClass().getResource("/images/Delete.png")));
			btnDelete.setLocation(new Point(262, 331));
		}
		return btnDelete;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
