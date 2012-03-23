package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.text.html.ListView;

import model.DepartmentsModel;
import model.VacanciesModel;
import model.VacanciesModel;

import util.DataUtil;

public class VacanciesDAO {

	public static ArrayList<VacanciesModel> getAllVacancies(){
		ArrayList<VacanciesModel> listVacancies = new ArrayList<VacanciesModel>();
		try {
			String sql = "SELECT * FROM Vacancies";
			ResultSet rs = DataUtil.executeQuery(sql);
			while (rs.next()){
				VacanciesModel model = new VacanciesModel();
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
	public static VacanciesModel getVacanciesByID(String id){
		VacanciesModel model = null;
		try {
			String sql = "SELECT * FROM Vacancies WHERE Vacancy_ID =?";
			PreparedStatement ps = DataUtil.getConnection().prepareStatement(sql);
			ps.setString(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				model.setVacancy_ID(rs.getString("Vacancy_ID"));
				model.setDep_ID(rs.getString("Dep_ID"));
				model.setSecID(rs.getString("SecID"));
				model.setDesignation_ID(rs.getString("Designation_ID"));
				model.setNo_Of_Vacancies(rs.getString("No_Of_Vacancies"));
				model.setStatus(rs.getString("Status"));
				model.setVacancy_Date(rs.getString("Vacancy_Date"));
				model.setCreator(rs.getString("Creator"));
				model.setPriority(rs.getString("Priority"));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return model;
	}
	public static boolean updateVacancies(VacanciesModel model){
		Boolean kq = false;
		try {
			String sql = "UPDATE Vacancies SET Dep_ID = ? , SecID = ?, Designation_ID = ?, No_Of_Vacancies = ?, Status = ?, Vacancy_Date = ?, Creator = ?, Priority = ? WHERE Dep_ID = ?";
			PreparedStatement ps = DataUtil.getConnection().prepareStatement(sql);
			ps.setString(1, model.getDep_ID());
			ps.setString(2, model.getSecID());
			ps.setString(3, model.getDesignation_ID());
			ps.setString(4, model.getNo_Of_Vacancies());
			ps.setString(5, model.getStatus());
			ps.setString(6, model.getVacancy_Date());
			ps.setString(7, model.getCreator());
			ps.setString(8, model.getPriority());
			ps.setString(9, model.getVacancy_ID());
			ps.executeUpdate();
			kq = true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			return kq;
	}
	public static Boolean insertVacancies(VacanciesModel model){
		Boolean kq = false;
		String sql ;
			try {
				sql = "INSERT INTO Departments VALUES (?,?,?,?,?,?,?,?,?)";
				PreparedStatement ps = DataUtil.getConnection().prepareStatement(sql);
				ps.setString(1, model.getVacancy_ID());
				ps.setString(2, model.getDep_ID());
				ps.setString(3, model.getSecID());
				ps.setString(4, model.getDesignation_ID());
				ps.setString(5, model.getNo_Of_Vacancies());
				ps.setString(6, model.getStatus());
				ps.setString(7, model.getVacancy_Date());
				ps.setString(8, model.getCreator());
				ps.setString(9, model.getPriority());
				ps.executeUpdate();
				kq = true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
		return kq;
	}
	public static Boolean deleteVacancies(VacanciesModel model){
		Boolean kq = false;
		try {
			String sql = "DELETE  FROM Vacancies WHERE Vacancy_ID = ?";
			PreparedStatement ps = DataUtil.getConnection().prepareStatement(sql);
			ps.setString(1, model.getVacancy_ID());
			ps.executeUpdate();
			kq = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return kq;
	}
	public static ArrayList<VacanciesModel> searchVacancies(String id, String date){
		ArrayList<VacanciesModel> listVacancies = new ArrayList<VacanciesModel>();
		try {
			String sql = "SELECT DEP_NAME FROM Departments WHERE Vacancy_ID LIKE '%" +id+ "%' AND Vacancy_Date LIKE '%" +date+ "%'";
			ResultSet rs = DataUtil.executeQuery(sql);
			System.out.println("Result Set:"+rs.getRow());
			while (rs.next()){
				VacanciesModel model = new VacanciesModel();
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
