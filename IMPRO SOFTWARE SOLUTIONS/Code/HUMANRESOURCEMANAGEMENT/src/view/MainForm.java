package view;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Rectangle;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class MainForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JMenu jMenu = null;
	private JMenuBar jJMenuBar = null;
	private JMenu jMenuMaster = null;
	private JMenu jMenuOrgdetail = null;
	private JMenu jMenuWeightage = null;
	private JMenu jMenuAuthentication = null;
	private JMenu jMenuReports = null;
	/**
	 * This is the default constructor
	 */
	public MainForm() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(585, 350);
		this.setJMenuBar(getJJMenuBar());
		this.setContentPane(getJContentPane());
		this.setTitle("MainForm");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jMenu	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getJMenu() {
		if (jMenu == null) {
			jMenu = new JMenu();
		}
		return jMenu;
	}

	/**
	 * This method initializes jJMenuBar	
	 * 	
	 * @return javax.swing.JMenuBar	
	 */
	private JMenuBar getJJMenuBar() {
		if (jJMenuBar == null) {
			jJMenuBar = new JMenuBar();
			jJMenuBar.add(getJMenuMaster());
			jJMenuBar.add(getJMenuOrgdetail());
			jJMenuBar.add(getJMenuWeightage());
			jJMenuBar.add(getJMenuAuthentication());
			jJMenuBar.add(getJMenuReports());
		}
		return jJMenuBar;
	}

	/**
	 * This method initializes jMenuMaster	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getJMenuMaster() {
		if (jMenuMaster == null) {
			jMenuMaster = new JMenu();
			jMenuMaster.setText("Master");
		}
		return jMenuMaster;
	}

	/**
	 * This method initializes jMenuOrgdetail	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getJMenuOrgdetail() {
		if (jMenuOrgdetail == null) {
			jMenuOrgdetail = new JMenu();
			jMenuOrgdetail.setText("Org.Detail");
		}
		return jMenuOrgdetail;
	}

	/**
	 * This method initializes jMenuWeightage	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getJMenuWeightage() {
		if (jMenuWeightage == null) {
			jMenuWeightage = new JMenu();
			jMenuWeightage.setText("Weightage");
		}
		return jMenuWeightage;
	}

	/**
	 * This method initializes jMenuAuthentication	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getJMenuAuthentication() {
		if (jMenuAuthentication == null) {
			jMenuAuthentication = new JMenu();
			jMenuAuthentication.setText("Authentication");
		}
		return jMenuAuthentication;
	}

	/**
	 * This method initializes jMenuReports	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getJMenuReports() {
		if (jMenuReports == null) {
			jMenuReports = new JMenu();
			jMenuReports.setText("Reports");
		}
		return jMenuReports;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
