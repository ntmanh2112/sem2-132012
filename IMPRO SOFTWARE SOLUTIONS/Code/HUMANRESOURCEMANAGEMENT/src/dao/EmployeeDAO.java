package dao;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import model.EmployeeModel;
import util.DataUtil;

public class EmployeeDAO {
	public static ArrayList<EmployeeModel> getAllEmployee(){
		ArrayList<EmployeeModel> listEmployee = new ArrayList<EmployeeModel>();
		try {
			String sql = "SELECT A.EmID, A.Name, B.Password, A.Dep_ID, A.Des_ID, A.SecID, A.Address, A.Phone, A.Fax, A.Email from Employee as A inner join Account as B on B.EmID = A.EmID";
			ResultSet rs = DataUtil.executeQuery(sql);
			while (rs.next()){
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
				listEmployee.add(model);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listEmployee;

}
	public static EmployeeModel getEmployeeByID(String id){
		EmployeeModel model = null;
		try {
			String sql = "SELECT A.EmID, A.Name, B.Password, A.Dep_ID, A.Des_ID, A.SecID, A.Address, A.Phone, A.Fax, A.Email from Employee as A inner join Account as B on B.EmID = A.EmID WHERE EmID =?";
			PreparedStatement ps = DataUtil.getConnection().prepareStatement(sql);
			ps.setString(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				model = new EmployeeModel();
				model.setEmID(rs.getString("EmID"));
				model.setName(rs.getString("Name"));
				model.setDep_ID(rs.getString("Dep_ID"));
				model.setDes_ID(rs.getString("Des_ID"));
				model.setSecID(rs.getString("SecID"));
				model.setAddress(rs.getString("Address"));
				model.setPhone(rs.getString("Phone"));
				model.setFax(rs.getString("Fax"));
				model.setEmail(rs.getString("Email"));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return model;
	}
	
	public static Boolean insertUsingStore(EmployeeModel model) {
		Boolean result = false;
		
		try {
			CallableStatement csmt = DataUtil.getConnection().prepareCall("{call SP_INSERT_EMPLOYEE(?,?,?,?,?,?,?,?,?,?)}");
			csmt.setString("EmID", model.getEmID());
			csmt.setString("Name", model.getName());
			csmt.setString("Dep_ID", model.getDep_ID());
			csmt.setString("Des_ID", model.getDes_ID());
			csmt.setString("SecID", model.getSecID());
			csmt.setString("Address", model.getAddress());
			csmt.setString("Phone", model.getPhone());
			csmt.setString("Fax", model.getFax());
			csmt.setString("Email", model.getEmail());
			csmt.setString("Password", model.getPassword());
			
			csmt.executeQuery();
			result = true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public static Boolean insertEmployee( EmployeeModel model){
		Boolean kq = false;
		String sql ;
			try {
				sql = "INSERT INTO EMPLOYEE VALUES (?,?,?,?,?,?,?,?,?)";
				PreparedStatement ps = DataUtil.getConnection().prepareStatement(sql);
				ps.setString(1, model.getEmID());
				ps.setString(2, model.getName());
				ps.setString(3, model.getDep_ID());
				ps.setString(4, model.getDes_ID());
				ps.setString(5, model.getSecID());
				ps.setString(6, model.getAddress());
				ps.setString(7, model.getPhone());
				ps.setString(8, model.getFax());
				ps.setString(9, model.getEmail());
				ps.executeUpdate();
				kq = true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		return kq;
}
	public static boolean updateEmployee(EmployeeModel model){
		Boolean kq = false;
		try {
			String sql = "UPDATE Employee SET Name = ?, Dep_ID = ? , Des_ID = ?, SecID = ?, Address = ?, Phone = ?, Fax = ?, Email = ? WHERE EmID=?";

			PreparedStatement ps = DataUtil.getConnection().prepareStatement(sql);
			
			ps.setString(1, model.getName());
			ps.setString(2, model.getDep_ID());
			ps.setString(3, model.getDes_ID());
			ps.setString(4, model.getSecID());
			ps.setString(5, model.getAddress());
			ps.setString(6, model.getPhone());
			ps.setString(7, model.getFax());
			ps.setString(8, model.getEmail());
			ps.setString(9, model.getEmID());
			
			
			
			ps.executeUpdate();
			kq = true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			return kq;
	}
	public static Boolean deleteEmployee(EmployeeModel model){
		Boolean kq = false;
		try {
			String sql = "DELETE FROM Employee WHERE EmID = ?";
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
	public static ArrayList<EmployeeModel> searchEmployee(String EmID,String Name,String Dep_ID){
		ArrayList<EmployeeModel> listEmployee = new ArrayList<EmployeeModel>();
		try {
			String sql = "SELECT EmID, Name, Dep_ID, Des_ID, SecID, Address, Phone, Fax, Email FROM Employee WHERE EmID LIKE '%" +EmID+ "%' AND Name LIKE '%" +Name+ "%' AND Dep_ID LIKE '%" +Dep_ID+ "%'";
			ResultSet rs = DataUtil.executeQuery(sql);
			System.out.println("Result Set:"+rs.getRow());
			while (rs.next()){
				EmployeeModel model = new EmployeeModel();
				model.setEmID(rs.getString("EmID"));
				model.setName(rs.getString("Name"));
				model.setDep_ID(rs.getString("Dep_ID"));
				model.setDes_ID(rs.getString("Des_ID"));
				model.setSecID(rs.getString("SecID"));
				model.setAddress(rs.getString("Address"));
				model.setPhone(rs.getString("Phone"));
				model.setFax(rs.getString("Fax"));
				model.setEmail(rs.getString("Email"));
				listEmployee.add(model);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listEmployee;
	}
}
