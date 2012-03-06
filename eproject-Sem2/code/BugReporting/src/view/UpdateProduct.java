package view;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Rectangle;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Point;
import javax.swing.JButton;

public class UpdateProduct extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JTextField txtProductname = null;
	private JLabel jLabel2 = null;
	private JTextField txtDescription = null;
	private JLabel jLabel3 = null;
	private JTextField txtDate = null;
	private JLabel jLabel4 = null;
	private JTextField txtPrice = null;
	private JLabel jLabel5 = null;
	private JTextField txtWarranty = null;
	private JButton btnUpdate = null;
	private JButton btnCancel = null;
	/**
	 * This is the default constructor
	 */
	public UpdateProduct() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(406, 397);
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
			jLabel5.setText("Warranty");
			jLabel5.setLocation(new Point(18, 255));
			jLabel5.setSize(new Dimension(120, 30));
			jLabel4 = new JLabel();
			jLabel4.setFont(new Font("Dialog", Font.BOLD, 14));
			jLabel4.setLocation(new Point(18, 209));
			jLabel4.setSize(new Dimension(120, 30));
			jLabel4.setText("Price");
			jLabel3 = new JLabel();
			jLabel3.setFont(new Font("Dialog", Font.BOLD, 14));
			jLabel3.setSize(new Dimension(120, 30));
			jLabel3.setLocation(new Point(18, 165));
			jLabel3.setText("Date");
			jLabel2 = new JLabel();
			jLabel2.setText("Description");
			jLabel2.setLocation(new Point(18, 120));
			jLabel2.setFont(new Font("Dialog", Font.BOLD, 14));
			jLabel2.setSize(new Dimension(120, 30));
			jLabel1 = new JLabel();
			jLabel1.setFont(new Font("Dialog", Font.BOLD, 14));
			jLabel1.setLocation(new Point(18, 78));
			jLabel1.setSize(new Dimension(120, 30));
			jLabel1.setText("Productname");
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(58, 16, 279, 50));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 36));
			jLabel.setText("Update Product");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(jLabel, null);
			jContentPane.add(jLabel1, null);
			jContentPane.add(getTxtProductname(), null);
			jContentPane.add(jLabel2, null);
			jContentPane.add(getTxtDescription(), null);
			jContentPane.add(jLabel3, null);
			jContentPane.add(getTxtDate(), null);
			jContentPane.add(jLabel4, null);
			jContentPane.add(getTxtPrice(), null);
			jContentPane.add(jLabel5, null);
			jContentPane.add(getTxtWarranty(), null);
			jContentPane.add(getBtnUpdate(), null);
			jContentPane.add(getBtnCancel(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes txtProductname	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtProductname() {
		if (txtProductname == null) {
			txtProductname = new JTextField();
			txtProductname.setLocation(new Point(152, 78));
			txtProductname.setSize(new Dimension(224, 30));
		}
		return txtProductname;
	}

	/**
	 * This method initializes txtDescription	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtDescription() {
		if (txtDescription == null) {
			txtDescription = new JTextField();
			txtDescription.setLocation(new Point(152, 120));
			txtDescription.setSize(new Dimension(224, 30));
		}
		return txtDescription;
	}

	/**
	 * This method initializes txtDate	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtDate() {
		if (txtDate == null) {
			txtDate = new JTextField();
			txtDate.setSize(new Dimension(224, 30));
			txtDate.setLocation(new Point(152, 165));
		}
		return txtDate;
	}

	/**
	 * This method initializes txtPrice	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtPrice() {
		if (txtPrice == null) {
			txtPrice = new JTextField();
			txtPrice.setSize(new Dimension(224, 30));
			txtPrice.setLocation(new Point(152, 209));
		}
		return txtPrice;
	}

	/**
	 * This method initializes txtWarranty	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtWarranty() {
		if (txtWarranty == null) {
			txtWarranty = new JTextField();
			txtWarranty.setSize(new Dimension(224, 30));
			txtWarranty.setLocation(new Point(152, 255));
		}
		return txtWarranty;
	}

	/**
	 * This method initializes btnUpdate	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnUpdate() {
		if (btnUpdate == null) {
			btnUpdate = new JButton();
			btnUpdate.setBounds(new Rectangle(70, 302, 106, 37));
			btnUpdate.setFont(new Font("Dialog", Font.BOLD, 14));
			btnUpdate.setText("Update");
		}
		return btnUpdate;
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
			btnCancel.setSize(new Dimension(106, 37));
			btnCancel.setLocation(new Point(248, 302));
			btnCancel.setText("Cancel");
		}
		return btnCancel;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
