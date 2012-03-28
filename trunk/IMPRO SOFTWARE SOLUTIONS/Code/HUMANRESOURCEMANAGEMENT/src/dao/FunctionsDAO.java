package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.config.ListFactoryBean;

import model.DepartmentsModel;
import model.FunctionsModel;
import util.DataUtil;

public class FunctionsDAO {
	public static ArrayList<FunctionsModel> getAllFunctions(){
		ArrayList<FunctionsModel> listFunctions = new ArrayList<FunctionsModel>();
		try {
			String sql = "SELECT * FROM Functions";
			ResultSet rs = DataUtil.executeQuery(sql);
			while (rs.next()){
				FunctionsModel model = new FunctionsModel();
				model.setID(rs.getString("ID"));
				model.setFun_Name(rs.getString("Fun_Name"));
				listFunctions.add(model);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listFunctions;
	}
	public static FunctionsModel getFunctionsByID(String id){
		FunctionsModel model = null;
		try {
			String sql = "SELECT * FROM Functions WHERE ID =?";
			PreparedStatement ps = DataUtil.getConnection().prepareStatement(sql);
			ps.setString(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				model.setID(rs.getString("ID"));
				model.setFun_Name(rs.getString("Fun_Name"));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return model;
	}
	public static boolean updateFunctions(FunctionsModel model){
		Boolean kq = false;
		try {
			String sql = "UPDATE Departments SET Fun_Name = ? WHERE ID = ?";
			PreparedStatement ps = DataUtil.getConnection().prepareStatement(sql);
			ps.setString(1, model.getFun_Name());
			ps.setString(6, model.getID());	
			ps.executeUpdate();
			kq = true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			return kq;
	}
	public static Boolean insertFunctions(FunctionsModel model){
		Boolean kq = false;
		String sql ;
			try {
				sql = "INSERT INTO Functions VALUES (?,?)";
				PreparedStatement ps = DataUtil.getConnection().prepareStatement(sql);
				ps.setString(1, model.getID());
				ps.setString(2, model.getFun_Name());
				ps.executeUpdate();
				kq = true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
		return kq;
	}
	public static Boolean deleteFunctions(FunctionsModel model){
		Boolean kq = false;
		try {
			String sql = "DELETE  FROM Functions WHERE Dep_ID = ?";
			PreparedStatement ps = DataUtil.getConnection().prepareStatement(sql);
			ps.setString(1, model.getID());
			ps.executeUpdate();
			kq = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return kq;
	}
	public static ArrayList<FunctionsModel> searchFunctions(String id){
		ArrayList<FunctionsModel> listFunctions = new ArrayList<FunctionsModel>();
		try {
			String sql = "SELECT ID FROM Funtions WHERE ID LIKE '%" +id+ "%'";
			ResultSet rs = DataUtil.executeQuery(sql);
			System.out.println("Result Set:"+rs.getRow());
			while (rs.next()){
				FunctionsModel model = new FunctionsModel();
				model.setID(rs.getString("ID"));
				model.setFun_Name(rs.getString("Fun_Name"));
				listFunctions.add(model);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listFunctions;
	}
}
