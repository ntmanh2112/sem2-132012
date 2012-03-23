package dao;

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
			String sql = "SELECT * FROM Employee";
			ResultSet rs = DataUtil.executeQuery(sql);
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
	public static EmployeeModel getEmployeeByID(String id){
		EmployeeModel model = null;
		try {
			String sql = "SELECT * FROM EMPLOYEE WHERE EmID =?";
			PreparedStatement ps = DataUtil.getConnection().prepareStatement(sql);
			ps.setString(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				model = new EmployeeModel();
				model.setEmID(rs.getString("EmID"));
				model.setName(rs.getString("Name"));
				model.setDep_ID(rs.getString("Dep_ID"));
				model.setDes_ID(rs.getString("Des_ID"));
				model.setSecID(rs.getString("Sec_ID"));
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
			String sql = "update employee set Name=?,Dep_ID=? , Des_ID=?,SecID=?,Address=?,Phone=?,Fax=?,Email=? where EmID=?";

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
			String sql = "delete from employee where EmID = ?";
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
			String sql = "SELECT EmID,Name,Dep_ID,Des_ID,SecID,Address,Phone,fax,Email FROM EMPLOYEE WHERE EmID LIKE '%" +EmID+ "%' AND Name LIKE '%" +Name+ "%' AND Dep_ID LIKE '%" +Dep_ID+ "%'";
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
