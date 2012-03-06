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

public class AddComplaint extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JTextField txtCustomername = null;
	private JLabel jLabel2 = null;
	private JTextField txtProductname = null;
	private JLabel jLabel3 = null;
	private JTextField txtOrdercode = null;
	private JLabel jLabel4 = null;
	private JTextField txtDate = null;
	private JLabel jLabel5 = null;
	private JTextField txtContent = null;
	private JButton btnAdd = null;
	private JButton btnCancel = null;

	/**
	 * This is the default constructor
	 */
	public AddComplaint() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(568, 529);
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
			jLabel5 = new JLabel();
			jLabel5.setFont(new Font("Dialog", Font.BOLD, 14));
			jLabel5.setLocation(new Point(10, 273));
			jLabel5.setSize(new Dimension(111, 30));
			jLabel5.setText("Content");
			jLabel4 = new JLabel();
			jLabel4.setFont(new Font("Dialog", Font.BOLD, 14));
			jLabel4.setLocation(new Point(10, 226));
			jLabel4.setSize(new Dimension(111, 30));
			jLabel4.setText("Date");
			jLabel3 = new JLabel();
			jLabel3.setText("Order code");
			jLabel3.setLocation(new Point(10, 181));
			jLabel3.setFont(new Font("Dialog", Font.BOLD, 14));
			jLabel3.setSize(new Dimension(111, 30));
			jLabel2 = new JLabel();
			jLabel2.setFont(new Font("Dialog", Font.BOLD, 14));
			jLabel2.setLocation(new Point(10, 136));
			jLabel2.setSize(new Dimension(111, 30));
			jLabel2.setText("Productname");
			jLabel1 = new JLabel();
			jLabel1.setFont(new Font("Dialog", Font.BOLD, 14));
			jLabel1.setSize(new Dimension(111, 30));
			jLabel1.setLocation(new Point(10, 92));
			jLabel1.setText("Customername");
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(136, 12, 287, 63));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 36));
			jLabel.setText("Add Complaint");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.setFont(new Font("Dialog", Font.PLAIN, 14));
			jContentPane.add(jLabel, null);
			jContentPane.add(jLabel1, null);
			jContentPane.add(getTxtCustomername(), null);
			jContentPane.add(jLabel2, null);
			jContentPane.add(getTxtProductname(), null);
			jContentPane.add(jLabel3, null);
			jContentPane.add(getTxtOrdercode(), null);
			jContentPane.add(jLabel4, null);
			jContentPane.add(getTxtDate(), null);
			jContentPane.add(jLabel5, null);
			jContentPane.add(getTxtContent(), null);
			jContentPane.add(getBtnAdd(), null);
			jContentPane.add(getBtnCancel(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes txtCustomername	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtCustomername() {
		if (txtCustomername == null) {
			txtCustomername = new JTextField();
			txtCustomername.setLocation(new Point(164, 92));
			txtCustomername.setSize(new Dimension(350, 30));
		}
		return txtCustomername;
	}

	/**
	 * This method initializes txtProductname	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtProductname() {
		if (txtProductname == null) {
			txtProductname = new JTextField();
			txtProductname.setLocation(new Point(164, 136));
			txtProductname.setSize(new Dimension(350, 30));
		}
		return txtProductname;
	}

	/**
	 * This method initializes txtOrdercode	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtOrdercode() {
		if (txtOrdercode == null) {
			txtOrdercode = new JTextField();
			txtOrdercode.setLocation(new Point(164, 180));
			txtOrdercode.setSize(new Dimension(350, 30));
		}
		return txtOrdercode;
	}

	/**
	 * This method initializes txtDate	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtDate() {
		if (txtDate == null) {
			txtDate = new JTextField();
			txtDate.setLocation(new Point(164, 226));
			txtDate.setSize(new Dimension(350, 30));
		}
		return txtDate;
	}

	/**
	 * This method initializes txtContent	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtContent() {
		if (txtContent == null) {
			txtContent = new JTextField();
			txtContent.setBounds(new Rectangle(164, 272, 351, 102));
		}
		return txtContent;
	}

	/**
	 * This method initializes btnAdd	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnAdd() {
		if (btnAdd == null) {
			btnAdd = new JButton();
			btnAdd.setLocation(new Point(105, 407));
			btnAdd.setText("Add");
			btnAdd.setSize(new Dimension(110, 36));
		}
		return btnAdd;
	}

	/**
	 * This method initializes btnCancel	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnCancel() {
		if (btnCancel == null) {
			btnCancel = new JButton();
			btnCancel.setFont(new Font("Dialog", Font.BOLD, 14));
			btnCancel.setLocation(new Point(313, 407));
			btnCancel.setSize(new Dimension(110, 36));
			btnCancel.setText("Cancel");
		}
		return btnCancel;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
