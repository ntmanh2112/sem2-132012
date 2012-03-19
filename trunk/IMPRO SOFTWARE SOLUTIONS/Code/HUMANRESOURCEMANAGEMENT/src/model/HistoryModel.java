package model;

public class HistoryModel {
	private String ID;
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getEmID() {
		return EmID;
	}
	public void setEmID(String emID) {
		EmID = emID;
	}
	public String getDesID() {
		return DesID;
	}
	public void setDesID(String desID) {
		DesID = desID;
	}
	public String getDate_action() {
		return Date_action;
	}
	public void setDate_action(String dateAction) {
		Date_action = dateAction;
	}
	public String getAction() {
		return Action;
	}
	public void setAction(String action) {
		Action = action;
	}
	private String EmID;
	private String DesID;
	private String Date_action;
	private String Action;

}
