package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import net.sf.jasperreports.components.list.ListDesignConverter;

import model.DepartmentsModel;
import model.DesignLayerModel;

import util.DataUtil;

public class DesignLayerDAO {

	public static ArrayList<DesignLayerModel> getAllDesignLayer(){
		ArrayList<DesignLayerModel> listDesignLayer = new ArrayList<DesignLayerModel>();
		try {
			String sql = "SELECT * FROM Desiglayer";
			ResultSet rs = DataUtil.executeQuery(sql);
			while (rs.next()){
				DesignLayerModel model = new DesignLayerModel();
				model.setDes_ID(rs.getString("Des_ID"));
				model.setLayer(rs.getString("Layer"));
				model.setWeightage(rs.getString("Weightage"));
				
				listDesignLayer.add(model);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listDesignLayer;
	}
	public static DesignLayerModel getDesignLayerByID(String id){
		DesignLayerModel model = null;
		try {
			String sql = "SELECT * FROM DesignLayer WHERE Layer_ID =?";
			PreparedStatement ps = DataUtil.getConnection().prepareStatement(sql);
			ps.setString(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				model.setDes_ID(rs.getString("Des_ID"));
				model.setLayer(rs.getString("Layer"));
				model.setWeightage(rs.getString("Weightage"));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return model;
	}
	public static ArrayList<DesignLayerModel> getlayerByID(String id){
		 ArrayList<DesignLayerModel> listmodel = new ArrayList<DesignLayerModel>();
		try {
			String sql = "select A.layer,B.Designation from DesigLayer AS A inner join Designation AS B on A.layer_ID = B.layer_ID where Layer = ?";
			PreparedStatement ps = DataUtil.getConnection().prepareStatement(sql);
			ps.setString(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				DesignLayerModel model = new DesignLayerModel();
				model.setLayer(rs.getString("Layer"));
				model.setDesignation(rs.getString("Designation"));
				listmodel.add(model);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listmodel;
	}
	public static boolean updateDesignLayer(DesignLayerModel model){
		Boolean kq = false;
		try {
			String sql = "UPDATE DesignLayer SET Layer = ? , Weightage = ? WHERE Layer_ID=?";
			PreparedStatement ps = DataUtil.getConnection().prepareStatement(sql);
			ps.setString(1, model.getLayer());
			ps.setString(2, model.getWeightage());
			ps.setString(3, model.getDes_ID());	
			ps.executeUpdate();
			kq = true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			return kq;
	}
	public static Boolean insertDesignLayer(DesignLayerModel model){
		Boolean kq = false;
		String sql ;
			try {
				sql = "INSERT INTO DesignLayer VALUES (?,?,?)";
				PreparedStatement ps = DataUtil.getConnection().prepareStatement(sql);
				ps.setString(1, model.getDes_ID());
				ps.setString(2, model.getLayer());
				ps.setString(3, model.getWeightage());
				ps.executeUpdate();
				kq = true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
		return kq;
	}
	public static Boolean deleteDesignLayer(DesignLayerModel model){
		Boolean kq = false;
		try {
			String sql = "DELETE  FROM DesignLayer WHERE Layer_ID = ?";
			PreparedStatement ps = DataUtil.getConnection().prepareStatement(sql);
			ps.setString(1, model.getDes_ID());
			ps.executeUpdate();
			kq = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return kq;
	}
	public static ArrayList<DesignLayerModel> searchDesignLayer(String num){
		ArrayList<DesignLayerModel> listDesignLayer = new ArrayList<DesignLayerModel>();
		try {
			String sql = "SELECT Layer FROM DesignLayer WHERE Layer LIKE '%" +num+ "%'";
			ResultSet rs = DataUtil.executeQuery(sql);
			System.out.println("Result Set:"+rs.getRow());
			while (rs.next()){
				DesignLayerModel model = new DesignLayerModel();
				model.setDes_ID(rs.getString("Des_ID"));
				model.setLayer(rs.getString("Layer"));
				model.setWeightage(rs.getString("Weightage"));
				listDesignLayer.add(model);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listDesignLayer;
	}
}
