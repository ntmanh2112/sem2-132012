package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.DepartmentsModel;
import util.DataUtil;

public class DepartmentsDAO {
	public static ArrayList<DepartmentsModel> getAllDepartments(){
		ArrayList<DepartmentsModel> listDepartments = new ArrayList<DepartmentsModel>();
		try {
			String sql = "SELECT * FROM Departments";
			ResultSet rs = DataUtil.executeQuery(sql);
			while (rs.next()){
				DepartmentsModel model = new DepartmentsModel();
				model.setDep_ID(rs.getString("DEP_ID"));
				model.setDep_Name(rs.getString("DEP_NAME"));
				model.setDep_Head(rs.getString("DEP_HEAD"));
				model.setLocation(rs.getString("LOCATION"));
				model.setUp_Dep_No(rs.getString("UP_DEP_NO"));
				model.setDn_Dep_No(rs.getString("DN_DEP_NO"));
				listDepartments.add(model);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listDepartments;
	}
	public static DepartmentsModel getDepartmentsByID(String id){
		DepartmentsModel model = null;
		try {
			String sql = "SELECT * FROM Departments WHERE Dep_ID =?";
			PreparedStatement ps = DataUtil.getConnection().prepareStatement(sql);
			ps.setString(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				model.setDep_ID(rs.getString("DEP_ID"));
				model.setDep_Name(rs.getString("DEP_NAME"));
				model.setDep_Head(rs.getString("DEP_HEAD"));
				model.setLocation(rs.getString("LOCATION"));
				model.setUp_Dep_No(rs.getString("UP_DEP_NO"));
				model.setDn_Dep_No(rs.getString("DN_DEP_NO"));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return model;
	}
	public static Boolean updateDepartments( DepartmentsModel model){
		Boolean kq = false;
		String sql = "Update NhanVien set DEP_NAME = '" + model.getDep_Name() 
											+ "',DEP_HEAD = '"+ model.getDep_Head()
											+"', LOCATION = '"+model.getLocation()
											+"' , UP_DEP_NO = '"+model.getUp_Dep_No()
											+"', DN_DEP_NO = '"+model.getDn_Dep_No()
											+"' where DEP_ID = "+model.getDep_ID();
		kq=DataUtil.executeNonQuery(sql);
		return kq;
	}
	public static Boolean insertDepartments( DepartmentsModel model){
		Boolean kq = false;
		String sql ;
			try {
				sql = "INSERT INTO Departments VALUES (?,?,?,?,?,?)";
				PreparedStatement ps = DataUtil.getConnection().prepareStatement(sql);
				ps.setString(1, model.getDep_ID());
				ps.setString(2, model.getDep_Name());
				ps.setString(3, model.getDep_Head());
				ps.setString(4, model.getLocation());
				ps.setString(5, model.getUp_Dep_No());
				ps.setString(6, model.getDn_Dep_No());
				ps.executeUpdate();
				kq = true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		return kq;
	}
	public static Boolean deleteDepartments(DepartmentsModel model){
		Boolean kq = false;
		try {
			String sql = "DELETE * FROM Departments WHERE DEP_ID = ?";
			PreparedStatement ps = DataUtil.getConnection().prepareStatement(sql);
			ps.setString(1, model.getDep_ID());
			ps.executeUpdate();
			kq = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return kq;
	}
	public static ArrayList<DepartmentsModel> searchDepartments(String Name){
		ArrayList<DepartmentsModel> listDepartments = new ArrayList<DepartmentsModel>();
		try {
			String sql = "SELECT DEP_NAME FROM Departments WHERE DEP_NAME LIKE '%" +Name+ "%'";
			ResultSet rs = DataUtil.executeQuery(sql);
			System.out.println("Result Set:"+rs.getRow());
			while (rs.next()){
				DepartmentsModel model = new DepartmentsModel();
				model.setDep_ID(rs.getString("DEP_ID"));
				model.setDep_Name(rs.getString("DEP_NAME"));
				model.setDep_Head(rs.getString("DEP_HEAD"));
				model.setLocation(rs.getString("LOCATION"));
				model.setUp_Dep_No(rs.getString("UP_DEP_NO"));
				model.setDn_Dep_No(rs.getString("DN_DEP_NO"));
				listDepartments.add(model);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listDepartments;
	}
}
