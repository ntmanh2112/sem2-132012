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
import java.awt.Color;
import javax.swing.ImageIcon;

public class UpdateDesignation extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JTextField txtDesignationid = null;
	private JLabel jLabel2 = null;
	private JTextField txtDesignationname = null;
	private JButton btnOk = null;
	private JButton btnCancel = null;
	/**
	 * This is the default constructor
	 */
	public UpdateDesignation() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(413, 330);
		this.setContentPane(getJContentPane());
		this.setTitle("FrmUpdateDesign");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabel2 = new JLabel();
			jLabel2.setText("Designation Name :");
			jLabel2.setLocation(new Point(30, 140));
			jLabel2.setSize(new Dimension(114, 25));
			jLabel1 = new JLabel();
			jLabel1.setText("DesignationID :");
			jLabel1.setLocation(new Point(30, 100));
			jLabel1.setSize(new Dimension(90, 25));
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(75, 13, 226, 50));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 24));
			jLabel.setForeground(Color.red);
			jLabel.setText("Update Designation");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.setBackground(new Color(238, 238, 238));
			jContentPane.add(jLabel, null);
			jContentPane.add(jLabel1, null);
			jContentPane.add(getTxtDesignationid(), null);
			jContentPane.add(jLabel2, null);
			jContentPane.add(getTxtDesignationname(), null);
			jContentPane.add(getBtnOk(), null);
			jContentPane.add(getBtnCancel(), null);
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
			txtDesignationid.setLocation(new Point(160, 100));
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
			txtDesignationname.setLocation(new Point(160, 140));
			txtDesignationname.setSize(new Dimension(200, 25));
		}
		return txtDesignationname;
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
			btnOk.setSize(new Dimension(90, 34));
			btnOk.setMnemonic(KeyEvent.VK_UNDEFINED);
			btnOk.setIcon(new ImageIcon(getClass().getResource("/images/Apply.png")));
			btnOk.setLocation(new Point(74, 217));
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
			btnCancel.setSize(new Dimension(97, 34));
			btnCancel.setIcon(new ImageIcon(getClass().getResource("/images/Erase.png")));
			btnCancel.setLocation(new Point(226, 217));
		}
		return btnCancel;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
