package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.DepartmentsModel;
import model.HistoryModel;
import util.DataUtil;

public class HistoryDAO {
	public static ArrayList<HistoryModel> getAllHistory(){
		ArrayList<HistoryModel> listHistory = new ArrayList<HistoryModel>();
		try {
			String sql = "SELECT * FROM History";
			ResultSet rs = DataUtil.executeQuery(sql);
			while (rs.next()){
				HistoryModel model = new HistoryModel();
				model.setID(rs.getString("ID"));
				model.setEmID(rs.getString("EmID"));
				model.setDesID(rs.getString("DesID"));
				model.setDate_action(rs.getString("Date_Action"));
				model.setAction(rs.getString("Action"));
				listHistory.add(model);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listHistory;
	}
	public static HistoryModel getHistoryByID(String id){
		HistoryModel model = null;
		try {
			String sql = "SELECT * FROM History WHERE ID =?";
			PreparedStatement ps = DataUtil.getConnection().prepareStatement(sql);
			ps.setString(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				model.setID(rs.getString("ID"));
				model.setEmID(rs.getString("EmID"));
				model.setDesID(rs.getString("DesID"));
				model.setDate_action(rs.getString("Date_Action"));
				model.setAction(rs.getString("Action"));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return model;
	}
}
