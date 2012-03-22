package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.AccountModel;

import util.DataUtil;

public class AccountDAO {

	public static AccountModel getAccountNEW(String EmID, String password) {
		AccountModel model = null;
		try {
			String sql = "select * from Account where EmID = ? AND Password = ?";
			PreparedStatement ps = DataUtil.getConnection().prepareStatement(sql);
			ps.setString(1, EmID);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				model = new AccountModel();
				
				model.setUserID(rs.getString("UserID"));
				model.setPassword(rs.getString("Password"));
				model.setEmID(rs.getString("EmID"));
				model.setAcc_level(rs.getString("Acc_level"));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return model;
		
	}
}
