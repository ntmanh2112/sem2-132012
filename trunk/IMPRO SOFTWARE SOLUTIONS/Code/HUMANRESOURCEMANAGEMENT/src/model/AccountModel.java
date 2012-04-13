package model;

public class AccountModel {

	private String UserID;
	private String EmID;
	private String Password;
	private String DesignationID;
	private String Name;
	private String Layer;
	private String Designation;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getLayer() {
		return Layer;
	}
	public void setLayer(String layer) {
		Layer = layer;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public String getDesignationID(){
		return DesignationID;
	}
	public void setDesignationID(String designationID){
		DesignationID = designationID;
	}
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
}
