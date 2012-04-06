package model;

public class DivisionModel {
	
	public String getVacancy_ID() {
		return Vacancy_ID;
	}
	public void setVacancy_ID(String vacancyID) {
		Vacancy_ID = vacancyID;
	}
	public String getSecID() {
		return SecID;
	}
	public void setSecID(String secID) {
		SecID = secID;
	}
	private String Vacancy_ID;
	private String SecID;
	private String id;
	private String Interpretation_Vacancy;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getInterpretation_Vacancy() {
		return Interpretation_Vacancy;
	}
	public void setInterpretation_Vacancy(String interpretationVacancy) {
		Interpretation_Vacancy = interpretationVacancy;
	}
}
