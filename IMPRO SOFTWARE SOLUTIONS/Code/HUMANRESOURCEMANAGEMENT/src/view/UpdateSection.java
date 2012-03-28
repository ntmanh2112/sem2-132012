package view;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Rectangle;
import java.awt.Font;
import java.awt.Point;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.ImageIcon;

import Common.KeyValue;

import model.DepartmentsModel;
import model.DesignationModel;
import model.EmployeeModel;
import model.SectionModel;

import dao.DepartmentsDAO;
import dao.DesignationDAO;
import dao.EmployeeDAO;
import dao.SectionDAO;


import java.awt.Color;
import java.util.ArrayList;

public class UpdateSection extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JTextField txtSectionid = null;
	private JLabel jLabel2 = null;
	private JTextField txtSectionname = null;
	private JLabel jLabel3 = null;
	private JTextField txtSecincharge = null;
	private JLabel jLabel4 = null;
	private JComboBox cbnDeptno = null;
	private JButton btnCancel = null;
	private JButton btnUpdate = null;
	//private SectionModel model;
	SectionModel model = new SectionModel();

	/**
	 * This is the default constructor
	 */
	public UpdateSection() {
		super();
		initialize();
	}
	public UpdateSection(SectionModel model) {
		super();
		this.model = SectionDAO.getSectionByID(model.getSecID());
		initialize();
		txtSectionid.setText(this.model.getSecID());
		txtSectionname.setText(this.model.getName());
		txtSecincharge.setText(this.model.getSection_Inch());
		
		ArrayList<DepartmentsModel> listDepartment = DepartmentsDAO.getAllDepartments();
		for (DepartmentsModel dm : listDepartment) {
			KeyValue item = new KeyValue(dm.getDep_ID(),dm.getDep_Name());

			cbnDeptno.addItem(item);
			if (item.getKey().equals(this.model.getDepID())) {
				cbnDeptno.setSelectedItem(item);
			}
		}
		
		
	
		
		//txtSecincharge.setText(this.model.getSection_Inch());
		
		
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(485, 414);
		this.setContentPane(getJContentPane());
		this.setTitle("FrmUpdateSection");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabel4 = new JLabel();
			jLabel4.setText("DepID :");
			jLabel4.setLocation(new Point(20, 220));
			jLabel4.setSize(new Dimension(46, 25));
			jLabel3 = new JLabel();
			jLabel3.setText("Sec-incharge :");
			jLabel3.setLocation(new Point(20, 180));
			jLabel3.setSize(new Dimension(86, 25));
			jLabel2 = new JLabel();
			jLabel2.setText("SectionName :");
			jLabel2.setLocation(new Point(20, 140));
			jLabel2.setSize(new Dimension(87, 25));
			jLabel1 = new JLabel();
			jLabel1.setText("SectionID :");
			jLabel1.setLocation(new Point(20, 100));
			jLabel1.setSize(new Dimension(70, 25));
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(151, 13, 179, 41));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 24));
			jLabel.setForeground(Color.red);
			jLabel.setText("Update Section");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(jLabel, null);
			jContentPane.add(jLabel1, null);
			jContentPane.add(getTxtSectionid(), null);
			jContentPane.add(jLabel2, null);
			jContentPane.add(getTxtSectionname(), null);
			jContentPane.add(jLabel3, null);
			jContentPane.add(getTxtSecincharge(), null);
			jContentPane.add(jLabel4, null);
			jContentPane.add(getCbnDeptno(), null);
			jContentPane.add(getBtnCancel(), null);
			jContentPane.add(getBtnUpdate(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes txtSectionid	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtSectionid() {
		if (txtSectionid == null) {
			txtSectionid = new JTextField();
			txtSectionid.setEnabled(false);
			txtSectionid.setSize(new Dimension(200, 25));
			txtSectionid.setLocation(new Point(150, 100));
		}
		return txtSectionid;
	}

	/**
	 * This method initializes txtSectionname	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtSectionname() {
		if (txtSectionname == null) {
			txtSectionname = new JTextField();
			txtSectionname.setLocation(new Point(150, 140));
			txtSectionname.setSize(new Dimension(200, 25));
		}
		return txtSectionname;
	}

	/**
	 * This method initializes txtSecincharge	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtSecincharge() {
		if (txtSecincharge == null) {
			txtSecincharge = new JTextField();
			txtSecincharge.setLocation(new Point(150, 180));
			txtSecincharge.setSize(new Dimension(200, 25));
		}
		return txtSecincharge;
	}

	/**
	 * This method initializes cbnDeptno	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getCbnDeptno() {
		if (cbnDeptno == null) {
			cbnDeptno = new JComboBox();
			cbnDeptno.setLocation(new Point(150, 220));
			cbnDeptno.setSize(new Dimension(200, 25));
			
		}
		return cbnDeptno;
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
			btnCancel.setSize(new Dimension(100, 34));
			btnCancel.setIcon(new ImageIcon(getClass().getResource("/images/Button-Close-icon.png")));
			btnCancel.setLocation(new Point(267, 284));
			btnCancel.addActionListener(new java.awt.event.ActionListener() {
				
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.out.println("actionPerformed()"); 
					// TODO Auto-generated Event stub actionPerformed()
					int kg = JOptionPane.showConfirmDialog(null,
							"Ban co chac muon thoat", "Thong Bao",
							JOptionPane.OK_CANCEL_OPTION);
					if (kg == 0) {
						(new ViewSection()).setVisible(true);
						dispose();
					}
				}
			});
		}
		return btnCancel;
	}

	/**
	 * This method initializes btnUpdate	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnUpdate() {
		if (btnUpdate == null) {
			btnUpdate = new JButton();
			btnUpdate.setText("Update");
			btnUpdate.setSize(new Dimension(96, 34));
			btnUpdate.setIcon(new ImageIcon(getClass().getResource("/images/Update.png")));
			btnUpdate.setLocation(new Point(108, 284));
			btnUpdate.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.out.println("actionPerformed()");
					// TODO Auto-generated Event stub actionPerformed()
					SectionModel model = new SectionModel();
					model.setSecID(txtSectionid.getText().trim());
					model.setName(txtSectionname.getText().trim());
					model.setSection_Inch(txtSecincharge.getText().trim());
					model.setDepID(((KeyValue) cbnDeptno.getSelectedItem())
							.getKey());
					if(!validateModel(model)){
						return;
					}
					
					Boolean kq = SectionDAO.updateSection(model);
					if (kq) {
						JOptionPane.showMessageDialog(null,
								"Update success",
								"Notice",
								JOptionPane.INFORMATION_MESSAGE);
						(new ViewSection()).setVisible(true);
						dispose();

					}
				}
				
			});
			
		}
		return btnUpdate;
	}
	private Boolean validateModel(SectionModel mo) {
		if (mo.getSecID() == null || mo.getSecID().equals("")) {
			JOptionPane.showMessageDialog(null," SecID invalid","Notice",JOptionPane.ERROR_MESSAGE);
			return false;
		}
		if (mo.getName() == null || mo.getName().equals("")) {
			JOptionPane.showMessageDialog(null,"SecName invalid","Notice",JOptionPane.ERROR_MESSAGE);
			return false;
		}
		
		if (mo.getSection_Inch() == null || mo.getSection_Inch().equals("")) {
			JOptionPane.showMessageDialog(null,"Section incharge invalid","Notice",JOptionPane.ERROR_MESSAGE);
			return false;
		}
		return true;
	
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
