package model;

public class DesignLayerModel {
	//private String Des_ID;
	//public String getDes_ID() {
	//	return Des_ID;
	//}
	//public void setDes_ID(String desID) {
	//	Des_ID = desID;
	//}
	public String getLayer() {
		return Layer;
	}
	public void setLayer(String layer) {
		Layer = layer;
	}
	public String getWeightage() {
		return Weightage;
	}
	public void setWeightage(String weightage) {
		Weightage = weightage;
	}
	private String Layer_ID;
	private String Layer;
	private String Weightage;
	public String getLayer_ID() {
		return Layer_ID;
	}
	public void setLayer_ID(String layerID) {
		Layer_ID = layerID;
	}
	/*private String Designation;
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}*/
}
