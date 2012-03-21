package view;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

public class ImagePanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Image img;
	public Integer width;
	public Integer height;
	
	/**
	 * <ul>
	 * <li> Mục đích của hàm này
	 * </ul>
	 * 
	 * @author 	ThienVD
	 * @param 	Các thông số đi vào hàm này
	 * @return	Kết quả trả về của hàm này
	 * @throws  Lỗi ném về (nếu có)
	 */
	public ImagePanel(Image value, Integer width, Integer height) {
		try {		
			this.img = value;
			this.width = width;
			this.height = height;
			this.setLayout(null);
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}		
	}
	
	/**
	 * <ul>
	 * <li> Mục đích của hàm này
	 * </ul>
	 * 
	 * @author 	ThienVD
	 * @param 	Các thông số đi vào hàm này
	 * @return	Kết quả trả về của hàm này
	 * @throws  Lỗi ném về (nếu có)
	 */
	public void paintComponent(Graphics g) {
	    g.drawImage(img, 0, 0, width, height, null);	    
	}
}
