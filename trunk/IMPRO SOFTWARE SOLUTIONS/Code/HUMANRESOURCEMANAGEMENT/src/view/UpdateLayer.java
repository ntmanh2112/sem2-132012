package view;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Rectangle;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Point;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JSlider;
import javax.swing.JEditorPane;
import javax.swing.JTabbedPane;
import java.awt.Panel;
import java.awt.GridBagLayout;
import javax.swing.JToolBar;
import javax.swing.JOptionPane;

public class UpdateLayer extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabelTitle = null;
	private JLabel JLabelID = null;
	private JTextField txtID = null;
	private JLabel jLabelLayer = null;
	private JTextField txtLayer = null;
	private JLabel jLabelWeightage = null;
	private JTextField txtWeightage = null;
	private JButton btnDongy = null;
	private JButton btnCancel = null;
	/**
	 * This is the default constructor
	 */
	public UpdateLayer() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(436, 353);
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
			jLabelWeightage = new JLabel();
			jLabelWeightage.setText("Weightage :");
			jLabelWeightage.setLocation(new Point(40, 180));
			jLabelWeightage.setSize(new Dimension(89, 25));
			jLabelLayer = new JLabel();
			jLabelLayer.setText("Layer :");
			jLabelLayer.setLocation(new Point(40, 140));
			jLabelLayer.setSize(new Dimension(93, 25));
			JLabelID = new JLabel();
			JLabelID.setText("LayerID :");
			JLabelID.setLocation(new Point(40, 100));
			JLabelID.setSize(new Dimension(95, 25));
			jLabelTitle = new JLabel();
			jLabelTitle.setBounds(new Rectangle(44, 15, 165, 48));
			jLabelTitle.setFont(new Font("Dialog", Font.BOLD, 24));
			jLabelTitle.setForeground(Color.red);
			jLabelTitle.setText("Update Layer");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.setBackground(new Color(238, 238, 238));
			jContentPane.add(jLabelTitle, null);
			jContentPane.add(JLabelID, null);
			jContentPane.add(getTxtID(), null);
			jContentPane.add(jLabelLayer, null);
			jContentPane.add(getTxtLayer(), null);
			jContentPane.add(jLabelWeightage, null);
			jContentPane.add(getTxtWeightage(), null);
			jContentPane.add(getBtnDongy(), null);
			jContentPane.add(getBtnCancel(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes txtID	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtID() {
		if (txtID == null) {
			txtID = new JTextField();
			txtID.setSize(new Dimension(200, 25));
			txtID.setLocation(new Point(170, 100));
		}
		return txtID;
	}

	/**
	 * This method initializes txtLayer	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtLayer() {
		if (txtLayer == null) {
			txtLayer = new JTextField();
			txtLayer.setSize(new Dimension(200, 25));
			txtLayer.setLocation(new Point(170, 140));
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
			txtWeightage.setSize(new Dimension(200, 25));
			txtWeightage.setLocation(new Point(170, 180));
		}
		return txtWeightage;
	}

	/**
	 * This method initializes btnDongy	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnDongy() {
		if (btnDongy == null) {
			btnDongy = new JButton();
			btnDongy.setText("Update");
			btnDongy.setLocation(new Point(79, 237));
			btnDongy.setIcon(new ImageIcon(getClass().getResource("/images/Update.png")));
			btnDongy.setSize(new Dimension(95, 34));
		}
		return btnDongy;
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
			btnCancel.setLocation(new Point(240, 237));
			btnCancel.setIcon(new ImageIcon(getClass().getResource("/images/button-cancel-icon.png")));
			btnCancel.setSize(new Dimension(98, 34));
		}
		return btnCancel;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
