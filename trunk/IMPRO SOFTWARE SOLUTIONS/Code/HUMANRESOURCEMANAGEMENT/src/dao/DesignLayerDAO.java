package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.DesigLayerModel;

import util.DataUtil;

public class DesignLayerDAO {

	public static ArrayList<DesigLayerModel> getAllDesigLayer(){
		ArrayList<DesigLayerModel> listDesigLayer = new ArrayList<DesigLayerModel>();
		try {
			String sql = "SELECT * FROM Desiglayer";
			ResultSet rs = DataUtil.executeQuery(sql);
			while (rs.next()){
				DesigLayerModel model = new DesigLayerModel();
				model.setLayer_ID(rs.getString("Layer_ID"));
				model.setLayer(rs.getString("Layer"));
				model.setWeightage(rs.getString("Weightage"));
				
				listDesigLayer.add(model);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listDesigLayer;

}
}
