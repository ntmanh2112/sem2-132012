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

public class UpdateDesignationLayer extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JComboBox cbnDesignationid = null;
	private JLabel jLabel2 = null;
	private JTextField txtLayer = null;
	private JLabel jLabel3 = null;
	private JTextField txtWeightage = null;
	private JButton btnOk = null;
	private JButton btnCancel = null;
	/**
	 * This is the default constructor
	 */
	public UpdateDesignationLayer() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(464, 353);
		this.setContentPane(getJContentPane());
		this.setTitle("FrmUpdateDesignLayer");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabel3 = new JLabel();
			jLabel3.setText("Weightage");
			jLabel3.setLocation(new Point(20, 200));
			jLabel3.setSize(new Dimension(64, 30));
			jLabel2 = new JLabel();
			jLabel2.setText("Layer");
			jLabel2.setLocation(new Point(20, 150));
			jLabel2.setSize(new Dimension(36, 30));
			jLabel1 = new JLabel();
			jLabel1.setText("DesignationID");
			jLabel1.setLocation(new Point(20, 100));
			jLabel1.setSize(new Dimension(81, 30));
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(65, 19, 310, 43));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 24));
			jLabel.setText("Update Designation Layer ");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(jLabel, null);
			jContentPane.add(jLabel1, null);
			jContentPane.add(getCbnDesignationid(), null);
			jContentPane.add(jLabel2, null);
			jContentPane.add(getTxtLayer(), null);
			jContentPane.add(jLabel3, null);
			jContentPane.add(getTxtWeightage(), null);
			jContentPane.add(getBtnOk(), null);
			jContentPane.add(getBtnCancel(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes cbnDesignationid	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getCbnDesignationid() {
		if (cbnDesignationid == null) {
			cbnDesignationid = new JComboBox();
			cbnDesignationid.setSize(new Dimension(200, 30));
			cbnDesignationid.setLocation(new Point(130, 100));
		}
		return cbnDesignationid;
	}

	/**
	 * This method initializes txtLayer	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtLayer() {
		if (txtLayer == null) {
			txtLayer = new JTextField();
			txtLayer.setLocation(new Point(130, 150));
			txtLayer.setSize(new Dimension(200, 30));
		}
		return txtLayer;
	}

	/**
	 * This method initializes txtWeightage	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtWeightage() {
		if (txtWeightage == null) {
			txtWeightage = new JTextField();
			txtWeightage.setLocation(new Point(130, 200));
			txtWeightage.setSize(new Dimension(200, 30));
		}
		return txtWeightage;
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
			btnOk.setLocation(new Point(130, 260));
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
			btnCancel.setSize(new Dimension(90, 30));
			btnCancel.setLocation(new Point(230, 260));
		}
		return btnCancel;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
