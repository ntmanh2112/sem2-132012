package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.AccountModel;
import model.DepartmentsModel;
import model.DesignLayerModel;
import model.SectionModel;

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
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return model;
		
	}
	public static ArrayList<AccountModel> getAllAccount(){
		ArrayList<AccountModel> listAccount = new ArrayList<AccountModel>();
		try {
			String sql = "SELECT * FROM Account";
			ResultSet rs = DataUtil.executeQuery(sql);
			while (rs.next()){
				AccountModel model = new AccountModel();
				model.setUserID(rs.getString("UserID"));
				model.setPassword(rs.getString("Password"));
				model.setEmID(rs.getString("EmID"));
				
				
				listAccount.add(model);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listAccount;
	}
	public static AccountModel getAccountByID(String id){
		AccountModel model = null;
		try {
			String sql = "SELECT * FROM Account WHERE UserID =?";
			PreparedStatement ps = DataUtil.getConnection().prepareStatement(sql);
			ps.setString(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				model.setUserID(rs.getString("UserID"));
				model.setEmID(rs.getString("EmID"));
				model.setPassword(rs.getString("Password"));
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return model;
	}
	public static Boolean insertAccount(AccountModel model){
		Boolean kq = false;
		String sql ;
			try {
				sql = "INSERT INTO Account VALUES (?,?,?)";
				PreparedStatement ps = DataUtil.getConnection().prepareStatement(sql);
				ps.setString(1, model.getUserID());
				ps.setString(2, model.getEmID());
				ps.setString(3, model.getPassword());
				
				ps.executeUpdate();
				kq = true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
		return kq;
	}
	public static boolean updateAccount(AccountModel model){
		Boolean kq = false;
		try {
			String sql = "UPDATE Account SET EmID = ?,Password = ?  WHERE UserID = ?";
			PreparedStatement ps = DataUtil.getConnection().prepareStatement(sql);
			ps.setString(1, model.getEmID());
			ps.setString(2, model.getPassword());
			
			ps.setString(4, model.getEmID());
			ps.executeUpdate();
			kq = true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			return kq;
	}
	public static Boolean deleteAccount(AccountModel model){
		Boolean kq = false;
		try {
			String sql = "DELETE  FROM Account WHERE UserID = ?";
			PreparedStatement ps = DataUtil.getConnection().prepareStatement(sql);
			ps.setString(1, model.getUserID());
			ps.executeUpdate();
			kq = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return kq;
	}
}
