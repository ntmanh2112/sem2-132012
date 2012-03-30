package model;

public class AccountModel {

	private String UserID;
	public String getUserID() {
		return UserID;
	}
	public void setUserID(String userID) {
		UserID = userID;
	}
	public String getEmID() {
		return EmID;
	}
	public void setEmID(String emID) {
		EmID = emID;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
	private String EmID;
	private String Password;
	
}
