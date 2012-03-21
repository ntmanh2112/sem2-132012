package view;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Rectangle;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.Point;
import java.awt.GridBagLayout;
import javax.swing.JTextField;

public class ViewDesignationLayer extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JScrollPane jScrollPane = null;
	private JTable jTableViewdesignationlayer = null;
	private JButton btnAdd = null;
	private JButton btnEdit = null;
	private JButton btnDelete = null;
	private JPanel jPanel = null;
	private JLabel jLabel1 = null;
	private JTextField txtDesignationid = null;
	private JLabel jLabel2 = null;
	private JTextField txtWeightage = null;
	private JLabel jLabel3 = null;
	private JTextField txtLayer = null;
	private JButton btnSearch = null;

	/**
	 * This is the default constructor
	 */
	public ViewDesignationLayer() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(650, 516);
		this.setContentPane(getJContentPane());
		this.setTitle("FrmViewDesignLayer");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(161, 17, 274, 47));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 24));
			jLabel.setText("View Designation Layer");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(jLabel, null);
			jContentPane.add(getJScrollPane(), null);
			jContentPane.add(getBtnAdd(), null);
			jContentPane.add(getBtnEdit(), null);
			jContentPane.add(getBtnDelete(), null);
			jContentPane.add(getJPanel(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jScrollPane	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane() {
		if (jScrollPane == null) {
			jScrollPane = new JScrollPane();
			jScrollPane.setBounds(new Rectangle(27, 83, 567, 191));
			jScrollPane.setViewportView(getJTableViewdesignationlayer());
		}
		return jScrollPane;
	}

	/**
	 * This method initializes jTableViewdesignationlayer	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getJTableViewdesignationlayer() {
		if (jTableViewdesignationlayer == null) {
			jTableViewdesignationlayer = new JTable();
		}
		return jTableViewdesignationlayer;
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
			btnAdd.setLocation(new Point(90, 420));
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
			btnEdit.setLocation(new Point(270, 420));
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
			btnDelete.setLocation(new Point(450, 420));
		}
		return btnDelete;
	}

	/**
	 * This method initializes jPanel	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel() {
		if (jPanel == null) {
			jLabel3 = new JLabel();
			jLabel3.setText("Layer");
			jLabel3.setLocation(new Point(278, 17));
			jLabel3.setSize(new Dimension(57, 30));
			jLabel2 = new JLabel();
			jLabel2.setText("Weightage");
			jLabel2.setSize(new Dimension(64, 30));
			jLabel2.setLocation(new Point(9, 69));
			jLabel1 = new JLabel();
			jLabel1.setText("DesignationID");
			jLabel1.setSize(new Dimension(80, 30));
			jLabel1.setLocation(new Point(9, 17));
			jPanel = new JPanel();
			jPanel.setLayout(null);
			jPanel.setLocation(new Point(28, 291));
			jPanel.setSize(new Dimension(564, 116));
			jPanel.add(jLabel1, null);
			jPanel.add(getTxtDesignationid(), null);
			jPanel.add(jLabel2, null);
			jPanel.add(getTxtWeightage(), null);
			jPanel.add(jLabel3, null);
			jPanel.add(getTxtLayer(), null);
			jPanel.add(getBtnSearch(), null);
		    jPanel.setBorder(BorderFactory.createEtchedBorder());
		}
		return jPanel;
	}

	/**
	 * This method initializes txtDesignationid	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtDesignationid() {
		if (txtDesignationid == null) {
			txtDesignationid = new JTextField();
			txtDesignationid.setLocation(new Point(108, 17));
			txtDesignationid.setSize(new Dimension(160, 30));
		}
		return txtDesignationid;
	}

	/**
	 * This method initializes txtWeightage	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtWeightage() {
		if (txtWeightage == null) {
			txtWeightage = new JTextField();
			txtWeightage.setLocation(new Point(108, 69));
			txtWeightage.setSize(new Dimension(160, 30));
		}
		return txtWeightage;
	}

	/**
	 * This method initializes txtLayer	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtLayer() {
		if (txtLayer == null) {
			txtLayer = new JTextField();
			txtLayer.setLocation(new Point(353, 17));
			txtLayer.setSize(new Dimension(160, 30));
		}
		return txtLayer;
	}

	/**
	 * This method initializes btnSearch	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnSearch() {
		if (btnSearch == null) {
			btnSearch = new JButton();
			btnSearch.setText("Search");
			btnSearch.setSize(new Dimension(117, 30));
			btnSearch.setLocation(new Point(353, 69));
		}
		return btnSearch;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
