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
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.SwingConstants;

public class ViewDesignation extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JScrollPane jScrollPane = null;
	private JTable jTableViewdesignation = null;
	private JButton btnAdd = null;
	private JButton btnEdit = null;
	private JButton btnDelete = null;
	private JPanel jPanel = null;
	private JLabel jLabel1 = null;
	private JTextField txtDesignationid = null;
	private JLabel jLabel2 = null;
	private JTextField txtDesignationname = null;
	private JButton btnSearch = null;

	/**
	 * This is the default constructor
	 */
	public ViewDesignation() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(701, 516);
		this.setContentPane(getJContentPane());
		this.setTitle("FrmViewDesign");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(229, 18, 202, 47));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 24));
			jLabel.setForeground(Color.red);
			jLabel.setText("View Designation");
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
			jScrollPane.setBounds(new Rectangle(27, 83, 635, 191));
			jScrollPane.setViewportView(getJTableViewdesignation());
		}
		return jScrollPane;
	}

	/**
	 * This method initializes jTableViewdesignation	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getJTableViewdesignation() {
		if (jTableViewdesignation == null) {
			jTableViewdesignation = new JTable();
		}
		return jTableViewdesignation;
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
			btnAdd.setIcon(new ImageIcon(getClass().getResource("/images/add-2-icon.png")));
			btnAdd.setFont(new Font("Dialog", Font.BOLD, 12));
			btnAdd.setHorizontalTextPosition(SwingConstants.TRAILING);
			btnAdd.setHorizontalAlignment(SwingConstants.TRAILING);
			btnAdd.setLocation(new Point(92, 392));
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
			btnEdit.setIcon(new ImageIcon(getClass().getResource("/images/Edit-icon.png")));
			btnEdit.setLocation(new Point(280, 392));
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
			btnDelete.setIcon(new ImageIcon(getClass().getResource("/images/Delete.png")));
			btnDelete.setLocation(new Point(464, 392));
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
			jLabel2 = new JLabel();
			jLabel2.setText("DesignationName :");
			jLabel2.setSize(new Dimension(112, 25));
			jLabel2.setLocation(new Point(227, 17));
			jLabel1 = new JLabel();
			jLabel1.setText("DesignationID :");
			jLabel1.setSize(new Dimension(88, 25));
			jLabel1.setLocation(new Point(9, 17));
			jPanel = new JPanel();
			jPanel.setLayout(null);
			jPanel.setLocation(new Point(28, 291));
			jPanel.setSize(new Dimension(634, 58));
			jPanel.add(jLabel1, null);
			jPanel.add(getTxtDesignationid(), null);
			jPanel.add(jLabel2, null);
			jPanel.add(getTxtDesignationname(), null);
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
			txtDesignationid.setSize(new Dimension(90, 25));
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
			txtDesignationname.setLocation(new Point(354, 17));
			txtDesignationname.setSize(new Dimension(90, 25));
		}
		return txtDesignationname;
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
			btnSearch.setSize(new Dimension(100, 25));
			btnSearch.setIcon(new ImageIcon(getClass().getResource("/images/View.png")));
			btnSearch.setLocation(new Point(484, 17));
		}
		return btnSearch;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
