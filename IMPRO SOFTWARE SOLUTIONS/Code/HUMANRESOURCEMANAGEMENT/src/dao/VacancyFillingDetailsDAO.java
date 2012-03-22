package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Vacancy_Fill_DetailsModel;


import util.DataUtil;

public class VacancyFillingDetailsDAO {

	public static ArrayList<Vacancy_Fill_DetailsModel> getAllVacancyFillDetails(){
		ArrayList<Vacancy_Fill_DetailsModel> listVacancyFillDetails = new ArrayList<Vacancy_Fill_DetailsModel>();
		try {
			String sql = "SELECT * FROM Vacancy_Fill_Details";
			ResultSet rs = DataUtil.executeQuery(sql);
			while (rs.next()){
				Vacancy_Fill_DetailsModel model = new Vacancy_Fill_DetailsModel();
				model.setID(rs.getString("ID"));
				model.setVacancy_ID(rs.getString("Vacancy_ID"));
				model.setEmID(rs.getString("EmID"));
				model.setFilled_Date(rs.getString("Filled_Date"));
				model.setIntake_Details(rs.getString("Intake_Details"));
				model.setStatus(rs.getString("Status"));
				model.setCreator(rs.getString("Creator"));
				
				listVacancyFillDetails.add(model);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listVacancyFillDetails;

}
}
