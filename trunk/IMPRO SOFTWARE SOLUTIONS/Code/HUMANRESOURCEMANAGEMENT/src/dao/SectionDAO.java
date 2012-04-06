package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.DepartmentsModel;
import model.SectionModel;
import util.DataUtil;

public class SectionDAO {

	public static ArrayList<SectionModel> getAllSection(){
		ArrayList<SectionModel> listSection = new ArrayList<SectionModel>();
		try {
			String sql = "SELECT * FROM Section";

			ResultSet rs = DataUtil.executeQuery(sql);
			while (rs.next()){
				SectionModel model = new SectionModel();
				model.setSecID(rs.getString("SecID"));
				model.setName(rs.getString("Name"));
				model.setSection_Inch(rs.getString("Section_Inch"));
				model.setDep_ID(rs.getString("Dep_ID"));
								
				listSection.add(model);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listSection;
	}
	public static SectionModel getSectionByID(String id){
		SectionModel model = null;
		try {
			String sql = "SELECT * FROM Section WHERE SecID =?";
			PreparedStatement ps = DataUtil.getConnection().prepareStatement(sql);
			ps.setString(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				model = new SectionModel();
				model.setSecID(rs.getString("SecID"));
				model.setName(rs.getString("Name"));
				model.setSection_Inch(rs.getString("Section_Inch"));
				model.setDep_ID(rs.getString("DepID"));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return model;
	}
	public static boolean updateSection(SectionModel model){
		Boolean kq = false;
		try {
			String sql = "UPDATE Section SET Name = ? , Section_Inch = ?, DepID = ? WHERE SecID=?";

			PreparedStatement ps = DataUtil.getConnection().prepareStatement(sql);
			ps.setString(1, model.getName());
			ps.setString(2, model.getSection_Inch());
			ps.setString(3, model.getDep_ID());
			ps.setString(4, model.getSecID());
			ps.executeUpdate();
			kq = true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			return kq;
	}
	public static Boolean insertSection(SectionModel model){
		Boolean kq = false;
		String sql ;
			try {
				sql = "INSERT INTO Section VALUES (?,?,?,?)";
				PreparedStatement ps = DataUtil.getConnection().prepareStatement(sql);
				ps.setString(1, model.getSecID());
				ps.setString(2, model.getName());
				ps.setString(3, model.getSection_Inch());
				ps.setString(4, model.getDep_ID());
				ps.executeUpdate();
				kq = true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
		return kq;
	}
	public static Boolean deleteSection(SectionModel model){
		Boolean kq = false;
		try {
			String sql = "DELETE  FROM Section WHERE SecID = ?";
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
	public static ArrayList<SectionModel> searchSection(String SecID,String DepID,String Name){
		ArrayList<SectionModel> listSection = new ArrayList<SectionModel>();
		try {
			String sql = "SELECT SecID,Name,Section_Inch,DepID FROM Section WHERE SecID LIKE '%" +SecID+ "%' AND Name LIKE '%" +Name+ "%' AND DepID LIKE '%" +DepID+ "%'";
			ResultSet rs = DataUtil.executeQuery(sql);
			System.out.println("Result Set:"+rs.getRow());
			while (rs.next()){
				SectionModel model = new SectionModel();
				model.setSecID(rs.getString("SecID"));
				model.setName(rs.getString("Name"));
				model.setSection_Inch(rs.getString("Section_Inch"));
				model.setDep_ID(rs.getString("Dep_ID"));
				listSection.add(model);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listSection;
	}
}
