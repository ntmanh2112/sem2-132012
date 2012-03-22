package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.DepartmentsModel;
import model.DesignationModel;
import util.DataUtil;

public class DesignationDAO {

	public static ArrayList<DesignationModel> getAllDesignation(){
		ArrayList<DesignationModel> listDesignation = new ArrayList<DesignationModel>();
		try {
			String sql = "select * from Designation";
			ResultSet rs = DataUtil.executeQuery(sql);
			while (rs.next()){
				DesignationModel model = new DesignationModel();
				model.setDesID(rs.getString("DesID"));
				model.setLayer_ID(rs.getString("Layer_ID"));
				model.setDesignation(rs.getString("Designation"));
				
				listDesignation.add(model);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listDesignation;
	}
}
