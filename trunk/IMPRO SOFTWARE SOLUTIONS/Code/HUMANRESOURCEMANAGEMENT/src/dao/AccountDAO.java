package dao;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.AccountModel;
import model.DepartmentsModel;
import model.DesignLayerModel;
import model.EmployeeModel;
import model.SectionModel;

import util.DataUtil;

public class AccountDAO {

	public static AccountModel getAccountNEW(String EmID, String password) {
		AccountModel model = null;
		try {
			String sql = "select A.*, B.Des_ID from Account A INNER JOIN Employee B on A.EmID=B.EmID "
						+" where A.EmID = ? AND A.Password = ?";
			PreparedStatement ps = DataUtil.getConnection().prepareStatement(sql);
			ps.setString(1, EmID);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				model = new AccountModel();
				model.setUserID(rs.getString("UserID"));
				model.setPassword(rs.getString("Password"));
				model.setEmID(rs.getString("EmID"));
				model.setDesignationID(rs.getString("Des_ID"));
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
			String sql = "select A.EmID,A.Password,B.name,C.Designation,D.Layer from Account AS A inner join employee AS B ON A.EmID = B.EmID inner join Designation AS C ON B.Des_ID = C.DesID inner join DesigLayer AS D ON C.Layer_ID = D.Layer_ID";
			ResultSet rs = DataUtil.executeQuery(sql);
			while (rs.next()){
				AccountModel model = new AccountModel();
				//model.setUserID(rs.getString("UserID"));
				model.setPassword(rs.getString("Password"));
				model.setEmID(rs.getString("EmID"));
				model.setName(rs.getString("Name"));
				model.setDesignation(rs.getString("Designation"));
				model.setLayer(rs.getString("Layer"));
				
				
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
			String sql = "select A.EmID,A.Password,B.name,C.Designation,D.Layer from Account AS A inner join employee AS B ON A.EmID = B.EmID inner join Designation AS C ON B.Des_ID = C.DesID inner join DesigLayer AS D ON C.Layer_ID = D.Layer_ID where A.EmID=?";
			PreparedStatement ps = DataUtil.getConnection().prepareStatement(sql);
			ps.setString(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				
				model = new AccountModel();
				
				//model.setUserID(rs.getString("UserID"));
				model.setEmID(rs.getString("EmID"));
				model.setPassword(rs.getString("Password"));
				model.setName(rs.getString("Name"));
				model.setLayer(rs.getString("Layer"));
				model.setDesignation(rs.getString("Designation"));
				
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
	/*public static boolean updateAccount(AccountModel model){
		Boolean kq = false;
		try {
			String sql = "UPDATE Account SET EmID = ?,Password = ?  WHERE UserID = ?";
			PreparedStatement ps = DataUtil.getConnection().prepareStatement(sql);
			ps.setString(1, model.getEmID());
			ps.setString(2, model.getPassword());
			
			//ps.setString(3, model.getName());
			ps.executeUpdate();
			kq = true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			return kq;
	}*/
	public static Boolean UpdateUsingStore(AccountModel model) {
		Boolean kq = false;
		
		try {
			CallableStatement csmt = DataUtil.getConnection().prepareCall("{call SP_UPDATEACCOUNTTODISIGNATION(?,?,?,?)}");
			csmt.setString("EmID", model.getEmID());
			csmt.setString("Password", model.getPassword());
			csmt.setString("Name", model.getName());
			csmt.setString("Des_ID", model.getLayer());

			
			
			
			csmt.executeUpdate();
			kq = true;
			
		} catch (SQLException e) {
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
	public static ArrayList<AccountModel> searchAccount(String EmID,String Name,String Designation){
		ArrayList<AccountModel> listAccount = new ArrayList<AccountModel>();
		try {
			//String sql = "SELECT EmID, Name, Dep_ID, Des_ID, Address, Phone, Fax, Email FROM Employee WHERE EmID LIKE '%" +EmID+ "%' AND Name LIKE '%" +Name+ "%' AND Dep_ID LIKE '%" +Dep_ID+ "%'";
			String sql ="select A.EmID,A.Password,B.name,C.Designation,D.Layer from Account AS A inner join employee AS B ON A.EmID = B.EmID inner join Designation AS C ON B.Des_ID = C.DesID inner join DesigLayer AS D ON C.Layer_ID = D.Layer_ID where A.EmID LIKE '%" +EmID+ "%' AND Name LIKE '%" +Name+ "%' AND Designation LIKE '%" +Designation+ "%'";
			ResultSet rs = DataUtil.executeQuery(sql);
			System.out.println("Result Set:"+rs.getRow());
			while (rs.next()){
				AccountModel model = new AccountModel();
				model.setEmID(rs.getString("EmID"));
				model.setName(rs.getString("Name"));
				model.setPassword(rs.getString("Password"));
				model.setDesignation(rs.getString("Designation"));
				
				
				model.setLayer(rs.getString("Layer"));
				
				listAccount.add(model);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listAccount;
	}
}
