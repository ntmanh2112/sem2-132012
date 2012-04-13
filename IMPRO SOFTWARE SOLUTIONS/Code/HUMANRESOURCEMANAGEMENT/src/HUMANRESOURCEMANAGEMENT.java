import util.DataUtil;
import view.Login;



public class HUMANRESOURCEMANAGEMENT {
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataUtil.readFileConfig();
		(new Login()).setVisible(true);
	}

}
