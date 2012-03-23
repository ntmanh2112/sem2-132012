package model;

public class VacanciesModel {
	
	private String Vacancy_ID;
	public String getVacancy_ID() {
		return Vacancy_ID;
	}
	public void setVacancy_ID(String vacancyID) {
		Vacancy_ID = vacancyID;
	}
	public String getDep_ID() {
		return Dep_ID;
	}
	public void setDep_ID(String depID) {
		Dep_ID = depID;
	}
	public String getSecID() {
		return SecID;
	}
	public void setSecID(String secID) {
		SecID = secID;
	}
	public String getDesignation_ID() {
		return Designation_ID;
	}
	public void setDesignation_ID(String designationID) {
		Designation_ID = designationID;
	}
	public String getNo_Of_Vacancies() {
		return No_Of_Vacancies;
	}
	public void setNo_Of_Vacancies(String noOfVacancies) {
		No_Of_Vacancies = noOfVacancies;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getVacancy_Date() {
		return Vacancy_Date;
	}
	public void setVacancy_Date(String vacancyDate) {
		Vacancy_Date = vacancyDate;
	}
	public String getCreator() {
		return Creator;
	}
	public void setCreator(String creator) {
		Creator = creator;
	}
	public String getPriority() {
		return Priority;
	}
	public void setPriority(String priority) {
		Priority = priority;
	}
	private String Dep_ID;
	private String SecID;
	private String Designation_ID;
	private String No_Of_Vacancies;
	private String Status;
	private String Vacancy_Date;
	private String Creator;
	private String Priority;

}
