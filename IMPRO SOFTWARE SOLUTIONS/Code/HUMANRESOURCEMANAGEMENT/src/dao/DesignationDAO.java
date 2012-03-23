package dao;

import java.sql.PreparedStatement;
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
			String sql = "SELECT * FROM Designation";
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
	public static DesignationModel getDesignationByID(String id){
		DesignationModel model = null;
		try {
			String sql = "SELECT * FROM Designation WHERE DesID =?";
			PreparedStatement ps = DataUtil.getConnection().prepareStatement(sql);
			ps.setString(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				model.setDesID(rs.getString("DesID"));
				model.setLayer_ID(rs.getString("Layer_ID"));
				model.setDesignation(rs.getString("Designation"));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return model;
	}
	public static boolean updateDesignation(DesignationModel model){
		Boolean kq = false;
		try {
			String sql = "UPDATE Designation SET Layer_ID = ? , Designation = ? where DesID = ?";

			PreparedStatement ps = DataUtil.getConnection().prepareStatement(sql);	
			ps.setString(1, model.getLayer_ID());
			ps.setString(2, model.getDesignation());
			ps.setString(3, model.getDesID());
			ps.executeUpdate();
			kq = true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			return kq;
	}
	public static Boolean insertDesignation(DesignationModel model){
		Boolean kq = false;
		String sql ;
			try {
				sql = "INSERT INTO Designation VALUES (?,?,?)";
				PreparedStatement ps = DataUtil.getConnection().prepareStatement(sql);
				ps.setString(1, model.getDesID());
				ps.setString(2, model.getLayer_ID());
				ps.setString(3, model.getDesignation());
				ps.executeUpdate();
				kq = true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		return kq;
	}
	public static Boolean deleteDesignation(DesignationModel model){
		Boolean kq = false;
		try {
			String sql = "DELETE  FROM Designation WHERE DesID = ?";
			PreparedStatement ps = DataUtil.getConnection().prepareStatement(sql);
			ps.setString(1, model.getDesID());
			ps.executeUpdate();
			kq = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return kq;
	}
	public static ArrayList<DesignationModel> searchDesignation(String Name){
		ArrayList<DesignationModel> listDesignation = new ArrayList<DesignationModel>();
		try {
			String sql = "SELECT Designation FROM Designation WHERE Designation LIKE '%" +Name+ "%'";
			ResultSet rs = DataUtil.executeQuery(sql);
			System.out.println("Result Set:"+rs.getRow());
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
