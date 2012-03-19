package model;

public class Vacancy_Fill_DetailsModel {
	private String ID;
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getVacancy_ID() {
		return Vacancy_ID;
	}
	public void setVacancy_ID(String vacancyID) {
		Vacancy_ID = vacancyID;
	}
	public String getEmID() {
		return EmID;
	}
	public void setEmID(String emID) {
		EmID = emID;
	}
	public String getFilled_Date() {
		return Filled_Date;
	}
	public void setFilled_Date(String filledDate) {
		Filled_Date = filledDate;
	}
	public String getIntake_Details() {
		return Intake_Details;
	}
	public void setIntake_Details(String intakeDetails) {
		Intake_Details = intakeDetails;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getCreator() {
		return Creator;
	}
	public void setCreator(String creator) {
		Creator = creator;
	}
	private String Vacancy_ID;
	private String EmID;
	private String Filled_Date;
	private String Intake_Details;
	private String Status;
	private String Creator;

}
