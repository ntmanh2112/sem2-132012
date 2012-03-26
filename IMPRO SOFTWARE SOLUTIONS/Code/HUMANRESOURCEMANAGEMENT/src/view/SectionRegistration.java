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

import dao.SectionDAO;


import model.SectionModel;


import java.awt.Color;

public class SectionRegistration extends JFrame {

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
	//private JButton btnAdd = null;
	//private JButton btnEdit = null;
	private JButton btnCancel = null;
	private JButton btnAdd = null;

	/**
	 * This is the default constructor
	 */
	public SectionRegistration() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(485, 395);
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
			jLabel4 = new JLabel();
			jLabel4.setText("DepID :");
			jLabel4.setLocation(new Point(50, 220));
			jLabel4.setSize(new Dimension(46, 25));
			jLabel3 = new JLabel();
			jLabel3.setText("Sec-incharge :");
			jLabel3.setLocation(new Point(50, 180));
			jLabel3.setSize(new Dimension(88, 25));
			jLabel2 = new JLabel();
			jLabel2.setText("SectionName :");
			jLabel2.setLocation(new Point(50, 140));
			jLabel2.setSize(new Dimension(87, 25));
			jLabel1 = new JLabel();
			jLabel1.setText("SectionID :");
			jLabel1.setLocation(new Point(50, 100));
			jLabel1.setSize(new Dimension(72, 25));
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(130, 13, 244, 41));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 24));
			jLabel.setForeground(Color.red);
			jLabel.setText("Section Registration");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.setBackground(new Color(238, 238, 238));
			jContentPane.add(jLabel, null);
			jContentPane.add(jLabel1, null);
			jContentPane.add(getTxtSectionid(), null);
			jContentPane.add(jLabel2, null);
			jContentPane.add(getTxtSectionname(), null);
			jContentPane.add(jLabel3, null);
			jContentPane.add(getTxtSecincharge(), null);
			jContentPane.add(jLabel4, null);
			jContentPane.add(getCbnDeptno(), null);
			//jContentPane.add(getBtnAdd(), null);
			//jContentPane.add(getBtnEdit(), null);
			jContentPane.add(getBtnCancel(), null);
			jContentPane.add(getBtnAdd(), null);
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
			txtSectionid.setSize(new Dimension(200, 25));
			txtSectionid.setLocation(new Point(180, 100));
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
			txtSectionname.setLocation(new Point(180, 140));
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
			txtSecincharge.setLocation(new Point(180, 180));
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
			cbnDeptno.setLocation(new Point(180, 220));
			cbnDeptno.setSize(new Dimension(200, 25));
			cbnDeptno.addItem("P10");
			cbnDeptno.addItem("P20");
			cbnDeptno.addItem("P30");
			cbnDeptno.addItem("P40");
		}
		return cbnDeptno;
	}

	/**
	 * This method initializes btnAdd	
	 * 	
	 * @return javax.swing.JButton	
	 */
	

	/**
	 * This method initializes btnEdit	
	 * 	
	 * @return javax.swing.JButton	
	 */
	

	/**
	 * This method initializes btnCancel	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnCancel() {
		if (btnCancel == null) {
			btnCancel = new JButton();
			btnCancel.setText("Cancel");
			btnCancel.setSize(new Dimension(98, 34));
			btnCancel.setIcon(new ImageIcon(getClass().getResource("/images/Erase.png")));
			btnCancel.setLocation(new Point(269, 287));
			btnCancel.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.out.println("actionPerformed()"); // TODO Auto-generated Event stub actionPerformed()
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
	 * This method initializes btnAdd	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnAdd() {
		if (btnAdd == null) {
			btnAdd = new JButton();
			btnAdd.setText("Add");
			btnAdd.setSize(new Dimension(90, 34));
			btnAdd.setIcon(new ImageIcon(getClass().getResource("/images/Yes.png")));
			btnAdd.setLocation(new Point(118, 287));
			btnAdd.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.out.println("actionPerformed()"); // TODO Auto-generated Event stub actionPerformed()
					SectionModel model = new SectionModel();
					model.setSecID(txtSectionid.getText().trim());
					model.setName(txtSectionname.getText().trim());
					model.setSection_Inch(txtSecincharge.getText().trim());
					model.setDepID(cbnDeptno.getSelectedItem().toString());
					if(!validateModel(model)){
						return;
					}
					
					Boolean kq = SectionDAO.insertSection(model);
					if (kq) {
						JOptionPane.showMessageDialog(null,
								"Thêm Section Thành Công", "Thông Báo",
								JOptionPane.INFORMATION_MESSAGE);
						(new ViewSection()).setVisible(true);
						dispose();
					}
				}
			});
		}
		return btnAdd;
	}
	private Boolean validateModel(SectionModel mo) {
		if (mo.getSecID() == null || mo.getSecID().equals("")) {
			JOptionPane.showMessageDialog(null,"Ma section khong hop le","thong bao",JOptionPane.ERROR_MESSAGE);
			return false;
		}
		if (mo.getName() == null || mo.getName().equals("")) {
			JOptionPane.showMessageDialog(null,"Ten section khong hop le","thong bao",JOptionPane.ERROR_MESSAGE);
			return false;
		}
		
		if (mo.getSection_Inch() == null || mo.getSection_Inch().equals("")) {
			JOptionPane.showMessageDialog(null,"Section incharge khong hop le","thong bao",JOptionPane.ERROR_MESSAGE);
			return false;
		}
		return true;
	
	}
			
		
	
}  //  @jve:decl-index=0:visual-constraint="10,10"
