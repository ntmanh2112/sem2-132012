package view;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Rectangle;
import java.awt.Font;
import java.awt.Toolkit;

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
import java.awt.event.ActionEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JToolBar;
import javax.swing.JOptionPane;

import Common.KeyValue;

import model.DepartmentsModel;
import model.DesignLayerModel;
import dao.DepartmentsDAO;
import dao.DesignLayerDAO;
import dao.EmployeeDAO;

import javax.swing.JComboBox;

public class UpdateLayer extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabelTitle = null;
	private JLabel JLabelID = null;
	private JLabel jLabelLayer = null;
	private JTextField txtLayer = null;
	private JLabel jLabelWeightage = null;
	private JTextField txtWeightage = null;
	private JButton btnDongy = null;
	private JButton btnCancel = null;
	private JTextField txtLayerID = null;
	DesignLayerModel model = new DesignLayerModel();  //  @jve:decl-index=0:
	/**
	 * This is the default constructor
	 */
	public UpdateLayer() {
		super();
		initialize();
	}
	public UpdateLayer(DesignLayerModel mo) {
		super();
		this.model = DesignLayerDAO.getDesignLayerByID(mo.getLayer_ID());
		initialize();
		txtLayerID.setText(model.getLayer_ID());
		txtLayer.setText(model.getLayer());
		txtWeightage.setText(model.getWeightage());
		
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
		this.setLocation((wndSize.width-436)/2, (wndSize.height-353)/2);
		this.setSize(387, 353);
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
			jLabelWeightage.setSize(new Dimension(73, 25));
			jLabelLayer = new JLabel();
			jLabelLayer.setText("Layer :");
			jLabelLayer.setLocation(new Point(40, 140));
			jLabelLayer.setSize(new Dimension(66, 25));
			JLabelID = new JLabel();
			JLabelID.setText("Layer_ID :");
			JLabelID.setLocation(new Point(40, 100));
			JLabelID.setSize(new Dimension(66, 25));
			jLabelTitle = new JLabel();
			jLabelTitle.setBounds(new Rectangle(76, 13, 249, 48));
			jLabelTitle.setFont(new Font("Dialog", Font.BOLD, 24));
			jLabelTitle.setForeground(Color.red);
			jLabelTitle.setText("Update DesignLayer");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.setBackground(new Color(238, 238, 238));
			jContentPane.add(jLabelTitle, null);
			jContentPane.add(JLabelID, null);
			jContentPane.add(jLabelLayer, null);
			jContentPane.add(getTxtLayer(), null);
			jContentPane.add(jLabelWeightage, null);
			jContentPane.add(getTxtWeightage(), null);
			jContentPane.add(getBtnDongy(), null);
			jContentPane.add(getBtnCancel(), null);
			jContentPane.add(getTxtLayerID(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes txtLayer	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtLayer() {
		if (txtLayer == null) {
			txtLayer = new JTextField();
			//txtLayer.setEnabled(false);
			txtLayer.setSize(new Dimension(200, 25));
			txtLayer.setLocation(new Point(130, 140));
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
			txtWeightage.setLocation(new Point(130, 180));
		}
		return txtWeightage;
	}

	/**
	 * This method initializes btnDongy	
	 * 	
	 * @return javax.swing.JButton	
	 */
private Boolean validateModel(DesignLayerModel mo) {
    	
    	if( mo.getLayer() == null || mo.getLayer().equals("")){ 
    		JOptionPane.showMessageDialog(null, "Layer invalid","Notice",JOptionPane.ERROR_MESSAGE);
    		return false;
    	}
    	if(!validateLayer(mo.getLayer())){
			return false;
		}
    	if( mo.getWeightage()== null || mo.getWeightage().equals("")){
    		JOptionPane.showMessageDialog(null, "Weightage invalid","Notice",JOptionPane.ERROR_MESSAGE);
    		return false;
    	}
    	if(!validateWeightage(mo.getWeightage())){
    		return false;
    	}
    	return true;
}
	private JButton getBtnDongy() {
		if (btnDongy == null) {
			btnDongy = new JButton();
			btnDongy.setText("Update");
			btnDongy.setLocation(new Point(79, 237));
			btnDongy.setIcon(new ImageIcon(getClass().getResource("/images/Update.png")));
			btnDongy.setSize(new Dimension(95, 34));
			btnDongy.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					DesignLayerModel model = new DesignLayerModel();
					model.setLayer_ID(txtLayerID.getText().trim());
					model.setLayer(txtLayer.getText().trim());
					model.setWeightage(txtWeightage.getText().trim());
					
					if(!validateModel(model)) {
						
						return;
					}
					Boolean kq = DesignLayerDAO.updateDesignLayer(model);
					if (kq) {
						JOptionPane.showMessageDialog(null,
								"Update success", "Notice",
								JOptionPane.INFORMATION_MESSAGE);
						(new ViewDesignationLayer()).setVisible(true);
						dispose();
					}else{
						JOptionPane.showMessageDialog(null,
								"Update failed", "Notice",
								JOptionPane.ERROR_MESSAGE);
						(new ViewDesignationLayer()).setVisible(true);
						dispose();
					}
				}
			});
			
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
			btnCancel.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					int kg = JOptionPane.showConfirmDialog(null,
							"Are you sure you want to exit", "Notice",
							JOptionPane.OK_CANCEL_OPTION);
					if (kg == 0) {
						(new ViewDesignationLayer()).setVisible(true);
						dispose();
					}
				}
			});
		}
		return btnCancel;
	}

	public boolean  validateLayer(String input){
		//boolean kq = true;
		String regex = "[0-9*]";
		Pattern pat = Pattern.compile(regex);
		Matcher mat = pat.matcher(input);
		if(mat.find()){
			return true;
		}
		JOptionPane.showMessageDialog(null, "Is the Layer number","Notice",JOptionPane.ERROR_MESSAGE);
		return false;
		}
		
		
	public boolean  validateWeightage(String input){
		//boolean kq = true;
		String regex = "[0-9*]";
		Pattern pat = Pattern.compile(regex);
		Matcher mat = pat.matcher(input);
		if(mat.find()){
			return true;
		}
		JOptionPane.showMessageDialog(null, "Is the Weightage number","Notice",JOptionPane.ERROR_MESSAGE);
		
		return false;
		}

/**
 * This method initializes txtLayerID	
 * 	
 * @return javax.swing.JTextField	
 */
private JTextField getTxtLayerID() {
	if (txtLayerID == null) {
		txtLayerID = new JTextField();
		txtLayerID.setEnabled(false);
		txtLayerID.setSize(new Dimension(200, 25));
		txtLayerID.setLocation(new Point(130, 100));
	}
	return txtLayerID;
}
}  //  @jve:decl-index=0:visual-constraint="10,10"
