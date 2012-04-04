package view;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Rectangle;
import java.awt.Font;
import java.awt.Point;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JButton;

public class DiviseEmployee extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JComboBox cbnProjectname = null;
	private JLabel jLabel2 = null;
	private JList jListEmployeenotinvolved = null;
	private JList jListEmployeeinvolved = null;
	private JLabel jLabel3 = null;
	private JButton btn1 = null;
	private JButton btn2 = null;
	private JButton btn3 = null;
	private JButton btn4 = null;
	private JButton btnPrint = null;

	/**
	 * This is the default constructor
	 */
	public DiviseEmployee() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(804, 489);
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
			jLabel3 = new JLabel();
			jLabel3.setText("Employee Involved");
			jLabel3.setSize(new Dimension(109, 30));
			jLabel3.setLocation(new Point(559, 113));
			jLabel2 = new JLabel();
			jLabel2.setText("Employee Not Involved");
			jLabel2.setSize(new Dimension(130, 30));
			jLabel2.setLocation(new Point(95, 113));
			jLabel1 = new JLabel();
			jLabel1.setText("ProjectName");
			jLabel1.setSize(new Dimension(76, 30));
			jLabel1.setLocation(new Point(137, 72));
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(309, 13, 193, 36));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 24));
			jLabel.setText("Divise Employee");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(jLabel, null);
			jContentPane.add(jLabel1, null);
			jContentPane.add(getCbnProjectname(), null);
			jContentPane.add(jLabel2, null);
			jContentPane.add(getJListEmployeenotinvolved(), null);
			jContentPane.add(getJListEmployeeinvolved(), null);
			jContentPane.add(jLabel3, null);
			jContentPane.add(getBtn1(), null);
			jContentPane.add(getBtn2(), null);
			jContentPane.add(getBtn3(), null);
			jContentPane.add(getBtn4(), null);
			jContentPane.add(getBtnPrint(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes cbnProjectname	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getCbnProjectname() {
		if (cbnProjectname == null) {
			cbnProjectname = new JComboBox();
			cbnProjectname.setLocation(new Point(276, 72));
			cbnProjectname.setSize(new Dimension(225, 30));
		}
		return cbnProjectname;
	}

	/**
	 * This method initializes jListEmployeenotinvolved	
	 * 	
	 * @return javax.swing.JList	
	 */
	private JList getJListEmployeenotinvolved() {
		if (jListEmployeenotinvolved == null) {
			jListEmployeenotinvolved = new JList();
			jListEmployeenotinvolved.setBounds(new Rectangle(13, 148, 318, 241));
			jListEmployeenotinvolved.setBorder(BorderFactory.createEtchedBorder());
		}
		return jListEmployeenotinvolved;
	}

	/**
	 * This method initializes jListEmployeeinvolved	
	 * 	
	 * @return javax.swing.JList	
	 */
	private JList getJListEmployeeinvolved() {
		if (jListEmployeeinvolved == null) {
			jListEmployeeinvolved = new JList();
			jListEmployeeinvolved.setSize(new Dimension(318, 241));
			jListEmployeeinvolved.setLocation(new Point(450, 148));
			jListEmployeeinvolved.setBorder(BorderFactory.createEtchedBorder());
		}
		return jListEmployeeinvolved;
	}

	/**
	 * This method initializes btn1	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtn1() {
		if (btn1 == null) {
			btn1 = new JButton();
			btn1.setLocation(new Point(345, 161));
			btn1.setText(">");
			btn1.setSize(new Dimension(90, 30));
		}
		return btn1;
	}

	/**
	 * This method initializes btn2	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtn2() {
		if (btn2 == null) {
			btn2 = new JButton();
			btn2.setLocation(new Point(345, 211));
			btn2.setText(">>");
			btn2.setSize(new Dimension(90, 30));
		}
		return btn2;
	}

	/**
	 * This method initializes btn3	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtn3() {
		if (btn3 == null) {
			btn3 = new JButton();
			btn3.setLocation(new Point(345, 261));
			btn3.setText("<");
			btn3.setSize(new Dimension(90, 30));
		}
		return btn3;
	}

	/**
	 * This method initializes btn4	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtn4() {
		if (btn4 == null) {
			btn4 = new JButton();
			btn4.setLocation(new Point(345, 311));
			btn4.setText("<<");
			btn4.setSize(new Dimension(90, 30));
		}
		return btn4;
	}

	/**
	 * This method initializes btnPrint	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnPrint() {
		if (btnPrint == null) {
			btnPrint = new JButton();
			btnPrint.setBounds(new Rectangle(330, 399, 121, 38));
			btnPrint.setText("Print");
		}
		return btnPrint;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
