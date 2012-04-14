package dao;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
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
				String sql = "select A.EmID,B.designation,D.Dep_ID ,E.Status,E.Remarks from employee AS A inner join designation AS B on A.Des_ID = B.DesID inner join Section AS C on A.secID = C.SecID inner join departments AS D on C.Dep_ID = D.Dep_ID inner join Job_rotation AS E on A.EmID = E.EmID";
				
				ResultSet rs = DataUtil.executeQuery(sql);
				while (rs.next()){
					Job_rotationModel model = new Job_rotationModel();
					//model.setID(rs.getString("ID"));
					model.setEmID(rs.getString("EmID"));
					model.setPresent_Designation(rs.getString("Designation"));
					model.setDeputed_To(rs.getString("Dep_ID"));
					//model.setCreation_Date(rs.getString("Creation_Date"));
					
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
		public static Job_rotationModel getJob_RotationID(String id){
			Job_rotationModel model = null;
			try {
				String sql = "select A.EmID,A.Des_ID,C.SecID ,E.Status,E.Remarks from employee AS A  inner join Section AS C on A.secID = C.SecID inner join departments AS D on C.Dep_ID = D.Dep_ID inner join Job_rotation AS E on A.EmID = E.EmID where A.EmiD=?";
				//String sql = "select * from job_rotation where EmID = ? ";
				PreparedStatement ps = DataUtil.getConnection().prepareStatement(sql);
				ps.setString(1, id);
				ResultSet rs = ps.executeQuery();
				while(rs.next()){
					model = new Job_rotationModel();
					model.setEmID(rs.getString("EmID"));
					model.setPresent_Designation(rs.getString("Des_ID"));
					model.setDeputed_To(rs.getString("SecID"));
					//model.setCreation_Date(rs.getString("Creation_Date"));
					
					model.setStatus(rs.getString("Status"));
					model.setRemarks(rs.getString("Remarks"));
					
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return model;
		}
		public static Boolean UpdateUsingStore(Job_rotationModel model) {
			Boolean kq = false;
			
			try {
				CallableStatement csmt = DataUtil.getConnection().prepareCall("{call sp_UPDATE_EMPLOYEErato(?,?,?,?,?)}");
				/*csmt.setString("EmID", model.getEmID());
				csmt.setString("Present_Designation", model.getDes_ID());
				csmt.setString("Deputed_To", model.getSecID());
				//csmt.setString("Creation_Date", model.getCreation_Date());
				csmt.setString("Status", model.getStatus());
				csmt.setString("Remarks", model.getRemarks());
				//csmt.setString("Name", model.getName());
				csmt.setString("SecID", model.getSecID());
				csmt.setString("Des_ID", model.getDes_ID());
				
				//csmt.setString("Address", model.getAddress());
				//csmt.setString("Phone", model.getPhone());
				//csmt.setString("Fax", model.getFax());
				//csmt.setString("Email", model.getEmail());
				//csmt.setString("Password", model.getPassword());*/
				//CallableStatement csmt = DataUtil.getConnection().prepareCall("{call sp_INSERT_EMPLOYEETOJOBROTATION(?,?,?,?,?,?,?,?,?,?,?,?,?)}");
				csmt.setString("EmID", model.getEmID());
				//csmt.setString("Name", model.getName());
				//csmt.setString("SecID", model.getDeputed_To());
				//csmt.setString("Des_ID", model.getPresent_Designation());
				
				//csmt.setString("Address", model.getAddress());
				//csmt.setString("Phone", model.getPhone());
				//csmt.setString("Fax", model.getFax());
				//csmt.setString("Email", model.getEmail());
				//csmt.setString("Password", model.getPassword());
				csmt.setString("Present_Designation", model.getPresent_Designation());
				csmt.setString("Deputed_To", model.getDeputed_To());
				//csmt.setString("Creation_Date", model.getCreation_Date());
				csmt.setString("Status", model.getStatus());
				csmt.setString("Remarks", model.getRemarks());
				
				
				csmt.executeUpdate();
				kq = true;
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			return kq;
		}
		public static ArrayList<Job_rotationModel> searchjob(String EmID,String Designation,String DesID){
			ArrayList<Job_rotationModel> listjob = new ArrayList<Job_rotationModel>();
			try {
				String sql = "select A.EmID,B.designation,D.Dep_ID ,E.Status,E.Remarks from employee AS A inner join designation AS B on A.Des_ID = B.DesID inner join Section AS C on A.secID = C.SecID inner join departments AS D on C.Dep_ID = D.Dep_ID inner join Job_rotation AS E on A.EmID = E.EmID WHERE A.EmID LIKE '%" +EmID+ "%' AND Designation LIKE '%" +Designation+ "%' AND D.Dep_ID LIKE '%" +DesID+ "%'";
				
				ResultSet rs = DataUtil.executeQuery(sql);
				System.out.println("Result Set:"+rs.getRow());
				while (rs.next()){
					Job_rotationModel model = new Job_rotationModel();
					model.setEmID(rs.getString("EmID"));
					model.setPresent_Designation(rs.getString("Designation"));
					model.setDeputed_To(rs.getString("Dep_ID"));
					model.setStatus(rs.getString("Status"));
					model.setRemarks(rs.getString("Remarks"));
					listjob.add(model);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return listjob;
		}
}
