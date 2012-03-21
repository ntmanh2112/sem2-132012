package dao;

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
}
