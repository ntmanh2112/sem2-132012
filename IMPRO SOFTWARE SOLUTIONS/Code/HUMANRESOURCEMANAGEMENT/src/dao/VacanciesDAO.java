package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.VacaniesModel;

import util.DataUtil;

public class VacanciesDAO {

	public static ArrayList<VacaniesModel> getAllVacasies(){
		ArrayList<VacaniesModel> listVacancies = new ArrayList<VacaniesModel>();
		try {
			String sql = "SELECT * FROM Vacancies";
			ResultSet rs = DataUtil.executeQuery(sql);
			while (rs.next()){
				VacaniesModel model = new VacaniesModel();
				model.setVacancy_ID(rs.getString("Vacancy_ID"));
				model.setDep_ID(rs.getString("Dep_ID"));
				model.setSecID(rs.getString("SecID"));
				model.setDesignation_ID(rs.getString("Designation_ID"));
				model.setNo_Of_Vacancies(rs.getString("No_Of_Vacancies"));
				model.setStatus(rs.getString("Status"));
				model.setVacancy_Date(rs.getString("Vacancy_Date"));
				model.setCreator(rs.getString("Creator"));
				model.setPriority(rs.getString("Priority"));
				
				listVacancies.add(model);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listVacancies;

}
}
