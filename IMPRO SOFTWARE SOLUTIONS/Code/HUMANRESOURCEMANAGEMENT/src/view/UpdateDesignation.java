package view;

import java.awt.BorderLayout;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Rectangle;
import java.awt.Font;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

import dao.DepartmentsDAO;
import dao.DesignationDAO;
import dao.EmployeeDAO;

import model.DepartmentsModel;
import model.DesignationModel;

import java.awt.Color;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JComboBox;

import Common.KeyValue;

public class UpdateDesignation extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JTextField txtDesignationid = null;
	private JLabel jLabel2 = null;
	private JTextField txtDesignationname = null;
	private JButton btnAdd = null;
	private JButton btnDelete = null;
	private JLabel jLabel3 = null;
	private JComboBox cbnLayerId = null;
	DesignationModel model = new DesignationModel();  //  @jve:decl-index=0:
	/**
	 * This is the default constructor
	 */
	public UpdateDesignation() {
		super();
		initialize();
		
	}
	public UpdateDesignation(DesignationModel mo) {
		super();
		this.model = DesignationDAO.getDesignationByID(mo.getDesID());
		initialize();
		txtDesignationid.setText(model.getDesID());
		ArrayList<DesignationModel> listDesignation = DesignationDAO.getAllDesignation();
		for (DesignationModel dm : listDesignation) {
			KeyValue item = new KeyValue(dm.getLayer_ID(),dm.getLayer_ID());

			cbnLayerId.addItem(item);
			if (item.getKey().equals(model.getLayer_ID())) {
				cbnLayerId.setSelectedItem(item);
			}
		}
		txtDesignationname.setText(model.getDesignation());
		
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
		this.setLocation((wndSize.width-343)/2, (wndSize.height-330)/2);
		this.setSize(343, 330);
		this.setContentPane(getJContentPane());
		this.setTitle("FrmDesign");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabel3 = new JLabel();
			jLabel3.setText("Layer_ID :");
			jLabel3.setSize(new Dimension(65, 25));
			jLabel3.setLocation(new Point(20, 140));
			jLabel2 = new JLabel();
			jLabel2.setText("Des_Name :");
			jLabel2.setSize(new Dimension(75, 25));
			jLabel2.setLocation(new Point(20, 180));
			jLabel1 = new JLabel();
			jLabel1.setText("Des_ID :");
			jLabel1.setLocation(new Point(20, 100));
			jLabel1.setSize(new Dimension(63, 25));
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(45, 14, 233, 50));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 24));
			jLabel.setBackground(Color.white);
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
			jContentPane.add(getBtnAdd(), null);
			jContentPane.add(getBtnDelete(), null);
			jContentPane.add(jLabel3, null);
			jContentPane.add(getCbnLayerId(), null);
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
			txtDesignationid.setEnabled(false);
			txtDesignationid.setSize(new Dimension(200, 25));
			txtDesignationid.setLocation(new Point(100, 100));
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
			txtDesignationname.setLocation(new Point(100, 180));
			txtDesignationname.setSize(new Dimension(200, 25));
		}
		return txtDesignationname;
	}

	/**
	 * This method initializes btnAdd	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnAdd() {
		if (btnAdd == null) {
			btnAdd = new JButton();
			btnAdd.setText("Update");
			btnAdd.setSize(new Dimension(98, 35));
			btnAdd.setIcon(new ImageIcon(getClass().getResource("/images/Create.png")));
			btnAdd.setLocation(new Point(40, 228));
			btnAdd.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					 DesignationModel model = new DesignationModel();
					model.setDesID(txtDesignationid.getText().trim());
					model.setLayer_ID(((KeyValue) cbnLayerId.getSelectedItem())
							.getKey());
					model.setDesignation(txtDesignationname.getText().trim());
					if(!validateModel(model)) {
						
						return;
					}
					Boolean kq = DesignationDAO.updateDesignation(model);
					if (kq) {
						JOptionPane.showMessageDialog(null,
								"Update success", "Notice",
								JOptionPane.INFORMATION_MESSAGE);
						(new ViewDesignation()).setVisible(true);
						dispose();
					}
					else{
						JOptionPane.showMessageDialog(null,
								"Update failed", "Notice",
								JOptionPane.ERROR_MESSAGE);
						(new ViewDesignation()).setVisible(true);
						dispose();
					}
				}
			});
		}
		return btnAdd;
	}

	/**
	 * This method initializes btnDelete	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnDelete() {
		if (btnDelete == null) {
			btnDelete = new JButton();
			btnDelete.setText("Cancel");
			btnDelete.setSize(new Dimension(99, 35));
			btnDelete.setIcon(new ImageIcon(getClass().getResource("/images/Delete.png")));
			btnDelete.setLocation(new Point(175, 228));
			btnDelete.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					int kg = JOptionPane.showConfirmDialog(null,
							"Are you sure you want to exit", "Notice",
							JOptionPane.OK_CANCEL_OPTION);
					if (kg == 0) {
						(new ViewDesignation()).setVisible(true);
						dispose();
					}
				}
			});
		}
		return btnDelete;
	}

	public Boolean validateModel(DesignationModel mo){
		if( mo.getDesID() == null || mo.getDesID().equals("")){ 
    		JOptionPane.showMessageDialog(null, " DEP_ID invalid","Notice",JOptionPane.ERROR_MESSAGE);
    		return false;
    	}
		if( mo.getLayer_ID() == null || mo.getLayer_ID().equals("")){ 
    		JOptionPane.showMessageDialog(null, " LAYER_ID invalid","Notice",JOptionPane.ERROR_MESSAGE);
    		return false;
    	}
		if( mo.getDesignation() == null || mo.getDesignation().equals("")){ 
    		JOptionPane.showMessageDialog(null, "Designation invalid","Notice",JOptionPane.ERROR_MESSAGE);
    		return false;
    	}
		if(!validateDesignation(mo.getDesignation())){
			return false;
		}
		return true;
	}
	public boolean  validateDesignation(String input){
		//boolean kq = true;
		String regex = "[A-Za-z]";
		Pattern pat = Pattern.compile(regex);
		Matcher mat = pat.matcher(input);
		if(mat.find()){
			
			return true;
		}
		JOptionPane.showMessageDialog(null, "Designation not numbers","Notice",JOptionPane.ERROR_MESSAGE);
		return false;
		}
	/**
	 * This method initializes cbnLayerId	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getCbnLayerId() {
		if (cbnLayerId == null) {
			cbnLayerId = new JComboBox();
			cbnLayerId.setEnabled(false);
			cbnLayerId.setSize(new Dimension(200, 26));
			cbnLayerId.setLocation(new Point(100, 140));
		}
		return cbnLayerId;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
