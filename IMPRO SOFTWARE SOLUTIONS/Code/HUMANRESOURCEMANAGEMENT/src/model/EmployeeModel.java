package model;

public class EmployeeModel {
	private String EmID;
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
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSecID() {
		return SecID;
	}
	public void setSecID(String secID) {
		SecID = secID;
	}
	public String getDes_ID() {
		return Des_ID;
	}
	public void setDes_ID(String desID) {
		Des_ID = desID;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getFax() {
		return Fax;
	}
	public void setFax(String fax) {
		Fax = fax;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	private String Password;
	
	private String Name;
	private String SecID;
	private String Des_ID;

	private String Address;
	private String Phone;
	private String Fax;
	private String Email;
	private String Present_Designation;
	private String Deputed_To;
	private String Status;
	private String Remarks;
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getRemarks() {
		return Remarks;
	}
	public void setRemarks(String remarks) {
		Remarks = remarks;
	}
	private String Creation_Date;
	public String getPresent_Designation() {
		return Present_Designation;
	}
	public void setPresent_Designation(String presentDesignation) {
		Present_Designation = presentDesignation;
	}
	public String getDeputed_To() {
		return Deputed_To;
	}
	public void setDeputed_To(String deputedTo) {
		Deputed_To = deputedTo;
	}
	public String getCreation_Date() {
		return Creation_Date;
	}
	public void setCreation_Date(String creationDate) {
		Creation_Date = creationDate;
	}
	
}
