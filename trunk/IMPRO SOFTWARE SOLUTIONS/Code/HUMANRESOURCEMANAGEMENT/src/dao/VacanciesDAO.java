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
			String sql = "SELECT Vacancy_ID,SecID,Designation_ID,interpretation,No_Of_Vacancies,Status,cast(datepart(month,Vacancy_Date) as varchar)+'/'+ cast(datepart(day,Vacancy_Date) as varchar)+'/'+ cast(datepart(year,Vacancy_Date) as varchar)as'Vacancy_Date',Creator,Priority FROM Vacancies";
			ResultSet rs = DataUtil.executeQuery(sql);
			while (rs.next()){
				VacanciesModel model = new VacanciesModel();
				model.setVacancy_ID(rs.getString("Vacancy_ID"));
				//model.setDep_ID(rs.getString("Dep_ID"));
				model.setSecID(rs.getString("SecID"));
				model.setDesignation_ID(rs.getString("Designation_ID"));
				model.setInterpretation(rs.getString("Interpretation"));
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
				model = new VacanciesModel();
				model.setVacancy_ID(rs.getString("Vacancy_ID"));
				//model.setDep_ID(rs.getString("Dep_ID"));
				model.setSecID(rs.getString("SecID"));
				model.setDesignation_ID(rs.getString("Designation_ID"));
				model.setInterpretation(rs.getString("Interpretation"));
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
			String sql = "UPDATE Vacancies SET SecID = ?, Designation_ID = ?, Interpretation = ?,No_Of_Vacancies = ?, Status = ?, Vacancy_Date = ?, Creator = ?, Priority = ? WHERE Vacancy_ID = ?";
			PreparedStatement ps = DataUtil.getConnection().prepareStatement(sql);
			//ps.setString(1, model.getDep_ID());
			ps.setString(1, model.getSecID());
			ps.setString(2, model.getDesignation_ID());
			ps.setString(3, model.getInterpretation());
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
				sql = "INSERT INTO VACANCIES VALUES (?,?,?,?,?,?,?,?,?)";
				PreparedStatement ps = DataUtil.getConnection().prepareStatement(sql);
				ps.setString(1, model.getVacancy_ID());
				ps.setString(2, model.getSecID());
				ps.setString(3, model.getDesignation_ID());
				ps.setString(4, model.getInterpretation());
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
	public static ArrayList<VacanciesModel> searchVacancies(String Vacancy_ID, String SecID){
		ArrayList<VacanciesModel> listVacancies = new ArrayList<VacanciesModel>();
		try {
			String sql = "SELECT VACANCY_ID,SECID,Designation_ID,Interpretation,No_Of_Vacancies,Status,Vacancy_Date,Creator,Priority FROM VACANCIES WHERE Vacancy_ID LIKE '%" +Vacancy_ID+ "%' AND SecID LIKE '%" +SecID+ "%'";
			ResultSet rs = DataUtil.executeQuery(sql);
			System.out.println("Result Set:"+rs.getRow());
			while (rs.next()){
				VacanciesModel model = new VacanciesModel();
				model.setVacancy_ID(rs.getString("Vacancy_ID"));
				//model.setDep_ID(rs.getString("Dep_ID"));
				model.setSecID(rs.getString("SecID"));
				model.setDesignation_ID(rs.getString("Designation_ID"));
				model.setInterpretation(rs.getString("Interpretation"));
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
