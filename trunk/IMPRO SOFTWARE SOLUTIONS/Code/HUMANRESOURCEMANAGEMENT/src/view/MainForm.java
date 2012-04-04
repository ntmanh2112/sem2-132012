package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Rectangle;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.SystemColor;

public class MainForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JMenuBar jJMenuBar = null;
	private JMenu jMenuAdmin = null;
	private JMenu jMenuHrmanager = null;
	private JMenu jMenuDepartmentmanager = null;
	private JMenu jMenuEmployee = null;
	private JMenuItem jMenuItemViewemployee = null;
	private JMenuItem jMenuItemViewdepartment = null;
	private JMenuItem jMenuItemViewsection = null;
	private JMenuItem jMenuItemViewvacancies = null;
	private JMenuItem jMenuItemViewvacanciesfillinginfo = null;
	private JMenuItem jMenuItemViewdepartmentdependencies = null;
	private JMenuItem jMenuItemViewdesignation = null;
	private JMenuItem jMenuItemViewdesignationlayer = null;
	private JMenuItem jMenuItemViewdesignationweightage = null;
	private JMenuItem jMenuItemCreateaccount = null;
	private JMenuItem jMenuItemHrviewdepartment = null;
	private JMenuItem jMenuItemHrviewemployee = null;
	private JMenuItem jMenuItemHrviewsection = null;
	private JMenuItem jMenuItemHrrotateemployee = null;
	private JMenuItem jMenuItemHrprocessvacancy = null;
	private JMenuItem jMenuItemHrviewreport = null;
	private JMenuItem jMenuItemDmviewemployee = null;
	private JMenuItem jMenuItemDmviewsection = null;
	private JMenuItem jMenuItemDmmanagevacancy = null;
	private JMenuItem jMenuItemDmviewreport = null;
	private JMenuItem jMenuItemViewinformation = null;
	private Image img = null;
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
		Toolkit theKit = this.getToolkit();   
		Dimension wndSize = theKit.getScreenSize();
		this.setLocation((wndSize.width-1300)/2, (wndSize.height-650)/2);
		//Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		this.setResizable(false);
		this.setSize(1300, 650);
		//this.setSize(d);
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
			
			//Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
			jContentPane.setBackground(SystemColor.activeCaption);
			 BufferedImage bf = null;
			 try {
				 bf = ImageIO.read(new File("images/A013.jpg"));
				 } catch (IOException e) {
					 e.printStackTrace();  
				} 
				 ImagePanel imgBackground = new ImagePanel(bf,1300,650);
				 imgBackground.setLocation(0, 0);
				 imgBackground.setSize(1300,650);
				 jContentPane.add(imgBackground, null);
				 //this.setSize(d);
			//jContentPane = new ImagePanel(image,Double.valueOf(dim.getWidth()).intValue(),Double.valueOf(dim.getHeight()).intValue());
		}
		return jContentPane;
	}

	/**
	 * This method initializes jJMenuBar	
	 * 	
	 * @return javax.swing.JMenuBar	
	 */
	private JMenuBar getJJMenuBar() {
		if (jJMenuBar == null) {
			jJMenuBar = new JMenuBar();
			jJMenuBar.add(getJMenuAdmin());
			jJMenuBar.add(getJMenuHrmanager());
			jJMenuBar.add(getJMenuDepartmentmanager());
			jJMenuBar.add(getJMenuEmployee());
		}
		return jJMenuBar;
	}

	/**
	 * This method initializes jMenuAdmin	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getJMenuAdmin() {
		if (jMenuAdmin == null) {
			jMenuAdmin = new JMenu();
			jMenuAdmin.setText("Admin");
			jMenuAdmin.add(getJMenuItemViewemployee());
			jMenuAdmin.add(getJMenuItemViewdepartment());
			//jMenuAdmin.add(getJMenuItemViewdepartmentdependencies());
			jMenuAdmin.add(getJMenuItemViewsection());
			jMenuAdmin.add(getJMenuItemViewvacancies());
			jMenuAdmin.add(getJMenuItemViewvacanciesfillinginfo());
			jMenuAdmin.add(getJMenuItemViewdesignation());
			jMenuAdmin.add(getJMenuItemViewdesignationlayer());
			jMenuAdmin.add(getJMenuItemViewdesignationweightage());
			jMenuAdmin.add(getJMenuItemCreateaccount());
		}
		return jMenuAdmin;
	}

	/**
	 * This method initializes jMenuHrmanager	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getJMenuHrmanager() {
		if (jMenuHrmanager == null) {
			jMenuHrmanager = new JMenu();
			jMenuHrmanager.setText("HR Manager");
			jMenuHrmanager.add(getJMenuItemHrviewdepartment());
			jMenuHrmanager.add(getJMenuItemHrviewemployee());
			jMenuHrmanager.add(getJMenuItemHrviewsection());
			jMenuHrmanager.add(getJMenuItemHrrotateemployee());
			jMenuHrmanager.add(getJMenuItemHrprocessvacancy());
			jMenuHrmanager.add(getJMenuItemHrviewreport());
		}
		return jMenuHrmanager;
	}

	/**
	 * This method initializes jMenuDepartmentmanager	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getJMenuDepartmentmanager() {
		if (jMenuDepartmentmanager == null) {
			jMenuDepartmentmanager = new JMenu();
			jMenuDepartmentmanager.setText("Department Manager");
			jMenuDepartmentmanager.add(getJMenuItemDmviewemployee());
			jMenuDepartmentmanager.add(getJMenuItemDmviewsection());
			jMenuDepartmentmanager.add(getJMenuItemDmmanagevacancy());
			jMenuDepartmentmanager.add(getJMenuItemDmviewreport());
		}
		return jMenuDepartmentmanager;
	}

	/**
	 * This method initializes jMenuEmployee	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getJMenuEmployee() {
		if (jMenuEmployee == null) {
			jMenuEmployee = new JMenu();
			jMenuEmployee.setText("Employee");
			jMenuEmployee.add(getJMenuItemViewinformation());
		}
		return jMenuEmployee;
	}

	/**
	 * This method initializes jMenuItemViewemployee	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemViewemployee() {
		if (jMenuItemViewemployee == null) {
			jMenuItemViewemployee = new JMenuItem();
			jMenuItemViewemployee.setText("Management Employee");
			jMenuItemViewemployee.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.out.println("actionPerformed()"); 
					// TODO Auto-generated Event stub actionPerformed()
					(new ViewEmployee()).setVisible(true);
					
				}
			});
		}
		return jMenuItemViewemployee;
	}

	/**
	 * This method initializes jMenuItemViewdepartment	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemViewdepartment() {
		if (jMenuItemViewdepartment == null) {
			jMenuItemViewdepartment = new JMenuItem();
			jMenuItemViewdepartment.setText("Management Department");
			jMenuItemViewdepartment.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.out.println("actionPerformed()"); 
					// TODO Auto-generated Event stub actionPerformed()
					(new ViewDepartment()).setVisible(true);
					
				}
			});
		}
		return jMenuItemViewdepartment;
	}

	/**
	 * This method initializes jMenuItemViewsection	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemViewsection() {
		if (jMenuItemViewsection == null) {
			jMenuItemViewsection = new JMenuItem();
			jMenuItemViewsection.setText("Management Section");
			jMenuItemViewsection.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.out.println("actionPerformed()"); 
					// TODO Auto-generated Event stub actionPerformed()
					(new ViewSection()).setVisible(true);
					
				}
			});
		}
		return jMenuItemViewsection;
	}

	/**
	 * This method initializes jMenuItemViewvacancies	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemViewvacancies() {
		if (jMenuItemViewvacancies == null) {
			jMenuItemViewvacancies = new JMenuItem();
			jMenuItemViewvacancies.setText("Management Vacancies");
			jMenuItemViewvacancies.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.out.println("actionPerformed()"); 
					// TODO Auto-generated Event stub actionPerformed()
					(new ViewVacancies()).setVisible(true);
				}
			});
		}
		return jMenuItemViewvacancies;
	}

	/**
	 * This method initializes jMenuItemViewvacanciesfillinginfo	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemViewvacanciesfillinginfo() {
		if (jMenuItemViewvacanciesfillinginfo == null) {
			jMenuItemViewvacanciesfillinginfo = new JMenuItem();
			jMenuItemViewvacanciesfillinginfo.setText("Management Division Employee");
			jMenuItemViewvacanciesfillinginfo
					.addActionListener(new java.awt.event.ActionListener() {
						public void actionPerformed(java.awt.event.ActionEvent e) {
							System.out.println("actionPerformed()");
							// TODO Auto-generated Event stub actionPerformed()
							(new DiviseEmployee()).setVisible(true);
							
						}
					});
		}
		return jMenuItemViewvacanciesfillinginfo;
	}

	/**
	 * This method initializes jMenuItemViewdepartmentdependencies	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	

	/**
	 * This method initializes jMenuItemViewdesignation	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemViewdesignation() {
		if (jMenuItemViewdesignation == null) {
			jMenuItemViewdesignation = new JMenuItem();
			jMenuItemViewdesignation.setText("View Designation");
			jMenuItemViewdesignation.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.out.println("actionPerformed()");
					// TODO Auto-generated Event stub actionPerformed()
					(new ViewDesignation()).setVisible(true);
				}
			});
		}
		return jMenuItemViewdesignation;
	}

	/**
	 * This method initializes jMenuItemViewdesignationlayer	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemViewdesignationlayer() {
		if (jMenuItemViewdesignationlayer == null) {
			jMenuItemViewdesignationlayer = new JMenuItem();
			jMenuItemViewdesignationlayer.setText("View Designation Layer");
			jMenuItemViewdesignationlayer
					.addActionListener(new java.awt.event.ActionListener() {
						public void actionPerformed(java.awt.event.ActionEvent e) {
							System.out.println("actionPerformed()");
							// TODO Auto-generated Event stub actionPerformed()
							(new ViewDesignationLayer()).setVisible(true);
						}
					});
		}
		return jMenuItemViewdesignationlayer;
	}

	/**
	 * This method initializes jMenuItemViewdesignationweightage	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemViewdesignationweightage() {
		if (jMenuItemViewdesignationweightage == null) {
			jMenuItemViewdesignationweightage = new JMenuItem();
			jMenuItemViewdesignationweightage.setText("View Designation Weightage");
			jMenuItemViewdesignationweightage
					.addActionListener(new java.awt.event.ActionListener() {
						public void actionPerformed(java.awt.event.ActionEvent e) {
							System.out.println("actionPerformed()");
							// TODO Auto-generated Event stub actionPerformed()
							(new ViewDesignationWeightage()).setVisible(true);
						}
					});
		}
		return jMenuItemViewdesignationweightage;
	}

	/**
	 * This method initializes jMenuItemCreateaccount	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemCreateaccount() {
		if (jMenuItemCreateaccount == null) {
			jMenuItemCreateaccount = new JMenuItem();
			jMenuItemCreateaccount.setText("Management Account");
			jMenuItemCreateaccount.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					(new ViewAccount()).setVisible(true);
				}
			});
		}
		return jMenuItemCreateaccount;
	}

	/**
	 * This method initializes jMenuItemHrviewdepartment	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemHrviewdepartment() {
		if (jMenuItemHrviewdepartment == null) {
			jMenuItemHrviewdepartment = new JMenuItem();
			jMenuItemHrviewdepartment.setText("View Department");
			jMenuItemHrviewdepartment
					.addActionListener(new java.awt.event.ActionListener() {
						public void actionPerformed(java.awt.event.ActionEvent e) {
							System.out.println("actionPerformed()");
							// TODO Auto-generated Event stub actionPerformed()
							(new ViewDepartment()).setVisible(true);
						}
					});
		}
		return jMenuItemHrviewdepartment;
	}

	/**
	 * This method initializes jMenuItemHrviewemployee	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemHrviewemployee() {
		if (jMenuItemHrviewemployee == null) {
			jMenuItemHrviewemployee = new JMenuItem();
			jMenuItemHrviewemployee.setText("View Employee");
			jMenuItemHrviewemployee.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.out.println("actionPerformed()"); 
					// TODO Auto-generated Event stub actionPerformed()
					(new ViewEmployee()).setVisible(true);
				}
			});
		}
		return jMenuItemHrviewemployee;
	}

	/**
	 * This method initializes jMenuItemHrviewsection	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemHrviewsection() {
		if (jMenuItemHrviewsection == null) {
			jMenuItemHrviewsection = new JMenuItem();
			jMenuItemHrviewsection.setText("View Section");
			jMenuItemHrviewsection.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.out.println("actionPerformed()");
					// TODO Auto-generated Event stub actionPerformed()
					(new ViewSection()).setVisible(true);
				}
			});
		}
		return jMenuItemHrviewsection;
	}

	/**
	 * This method initializes jMenuItemHrrotateemployee	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemHrrotateemployee() {
		if (jMenuItemHrrotateemployee == null) {
			jMenuItemHrrotateemployee = new JMenuItem();
			jMenuItemHrrotateemployee.setText("Rotate Employee");
			jMenuItemHrrotateemployee
					.addActionListener(new java.awt.event.ActionListener() {
						public void actionPerformed(java.awt.event.ActionEvent e) {
							System.out.println("actionPerformed()"); 
							// TODO Auto-generated Event stub actionPerformed()
							(new EmployeeJobRotation()).setVisible(true);
						}
					});
		}
		return jMenuItemHrrotateemployee;
	}

	/**
	 * This method initializes jMenuItemHrprocessvacancy	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemHrprocessvacancy() {
		if (jMenuItemHrprocessvacancy == null) {
			jMenuItemHrprocessvacancy = new JMenuItem();
			jMenuItemHrprocessvacancy.setText("Process Vacancy");
			jMenuItemHrprocessvacancy
					.addActionListener(new java.awt.event.ActionListener() {
						public void actionPerformed(java.awt.event.ActionEvent e) {
							System.out.println("actionPerformed()");
							// TODO Auto-generated Event stub actionPerformed()
							(new ViewVacancies()).setVisible(true);
						}
					});
		}
		return jMenuItemHrprocessvacancy;
	}

	/**
	 * This method initializes jMenuItemHrviewreport	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemHrviewreport() {
		if (jMenuItemHrviewreport == null) {
			jMenuItemHrviewreport = new JMenuItem();
			jMenuItemHrviewreport.setText("View Report");
			jMenuItemHrviewreport.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.out.println("actionPerformed()");
					// TODO Auto-generated Event stub actionPerformed()
					//(new view)
				}
			});
		}
		return jMenuItemHrviewreport;
	}

	/**
	 * This method initializes jMenuItemDmviewemployee	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemDmviewemployee() {
		if (jMenuItemDmviewemployee == null) {
			jMenuItemDmviewemployee = new JMenuItem();
			jMenuItemDmviewemployee.setText("View Employee");
			jMenuItemDmviewemployee.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.out.println("actionPerformed()");
					// TODO Auto-generated Event stub actionPerformed()
					(new ViewEmployee()).setVisible(true);
				}
			});
		}
		return jMenuItemDmviewemployee;
	}

	/**
	 * This method initializes jMenuItemDmviewsection	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemDmviewsection() {
		if (jMenuItemDmviewsection == null) {
			jMenuItemDmviewsection = new JMenuItem();
			jMenuItemDmviewsection.setText("View Section");
			jMenuItemDmviewsection.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.out.println("actionPerformed()");
					// TODO Auto-generated Event stub actionPerformed()
					(new ViewSection()).setVisible(true);
				}
			});
		}
		return jMenuItemDmviewsection;
	}

	/**
	 * This method initializes jMenuItemDmmanagevacancy	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemDmmanagevacancy() {
		if (jMenuItemDmmanagevacancy == null) {
			jMenuItemDmmanagevacancy = new JMenuItem();
			jMenuItemDmmanagevacancy.setText("Manage Vacancy");
			jMenuItemDmmanagevacancy.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.out.println("actionPerformed()");
					// TODO Auto-generated Event stub actionPerformed()
					(new ViewVacancies()).setVisible(true);
				}
			});
		}
		return jMenuItemDmmanagevacancy;
	}

	/**
	 * This method initializes jMenuItemDmviewreport	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemDmviewreport() {
		if (jMenuItemDmviewreport == null) {
			jMenuItemDmviewreport = new JMenuItem();
			jMenuItemDmviewreport.setText("View Report");
		}
		return jMenuItemDmviewreport;
	}

	/**
	 * This method initializes jMenuItemViewinformation	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemViewinformation() {
		if (jMenuItemViewinformation == null) {
			jMenuItemViewinformation = new JMenuItem();
			jMenuItemViewinformation.setText("View Information");
			jMenuItemViewinformation.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.out.println("actionPerformed()"); 
					// TODO Auto-generated Event stub actionPerformed()
					(new InformationEmployee()).setVisible(true);
				}
			});
		}
		return jMenuItemViewinformation;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
