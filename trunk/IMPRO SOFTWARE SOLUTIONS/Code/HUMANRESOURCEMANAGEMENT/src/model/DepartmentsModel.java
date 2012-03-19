package model;

public class DepartmentsModel {
	private String Dep_ID;
	public String getDep_ID() {
		return Dep_ID;
	}
	public void setDep_ID(String depID) {
		Dep_ID = depID;
	}
	public String getDep_Name() {
		return Dep_Name;
	}
	public void setDep_Name(String depName) {
		Dep_Name = depName;
	}
	public String getDep_Head() {
		return Dep_Head;
	}
	public void setDep_Head(String depHead) {
		Dep_Head = depHead;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public String getUp_Dep_No() {
		return Up_Dep_No;
	}
	public void setUp_Dep_No(String upDepNo) {
		Up_Dep_No = upDepNo;
	}
	public String getDn_Dep_No() {
		return Dn_Dep_No;
	}
	public void setDn_Dep_No(String dnDepNo) {
		Dn_Dep_No = dnDepNo;
	}
	private String Dep_Name;
	private String Dep_Head;
	private String Location;
	private String Up_Dep_No;
	private String Dn_Dep_No;
}
