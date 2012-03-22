package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
}
