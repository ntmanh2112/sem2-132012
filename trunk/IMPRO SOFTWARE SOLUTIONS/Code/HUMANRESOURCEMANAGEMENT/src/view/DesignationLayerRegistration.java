package view;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Rectangle;
import java.awt.Font;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

import model.DesignLayerModel;
import model.DesignationModel;
import model.EmployeeModel;
import model.SectionModel;
import Common.KeyValue;
import dao.DesignationDAO;
import dao.EmployeeDAO;
import dao.SectionDAO;

import java.awt.Color;
import java.awt.SystemColor;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DesignationLayerRegistration extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JComboBox cbnDesignationid = null;
	private JLabel jLabel2 = null;
	private JTextField txtLayer = null;
	private JLabel jLabel3 = null;
	private JTextField txtWeightage = null;
	private JButton btnAdd = null;
	private JButton btnSave = null;
	private JButton btnEdit = null;
	private JButton btnDelete = null;
	/**
	 * This is the default constructor
	 */
	public DesignationLayerRegistration() {
		super();
		initialize();
		ArrayList<DesignationModel> listDesignation = DesignationDAO.getAllDesignation();
		for (DesignationModel desm : listDesignation) {
			KeyValue item = new KeyValue(desm.getDesID(),desm.getDesignation());

			cbnDesignationid.addItem(item);
			if (item.getKey().equals(desm.getDesID())) {
				cbnDesignationid.setSelectedItem(item);
			}
		}
	}
	

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		Toolkit theKit = this.getToolkit();   
		Dimension wndSize = theKit.getScreenSize();
		this.setResizable(false);
		this.setLocation((wndSize.width-464)/2, (wndSize.height-353)/2);
		this.setSize(464, 353);
		this.setContentPane(getJContentPane());
		this.setTitle("FrmPosDesign");
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
			jLabel3.setLocation(new Point(20, 180));
			jLabel3.setSize(new Dimension(64, 25));
			jLabel2 = new JLabel();
			jLabel2.setText("Layer");
			jLabel2.setLocation(new Point(20, 140));
			jLabel2.setSize(new Dimension(36, 25));
			jLabel1 = new JLabel();
			jLabel1.setText("DesignationID");
			jLabel1.setLocation(new Point(20, 100));
			jLabel1.setSize(new Dimension(81, 25));
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(46, 19, 356, 43));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 24));
			jLabel.setForeground(Color.red);
			jLabel.setText("Designation Layer Registration");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.setBackground(Color.white);
			jContentPane.add(jLabel, null);
			jContentPane.add(jLabel1, null);
			jContentPane.add(getCbnDesignationid(), null);
			jContentPane.add(jLabel2, null);
			jContentPane.add(getTxtLayer(), null);
			jContentPane.add(jLabel3, null);
			jContentPane.add(getTxtWeightage(), null);
			jContentPane.add(getBtnAdd(), null);
			jContentPane.add(getBtnSave(), null);
			jContentPane.add(getBtnEdit(), null);
			jContentPane.add(getBtnDelete(), null);
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
			cbnDesignationid.setSize(new Dimension(200, 25));
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
			txtLayer.setLocation(new Point(130, 140));
			txtLayer.setSize(new Dimension(200, 25));
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
			txtWeightage.setLocation(new Point(130, 180));
			txtWeightage.setSize(new Dimension(200, 25));
		}
		return txtWeightage;
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
			btnAdd.setIcon(new ImageIcon(getClass().getResource("/images/Create.png")));
			btnAdd.setLocation(new Point(29, 243));
			btnAdd.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					 // TODO Auto-generated Event stub actionPerformed()
					DesignLayerModel model = new DesignLayerModel();
					model.setLayer(txtLayer.getText().trim());
					model.setWeightage(txtWeightage.getText().trim());
					model.setDes_ID(((KeyValue) cbnDesignationid.getSelectedItem())
							.getKey());
					
					if(!validateModel(model)) {
						
						return;
					}
				}
			});
			btnAdd.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.out.println("actionPerformed()"); // TODO Auto-generated Event stub actionPerformed()
					validateLayer(txtLayer.getText());
				}
			});
			btnAdd.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.out.println("actionPerformed()"); // TODO Auto-generated Event stub actionPerformed()
					validateWeightage(txtWeightage.getText());
				}
			});
		}
		return btnAdd;
	}

	/**
	 * This method initializes btnSave	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnSave() {
		if (btnSave == null) {
			btnSave = new JButton();
			btnSave.setText("Save");
			btnSave.setSize(new Dimension(90, 30));
			btnSave.setMnemonic(KeyEvent.VK_UNDEFINED);
			btnSave.setIcon(new ImageIcon(getClass().getResource("/images/Save.png")));
			btnSave.setLocation(new Point(130, 243));
		}
		return btnSave;
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
			btnEdit.setIcon(new ImageIcon(getClass().getResource("/images/Modify.png")));
			btnEdit.setLocation(new Point(230, 243));
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
			btnDelete.setLocation(new Point(330, 243));
		}
		return btnDelete;
	}
private Boolean validateModel(DesignLayerModel mo) {
    	
    	if( mo.getLayer() == null || mo.getLayer().equals("")){ 
    		JOptionPane.showMessageDialog(null, "Layer invalid","Notice",JOptionPane.ERROR_MESSAGE);
    		return false;
    	}
    	if( mo.getWeightage() == null || mo.getWeightage().equals("")){ 
    		JOptionPane.showMessageDialog(null, "Weightage invalid","Notice",JOptionPane.ERROR_MESSAGE);
    		return false;
    	}
    	return true;
	}
public boolean  validateLayer(String input){
	boolean kq = true;
	String regex = "[0-9]";
	Pattern pat = Pattern.compile(regex);
	Matcher mat = pat.matcher(input);
	if(mat.find()){
		
		return true;
	}
	JOptionPane.showMessageDialog(null, "Layer invalid");
	return kq;
	}
public boolean  validateWeightage(String input){
	boolean kq = true;
	String regex = "[0-9]";
	Pattern pat = Pattern.compile(regex);
	Matcher mat = pat.matcher(input);
	if(mat.find()){
		
		return true;
	}
	JOptionPane.showMessageDialog(null, "Weightage invalid");
	return kq;
	}
}

  //  @jve:decl-index=0:visual-constraint="11,10"
