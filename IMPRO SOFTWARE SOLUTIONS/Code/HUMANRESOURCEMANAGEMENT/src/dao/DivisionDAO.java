package dao;

import java.io.Writer;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.concurrent.Callable;

import util.DataUtil;

import model.EmployeeModel;
import model.DivisionModel;

public class DivisionDAO {
	public static ArrayList<DivisionModel> getAll() {
		ArrayList<DivisionModel>listDivision = new ArrayList<DivisionModel>();
		try {
			String sql = "SELECT * FROM DIVISION";
			ResultSet rs = DataUtil.executeQuery(sql);
			while(rs.next()) {
				DivisionModel  model = new DivisionModel();
				model.setVacancy_ID(rs.getString("VACANCY_ID"));
				model.setEmID(rs.getString("EMID"));
				model.setSecID(rs.getString("SECID"));
				listDivision.add(model);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listDivision;
	}
	public static ArrayList<EmployeeModel> searchemployeeindivision(String secid){
		ArrayList<EmployeeModel>listRightDivision = new ArrayList<EmployeeModel>();
			
		try {
			CallableStatement cs = DataUtil.getConnection().prepareCall("{call SP_SEARCHEMPLOYEEINDIVISION(?)}");
			cs.setString("SECID", secid);
			ResultSet rs = cs.executeQuery();
			while(rs.next()){
				
				EmployeeModel model = new EmployeeModel();
				model.setEmID(rs.getString("EmID"));
				model.setName(rs.getString("Name"));
				model.setPassword(rs.getString("Password"));
				model.setDep_ID(rs.getString("Dep_ID"));
				model.setDes_ID(rs.getString("Des_ID"));
				model.setSecID(rs.getString("SecID"));
				model.setAddress(rs.getString("Address"));
				model.setPhone(rs.getString("Phone"));
				model.setFax(rs.getString("Fax"));
				model.setEmail(rs.getString("Email"));
				listRightDivision.add(model);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return listRightDivision;
	}
	public static ArrayList<EmployeeModel> searchemloyeenotindivision(String secid){
		ArrayList<EmployeeModel>listLeftDivision = new ArrayList<EmployeeModel>();
			
		try {
			CallableStatement cs = DataUtil.getConnection().prepareCall("{call SP_SEARCHEMPLOYEENOTINDIVISION(?)}");
			cs.setString("SECID", secid);
			ResultSet rs = cs.executeQuery();
			while(rs.next()){
				
				EmployeeModel model = new EmployeeModel();
				model.setEmID(rs.getString("EmID"));
				model.setName(rs.getString("Name"));
				model.setPassword(rs.getString("Password"));
				model.setDep_ID(rs.getString("Dep_ID"));
				model.setDes_ID(rs.getString("Des_ID"));
				model.setSecID(rs.getString("SecID"));
				model.setAddress(rs.getString("Address"));
				model.setPhone(rs.getString("Phone"));
				model.setFax(rs.getString("Fax"));
				model.setEmail(rs.getString("Email"));
				listLeftDivision.add(model);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return listLeftDivision;
	}
	
	public static Boolean insertDivision(DivisionModel model){
		Boolean kq = false;
		String sql ;
			try {
				sql = "INSERT INTO DIVISION VALUES (?,?,?)";
				PreparedStatement ps = DataUtil.getConnection().prepareStatement(sql);
				ps.setString(1, model.getVacancy_ID());
				ps.setString(2, model.getEmID());
				ps.setString(3, model.getSecID());
				
				ps.executeUpdate();
				kq = true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		return kq;	
}
	public static Boolean deleteDivision(DivisionModel model){
		Boolean kq = false;
		try {
			String sql = "delete from Division where EmID = ?";
			PreparedStatement ps = DataUtil.getConnection().prepareStatement(sql);
			ps.setString(1, model.getEmID());
			ps.executeUpdate();
			kq = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return kq;
	}
}