package model;

public class AccountModel {

	private String UserID;
	public String getUserID() {
		return UserID;
	}
	public void setUserID(String userID) {
		UserID = userID;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getEmID() {
		return EmID;
	}
	public void setEmID(String emID) {
		EmID = emID;
	}
	public String getAcc_level() {
		return Acc_level;
	}
	public void setAcc_level(String accLevel) {
		Acc_level = accLevel;
	}
	private String Password;
	private String EmID;
	private String Acc_level;
}
