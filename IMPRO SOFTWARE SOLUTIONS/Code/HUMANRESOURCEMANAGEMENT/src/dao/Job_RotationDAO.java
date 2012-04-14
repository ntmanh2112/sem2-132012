package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.EmployeeModel;
import model.Job_rotationModel;
import util.DataUtil;

public class Job_RotationDAO {

	
		public static ArrayList<Job_rotationModel> getAllJobrotation(){
			ArrayList<Job_rotationModel> lisrotation = new ArrayList<Job_rotationModel>();
			try {
				String sql = "select * from job_rotation";
				
				ResultSet rs = DataUtil.executeQuery(sql);
				while (rs.next()){
					Job_rotationModel model = new Job_rotationModel();
					model.setID(rs.getString("ID"));
					model.setEm_ID(rs.getString("Em_ID"));
					model.setPresent_Designation(rs.getString("Present_Designation"));
					model.setDeputed_To(rs.getString("Deputed_To"));
					model.setCreation_Date(rs.getString("Creation_Date"));
					
					model.setStatus(rs.getString("Status"));
					model.setRemarks(rs.getString("Remarks"));
					
					lisrotation.add(model);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return lisrotation;

	}
}
