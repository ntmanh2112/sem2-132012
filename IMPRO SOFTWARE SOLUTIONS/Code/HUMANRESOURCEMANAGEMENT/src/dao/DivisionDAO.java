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
import model.SectionModel;

public class DivisionDAO {
	public static ArrayList<DivisionModel> getAll() {
		ArrayList<DivisionModel>listDivision = new ArrayList<DivisionModel>();
		try {
			String sql = "SELECT * FROM DIVISION";
			ResultSet rs = DataUtil.executeQuery(sql);
			while(rs.next()) {
				DivisionModel  model = new DivisionModel();
				model.setId(rs.getString("ID"));
				model.setVacancy_ID(rs.getString("VACANCY_ID"));
				model.setSecID(rs.getString("SECID"));
				listDivision.add(model);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listDivision;
	}
	
	public static ArrayList<DivisionModel> getListDivisionBySecID(String secID) {
		ArrayList<DivisionModel> listDivision = new ArrayList<DivisionModel>();
		try {
			String sql = "SELECT A.*,B.Interpretation FROM Division A INNER JOIN Vacancies B on A.Vacancy_ID=B.Vacancy_ID WHERE A.SecID=?";
			PreparedStatement ps = DataUtil.getConnection().prepareStatement(sql);
			ps.setString(1, secID);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				DivisionModel  model = new DivisionModel();
				model.setId(rs.getString("ID"));
				model.setVacancy_ID(rs.getString("VACANCY_ID"));
				model.setSecID(rs.getString("SECID"));
				model.setInterpretation_Vacancy(rs.getString("Interpretation"));
				listDivision.add(model);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listDivision;
	}
	
	public static ArrayList<EmployeeModel> searchemployeeindivision(String SecID){
		ArrayList<EmployeeModel>listRightDivision = new ArrayList<EmployeeModel>();
			
		try {
			CallableStatement cs = DataUtil.getConnection().prepareCall("{call SP_SEARCHEMPLOYEEINDIVISION(?)}");
			cs.setString("SecID",SecID );
			ResultSet rs = cs.executeQuery();
			while(rs.next()){
				
				EmployeeModel model = new EmployeeModel();
				model.setEmID(rs.getString("EmID"));
				model.setName(rs.getString("Name"));
				//model.setPassword(rs.getString("Password"));
				model.setSecID(rs.getString("SecID"));
				model.setDes_ID(rs.getString("SECID"));
				
				//model.setAddress(rs.getString("Address"));
				//model.setPhone(rs.getString("Phone"));
				//model.setFax(rs.getString("Fax"));
				//model.setEmail(rs.getString("Email"));
				listRightDivision.add(model);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return listRightDivision;
	}
	public static ArrayList<EmployeeModel> searchemployeenotindivision(String SecID){
		ArrayList<EmployeeModel>listRightDivision = new ArrayList<EmployeeModel>();
			
		try {
			CallableStatement cs = DataUtil.getConnection().prepareCall("{call SP_SEARCHEMPLOYEENOTINDIVISION(?)}");
			cs.setString("SecID",SecID );
			ResultSet rs = cs.executeQuery();
			while(rs.next()){
				
				EmployeeModel model = new EmployeeModel();
				model.setEmID(rs.getString("EmID"));
				model.setName(rs.getString("Name"));
				//model.setPassword(rs.getString("Password"));
				model.setSecID(rs.getString("SECID"));
				model.setDes_ID(rs.getString("SECID"));
				
				//model.setAddress(rs.getString("Address"));
				//model.setPhone(rs.getString("Phone"));
				//model.setFax(rs.getString("Fax"));
				//model.setEmail(rs.getString("Email"));
				listRightDivision.add(model);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return listRightDivision;
	}
	/*public static ArrayList<EmployeeModel> searchemloyeenotindivision(String Emid){
		ArrayList<EmployeeModel>listLeftDivision = new ArrayList<EmployeeModel>();
			
		try {
			CallableStatement cs = DataUtil.getConnection().prepareCall("{call SP_SEARCHEMPLOYEENOTINDIVISION(?)}");
			cs.setString("EmID", Emid);
			ResultSet rs = cs.executeQuery();
			while(rs.next()){
				
				EmployeeModel model = new EmployeeModel();
				model.setEmID(rs.getString("EmID"));
				model.setName(rs.getString("Name"));
				//model.setPassword(rs.getString("Password"));
				model.setDep_ID(rs.getString("Dep_ID"));
				model.setDes_ID(rs.getString("Des_ID"));
				//model.setSecID(rs.getString("SecID"));
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
	}*/
	
	public static void updateEmployeeToSection(String emID, String secID, String divisionID){
		try {
			CallableStatement csmt = DataUtil.getConnection().prepareCall("{call sp_EmployeeToSection(?,?,?)}");
			csmt.setString("EmID", emID);
			csmt.setString("SecID", secID);
			csmt.setString("DivisionID", divisionID);
			csmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static boolean updateDivision(DivisionModel model){
		Boolean kq = false;
		try {
			String sql = "UPDATE Employee SET SECID = ? WHERE EmID=?";

			PreparedStatement ps = DataUtil.getConnection().prepareStatement(sql);
			ps.setString(1,model.getSecID());
			
			
			ps.executeUpdate();
			kq = true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			return kq;
	}
	public static Boolean deleteDivision(DivisionModel model){
		Boolean kq = false;
		try {
			String sql = "delete from Division where SecID = ?";
			PreparedStatement ps = DataUtil.getConnection().prepareStatement(sql);
			ps.setString(1, model.getSecID());
			
			ps.executeUpdate();
			kq = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return kq;
	}
	public static Boolean insertDivision(DivisionModel model){
		Boolean kq = false;
		String sql ;
			try {
				sql = "INSERT INTO Division VALUES (?,?)";
				PreparedStatement ps = DataUtil.getConnection().prepareStatement(sql);
				ps.setString(1, model.getVacancy_ID());
			
				ps.setString(2, model.getSecID());
				
				ps.executeUpdate();
				kq = true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
		return kq;
	}
}