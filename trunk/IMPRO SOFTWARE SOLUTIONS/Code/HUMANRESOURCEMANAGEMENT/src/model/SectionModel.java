package model;

public class SectionModel {

	private String SecID;
	public String getSecID() {
		return SecID;
	}
	public void setSecID(String secID) {
		SecID = secID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSection_Inch() {
		return Section_Inch;
	}
	public void setSection_Inch(String sectionInch) {
		Section_Inch = sectionInch;
	}
	public String getDep_ID() {
		return Dep_ID;
	}
	public void setDep_ID(String depID) {
		Dep_ID = depID;
	}
	private String Name;
	private String Section_Inch;
	private String Dep_ID;
}
