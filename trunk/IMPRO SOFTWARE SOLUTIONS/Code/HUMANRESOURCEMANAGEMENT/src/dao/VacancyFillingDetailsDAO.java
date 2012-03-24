package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.DepartmentsModel;
import model.Vacancy_Fill_DetailsModel;


import util.DataUtil;

public class VacancyFillingDetailsDAO {

	public static ArrayList<Vacancy_Fill_DetailsModel> getAllVacancyFillDetails(){
		ArrayList<Vacancy_Fill_DetailsModel> listVacancyFillDetails = new ArrayList<Vacancy_Fill_DetailsModel>();
		try {
			String sql = "SELECT Vacancy_ID,EmID,Filled_Date,Intake_Details,Status,Creator FROM Vacancy_Fill_Details ";
			ResultSet rs = DataUtil.executeQuery(sql);
			while (rs.next()){
				Vacancy_Fill_DetailsModel model = new Vacancy_Fill_DetailsModel();
				//model.setID(rs.getString("ID"));
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
	public static Vacancy_Fill_DetailsModel Vacancy_Fill_DetailsByID(String id){
		Vacancy_Fill_DetailsModel model = null;
		try {
			String sql = "SELECT * FROM Vacancy_Fill_Details WHERE ID =?";
			PreparedStatement ps = DataUtil.getConnection().prepareStatement(sql);
			ps.setString(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				model.setID(rs.getString("ID"));
				model.setVacancy_ID(rs.getString("Vacancy_ID"));
				model.setEmID(rs.getString("EmID"));
				model.setFilled_Date(rs.getString("Filled_Date"));
				model.setIntake_Details(rs.getString("Intake_Details"));
				model.setStatus(rs.getString("Status"));
				model.setCreator(rs.getString("Creator"));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return model;
	}
	public static boolean updateVacancy_Fill_Details(Vacancy_Fill_DetailsModel model){
		Boolean kq = false;
		try {
			String sql = "UPDATE Vacancy_Fill_Details SET Vacancy_ID = ? , EmID = ?, Filled_Date = ?, Intake_Details = ?, Status = ?, Creator = ? WHERE ID = ?";
			PreparedStatement ps = DataUtil.getConnection().prepareStatement(sql);
			ps.setString(1, model.getVacancy_ID());
			ps.setString(2, model.getEmID());
			ps.setString(3, model.getFilled_Date());
			ps.setString(4, model.getIntake_Details());
			ps.setString(5, model.getStatus());
			ps.setString(6, model.getCreator());	
			ps.setString(7, model.getID());
			ps.executeUpdate();
			kq = true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			return kq;
	}
	public static Boolean insertVacancy_Fill_Details(Vacancy_Fill_DetailsModel model){
		Boolean kq = false;
		String sql ;
			try {
				sql = "INSERT INTO Departments VALUES (?,?,?,?,?,?,?)";
				PreparedStatement ps = DataUtil.getConnection().prepareStatement(sql);
				ps.setString(1, model.getID());
				ps.setString(2, model.getVacancy_ID());
				ps.setString(3, model.getEmID());
				ps.setString(4, model.getFilled_Date());
				ps.setString(5, model.getIntake_Details());
				ps.setString(6, model.getStatus());
				ps.setString(7, model.getCreator());	
				ps.executeUpdate();
				kq = true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
		return kq;
	}
	public static Boolean deleteVacancy_Fill_Details(Vacancy_Fill_DetailsModel model){
		Boolean kq = false;
		try {
			String sql = "DELETE  FROM Vacancy_Fill_Details WHERE ID = ?";
			PreparedStatement ps = DataUtil.getConnection().prepareStatement(sql);
			ps.setString(1, model.getID());
			ps.executeUpdate();
			kq = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return kq;
	}
	public static ArrayList<Vacancy_Fill_DetailsModel> searchDepartments(String Name){
		ArrayList<Vacancy_Fill_DetailsModel> listVacancy_Fill_Details = new ArrayList<Vacancy_Fill_DetailsModel>();
		try {
			String sql = "SELECT DEP_NAME FROM Departments WHERE Dep_Name LIKE '%" +Name+ "%'";
			ResultSet rs = DataUtil.executeQuery(sql);
			System.out.println("Result Set:"+rs.getRow());
			while (rs.next()){
				Vacancy_Fill_DetailsModel model = new Vacancy_Fill_DetailsModel();
				model.setID(rs.getString("ID"));
				model.setVacancy_ID(rs.getString("Vacancy_ID"));
				model.setEmID(rs.getString("EmID"));
				model.setFilled_Date(rs.getString("Filled_Date"));
				model.setIntake_Details(rs.getString("Intake_Details"));
				model.setStatus(rs.getString("Status"));
				model.setCreator(rs.getString("Creator"));
				listVacancy_Fill_Details.add(model);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listVacancy_Fill_Details;
	}
}
